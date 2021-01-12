package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.EmpleadoInterface;
import modelo.Empleado;
import modelo.Vehiculo;

public class EmpleadoDao extends Conexion implements EmpleadoInterface {

	@Override
	public boolean aniadirEmpleado(Empleado miEmpleado) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO EMPLEADOS (UsuarioDNI, Contraseña, Tipo, Nombre, Apellido1, Apellido2, FechaNacimiento, Telefono, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, miEmpleado.getUsuarioDNI());
			st.setString(2, miEmpleado.getContrasenia());
			st.setString(3, miEmpleado.getTipo());
			st.setString(4, miEmpleado.getNombre());
			st.setString(5, miEmpleado.getApellido1());
			st.setString(6, miEmpleado.getApellido2());
			st.setDate(7, miEmpleado.getNacimiento());
			st.setString(8, miEmpleado.getTelefono());
			st.setString(9, miEmpleado.getEmail());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public boolean eliminarEmpleado(String dni) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM EMPLEADOS WHERE DNI=?");
			st.setString(1, dni);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public Empleado consultarEmpleado(String empleadoDNI) {
		Empleado miEmpleado = new Empleado();
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM EMPLEADOS WHERE UsuarioDNI=?");
			st.setString(1, empleadoDNI);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miEmpleado.setUsuarioDNI(res.getString("UsuarioDNI"));
				miEmpleado.setContrasenia(res.getString("Contraseña"));
				miEmpleado.setNacimiento(res.getDate("FechaNacimiento"));
				miEmpleado.setEmail(res.getString("Email"));
				miEmpleado.setTelefono(res.getString("Telefono"));
				miEmpleado.setNombre(res.getString("Nombre"));
				miEmpleado.setApellido1(res.getString("Apellido1"));
				miEmpleado.setApellido2(res.getString("Apellido2"));
				miEmpleado.setTipo(res.getString("Tipo"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return miEmpleado;
	}

	@Override
	public boolean modificarEmpleado(Empleado miEmpleado) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE EMPLEADOS SET UsuarioDNI=?, Contraseña=?, Tipo=?, Nombre=?, Apellido1=?, Apellido2=?, FechaNacimiento=?, Telefono=?, Email=? WHERE UsuarioDNI=?");
			st.setString(1, miEmpleado.getUsuarioDNI());
			st.setString(2, miEmpleado.getContrasenia());
			st.setString(3, miEmpleado.getTipo());
			st.setString(4, miEmpleado.getNombre());
			st.setString(5, miEmpleado.getApellido1());
			st.setString(6, miEmpleado.getApellido2());
			st.setDate(7, miEmpleado.getNacimiento());
			st.setString(8, miEmpleado.getTelefono());
			st.setString(9, miEmpleado.getEmail());
			st.setString(10, miEmpleado.getUsuarioDNI());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

}
