package modelo;

import java.sql.Date;

public class Empleado {
	
	public static final int baja = 0;
	public static final int activo = 1; 
	
	private int id;
	private String usuario;
	private String contrasenia;
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;
	private Date nacimiento;
	
	public Empleado() {	}
	
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

	public void setNacimientoDay(int dia) {
		this.nacimiento.setDate(dia);
	}
	
	public void setNacimientoMonth(int mes) {
		this.nacimiento.setMonth(mes);
	}
	
	public void setNacimientoYear(int year) {
		this.nacimiento.setYear(year);
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
	
	public Date getNacimiento() {
		return this.nacimiento;
	}
}

