package controlador;

import modelo.Alquiler;
import modelo.Incidencia;

public class IncidenciaController {

	private Incidencia modelo;
	
	public IncidenciaController(Incidencia modelo) {
		this.modelo = modelo;
	}
	
	public Alquiler getAlquiler() {
		return this.modelo.getAlquiler();
	}
	public void setAlquiler(Alquiler alquiler) {
		this.modelo.setAlquiler(alquiler);
	}
	public int getEstado() {
		return this.modelo.getEstado();
	}
	public void setEstado(int estado) {
		this.modelo.setEstado(estado);
	}
	public int getId() {
		return this.modelo.getId();
	}
	public void setId(int id) {
		this.modelo.setId(id);
	}
}
