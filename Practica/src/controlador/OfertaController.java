package controlador;

import java.sql.Date;

import modelo.Oferta;
import vista.VistaOferta;

public class OfertaController {
	private  Oferta modelo;
	private VistaOferta vista;
	
	public OfertaController(Oferta modelo, VistaOferta vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public int getDescuento() {
		return this.modelo.getDescuento();
	}

	public void setDescuento(int descuento) {
		this.modelo.setDescuento(descuento);
	}

	public Date getFechaInincio() {
		return this.modelo.getFechaInincio();
	}

	public void setFechaInincio(Date fechaInincio) {
		this.modelo.setFechaInincio(fechaInincio);
	}

	public Date getFechaFin() {
		return this.modelo.getFechaFin();
	}

	public void setFechaFin(Date fechaFin) {
		this.modelo.setFechaFin(fechaFin);
	}

	public String getTipoOferta() {
		return this.modelo.getTipoOferta();
	}

	public void setTipoOferta(String tipoOferta) {
		this.modelo.setTipoOferta(tipoOferta);
	}

	public String getOfertaid() {
		return this.modelo.getOfertaid();
	}

	public void setOfertaid(String ofertaid) {
		this.modelo.setOfertaid(ofertaid);
	}

	public int getEstado() {
		return this.modelo.getEstado();
	}

	public void setEstado(int estado) {
		this.modelo.setEstado(estado);
	}
	
}
