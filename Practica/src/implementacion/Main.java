package implementacion;
import java.io.IOException;
import java.sql.*;

import vista.*;
import controlador.*;
import modelo.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		AutenticarController aut = new AutenticarController(new VistaAutenticar());
		aut.mostrarVentanaAutenticar();	
	}
}
