package implementacion;

import modelo.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.VehiculoInterface;


public class VehiculoImpl extends Conexion implements VehiculoInterface{
	
	public List<Vehiculo> listaVehiculos() throws Exception {
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		this.establecerConexion();
		PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM VEHICULOS");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			
		}
		
		this.cerrarConexion();
		return listaVehiculos;
	}

	@Override
	public boolean aniadirVehiculo(String matricula, String tipo, int plazas, String combustible, int precio) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la base de datos
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO Vehiculos (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
//			st.setString(1, emp.getUsuario());
//			st.setString(2, emp.getContrasenia());
//			st.setString(3, emp.getDNI());
//			st.setString(4, emp.getNombre());
//			st.setString(5, emp.getApellidos());
//			st.setString(6, emp.getTelefono());
//			st.setDate(7, emp.getNacimiento());
//			st.setString(8, emp.getTipo());
//			st.setString(9, emp.getEmail());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public void bajaVehiculo(String matricula) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE VEHICULOS SET estado=? WHERE ID=?");
//			st.setString(1, "Baja");
//			st.setInt(2, empleadoid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//listaEmpleados.remove(empleadoid);
		this.cerrarConexion();
	}
}
