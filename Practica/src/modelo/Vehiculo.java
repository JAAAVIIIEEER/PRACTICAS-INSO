package modelo;

public class Vehiculo {
	
	public static enum TiposVehiculos {furgoneta, coche};
	public static enum TiposCombustible {gasolina, diesel, hibrido, electrico}
	
	private String matricula;
	private String tipo;
	private String combustible;
	private int coste;
	private int plazas;
	private String estado;
	private String marca;
	private int tiendaID;
	private String extras;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	public void setCoste(int coste) {
		this.coste = coste;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getCombustible() {
		return this.combustible;
	}
	
	public int getPlazas() {
		return this.plazas;
	}
	
	public int getCoste() {
		return this.coste;
	}

	public String getEstado() {
		return this.estado;
	}

	public int getTiendaID() {
		return tiendaID;
	}

	public void setTiendaID(int tiendaID) {
		this.tiendaID = tiendaID;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}
}
