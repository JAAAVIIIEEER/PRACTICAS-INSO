package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.ClienteDao;
import implementacion.ValidarDatos;
import modelo.Cliente;
import vista.VistaCliente;

public class ControladorClientes {

	private VistaCliente vistaCliente;
	private ValidarDatos validarDatos;
	private ControladorGeneral cont;
	
	public ControladorClientes(VistaCliente vistaCliente, ControladorGeneral cont) {
		this.vistaCliente = vistaCliente;
		this.validarDatos = new ValidarDatos();
		this.cont = cont;
	}

	public void aniadirCliente() {
		vistaCliente.establecerEstadoDefecto();
		vistaCliente.removeListenerAniadirButton();
		vistaCliente.establecerBordesDefecto();
		vistaCliente.setVisible(true);
		this.vistaCliente.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente miCliente = new Cliente();
				vistaCliente.establecerBordesDefecto();
				miCliente.setDNI(vistaCliente.getDNIText());
				miCliente.setNombre(vistaCliente.getNombreText());
				miCliente.setApellido1(vistaCliente.getApellido1Text());
				miCliente.setApellido2(vistaCliente.getApellido2Text());
				miCliente.setTelefono(vistaCliente.getTelefonoText());
				miCliente.setNacimiento(vistaCliente.getNacimientoDate());
				miCliente.setPais(vistaCliente.getPaisText());
				miCliente.setProvincia(vistaCliente.getProvinciaText());
				miCliente.setMunicipio(vistaCliente.getMunicipioText());
				miCliente.setCalle(vistaCliente.getCalleText());
				miCliente.setPortal(vistaCliente.getPortalText());
				miCliente.setLetra(vistaCliente.getLetraText());
				miCliente.setEmail(vistaCliente.getEmailText());
				miCliente.setPiso(vistaCliente.getPisoText());
				int validar = validarDatos.validarCliente(miCliente);
				ClienteDao cliente = new ClienteDao();
				if (validar == 0) {
					if (cliente.aniadirCliente(miCliente)) {
						vistaCliente.setVisible(false);
						vistaCliente.avisarClienteAniadidoCorrecto();
						ControladorGeneral.logger.info("Cliente añadido correctamente");
						cont.actualizarClientes();
					}
				} else {
					vistaCliente.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al añadir un cliente");
				}
			}
		});
	}

	public void eliminarCliente() {
		String dni = vistaCliente.mostrarVentanaBajaCliente();
		if (dni != null) {
			ClienteDao cliente = new ClienteDao();
			if (validarDatos.validarDNI(dni)) {
				cliente.eliminarCliente(dni);
				ControladorGeneral.logger.info("Cliente eliminado correctamente");
				vistaCliente.clienteEliminado();
				cont.actualizarClientes();
			} else {
				vistaCliente.mostrarDniNoValido();
			}
		}
	}

	public void modificarCliente() {
		vistaCliente.establecerBordesDefecto();
		vistaCliente.removeListenerAniadirButton();
		String dni = vistaCliente.mostrarVentanaConsultarCliente();
		ClienteDao cliente = new ClienteDao();
		Cliente miCliente = cliente.consultarCliente(dni);
		vistaCliente.setDNIText(miCliente.getDNI());
		vistaCliente.setNombreText(miCliente.getNombre());
		vistaCliente.setApellido1Text(miCliente.getApellido1());
		vistaCliente.setApellido2Text(miCliente.getApellido2());
		vistaCliente.setTelefonoText(miCliente.getTelefono());
		vistaCliente.setEmailText(miCliente.getEmail());
		vistaCliente.setNacimientoDate(miCliente.getNacimiento());
		vistaCliente.setPaisText(miCliente.getPais());
		vistaCliente.setProvinciaText(miCliente.getProvincia());
		vistaCliente.setMunicipioText(miCliente.getMunicipio());
		vistaCliente.setPortalText(miCliente.getPortal());
		vistaCliente.setLetraText(miCliente.getLetra());
		vistaCliente.setCalleText(miCliente.getCalle());
		vistaCliente.setPisoText(miCliente.getPiso());
		vistaCliente.setVisible(true);
		this.vistaCliente.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaCliente.establecerBordesDefecto();
				miCliente.setDNI(vistaCliente.getDNIText());
				miCliente.setNombre(vistaCliente.getNombreText());
				miCliente.setApellido1(vistaCliente.getApellido1Text());
				miCliente.setApellido2(vistaCliente.getApellido2Text());
				miCliente.setTelefono(vistaCliente.getTelefonoText());
				miCliente.setNacimiento(vistaCliente.getNacimientoDate());
				miCliente.setPais(vistaCliente.getPaisText());
				miCliente.setProvincia(vistaCliente.getProvinciaText());
				miCliente.setMunicipio(vistaCliente.getMunicipioText());
				miCliente.setCalle(vistaCliente.getCalleText());
				miCliente.setPortal(vistaCliente.getPortalText());
				miCliente.setLetra(vistaCliente.getLetraText());
				miCliente.setEmail(vistaCliente.getEmailText());
				miCliente.setPiso(vistaCliente.getPisoText());
				int validar = validarDatos.validarCliente(miCliente);
				if (validar == 0) {
					if (cliente.modificarCliente(miCliente)) {
						vistaCliente.setVisible(false);
						vistaCliente.avisarClienteModificadoCorrecto();
						ControladorGeneral.logger.info("Cliente modificado correctamente");
						cont.actualizarClientes();
					}
				} else {
					vistaCliente.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al modificar un cliente");
				}
			}
		});
	}
}
