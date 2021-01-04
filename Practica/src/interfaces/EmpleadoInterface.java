package interfaces;

import java.sql.SQLException;

import modelo.Empleado;

public interface EmpleadoInterface {
	
	public boolean aniadirEmpleado(Empleado empleado) throws SQLException;
	public void eliminarEmpleado(Empleado empleado) throws SQLException;
	public int autenticarConexion(String usuario, String contrasenia) throws SQLException;
	
}
