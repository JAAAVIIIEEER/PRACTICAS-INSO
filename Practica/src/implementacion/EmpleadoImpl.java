package implementacion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import interfaces.EmpleadoInterface;
import modelo.Empleado;

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
	public boolean aniadirEmpleado(Empleado empleado) {
		this.establecerConexion();
		try {
		PreparedStatement st = this.getConexion().prepareStatement(
				"INSERT INTO EMPLEADOS (usuario, contrasenia, DNI, apellidos, telefono, nacimiento) VALUES (?, ?, ?, ?, ?, ?)");
		st.setString(1, empleado.getUsuario());
		st.setString(2, empleado.getContrasenia());
		st.setString(3, empleado.getDNI());
		st.setString(4, empleado.getNombre());
		st.setString(5, empleado.getApellidos());
		st.setDate(6, empleado.getNacimiento());
		st.executeUpdate();
		} catch (SQLException e) {
			
		}
		this.cerrarConexion();
		listaEmpleados.add(empleado);
		return true;
	}

	@Override
	public void eliminarEmpleado(Empleado empleado) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE EMPLEADOS SET estado=? WHERE ID=?");
			st.setInt(1, empleado.getID());
			st.executeUpdate();
		} catch (SQLException e) {

		}
		this.cerrarConexion();
	}

	public int autenticarConexion(String usuario, String contrasenia) {
		String userConsult = "";
		String passConsult = "";
		String tipo = "";

		this.establecerConexion();

		try {
			PreparedStatement st = this.getConexion()
					.prepareStatement("SELECT usuario, contrasenia, tipo FROM EMPLEADOS WHERE usuario=?");
			st.setString(1, usuario);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				userConsult = rs.getString("usuario");
				passConsult = rs.getString("contrasenia");
				tipo = rs.getString("tipo");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		this.cerrarConexion();
		if (userConsult.equals(usuario) && passConsult.equals(contrasenia)) {
			if (tipo.equals(Empleado.administrador)) {
				return correctaAdmin;
			} else if (tipo.equals(Empleado.base)) {
				return correctaBase;
			}
		}
		return incorrecta;
	}

}
