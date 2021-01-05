package interfaces;

public interface TiendaInterface {
	
	public boolean AniadirTienda(String via, String provincia, String municipio, int numero);
	public void eliminarTienda(int tiendaid);
	
}
