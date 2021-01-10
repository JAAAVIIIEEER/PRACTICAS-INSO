package modelo;

public class Incidencia {

	private Alquiler alquiler;
	private int estado;
	private int id;
	
	public Incidencia(Alquiler alquiler, int id) {
		super();
		this.alquiler = alquiler;
		this.id = id;
	}
	
	public Alquiler getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
