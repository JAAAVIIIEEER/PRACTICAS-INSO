package interfaces;

import modelo.Vehiculo;

public interface VehiculoInterface {
	
	public boolean aniadirVehiculo(Vehiculo miVehiculo);
	public void bajaVehiculo(String matricula);
	public Vehiculo consultarVehiculo(String matricula);
	public boolean modificarVehiculo(String matricula, String tipo, int plazas, String combustible, int precio);
	
}
