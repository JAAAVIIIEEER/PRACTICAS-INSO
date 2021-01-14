package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import interfaces.IncidenciaInterface;
import modelo.Empleado;
import modelo.Incidencia;

public class IncidenciaDao extends Conexion implements IncidenciaInterface {

	@Override
	public boolean almacenarIncidencia(Incidencia miIncidencia) {
		this.establecerConexion();
		try {
			System.out.println(miIncidencia.getAlquilerID());
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO INCIDENCIAS (AlquilerID, Tipo, Informe) VALUES (?, ?, ?)");
			st.setInt(1, miIncidencia.getAlquilerID());
			st.setString(2, miIncidencia.getTipo());
			st.setString(3, miIncidencia.getInforme());
			st.executeUpdate();
		} catch (SQLException e) {
			if (e.getMessage().indexOf("IncidenciaID") != -1? true:false) {
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
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM INCIDENCIAS WHERE AlquilerID=?");
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
