package interfaces;

import java.sql.Date;

public interface AlquilerInterface {

	public boolean finalizarAlquiler(int alquilerid);

	public boolean aniadirAlquiler(String DNI, Date inicio, Date finalAlquiler, String vehiculo);

}
