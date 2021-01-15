package modelo;

import java.sql.Date;

public class Empleado {

	public static final int baja = 0;
	public static final int activo = 1;

	public static final String administrador = "Administrador";
	public static final String base = "Base";

	private int id;
	private String contrasenia;
	private String UsuarioDNI;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String email;
	private String tipo;
	// TODO
	private Date nacimiento;

	public void setID(int id) {
		this.id = id;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void setUsuarioDNI(String DNI) {
		this.UsuarioDNI = DNI;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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

	public String getContrasenia() {
		return this.contrasenia;
	}

	public String getUsuarioDNI() {
		return this.UsuarioDNI;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
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
}
