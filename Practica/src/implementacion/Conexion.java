package implementacion;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {

	private Connection conexion;

	public void establecerConexion() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentleondb", "root", "root");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos", "DB Error",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}

	public void cerrarConexion() {
		try {
			this.conexion.close();
		} catch (SQLException e) {
			System.out.println("Se produje un error al cerrar la BD");
		}
	}

	public Connection getConexion() {
		return conexion;
	}
}
