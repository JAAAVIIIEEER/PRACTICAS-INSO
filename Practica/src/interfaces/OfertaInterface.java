package interfaces;

import java.sql.Date;

import modelo.Oferta;

public interface OfertaInterface {
	public boolean aniadirOferta(int descuento, Date fechaInicio, Date fechaFin, String tipo, String ofertaid);
	public boolean eliminarOferta(String ofertaid);
	public Oferta buscarOferta(int ofertaid); 
	public boolean modificarOferta(int descuento,Date fechaInicio, Date fechaFin, String tipo, String ofertaid);
}
