package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.IncidenciaDao;
import modelo.Incidencia;
import vista.VistaIncidencia;

public class ControladorIncidencias {

	private VistaIncidencia vistaIncidencia;

	public ControladorIncidencias(VistaIncidencia vistaIncidencia) {
		this.vistaIncidencia = vistaIncidencia;
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
				}
			}
		});
	}

	public void finalizarIncidencia() {
		String id = vistaIncidencia.mostrarVentanaFinalizarIncidencia();
		IncidenciaDao incidencia = new IncidenciaDao();
		incidencia.finalizarIncidencia(Integer.valueOf(id));
		ControladorGeneral.logger.info("Incidencia Finalizada");
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
				}
			}
		});
	}
}
