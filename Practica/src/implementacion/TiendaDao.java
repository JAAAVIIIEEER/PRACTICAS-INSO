package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.TiendaInterface;
import modelo.Tienda;

public class TiendaDao extends Conexion implements TiendaInterface {

	@Override
	public boolean aniadirTienda(Tienda miTienda) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO TIENDAS (Provincia, Municipio, NombreVia, Portal, Telefono, CorreoElectronico) VALUES (?, ?, ?, ?, ?, ?)");
			st.setString(1, miTienda.getProvincia());
			st.setString(2, miTienda.getMunicipio());
			st.setString(3, miTienda.getVia());
			st.setInt(4, miTienda.getNumero());
			st.setString(5, miTienda.getTelefono());
			st.setString(6, miTienda.getEmail());
			st.executeUpdate();
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Portal no valido", "Number Fail", JOptionPane.ERROR_MESSAGE);
			return false;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public void eliminarTienda(int tiendaid) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM TIENDAS WHERE TiendaID=?");
			st.setInt(1, tiendaid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
	}

	@Override
	public Tienda consultarTienda(int tiendaid) {
		Tienda miTienda = new Tienda();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM TIENDAS WHERE TiendaID=?");
			st.setInt(1, tiendaid);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miTienda.setProvincia(res.getString("Provincia"));
				miTienda.setMunicipio(res.getString("Municipio"));
				miTienda.setVia(res.getString("NombreVia"));
				miTienda.setNumero(res.getInt("Portal"));
				miTienda.setTelefono(res.getString("Telefono"));
				miTienda.setEmail(res.getString("CorreoElectronico"));
				miTienda.setId(res.getInt("TiendaID"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return miTienda;
	}

	@Override
	public ArrayList<Tienda> listarTiendas() {
		ArrayList<Tienda> listaTiendas = new ArrayList<Tienda>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM TIENDAS");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				Tienda miTienda = new Tienda();
				miTienda.setProvincia(res.getString("Provincia"));
				miTienda.setMunicipio(res.getString("Municipio"));
				miTienda.setVia(res.getString("NombreVia"));
				miTienda.setNumero(res.getInt("Portal"));
				miTienda.setTelefono(res.getString("Telefono"));
				miTienda.setEmail(res.getString("CorreoElectronico"));
				miTienda.setId(res.getInt("TiendaID"));
				listaTiendas.add(miTienda);
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaTiendas;
	}

	@Override
	public boolean modificarTienda(Tienda miTienda) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE TIENDAS SET Provincia=?, Municipio=?, NombreVia=?, Portal=?, Telefono=?, CorreoElectronico=? WHERE TiendaID=?");
			st.setString(1, miTienda.getProvincia());
			st.setString(2, miTienda.getMunicipio());
			st.setString(3, miTienda.getVia());
			st.setInt(4, miTienda.getNumero());
			st.setString(5, miTienda.getTelefono());
			st.setString(6, miTienda.getEmail());
			st.setInt(7, miTienda.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		;
		return true;
	}

	@Override
	public ArrayList<Integer> buscarTiendas() {
		ArrayList<Integer> tiendaIDs = new ArrayList<Integer>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT TiendaID FROM TIENDAS");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				tiendaIDs.add(res.getInt("TiendaID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.cerrarConexion();
		;
		return tiendaIDs;
	}
}
