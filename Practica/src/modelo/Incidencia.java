package modelo;

public class Incidencia {

	private int alquilerID;
	private String estado;
	private int id;
	private String tipo;
	private String informe;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAlquilerID() {
		return alquilerID;
	}

	public void setAlquilerID(int alquilerID) {
		this.alquilerID = alquilerID;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}
}
