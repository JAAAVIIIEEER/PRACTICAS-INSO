package interfaces;

import java.sql.Date;

import modelo.Cliente;

public interface ClienteInterface {

	public boolean aniadirCliente(Cliente miCliente);
	public boolean eliminarCliente(String clienteDNI);
	public Cliente consultarCliente(String DNI);
	public boolean modificarCliente(Cliente miCliente);
	
}
