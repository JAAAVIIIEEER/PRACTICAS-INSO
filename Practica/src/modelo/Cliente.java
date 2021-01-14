package modelo;

import java.sql.Date;

public class Cliente {

	private String DNI;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String email;
	private Date nacimiento;
	private String pais;
	private String provincia;
	private String municipio;
	private String calle;
	private Integer portal;
	private Integer piso;
	private String letra;
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
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
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDNI() {
		return this.DNI;
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
	
	public Date getNacimiento() {
		return this.nacimiento;
	}
	
	public String getEmail() {
		return this.email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getPortal() {
		return portal;
	}

	public void setPortal(Integer portal) {
		this.portal = portal;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}
}
