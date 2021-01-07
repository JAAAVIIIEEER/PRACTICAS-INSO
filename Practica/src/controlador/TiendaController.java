package controlador;

import modelo.Tienda;
import vista.VistaAniadirTienda;

public class TiendaController {
	
	private Tienda modelo;
	private VistaAniadirTienda vista;

	public TiendaController(Tienda modelo, VistaAniadirTienda vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public int getId() {
		return this.modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);;
	}

	public String getVia() {
		return this.modelo.getVia();
	}

	public void setVia(String via) {
		this.modelo.setVia(via);
	}

	public String getProvincia() {
		return this.modelo.getProvincia();
	}

	public void setProvincia(String provincia) {
		this.modelo.setProvincia(provincia);
	}

	public String getMunicipio() {
		return this.modelo.getMunicipio();
	}

	public void setMunicipio(String municipio) {
		this.modelo.setMunicipio(municipio);
	}

	public int getNumero() {
		return this.modelo.getNumero();
	}

	public void setNumero(int numero) {
		this.modelo.setNumero(numero);
	}
}
