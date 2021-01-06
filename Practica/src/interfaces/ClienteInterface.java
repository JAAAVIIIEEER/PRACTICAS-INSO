package interfaces;

import java.sql.Date;

public interface ClienteInterface {

	public boolean aniadirCliente(String DNI, String nombre, String apellidos, String telefono, Date nacimiento,
			String email);
	public boolean eliminarCliente(int clienteid);
	
}
