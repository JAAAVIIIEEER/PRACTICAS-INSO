package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import interfaces.OfertaInterface;
import modelo.Oferta;

public class OfertaDao extends Conexion implements OfertaInterface {

	@Override
	public boolean aniadirOferta(Oferta miOferta) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO OFERTAS (FechaInicio, FechaFin, Tipo, Especificacion, Descuento) VALUES (?, ?, ?, ?, ?)");
			st.setDate(1, miOferta.getFechaInicio());
			st.setDate(2, miOferta.getFechaFin());
			st.setString(3, miOferta.getTipoOferta());
			st.setString(4, miOferta.getEspecificacion());
			st.setInt(5, miOferta.getDescuento());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public boolean eliminarOferta(int ofertaid) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("UPDATE OFERTAS SET ESTADO=? WHERE OfertaID=?");
			st.setString(1, "Finalizada");
			st.setInt(2, ofertaid);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public Oferta buscarOferta(int ofertaid) {
		Oferta miOferta = new Oferta();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM OFERTAS WHERE OfertaID=?");
			st.setInt(1, ofertaid);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miOferta.setFechaInicio(res.getDate("FechaInicio"));
				miOferta.setFechaFin(res.getDate("FechaFin"));
				miOferta.setTipoOferta(res.getString("Tipo"));
				miOferta.setEspecificacion(res.getString("Especificacion"));
				miOferta.setDescuento(res.getInt("Descuento"));
				miOferta.setEstado(res.getString("Estado"));
				miOferta.setOfertaid(res.getInt("OfertaID"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return miOferta;
	}
	
	@Override
	public ArrayList<Oferta> listarOfertas() {
		ArrayList<Oferta> listaOfertas = new ArrayList<Oferta>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM OFERTAS");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				Oferta miOferta = new Oferta();
				miOferta.setFechaInicio(res.getDate("FechaInicio"));
				miOferta.setFechaFin(res.getDate("FechaFin"));
				miOferta.setTipoOferta(res.getString("Tipo"));
				miOferta.setEspecificacion(res.getString("Especificacion"));
				miOferta.setDescuento(res.getInt("Descuento"));
				miOferta.setEstado(res.getString("Estado"));
				miOferta.setOfertaid(res.getInt("OfertaID"));
				listaOfertas.add(miOferta);
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return listaOfertas;
	}

	@Override
	public boolean modificarOferta(Oferta miOferta) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE OFERTAS SET FechaInicio=?, FechaFin=?, Tipo=?, Especificacion=?, Descuento=? WHERE OfertaID=?");
			st.setDate(1, miOferta.getFechaInicio());
			st.setDate(2, miOferta.getFechaFin());
			st.setString(3, miOferta.getTipoOferta());
			st.setString(4, miOferta.getEspecificacion());
			st.setInt(5, miOferta.getDescuento());
			st.setInt(6, miOferta.getOfertaid());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public Oferta buscarPosibleOferta(String matVehiculo) {
		String combustibleVehiculo = "";
		String modeloVehiculo = "";
		Oferta miOferta = new Oferta();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion()
					.prepareStatement("SELECT Combustible, Modelo FROM vehiculos WHERE Matricula=?");
			st.setString(1, matVehiculo);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				combustibleVehiculo = rs.getString("Combustible");
				modeloVehiculo = rs.getString("Modelo");
			}
			st = this.getConexion().prepareStatement("SELECT * FROM OFERTAS");
			rs = st.executeQuery();
			while (rs.next()) {
				if (rs.getString("Estado").equals("Activa")) {
					switch (rs.getString("Tipo")) {
					case "Modelo":
						if (rs.getString("Especificacion").equals(modeloVehiculo)) {
							miOferta.setOfertaid(rs.getInt("OfertaID"));
							miOferta.setDescuento(rs.getInt("Descuento"));
							return miOferta;
						}
					case "Vehiculo":
						if (rs.getString("Especificacion").equals(matVehiculo)) {
							miOferta.setOfertaid(rs.getInt("OfertaID"));
							miOferta.setDescuento(rs.getInt("Descuento"));
							return miOferta;
						}
					case "Combustible":
						if (rs.getString("Especificacion").equals(combustibleVehiculo)) {
							miOferta.setOfertaid(rs.getInt("OfertaID"));
							miOferta.setDescuento(rs.getInt("Descuento"));
							return miOferta;
						}
					}
				}
			}
			rs.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		this.cerrarConexion();
		return null;
	}
}
