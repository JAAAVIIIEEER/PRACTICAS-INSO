package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import implementacion.EmpleadoDao;
import modelo.Empleado;
import vista.VistaEmpleado;

public class EmpleadoController {
	
	private Empleado modelo;
	private VistaEmpleado vista;
	
	public EmpleadoController(Empleado modelo, VistaEmpleado vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void setID(int id) {
		this.modelo.setID(id);
	}
	
	public void setUsuario(String usuario) {
		this.modelo.setUsuario(usuario);
	}

	public void setContrasenia(String contrasenia) {
		this.modelo.setContrasenia(contrasenia);
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
	
	public void setTipo(String tipo) {
		this.modelo.setTipo(tipo);
	}
	
	public void setEmail(String email) {
		this.modelo.setEmail(email);
	}
	
	public int getID() {
		return this.modelo.getID();
	}
	
	public String getUsuario() {
		return this.modelo.getUsuario();
	}
	
	public String getContrasenia() {
		return this.modelo.getContrasenia();
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
	
	public String getTipo() {
		return this.modelo.getTipo();
	}
	
	public Date getNacimiento() {
		return this.modelo.getNacimiento();
	}
	
	public String getEmail() {
		return this.modelo.getEmail();
	}
}
