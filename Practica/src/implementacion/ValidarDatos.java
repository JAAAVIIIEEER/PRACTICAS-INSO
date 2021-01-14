package implementacion;

import java.sql.Date;
import java.util.regex.Pattern;

public class ValidarDatos {

	/**
	 * Comprueba DNI valido
	 * @param dni
	 * @return
	 */
	public boolean validarDNI(String dni) {
		return Pattern.matches("\\d{8}[A-HJ-NP-TV-Z]", dni);
	}
	
	/**
	 * Comprueba numero de telefono valido
	 * @param telefono
	 * @return
	 */
	public boolean validarTelefono(String telefono) {
		return Pattern.matches("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}", telefono);
	}
	
	/**
	 * Comprueba que una cadena no tiene mas de n caracteres
	 * @param texto
	 * @param caracteres
	 * @return
	 */
	public boolean validarNumeroCaracteres(String texto, int caracteres) {
		if (texto.strip().length() > caracteres) {
			return false;
		}
		return true;
	}
	
	public boolean validarMatricula(String matricula) {
		return Pattern.matches("^[0-9]{1,4}(?!.*(LL|CH))[BCDFGHJKLMNPRSTVWXYZ]{3}", matricula);
	}
	
	public boolean validarNumero(String entero) {
		try {
            Integer.parseInt(entero);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
	}
	
	public boolean validarCadena(String cadena) {
		String regex = "(.)*(\\d)(.)*";      
		Pattern pattern = Pattern.compile(regex);
		return !pattern.matcher(cadena).matches();
	}
	
	public boolean validarEmail(String email) {
		return Pattern.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+$", email);
	}
	
	public boolean validarFechaInicioFin(Date inicio, Date fin) {
		int milisecondsByDay = 86400000;
		int dias = (int) ((fin.getTime() - inicio.getTime())/ milisecondsByDay);
		return dias > 0; 
	}
}
