package modelo;

import java.sql.Date;

public class Oferta {

	private int descuento;
	private Date fechaInicio;
	private Date fechaFin;
	private String tipoOferta;
	private int ofertaid;
	private String estado;
	private String especificacion;
	
	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInincio) {
		this.fechaInicio = fechaInincio;
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

	public int getOfertaid() {
		return ofertaid;
	}

	public void setOfertaid(int id) {
		this.ofertaid = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String string) {
		this.estado = string;
	}

	public String getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(String especificacion) {
		this.especificacion = especificacion;
	}
}
