package interfaces;

import java.sql.Date;
import java.sql.SQLException;

import modelo.Empleado;

public interface EmpleadoInterface {
	
	public int autenticarConexion(String usuario, String contrasenia) throws SQLException;
	public boolean aniadirEmpleado(String usuario, String contrasenia, String DNI, String nombre, String apellidos,
			String telefono, Date nacimiento, String email, String tipo);
	public boolean eliminarEmpleado(int empleadoid); 
	
}
