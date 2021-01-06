package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import interfaces.ClienteInterface;

public class ClienteImpl extends Conexion implements ClienteInterface {

	@Override
	public boolean aniadirCliente(String DNI, String nombre, String apellidos, String telefono, Date nacimiento,
			String email) {
		this.establecerConexion();
		try {
			// TODO Realizar correctamente el query a la implementacion de la bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO CLIENTES (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
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
	public boolean eliminarCliente(int clienteid) {
		this.establecerConexion();
		// TODO cambiar query cuando se implemente bd
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE CLIENTES SET estado=? WHERE ID=?");
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

}
