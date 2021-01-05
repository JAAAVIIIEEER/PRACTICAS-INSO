package interfaces;

import java.sql.SQLException;

public interface VehiculoInterface {
	
	public boolean aniadirVehiculo(String matricula, String tipo, int plazas, String combustible, int precio);
	public void bajaVehiculo(String matricula);
}
