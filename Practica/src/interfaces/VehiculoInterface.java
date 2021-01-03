package interfaces;

import java.sql.SQLException;

public interface VehiculoInterface {
	
	public void aniadirVehiculo(String matricula, String tipo, int plazas, String combustible, int precio) throws SQLException;
	public void darBajaVehiculo(String matricula) throws SQLException;
}
