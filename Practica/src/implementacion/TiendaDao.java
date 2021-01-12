package implementacion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import interfaces.TiendaInterface;
import modelo.Tienda;
import modelo.Vehiculo;

public class TiendaDao extends Conexion implements TiendaInterface {
	
	@Override
	public boolean aniadirTienda(Tienda miTienda) {
		this.establecerConexion();
		try {
			// TODO STATEMENT Realizar cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO TIENDAS (usuario, contrasenia, DNI, nombre, apellidos, telefono, nacimiento, tipo, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
//			st.setString(1, t.getUsuario());
//			st.setString(2, t.getContrasenia());
//			st.setString(3, t.getDNI());
//			st.setString(4, t.getNombre());
//			st.setString(5, t.getApellidos());
//			st.setString(6, t.getTelefono());
//			st.setDate(7, t.getNacimiento());
//			st.setString(8, t.getTipo());
//			st.setString(9, t.getEmail());
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
	public void eliminarTienda(int tiendaid) {
		this.establecerConexion();
		try {
			//TODO realizar statement cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE EMPLEADOS SET estado=? WHERE ID=?");
//			st.setString(1, "Baja");
//			st.setInt(2, empleadoid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//listaEmpleados.remove(empleadoid);
		this.cerrarConexion();
	}

	@Override
	public Tienda consultarTienda(int tiendaid) {
		this.establecerConexion();
		try {
			// TODO Implementar query cuando se implemente la bd
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * TIENDA WHERE ID=?");
			st.setInt(1, tiendaid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		// TODO Poner todos los datos
		//Tienda found = new Tienda();
		return null;
	}

	@Override
	public boolean modificarTienda(Tienda miTienda) {
		this.establecerConexion();
		try {
			// TODO STATEMENT Realizar cuando se implemente bd
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Tiendaslol SET usuario=?, contrasenia=?, DNI=?, nombre=?, apellidos=?, telefono=?, nacimiento=?, tipo=?, email=? WHERE matricula=?");
//			st.setString(1, t.getUsuario());
//			st.setString(2, t.getContrasenia());
//			st.setString(3, t.getDNI());
//			st.setString(4, t.getNombre());
//			st.setString(5, t.getApellidos());
//			st.setString(6, t.getTelefono());
//			st.setDate(7, t.getNacimiento());
//			st.setString(8, t.getTipo());
//			st.setString(9, t.getEmail());
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
