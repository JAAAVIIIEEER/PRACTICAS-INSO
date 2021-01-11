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

	private final int incorrecta = 2;
	private final int correctaBase = 1;
	private final int correctaAdmin = 0;
	private ArrayList<Empleado> listaEmpleados;

	@Override
	public boolean aniadirEmpleado(Empleado nuevoEmpleado) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO EMPLEADOS (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, nuevoEmpleado.getUsuario());
			st.setString(2, nuevoEmpleado.getContrasenia());
			st.setString(3, nuevoEmpleado.getDNI());
			st.setString(4, nuevoEmpleado.getNombre());
			st.setString(5, nuevoEmpleado.getApellidos());
			st.setString(6, nuevoEmpleado.getTelefono());
			st.setDate(7, nuevoEmpleado.getNacimiento());
			st.setString(8, nuevoEmpleado.getTipo());
			st.setString(9, nuevoEmpleado.getEmail());
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
	public Empleado consultarEmpleado(String empleadoDNI) {
		Empleado miEmpleado = new Empleado();
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM EMPLEADOS WHERE ID=?");
			st.setString(1, empleadoDNI);
			ResultSet res = st.executeQuery();
			while(res.next()){
//				miEmpleado.setIdPersona(Integer.parseInt(res.getString("id")));
//				miEmpleado.setNombrePersona(res.getString("nombre"));
//				miEmpleado.setEdadPersona(Integer.parseInt(res.getString("edad")));
//				miEmpleado.setProfesionPersona(res.getString("profesion"));
//				miEmpleado.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			 }
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return miEmpleado;
	}

	@Override
	public boolean modificarEmpleado(Empleado modEmpleado) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Vehiculos SET usuario=?, contrasenia=?, DNI=?, nombre=?, apellidos=?, telefono=?, nacimiento=?, tipo=?, email=? WHERE matricula=?");
			st.setString(1, modEmpleado.getUsuario());
			st.setString(2, modEmpleado.getContrasenia());
			st.setString(3, modEmpleado.getDNI());
			st.setString(4, modEmpleado.getNombre());
			st.setString(5, modEmpleado.getApellidos());
			st.setString(6, modEmpleado.getTelefono());
			st.setDate(7, modEmpleado.getNacimiento());
			st.setString(8, modEmpleado.getTipo());
			st.setString(9, modEmpleado.getEmail());
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
