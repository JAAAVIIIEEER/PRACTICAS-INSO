package implementacion;
import java.io.IOException;
import java.sql.*;

import vista.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		VistaAdministrador a = new VistaAdministrador();
		a.setVisible(true);
		
		Conexion c = new Conexion();
		c.establecerConexion();
		
		
		//ResultSet r = c.getStatement().executeQuery("SELECT * from coches");
	
	}
}
