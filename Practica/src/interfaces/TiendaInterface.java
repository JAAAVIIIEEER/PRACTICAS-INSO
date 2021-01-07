package interfaces;

import modelo.Tienda;

public interface TiendaInterface {
	
	public boolean aniadirTienda(String via, String provincia, String municipio, int numero);
	public void eliminarTienda(int tiendaid);
	public Tienda consultarTienda(int tiendaid);
	public boolean modificarTienda(String via, String provincia, String municipio, int numero);
	
}
