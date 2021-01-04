package modelo;

public class Vehiculo {
	
	private static final int ALQUILADO = 1; 
	private static final int DISPONIBLE = 0; 
	
	public static enum TiposVehiculos {furgoneta, coche};
	public static enum TiposCombustible {gasolina, diesel, hibrido, electrico}
	
	private String matricula;
	private String tipo;
	private String combustible;
	private int coste;
	private int plazas;
	private int estado;
	
	public Vehiculo() {}
	
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
	
	public void setEstado(int estado) {
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

	public int getEstado() {
		return this.estado;
	}
}
