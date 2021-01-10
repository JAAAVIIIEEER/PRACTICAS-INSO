package modelo;

import java.sql.Date;

public class Oferta {

	private int descuento;
	private Date fechaInincio;
	private Date fechaFin;
	private String tipoOferta;
	private String ofertaid;
	private int estado;
	
	public Oferta(int descuento, Date fechaInicio, Date fechaFin,String tipoOferta, String ofertaid) {
		this.descuento=descuento;
		this.fechaInincio=fechaInicio;
		this.fechaFin=fechaFin;
		this.tipoOferta=tipoOferta;
		this.ofertaid=ofertaid;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public Date getFechaInincio() {
		return fechaInincio;
	}

	public void setFechaInincio(Date fechaInincio) {
		this.fechaInincio = fechaInincio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTipoOferta() {
		return tipoOferta;
	}

	public void setTipoOferta(String tipoOferta) {
		this.tipoOferta = tipoOferta;
	}

	public String getOfertaid() {
		return ofertaid;
	}

	public void setOfertaid(String ofertaid) {
		this.ofertaid = ofertaid;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
