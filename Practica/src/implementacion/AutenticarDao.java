package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Empleado;

public class AutenticarDao extends Conexion {

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
				return 0;
			} else if (tipo.equals(Empleado.base)) {
				return 1;
			}
		}
		return 2;
	}
}
