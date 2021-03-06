package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.IncidenciaDao;
import implementacion.ValidarDatos;
import modelo.Incidencia;
import vista.VistaIncidencia;

public class ControladorIncidencias {

	private VistaIncidencia vistaIncidencia;
	private ValidarDatos validarDatos;
	private ControladorGeneral cont;

	public ControladorIncidencias(VistaIncidencia vistaIncidencia, ControladorGeneral cont) {
		this.vistaIncidencia = vistaIncidencia;
		this.validarDatos = new ValidarDatos();
		this.cont = cont;
	}

	public void aniadirIncidencia() {
		vistaIncidencia.removeListenerAniadirButton();
		vistaIncidencia.establecerEstadoDefecto();
		vistaIncidencia.setVisible(true);
		this.vistaIncidencia.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Incidencia miIncidencia = new Incidencia();
				miIncidencia.setAlquilerID(vistaIncidencia.getIdAlquilerText());
				miIncidencia.setTipo(vistaIncidencia.getTipoBox());
				miIncidencia.setInforme(vistaIncidencia.getInformeText());
				IncidenciaDao incidencia = new IncidenciaDao();
				if (incidencia.almacenarIncidencia(miIncidencia)) {
					vistaIncidencia.setVisible(false);
					vistaIncidencia.avisarIncidenciaAniadidoCorrecto();
					ControladorGeneral.logger.info("Incidencia Añadida Correctamente");
					cont.actualizarIncidencias();
				}
			}
		});
	}

	public void finalizarIncidencia() {
		ControladorGeneral.logger.info("Incidencia Finalizada");
		String id = vistaIncidencia.mostrarVentanaFinalizarIncidencia();
		if (id != null) {
			IncidenciaDao incidencia = new IncidenciaDao();
			if (validarDatos.validarNumero(id)) {
				incidencia.finalizarIncidencia(Integer.valueOf(id));
				ControladorGeneral.logger.info("Cliente eliminado correctamente");
				vistaIncidencia.incidenciaFinalizada();
				cont.actualizarIncidencias();
			} else {
				vistaIncidencia.errorNumero();
			}
		}
	}

	public void modificarIncidencia() {
		vistaIncidencia.removeListenerAniadirButton();
		String id = vistaIncidencia.mostrarVentanaConsultarIncidencia();
		IncidenciaDao incidencia = new IncidenciaDao();
		Incidencia miIncidencia = incidencia.consultarIncidencia(Integer.valueOf(id));
		vistaIncidencia.setTipoBox(miIncidencia.getTipo());
		vistaIncidencia.setIdAlquilerText(miIncidencia.getAlquilerID());
		vistaIncidencia.setInformeText(miIncidencia.getInforme());
		vistaIncidencia.setVisible(true);
		this.vistaIncidencia.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miIncidencia.setAlquilerID(vistaIncidencia.getIdAlquilerText());
				miIncidencia.setTipo(vistaIncidencia.getTipoBox());
				miIncidencia.setInforme(vistaIncidencia.getInformeText());
				if (incidencia.modificarIncidencia(miIncidencia)) {
					vistaIncidencia.setVisible(false);
					vistaIncidencia.avisarIncidenciaModificadoCorrecto();
					ControladorGeneral.logger.info("Incidencia Modificada");
					cont.actualizarIncidencias();
				}
			}
		});
	}
}
