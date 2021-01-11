package controlador;

import modelo.Vehiculo;
import vista.VistaVehiculo;

public class VehiculoController {
	
	private Vehiculo modelo;
	private VistaVehiculo vista;
	
	public VehiculoController(Vehiculo modelo, VistaVehiculo vista) {
		this.modelo = modelo;
		this.vista = vista;
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
	
	public void actualizarVistaAniadirVehiculo() {
		this.vista.isFontSet();
	}
}
