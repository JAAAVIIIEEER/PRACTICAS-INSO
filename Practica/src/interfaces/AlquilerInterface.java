package interfaces;

import java.util.ArrayList;

import modelo.Alquiler;

public interface AlquilerInterface {

	public boolean finalizarAlquiler(int alquilerid);
	public boolean aniadirAlquiler(Alquiler miAlquiler);
	public Alquiler consultarAlquiler(int alquilerid);
	public boolean modificarAlquiler(Alquiler miAlquiler);
	public int calcularCoste(String matVehiculo);
	public ArrayList<Alquiler> listarAlquileres();
}
