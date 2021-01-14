package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.swing.JOptionPane;

import interfaces.AlquilerInterface;
import modelo.Alquiler;

public class AlquilerDao extends Conexion implements AlquilerInterface {

	@Override
	public boolean aniadirAlquiler(Alquiler miAlquiler) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO ALQUILERES (FechaRecogida, FechaEntrega, CosteTotal, EmpleadoDNI, ClienteDNI, Oferta, VehiculoAlquilado) VALUES (?, ?, ?, ?, ?, ?, ?)");
			st.setDate(1, miAlquiler.getFecha1());
			st.setDate(2, miAlquiler.getFecha2());
			st.setInt(3, miAlquiler.getCoste());
			st.setString(4, miAlquiler.getDniEmpleado());
			st.setString(5, miAlquiler.getDniCliente());
			if (miAlquiler.getOferta() != null) {
				st.setInt(6, miAlquiler.getOferta());
			} else {
				st.setNull(6, Types.INTEGER);
			}
			st.setString(7, miAlquiler.getMatVehiculo());
			st.executeUpdate();
			PreparedStatement stSec = this.getConexion()
					.prepareStatement("UPDATE VEHICULOS SET ESTADO=? WHERE Matricula=?");
			stSec.setString(1, "No disponible");
			stSec.setString(2, miAlquiler.getMatVehiculo());
			stSec.executeUpdate();
		} catch (SQLException e) {
			if (e.getMessage().indexOf("ClienteDNI") != -1? true:false) {
				JOptionPane.showMessageDialog(null, "No se encuentra un cliente con ese DNI", "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
			}
			if (e.getMessage().indexOf("UsuarioDNI") != -1? true:false) {
				JOptionPane.showMessageDialog(null, "No se encuentra un empleado con ese DNI", "Empleado no encontrado", JOptionPane.ERROR_MESSAGE);
			}
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public boolean finalizarAlquiler(int alquilerid) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion()
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
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public Alquiler consultarAlquiler(int alquilerid) {
		Alquiler miAlquiler = new Alquiler();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM ALQUILERES WHERE AlquilerID=?");
			st.setInt(1, alquilerid);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miAlquiler.setId(res.getInt("AlquilerID"));
				miAlquiler.setFecha1(res.getDate("FechaRecogida"));
				miAlquiler.setFecha2(res.getDate("FechaEntrega"));
				miAlquiler.setCoste(res.getInt("CosteTotal"));
				miAlquiler.setMatVehiculo(res.getString("VehiculoAlquilado"));
				miAlquiler.setDniEmpleado(res.getString("EmpleadoDNI"));
				miAlquiler.setDniCliente(res.getString("ClienteDNI"));
				miAlquiler.setOferta(res.getInt("Oferta"));
				miAlquiler.setEstado(res.getString("Estado"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return miAlquiler;
	}

	@Override
	public boolean modificarAlquiler(Alquiler miAlquiler) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE ALQUILERES SET FechaRecogida=?, FechaEntrega=?, CosteTotal=?, EmpleadoDNI=?, ClienteDNI=?, Oferta=?, VehiculoAlquilado=? WHERE matricula=?");
			st.setDate(1, miAlquiler.getFecha1());
			st.setDate(2, miAlquiler.getFecha2());
			st.setInt(3, miAlquiler.getCoste());
			st.setString(4, miAlquiler.getDniEmpleado());
			st.setString(5, miAlquiler.getDniCliente());
			st.setInt(6, miAlquiler.getOferta());
			st.setString(7, miAlquiler.getMatVehiculo());
			st.setInt(8, miAlquiler.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}
	
	@Override
	public int calcularCoste(String matVehiculo) {
		int coste = 0;
		this.establecerConexion(); 
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"SELECT CostePorDia FROM vehiculos WHERE Matricula=?");
			st.setString(1, matVehiculo);
			ResultSet res = st.executeQuery();
			while(res.next()) {
				coste = res.getInt("CostePorDia");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return -1;
		}
		this.cerrarConexion();
		return coste;
	}
}
