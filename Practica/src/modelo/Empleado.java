package modelo;

import java.sql.Date;
import implementacion.EmpleadoImpl;

public class Empleado {
	
	public static final int baja = 0;
	public static final int activo = 1; 
	
	public static final String administrador = "Administrador";
	public static final String base = "Base";
	
	private int id;
	private String usuario;
	private String contrasenia;
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private String tipo;
	private Date nacimiento;
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public String getContrasenia() {
		return this.contrasenia;
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public Date getNacimiento() {
		return this.nacimiento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public boolean aniadirEmpleado() {
		EmpleadoImpl aux = new EmpleadoImpl();
		return false;
	}
}

