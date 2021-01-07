package interfaces;

import java.sql.SQLException;

import modelo.Vehiculo;

public interface VehiculoInterface {
	
	public boolean aniadirVehiculo(String matricula, String tipo, int plazas, String combustible, int precio);
	public void bajaVehiculo(String matricula);
	public Vehiculo consultarVehiculo(String matricula);
	
}
