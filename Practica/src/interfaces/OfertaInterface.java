package interfaces;

import java.util.ArrayList;

import modelo.Oferta;

public interface OfertaInterface {
	public boolean aniadirOferta(Oferta miOferta);
	public boolean eliminarOferta(int ofertaid);
	public Oferta buscarOferta(int ofertaid); 
	public boolean modificarOferta(Oferta miOferta);
	public Oferta buscarPosibleOferta(String matVehiculo);
	public ArrayList<Oferta> listarOfertas();
}
