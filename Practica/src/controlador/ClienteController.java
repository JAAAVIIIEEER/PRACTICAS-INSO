package controlador;

import java.sql.Date;

import modelo.Cliente;
import vista.VistaCliente;

public class ClienteController {
	
	private Cliente modelo;
	private VistaCliente vista;

	public ClienteController(Cliente modelo, VistaCliente vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void setID(int id) {
		this.modelo.setID(id);
	}
	
	public void setDNI(String DNI) {
		this.modelo.setDNI(DNI);
	}
	
	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}
	
	public void setApellidos(String apellidos) {
		this.modelo.setApellidos(apellidos);
	}
	
	public void setTelefono(String telefono) {
		this.modelo.setTelefono(telefono);
	}

	public void setNacimiento(Date nacimiento) {
		this.modelo.setNacimiento(nacimiento);
	}
	
	public void setEmail(String email) {
		this.modelo.setEmail(email);
	}
	
	public int getID() {
		return this.modelo.getID();
	}

	public String getDNI() {
		return this.modelo.getDNI();
	}
	
	public String getNombre() {
		return this.modelo.getNombre();
	}
	
	public String getApellidos() {
		return this.modelo.getApellidos();
	}
	
	public String getTelefono() {
		return this.modelo.getTelefono();
	}
	
	public Date getNacimiento() {
		return this.modelo.getNacimiento();
	}
	
	public String getEmail() {
		return this.modelo.getEmail();
	}
}
