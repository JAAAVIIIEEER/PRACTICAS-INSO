package interfaces;

import java.sql.SQLException;

import modelo.Empleado;

public interface EmpleadoInterface {
	
	public void aniadirEmpleado(Empleado empleado) throws SQLException;
	public void eliminarEmpleado(Empleado empleado) throws SQLException;
	public boolean autenticarConexion(String usuario, String contrasenia) throws SQLException;
	
}
