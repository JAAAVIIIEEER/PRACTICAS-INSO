package interfaces;

import java.util.ArrayList;

import modelo.Tienda;

public interface TiendaInterface {
	
	public boolean aniadirTienda(Tienda miTienda);
	public void eliminarTienda(int tiendaid);
	public Tienda consultarTienda(int tiendaid);
	public boolean modificarTienda(Tienda miTienda);
	public ArrayList<Integer> buscarTiendas();
	
}
