package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import interfaces.AlquilerInterface;
import modelo.Alquiler;
import modelo.Vehiculo;

public class AlquilerImpl extends Conexion implements AlquilerInterface {

	@Override
	public boolean aniadirAlquiler(String DNI, Date inicio, Date finalAlquiler, String vehiculo) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO ALQUILERES (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
		//listaEmpleados.add(emp);
		return true;
	}	
	
	@Override
	public boolean finalizarAlquiler(int alquilerid) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE ALQUILERES SET estado=? WHERE ID=?");
//			st.setString(1, "Baja");
//			st.setInt(2, empleadoid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		//listaEmpleados.remove(empleadoid);
		this.cerrarConexion();
		return true;
	}

	@Override
	public Alquiler consultarAlquiler(int alquilerid) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM ALQUILERES WHERE ID=?");
			st.setInt(1, alquilerid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// TODO Poner todos los datos
		Alquiler found = new Alquiler();
		return found;
	}

	@Override
	public boolean modificarAlquiler(String DNI, Date inicio, Date finalAlquiler, String vehiculo) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Alquileres SET usuario=?, contrasenia=?, DNI=?, nombre=?, apellidos=?, telefono=?, nacimiento=?, tipo=?, email=? WHERE matricula=?");
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
		//listaEmpleados.add(emp);
		return true;
	}
}
