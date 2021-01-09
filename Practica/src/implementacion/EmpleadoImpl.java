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

public class EmpleadoImpl extends Conexion implements EmpleadoInterface {

	private final int incorrecta = 2;
	private final int correctaBase = 1;
	private final int correctaAdmin = 0;
	private ArrayList<Empleado> listaEmpleados;

	public List<Empleado> listaEmpleados() throws SQLException {

		listaEmpleados = new ArrayList<Empleado>();

		this.establecerConexion();
		PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM EMPLEADOS");
		ResultSet rs = st.executeQuery();

		// TODO
		while (rs.next()) {

		}

		this.cerrarConexion();
		return listaEmpleados;

	}

	@Override
	public boolean aniadirEmpleado(String usuario, String contrasenia, String DNI, String nombre, String apellidos, String telefono, Date nacimiento, String email, String tipo) {
		Empleado emp = new Empleado(usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, email, tipo);
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO EMPLEADOS (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, emp.getUsuario());
			st.setString(2, emp.getContrasenia());
			st.setString(3, emp.getDNI());
			st.setString(4, emp.getNombre());
			st.setString(5, emp.getApellidos());
			st.setString(6, emp.getTelefono());
			st.setDate(7, emp.getNacimiento());
			st.setString(8, emp.getTipo());
			st.setString(9, emp.getEmail());
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
	public boolean eliminarEmpleado(String dni) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE EMPLEADOS SET estado=? WHERE DNI=?");
			st.setString(1, "Baja");
			st.setString(2, dni);
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
	public Empleado consultarEmpleado(int empleadoid) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM EMPLEADOS WHERE ID=?");
			st.setInt(1, empleadoid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// TODO Poner todos los datos
//		Empleado found = new Empleado();
//		return found;
		return null;
	}

	@Override
	public boolean modificarEmpleado(String usuario, String contrasenia, String DNI, String nombre, String apellidos,
			String telefono, Date nacimiento, String email, String tipo) {
		Empleado emp = new Empleado(usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, email, tipo);
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Vehiculos SET usuario=?, contrasenia=?, DNI=?, nombre=?, apellidos=?, telefono=?, nacimiento=?, tipo=?, email=? WHERE matricula=?");
			st.setString(1, emp.getUsuario());
			st.setString(2, emp.getContrasenia());
			st.setString(3, emp.getDNI());
			st.setString(4, emp.getNombre());
			st.setString(5, emp.getApellidos());
			st.setString(6, emp.getTelefono());
			st.setDate(7, emp.getNacimiento());
			st.setString(8, emp.getTipo());
			st.setString(9, emp.getEmail());
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
