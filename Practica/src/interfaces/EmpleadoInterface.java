package interfaces;

import java.util.ArrayList;

import modelo.Empleado;

public interface EmpleadoInterface {

	public boolean aniadirEmpleado(Empleado nuevoEmpleado);

	public boolean eliminarEmpleado(String empleadoid);

	public Empleado consultarEmpleado(String empleadoDNI);

	public boolean modificarEmpleado(Empleado modEmpleado);

	public ArrayList<Empleado> listarEmpleados();

}
