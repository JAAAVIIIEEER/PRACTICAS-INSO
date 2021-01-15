package implementacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.ClienteInterface;
import modelo.Cliente;

public class ClienteDao extends Conexion implements ClienteInterface {

	@Override
	public boolean aniadirCliente(Cliente miCliente) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"INSERT INTO CLIENTES (DNI, Nombre, Apellido1, Apellido2, Telefono, CorreoElectronico, FechaNacimiento, Pais, Provincia, Municipio, NombreVia, Portal, Piso, Letra) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			st.setString(1, miCliente.getDNI());
			st.setString(2, miCliente.getNombre());
			st.setString(3, miCliente.getApellido1());
			st.setString(4, miCliente.getApellido2());
			st.setString(5, miCliente.getTelefono());
			st.setString(6, miCliente.getEmail());
			st.setDate(7, miCliente.getNacimiento());
			st.setString(8, miCliente.getPais());
			st.setString(9, miCliente.getProvincia());
			st.setString(10, miCliente.getMunicipio());
			st.setString(11, miCliente.getCalle());
			st.setInt(12, miCliente.getPortal());
			st.setInt(13, miCliente.getPiso());
			st.setString(14, miCliente.getLetra());
			st.executeUpdate();
		} catch (SQLException e) {
			if (e.getMessage().indexOf("Duplicate entry") != -1 ? true : false) {
				JOptionPane.showMessageDialog(null, "Ya hay un cliente con el DNI", "DNI Duplicado",
						JOptionPane.ERROR_MESSAGE);
			}
			return false;
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Portal o piso no validos", "Number Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		this.cerrarConexion();
		return true;
	}

	@Override
	public boolean eliminarCliente(String clienteDNI) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("DELETE FROM CLIENTES WHERE DNI=?");
			st.setString(1, clienteDNI);
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;

	}

	@Override
	public Cliente consultarCliente(String DNI) {
		Cliente miCliente = new Cliente();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM CLIENTES WHERE DNI=?");
			st.setString(1, DNI);
			ResultSet res = st.executeQuery();
			while (res.next()) {
				miCliente.setDNI(res.getString("DNI"));
				miCliente.setNombre(res.getString("Nombre"));
				miCliente.setApellido1(res.getString("Apellido1"));
				miCliente.setApellido2(res.getString("Apellido2"));
				miCliente.setTelefono(res.getString("Telefono"));
				miCliente.setEmail(res.getString("CorreoElectronico"));
				miCliente.setNacimiento(res.getDate("FechaNacimiento"));
				miCliente.setPais(res.getString("Pais"));
				miCliente.setProvincia(res.getString("Provincia"));
				miCliente.setMunicipio(res.getString("Municipio"));
				miCliente.setCalle(res.getString("NombreVia"));
				miCliente.setPortal(res.getInt("Portal"));
				miCliente.setPiso(res.getInt("Piso"));
				miCliente.setLetra(res.getString("Letra"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return miCliente;
	}

	@Override
	public ArrayList<Cliente> listarClientes() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement("SELECT * FROM CLIENTES");
			ResultSet res = st.executeQuery();
			while (res.next()) {
				Cliente miCliente = new Cliente();
				miCliente.setDNI(res.getString("DNI"));
				miCliente.setNombre(res.getString("Nombre"));
				miCliente.setApellido1(res.getString("Apellido1"));
				miCliente.setApellido2(res.getString("Apellido2"));
				miCliente.setTelefono(res.getString("Telefono"));
				miCliente.setEmail(res.getString("CorreoElectronico"));
				miCliente.setNacimiento(res.getDate("FechaNacimiento"));
				miCliente.setPais(res.getString("Pais"));
				miCliente.setProvincia(res.getString("Provincia"));
				miCliente.setMunicipio(res.getString("Municipio"));
				miCliente.setCalle(res.getString("NombreVia"));
				miCliente.setPortal(res.getInt("Portal"));
				miCliente.setPiso(res.getInt("Piso"));
				miCliente.setLetra(res.getString("Letra"));
				listaClientes.add(miCliente);
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		this.cerrarConexion();
		return listaClientes;
	}

	@Override
	public boolean modificarCliente(Cliente miCliente) {
		this.establecerConexion();
		try {
			PreparedStatement st = this.getConexion().prepareStatement(
					"UPDATE CLIENTES SET DNI=?, Nombre=?, Apellido1=?, Apellido2=?, Telefono=?, CorreoElectronico=?, FechaNacimiento=?, Pais=?, Provincia=?, Municipio=?, NombreVia=?, Portal=?, Piso=?, Letra=? WHERE DNI=?");
			st.setString(1, miCliente.getDNI());
			st.setString(2, miCliente.getNombre());
			st.setString(3, miCliente.getApellido1());
			st.setString(4, miCliente.getApellido2());
			st.setString(5, miCliente.getTelefono());
			st.setString(6, miCliente.getEmail());
			st.setDate(7, miCliente.getNacimiento());
			st.setString(8, miCliente.getPais());
			st.setString(9, miCliente.getProvincia());
			st.setString(10, miCliente.getMunicipio());
			st.setString(11, miCliente.getCalle());
			st.setInt(12, miCliente.getPortal());
			st.setInt(13, miCliente.getPiso());
			st.setString(14, miCliente.getLetra());
			st.setString(15, miCliente.getDNI());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		this.cerrarConexion();
		return true;
	}
}
