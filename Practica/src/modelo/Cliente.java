package modelo;

import java.sql.Date;

public class Cliente {

	private int id;
	private String DNI;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String email;
	private Date nacimiento;
	
	public void setID(int id) {
		this.id = id;
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getID() {
		return this.id;
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
	
	public String getEmail() {
		return this.email;
	}
}
