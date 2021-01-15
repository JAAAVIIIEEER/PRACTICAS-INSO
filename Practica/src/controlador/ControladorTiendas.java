package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.TiendaDao;
import implementacion.ValidarDatos;
import modelo.Tienda;
import vista.VistaTienda;

public class ControladorTiendas {

	private VistaTienda vistaTienda;
	private ValidarDatos validarDatos;

	public ControladorTiendas(VistaTienda vistaTienda) {
		this.vistaTienda = vistaTienda;
		this.validarDatos = new ValidarDatos();
	}

	public void aniadirTienda() {
		vistaTienda.removeListenerAniadirButton();
		vistaTienda.establecerEstadoDefecto();
		vistaTienda.establecerBordesDefecto();
		vistaTienda.setVisible(true);
		this.vistaTienda.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tienda miTienda = new Tienda();
				vistaTienda.establecerBordesDefecto();
				miTienda.setProvincia(vistaTienda.getProvinciaText());
				miTienda.setMunicipio(vistaTienda.getMunicipioText());
				miTienda.setVia(vistaTienda.getCalleText());
				miTienda.setNumero(vistaTienda.getNumeroText());
				miTienda.setEmail(vistaTienda.getEmailText());
				miTienda.setTelefono(vistaTienda.getTelefonoText());
				TiendaDao tienda = new TiendaDao();
				int validar = validarDatos.validarTienda(miTienda);
				if (validar == 0) {
					if (tienda.aniadirTienda(miTienda)) {
						vistaTienda.setVisible(false);
						vistaTienda.avisarTiendaAniadidaCorrecto();
						ControladorGeneral.logger.info("Tienda añadida correctamente");
					}
				} else {
					vistaTienda.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al añadir una tienda");
				}
			}
		});
	}

	public void bajaTienda() {
		String id = vistaTienda.mostrarVentanaBajaTienda();
		if (id != null) {
			TiendaDao tienda = new TiendaDao();
			if (validarDatos.validarNumero(id)) {
				tienda.eliminarTienda(Integer.parseInt(id));
				ControladorGeneral.logger.info("Tienda eliminada correctamente");
				vistaTienda.tiendaEliminada();
			} else {
				vistaTienda.errorNumero();
			}
		}
	}

	public void modificarTienda() {
		vistaTienda.removeListenerAniadirButton();
		String id = vistaTienda.mostrarVentanaConsultarTienda();
		TiendaDao tienda = new TiendaDao();
		Tienda miTienda = tienda.consultarTienda(Integer.valueOf(id));
		vistaTienda.establecerBordesDefecto();
		vistaTienda.setProvinciaText(miTienda.getProvincia());
		vistaTienda.setMunicipioText(miTienda.getMunicipio());
		vistaTienda.setCalleText(miTienda.getVia());
		vistaTienda.setNumeroText(miTienda.getNumero());
		vistaTienda.setEmailText(miTienda.getEmail());
		vistaTienda.setTelefonoText(miTienda.getTelefono());
		vistaTienda.setVisible(true);
		this.vistaTienda.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaTienda.establecerBordesDefecto();
				miTienda.setProvincia(vistaTienda.getProvinciaText());
				miTienda.setMunicipio(vistaTienda.getMunicipioText());
				miTienda.setVia(vistaTienda.getCalleText());
				miTienda.setNumero(vistaTienda.getNumeroText());
				miTienda.setEmail(vistaTienda.getEmailText());
				miTienda.setTelefono(vistaTienda.getTelefonoText());
				int validar = validarDatos.validarTienda(miTienda);
				if (validar == 0) {
					if (tienda.modificarTienda(miTienda)) {
						vistaTienda.setVisible(false);
						vistaTienda.avisarTiendaModificadoCorrecto();
						ControladorGeneral.logger.info("Tienda modificada correctamente");
					}
				} else {
					vistaTienda.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al modificar una tienda");
				}
			}
		});
	}
}
