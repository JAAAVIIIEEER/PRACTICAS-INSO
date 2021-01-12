package interfaces;

import java.sql.Date;

import modelo.Alquiler;

public interface AlquilerInterface {

	public boolean finalizarAlquiler(int alquilerid);
	public boolean aniadirAlquiler(Alquiler miAlquiler);
	public Alquiler consultarAlquiler(int alquilerid);
	public boolean modificarAlquiler(Alquiler miAlquiler);
}
