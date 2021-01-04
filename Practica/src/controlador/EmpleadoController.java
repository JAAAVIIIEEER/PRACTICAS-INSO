package controlador;

import modelo.Empleado;

public class EmpleadoController {
	
	private Empleado modelo = new Empleado();
	
	public int autenticarConexion(String usuario, String contrasenia) {
		return modelo.autenticarConexion(usuario, contrasenia);
	}
	
	public boolean aniadirEmpleado() {
		return modelo.aniadirEmpleado();	
	}
}
