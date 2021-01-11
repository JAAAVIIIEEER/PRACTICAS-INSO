package implementacion;

import java.util.regex.Pattern;

public class ValidarDatos {

	public boolean validarDNI(String dni) {
		return Pattern.matches("\\d{8}[A-HJ-NP-TV-Z]", dni);
	}
	
	public boolean validarTelefono(String telefono) {
		return Pattern.matches("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}", telefono);
	}
}
