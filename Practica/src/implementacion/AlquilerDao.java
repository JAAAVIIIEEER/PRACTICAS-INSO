package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.AlquilerInterface;
import modelo.Alquiler;
import modelo.Cliente;
import modelo.Vehiculo;

public class AlquilerDao extends Conexion implements AlquilerInterface {

	@Override
	public boolean aniadirAlquiler(Alquiler miAlquiler) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO ALQUILERES (FechaRecogida, FechaEntrega, CosteTotal, EmpleadoDNI, ClienteDNI, Oferta, CocheAlquilado) VALUES (?, ?, ?, ?, ?, ?, ?)");
			st.setDate(1, miAlquiler.getFecha1());
			st.setDate(2, miAlquiler.getFecha2());
			st.setInt(3, miAlquiler.getCoste());
			st.setString(4, miAlquiler.getDniEmpleado());
			st.setString(5, miAlquiler.getDniCliente());
			st.setInt(6, miAlquiler.getOferta());
			st.setString(7, miAlquiler.getMatVehiculo());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}	
	
	@Override
	public boolean finalizarAlquiler(int alquilerid) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE ALQUILERES SET estado=? WHERE AlquilerID=?");
			st.setString(1, "Finalizado");
			st.setInt(2, alquilerid);
			st.executeUpdate();
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
				miAlquiler.setMatVehiculo(res.getString("CocheAlquilado"));
				miAlquiler.setDniEmpleado(res.getString("EmpleadoDNI"));
				miAlquiler.setDniCliente(res.getString("ClienteDNI"));
				miAlquiler.setOferta(res.getInt("Oferta"));
				miAlquiler.setEstado(res.getString("Estado"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	@Override
	public boolean modificarAlquiler(Alquiler miAlquiler) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE ALQUILERES SET FechaRecogida=?, FechaEntrega=?, CosteTotal=?, EmpleadoDNI=?, ClienteDNI=?, Oferta=?, CocheAlquilado=? WHERE matricula=?");
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
}
