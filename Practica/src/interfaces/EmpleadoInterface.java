package interfaces;

import java.sql.Date;
import java.sql.SQLException;

import modelo.Empleado;
import modelo.Vehiculo;

public interface EmpleadoInterface {
	
	public boolean aniadirEmpleado(Empleado nuevoEmpleado);
	public boolean eliminarEmpleado(String empleadoid);
	public Empleado consultarEmpleado(int empleadoid); 
	public boolean modificarEmpleado(Empleado modEmpleado);
	
}
