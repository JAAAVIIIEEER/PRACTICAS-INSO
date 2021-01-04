package implementacion;

import modelo.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.VehiculoInterface;


public class VehiculoImpl extends Conexion implements VehiculoInterface{
	
	public List<Vehiculo> listaVehiculos() throws Exception {
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		
		this.establecerConexion();
		PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM VEHICULOS");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			
		}
		
		this.cerrarConexion();
		return listaVehiculos;
	}

	@Override
	public void aniadirVehiculo(String matricula, String tipo, int plazas, String combustible, int precio) throws SQLException {
		this.establecerConexion();
		PreparedStatement st = this.getConexion().prepareStatement("");
		st.executeQuery();
		this.cerrarConexion();
	}

	@Override
	public void darBajaVehiculo(String matricula) throws SQLException {
		this.establecerConexion();
		PreparedStatement st = this.getConexion().prepareStatement("");
		st.executeQuery();
		this.cerrarConexion();
	}
}
