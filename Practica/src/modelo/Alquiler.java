package modelo;

import java.sql.Date;

public class Alquiler {
	
	private int id;
	private String dni;
	private Date fecha1;
	private Date fecha2;
	private String matVehiculo;
	private int estado;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFecha1() {
		return fecha1;
	}

	public void setFecha1(Date fecha1) {
		this.fecha1 = fecha1;
	}

	public Date getFecha2() {
		return fecha2;
	}

	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}

	public String getMatVehiculo() {
		return matVehiculo;
	}

	public void setMatVehiculo(String matVehiculo) {
		this.matVehiculo = matVehiculo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
