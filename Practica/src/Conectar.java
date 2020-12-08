import java.sql.*;
import java.io.*;

public class Conectar {
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
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:" + puerto + "/alquileres", usuario,
					pass);
		} catch (SQLException e) {
			System.out.println("No se pudo conectar con la base de datos");
		} catch (IOException e) {
			System.out.println("Datos incorrectos");
		}
	}

}
