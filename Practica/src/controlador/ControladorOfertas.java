package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.OfertaDao;
import implementacion.ValidarDatos;
import modelo.Oferta;
import vista.VistaOferta;

public class ControladorOfertas {

	private VistaOferta vistaOferta;
	private ValidarDatos validarDatos;
	private ControladorGeneral cont;

	public ControladorOfertas(VistaOferta vistaOferta, ControladorGeneral cont) {
		this.vistaOferta = vistaOferta;
		this.validarDatos = new ValidarDatos();
		this.cont = cont;
	}

	public void aniadirOferta() {
		vistaOferta.removeListenerAniadirButton();
		vistaOferta.establecerBordesDefecto();
		vistaOferta.establecerEstadoDefecto();
		vistaOferta.setVisible(true);
		this.vistaOferta.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oferta miOferta = new Oferta();
				vistaOferta.establecerBordesDefecto();
				miOferta.setFechaInicio(vistaOferta.getFechaInicio());
				miOferta.setFechaFin(vistaOferta.getFechaFinal());
				miOferta.setTipoOferta(vistaOferta.getTipoBox());
				miOferta.setEspecificacion(vistaOferta.getEspecificacionText());
				miOferta.setDescuento(vistaOferta.getDescuentoSpinner());
				int validar = validarDatos.validarOferta(miOferta);
				OfertaDao oferta = new OfertaDao();
				if (validar == 0) {
					if (oferta.aniadirOferta(miOferta)) {
						vistaOferta.setVisible(false);
						vistaOferta.avisarOfertaAniadidoCorrecto();
						ControladorGeneral.logger.info("Oferta añadida correctamente");
						cont.actualizaOfertas();
					}
				} else {
					vistaOferta.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al añadir una oferta");
				}
			}
		});
	}

	public void finalizarOferta() {
		
		String id = vistaOferta.mostrarVentanaFinalizarOferta();
		if (id != null) {
			OfertaDao oferta = new OfertaDao();
			if (validarDatos.validarNumero(id)) {
				oferta.eliminarOferta(Integer.valueOf(id));
				ControladorGeneral.logger.info("Oferta Finalizada Correctamente");
				vistaOferta.ofertaFinalizada();
				cont.actualizaOfertas();
			} else {
				vistaOferta.errorNumero();
			}
		}		
	}

	public void modificarOferta() {
		vistaOferta.establecerBordesDefecto();
		vistaOferta.removeListenerAniadirButton();
		String id = vistaOferta.mostrarVentanaConsultarOferta();
		OfertaDao oferta = new OfertaDao();
		Oferta miOferta = oferta.buscarOferta(Integer.valueOf(id));
		vistaOferta.setFechaInicio(miOferta.getFechaInicio());
		vistaOferta.setFechaFinal(miOferta.getFechaFin());
		vistaOferta.setTipoBox(miOferta.getTipoOferta());
		vistaOferta.setEspecificacionText(miOferta.getEspecificacion());
		vistaOferta.setDescuentoSpinner(miOferta.getDescuento());
		vistaOferta.setVisible(true);
		this.vistaOferta.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaOferta.establecerBordesDefecto();
				miOferta.setFechaInicio(vistaOferta.getFechaInicio());
				miOferta.setFechaFin(vistaOferta.getFechaFinal());
				miOferta.setTipoOferta(vistaOferta.getTipoBox());
				miOferta.setEspecificacion(vistaOferta.getEspecificacionText());
				miOferta.setDescuento(vistaOferta.getDescuentoSpinner());
				int validar = validarDatos.validarOferta(miOferta);
				if (validar == 0) {
					if (oferta.modificarOferta(miOferta)) {
						vistaOferta.setVisible(false);
						vistaOferta.avisarOfertaModificadoCorrecto();
						ControladorGeneral.logger.info("Oferta Añadida Correctamente");
						cont.actualizaOfertas();
					}
				} else {
					vistaOferta.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al modificar una oferta");
				}
			}
		});
	}
}
