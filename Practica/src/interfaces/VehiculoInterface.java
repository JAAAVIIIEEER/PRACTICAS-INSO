package interfaces;

import java.util.ArrayList;

import modelo.Vehiculo;

public interface VehiculoInterface {

	public boolean aniadirVehiculo(Vehiculo miVehiculo);

	public void bajaVehiculo(String matricula);

	public Vehiculo consultarVehiculo(String matricula);

	public boolean modificarVehiculo(Vehiculo miVehiculo);

	public ArrayList<String> buscarVehiculosDisponibles();

	public ArrayList<Vehiculo> listarVehiculos();

}
