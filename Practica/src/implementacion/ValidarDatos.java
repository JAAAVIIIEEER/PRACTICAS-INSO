package implementacion;

import java.sql.Date;
import java.util.regex.Pattern;

import modelo.*;

public class ValidarDatos {

	/**
	 * Comprueba DNI valido
	 * 
	 * @param dni
	 * @return
	 */
	private boolean validarDNI(String dni) {
		return Pattern.matches("\\d{8}[A-HJ-NP-TV-Z]", dni);
	}

	/**
	 * Comprueba numero de telefono valido
	 * 
	 * @param telefono
	 * @return
	 */
	private boolean validarTelefono(String telefono) {
		return Pattern.matches("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}", telefono);
	}

	/**
	 * Comprueba que una cadena no tiene mas de n caracteres
	 * 
	 * @param texto
	 * @param caracteres
	 * @return
	 */
	private boolean validarNumeroCaracteres(String texto, int caracteres) {
		if (texto.strip().length() > caracteres) {
			return false;
		}
		return true;
	}

	private boolean validarMatricula(String matricula) {
		return Pattern.matches("^[0-9]{1,4}(?!.*(LL|CH))[BCDFGHJKLMNPRSTVWXYZ]{3}", matricula);
	}

	private boolean validarNumero(String entero) {
		try {
			Integer.parseInt(entero);
			return true;
		} catch (NumberFormatException excepcion) {
			return false;
		}
	}

	private boolean validarCadena(String cadena) {
		String regex = "(.)*(\\d)(.)*";
		Pattern pattern = Pattern.compile(regex);
		if (cadena.isEmpty())
			return false;
		return !pattern.matcher(cadena).matches();
	}

	private boolean validarEmail(String email) {
		return Pattern.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+$", email);
	}

	private boolean validarFechaInicioFin(Date inicio, Date fin) {
		int milisecondsByDay = 86400000;
		int dias = (int) ((fin.getTime() - inicio.getTime()) / milisecondsByDay);
		return dias > 0;
	}

	public int validarEmpleado(Empleado miEmpleado) {
		if (!validarDNI(miEmpleado.getUsuarioDNI()))
			return 1;
		if (!validarNumeroCaracteres(miEmpleado.getContrasenia(), 12)
				|| validarNumeroCaracteres(miEmpleado.getContrasenia(), 3))
			return 2;
		if (!validarCadena(miEmpleado.getNombre()))
			return 3;
		if (!validarCadena(miEmpleado.getApellido1()))
			return 4;
		if (!validarCadena(miEmpleado.getApellido2()))
			return 5;
		if (!validarTelefono(miEmpleado.getTelefono()))
			return 6;
		if (!validarEmail(miEmpleado.getEmail()))
			return 7;
		return 0;
	}

	public int validarVehiculo(Vehiculo miVehiculo) {
		if (!validarMatricula(miVehiculo.getMatricula()))
			return 1;
		if (miVehiculo.getModelo().isEmpty())
			return 2;
		return 0;
	}
	
	public int validarTienda(Tienda miTienda) {
		if (validarNumeroCaracteres(miTienda.getProvincia(), 3))
			return 1;
		if (validarNumeroCaracteres(miTienda.getMunicipio(), 2))
			return 2;
		if (validarNumeroCaracteres(miTienda.getVia(), 1))
			return 3;
		if (!validarEmail(miTienda.getEmail()))
			return 5;
		if (!validarTelefono(miTienda.getTelefono()))
			return 6;
		return 0;
	}
	
	public int validarAlquiler(Alquiler miAlquiler) {
		if (!validarDNI(miAlquiler.getDniEmpleado()))
			return 1;
		if (!validarDNI(miAlquiler.getDniCliente()))
			return 2;
		if (!validarFechaInicioFin(miAlquiler.getFecha1(), miAlquiler.getFecha2()))
			return 3;
		return 0;
	}
	
	public int validarCliente(Cliente miCliente) {
		if (validarNumeroCaracteres(miCliente.getNombre(), 2))
			return 1;
		if (validarNumeroCaracteres(miCliente.getApellido1(), 2))
			return 2;
		if (validarNumeroCaracteres(miCliente.getApellido2(), 2))
			return 3;
		if (!validarTelefono(miCliente.getTelefono()))
			return 4;
		if (!validarEmail(miCliente.getEmail()))
			return 5;
		if (!validarDNI(miCliente.getDNI()))
			return 6;
		if (validarNumeroCaracteres(miCliente.getPais(), 3))
			return 7;
		if (validarNumeroCaracteres(miCliente.getProvincia(), 3))
			return 8;
		if (validarNumeroCaracteres(miCliente.getMunicipio(), 2))
			return 9;
		if (validarNumeroCaracteres(miCliente.getCalle(), 1))
			return 10;
//		if (miCliente.getLetra().length() != 1 || Character.isLetter(miCliente.getLetra().charAt(0)))
//			return 13;
		return 0;
	}
	
	public int validarOferta(Oferta miOferta) {
		if (validarNumeroCaracteres(miOferta.getEspecificacion(), 2))
			return 1;
		if (!validarFechaInicioFin(miOferta.getFechaInicio(), miOferta.getFechaFin()))
			return 2;
		return 0;
	}
}
