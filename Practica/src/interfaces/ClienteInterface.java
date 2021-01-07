package interfaces;

import java.sql.Date;

import modelo.Cliente;

public interface ClienteInterface {

	public boolean aniadirCliente(String DNI, String nombre, String apellidos, String telefono, Date nacimiento,
			String email);
	public boolean eliminarCliente(int clienteid);
	public Cliente consultarCliente(String DNI);
	public boolean modificarCliente(String DNI, String nombre, String apellidos, String telefono, Date nacimiento,
			String email);
	
}
