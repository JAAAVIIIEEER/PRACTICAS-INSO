package interfaces;

import java.sql.Date;

import modelo.Alquiler;

public interface AlquilerInterface {

	public boolean finalizarAlquiler(int alquilerid);
	public boolean aniadirAlquiler(String DNI, Date inicio, Date finalAlquiler, String vehiculo);
	public Alquiler consultarAlquiler(int alquilerid);
	public boolean modificarAlquiler(String DNI, Date inicio, Date finalAlquiler, String vehiculo);
}
