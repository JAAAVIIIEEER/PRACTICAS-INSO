package implementacion;

import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
	
	private Connection conexion;
	
	public void establecerConexion() {
		// Class.forName("sun.jdbc.odbc.Jdbc0dbcDriver");
		try {
			
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduzca el puerto: ");
			String puerto = teclado.readLine();
			System.out.println("Introduzca el usuario: ");
			String usuario = teclado.readLine();
			System.out.println("Introduzca la contraseña: ");
			String pass = teclado.readLine();
			
			// Creamos la conexión con la base de datos
			
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:"+puerto+"/rentleondb", usuario,
					pass);
			
			
			
			
		} catch (SQLException | IOException e) {
			System.out.println("No se pudo conectar con la base de datos");
			JOptionPane.showMessageDialog(null, "No se pudo conectar con la base de datos", "DB Error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
	
	public void cerrarConexion() {
		try {
			this.conexion.close();
		} catch(SQLException e) {
			System.out.println("Se produje un error al cerrar la BD");
		}
	}
	
	public Connection getConexion() {
		return conexion;
	}
}
