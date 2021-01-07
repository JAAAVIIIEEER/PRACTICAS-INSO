package controlador;

import java.sql.Date;

import modelo.Alquiler;
import vista.VistaAniadirAlquiler;

public class AlquilerController {

	private Alquiler modelo;
	private VistaAniadirAlquiler vista;
	
	public AlquilerController(Alquiler modelo, VistaAniadirAlquiler vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public int getId() {
		return this.modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);;
	}

	public String getDni() {
		return this.modelo.getDni();
	}

	public void setDni(String dni) {
		this.modelo.setDni(dni);
	}

	public Date getFecha1() {
		return this.modelo.getFecha1();
	}

	public void setFecha1(Date fecha1) {
		this.modelo.setFecha1(fecha1);;
	}

	public Date getFecha2() {
		return this.modelo.getFecha2();
	}

	public void setFecha2(Date fecha2) {
		this.modelo.setFecha2(fecha2);;
	}

	public String getMatVehiculo() {
		return this.modelo.getMatVehiculo();
	}

	public void setMatVehiculo(String matVehiculo) {
		this.modelo.setMatVehiculo(matVehiculo);;
	}

	public int getEstado() {
		return this.modelo.getEstado();
	}

	public void setEstado(int estado) {
		this.modelo.setEstado(estado);;
	} 
}
