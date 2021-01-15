package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.IncidenciaInterface;
import modelo.Incidencia;

public class IncidenciaDao extends Conexion implements IncidenciaInterface {

	@Override
	public boolean almacenarIncidencia(Incidencia miIncidencia) {
		this.establecerConexion();
		try {
			int alquilerid = miIncidencia.getAlquilerID();
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO INCIDENCIAS (AlquilerID, Tipo, Informe) VALUES (?, ?, ?)");
			st.setInt(1, miIncidencia.getAlquilerID());
			
			st.setString(2, miIncidencia.getTipo());
			st.setString(3, miIncidencia.getInforme());
			st.executeUpdate();
			st = this.getConexion()
					.prepareStatement("UPDATE ALQUILERES SET estado=? WHERE AlquilerID=?");
			st.setString(1, "Finalizado");
			st.setInt(2, alquilerid);
			st.executeUpdate();
			PreparedStatement stTer = this.getConexion()
					.prepareStatement("SELECT VehiculoAlquilado FROM ALQUILERES WHERE AlquilerID=?");
			stTer.setInt(1, alquilerid);
			ResultSet res = stTer.executeQuery();
			String mat = "";;
			while(res.next()) {
				mat = res.getString("VehiculoAlquilado");
			}
			PreparedStatement stSec = this.getConexion()
					.prepareStatement("UPDATE VEHICULOS SET estado=? WHERE Matricula=?");
			stSec.setString(1, "Disponible");
			stSec.setString(2, mat);
			stSec.executeUpdate();
		} catch (SQLException e) {
			if (e.getMessage().indexOf("AlquilerID") != -1? true:false) {
				JOptionPane.showMessageDialog(null, "No hay un alquiler con ese ID", "Alquiler no encontrado", JOptionPane.ERROR_MESSAGE);
			}
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public boolean finalizarIncidencia(int alquilerID) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE INCIDENCIAS SET ESTADO=? WHERE AlquilerID=?");
			st.setString(1, "Finalizada");
			st.setInt(2, alquilerID);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public Incidencia consultarIncidencia(int alquilerID) {
		Incidencia miIncidencia = new Incidencia();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM INCIDENCIAS WHERE IncidenciaID=?");
			st.setInt(1, alquilerID);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miIncidencia.setId(res.getInt("IncidenciaID"));
				miIncidencia.setAlquilerID(res.getInt("AlquilerID"));
				miIncidencia.setTipo(res.getString("Tipo"));
				miIncidencia.setEstado(res.getString("Estado"));
				miIncidencia.setInforme(res.getString("Informe"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return miIncidencia;
	}
	
	@Override
	public ArrayList<Incidencia> listarIncidencias() {
		ArrayList<Incidencia> listaIncidencias = new ArrayList<Incidencia>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM INCIDENCIAS");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				Incidencia miIncidencia = new Incidencia();
				miIncidencia.setId(res.getInt("IncidenciaID"));
				miIncidencia.setAlquilerID(res.getInt("AlquilerID"));
				miIncidencia.setTipo(res.getString("Tipo"));
				miIncidencia.setEstado(res.getString("Estado"));
				miIncidencia.setInforme(res.getString("Informe"));
				listaIncidencias.add(miIncidencia);
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return listaIncidencias;
	}

	@Override
	public boolean modificarIncidencia(Incidencia miIncidencia) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE INCIDENCIAS SET AlquilerID=?, Tipo=?, Informe=? WHERE AlquilerID=?");
			st.setInt(1, miIncidencia.getAlquilerID());
			st.setString(2, miIncidencia.getTipo());
			st.setString(3, miIncidencia.getInforme());
			st.setInt(1, miIncidencia.getAlquilerID());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}
}
