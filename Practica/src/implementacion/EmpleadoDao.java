package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.EmpleadoInterface;
import modelo.Empleado;

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
			if (e.getMessage().indexOf("Duplicate entry") != -1? true:false) {
				JOptionPane.showMessageDialog(null, "Ya hay un empleado con el DNI", "DNI Duplicado", JOptionPane.ERROR_MESSAGE);
			}
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
	public ArrayList<Empleado> listarEmpleados() {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM EMPLEADOS");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				Empleado miEmpleado = new Empleado();
				miEmpleado.setID(res.getInt("EmpleadoID"));
				miEmpleado.setUsuarioDNI(res.getString("UsuarioDNI"));
				miEmpleado.setContrasenia(res.getString("Contraseña"));
				miEmpleado.setNacimiento(res.getDate("FechaNacimiento"));
				miEmpleado.setEmail(res.getString("Email"));
				miEmpleado.setTelefono(res.getString("Telefono"));
				miEmpleado.setNombre(res.getString("Nombre"));
				miEmpleado.setApellido1(res.getString("Apellido1"));
				miEmpleado.setApellido2(res.getString("Apellido2"));
				miEmpleado.setTipo(res.getString("Tipo"));
				listaEmpleados.add(miEmpleado);
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return listaEmpleados;
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
