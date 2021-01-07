package interfaces;

import java.sql.Date;
import java.sql.SQLException;

import modelo.Empleado;
import modelo.Vehiculo;

public interface EmpleadoInterface {
	
	public int autenticarConexion(String usuario, String contrasenia) throws SQLException;
	public boolean aniadirEmpleado(String usuario, String contrasenia, String DNI, String nombre, String apellidos,
			String telefono, Date nacimiento, String email, String tipo);
	public boolean eliminarEmpleado(int empleadoid);
	public Empleado consultarEmpleado(int empleadoid); 
	public boolean modificarEmpleado(String usuario, String contrasenia, String DNI, String nombre, String apellidos,
			String telefono, Date nacimiento, String email, String tipo);
	
}
