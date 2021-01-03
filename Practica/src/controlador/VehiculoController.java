package controlador;

import modelo.Vehiculo;
import vista.VistaVehiculos;

public class VehiculoController {
	
	private Vehiculo modelo;
	
	public VehiculoController(Vehiculo modelo, VistaVehiculos vista) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.modelo.setMatricula(matricula);
	}

	public void setTipo(String tipo) {
		this.modelo.setTipo(tipo);
	}

	public void setPlazas(int plazas) {
		this.modelo.setPlazas(plazas);
	}

	public void setCoste(int coste) {
		this.modelo.setCoste(coste);
	}

	public String getMatricula() {
		return this.modelo.getMatricula();
	}

	public String getTipo() {
		return this.modelo.getTipo();
	}

	public int getPlazas() {
		return this.modelo.getPlazas();
	}

	public int getCoste() {
		return this.modelo.getCoste();
	}
}
