package modelo;

public class Vehiculo {
	
	public static enum TiposVehiculos {furgoneta, coche};
	
	private String matricula;
	private String tipo;
	private int coste;
	private int plazas;
	
	public Vehiculo() {}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	public void setCoste(int coste) {
		this.coste = coste;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getPlazas() {
		return this.plazas;
	}
	
	public int getCoste() {
		return this.coste;
	}
}
