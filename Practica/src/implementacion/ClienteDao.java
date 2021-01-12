package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import interfaces.ClienteInterface;
import modelo.Cliente;

public class ClienteDao extends Conexion implements ClienteInterface {

	@Override
	public boolean aniadirCliente(Cliente miCliente) {
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
	public boolean eliminarCliente(String clienteDNI) {
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

	@Override
	public Cliente consultarCliente(String DNI) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM CLIENTES WHERE DNI=?");
			st.setString(1, DNI);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// TODO Poner todos los datos
		//Cliente found = new Cliente();
		//return found;
		return null;
	}

	@Override
	public boolean modificarCliente(Cliente miCliente) {
		this.establecerConexion();
		try {
			// TODO Realizar correctamente el query a la implementacion de la bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Vehiculos SET usuario=?, contrasenia=?, DNI=?, nombre=?, apellidos=?, telefono=?, nacimiento=?, tipo=?, email=? WHERE matricula=?");
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
