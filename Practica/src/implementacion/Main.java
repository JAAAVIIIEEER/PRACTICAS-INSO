package implementacion;

import java.io.IOException;
import java.sql.*;

import controlador.*;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

		ControladorGeneral aut = new ControladorGeneral();
		aut.mostrarVentanaAutenticar();	
	}
}
