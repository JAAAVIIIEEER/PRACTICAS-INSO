package implementacion;

import modelo.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.VehiculoInterface;


public class VehiculoDao extends Conexion implements VehiculoInterface{
	
	@Override
	public boolean aniadirVehiculo(Vehiculo miVehiculo) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO Vehiculos (Matricula, Tipo, Combustible, Plazas, CostePorDia, Extras, Tienda, Modelo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, miVehiculo.getMatricula());
			st.setString(2, miVehiculo.getTipo());
			st.setString(3, miVehiculo.getCombustible());
			st.setInt(4, miVehiculo.getPlazas());
			st.setInt(5, miVehiculo.getCoste());
			st.setString(6, miVehiculo.getExtras());
			st.setInt(7, miVehiculo.getTiendaID());
			st.setString(8, miVehiculo.getModelo());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public void bajaVehiculo(String matricula) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM VEHICULOS WHERE Matricula=?");
			st.setString(1, matricula);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
	}

	@Override
	public Vehiculo consultarVehiculo(String matricula) {
		Vehiculo miVehiculo = new Vehiculo();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM VEHICULOS WHERE MATRICULA=?");
			st.setString(1, matricula);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miVehiculo.setMatricula(res.getString("Matricula"));
				miVehiculo.setTipo(res.getString("Tipo"));
				miVehiculo.setCombustible(res.getString("Combustible"));
				miVehiculo.setPlazas(res.getInt("Plazas"));
				miVehiculo.setCoste(res.getInt("CostePorDia"));
				miVehiculo.setExtras(res.getString("Extras"));
				miVehiculo.setTiendaID(res.getInt("Tienda"));
				miVehiculo.setEstado(res.getString("Estado"));
				miVehiculo.setModelo(res.getString("Modelo"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return miVehiculo;
	}

	@Override
	public boolean modificarVehiculo(Vehiculo miVehiculo) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE Vehiculos SET Matricula=?, Tipo=?, Combustible=?, Plazas=?, CostePorDia=?, Extras=?, Tienda=?, Modelo=?  WHERE matricula=?");
			st.setString(1, miVehiculo.getMatricula());
			st.setString(2, miVehiculo.getTipo());
			st.setString(3, miVehiculo.getCombustible());
			st.setInt(4, miVehiculo.getPlazas());
			st.setInt(5, miVehiculo.getCoste());
			st.setString(6, miVehiculo.getExtras());
			st.setInt(7, miVehiculo.getTiendaID());
			st.setString(8, miVehiculo.getModelo());
			st.setString(9, miVehiculo.getMatricula());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}
	
	@Override
	public ArrayList<String> buscarVehiculosDisponibles() {
		ArrayList<String> disponibles = new ArrayList<String>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT Matricula FROM VEHICULOS WHERE Estado=?");
			st.setString(1, "Disponible");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				disponibles.add(res.getString("Matricula"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return disponibles;
	}
}
