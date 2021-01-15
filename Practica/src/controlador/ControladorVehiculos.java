package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import implementacion.TiendaDao;
import implementacion.ValidarDatos;
import implementacion.VehiculoDao;
import modelo.Vehiculo;
import vista.VistaVehiculo;

public class ControladorVehiculos {

	private VistaVehiculo vistaVehiculo;
	private ValidarDatos validarDatos;
	private ControladorGeneral cont;

	public ControladorVehiculos(VistaVehiculo vistaVehiculo, ControladorGeneral cont) {
		this.vistaVehiculo = vistaVehiculo;
		this.validarDatos = new ValidarDatos();
		this.cont = cont;
	}

	public void aniadirVehiculo() {
		TiendaDao tienda = new TiendaDao();
		ArrayList<Integer> tiendas = tienda.buscarTiendas();
		if (tiendas.isEmpty()) {
			vistaVehiculo.mostrarVentanaNoTiendas();
		} else {
			vistaVehiculo.establecerTiendasDisponibles(tiendas);
			vistaVehiculo.removeListenerAniadirButton();
			vistaVehiculo.establecerBordesDefecto();
			vistaVehiculo.establecerEstadoDefecto();
			vistaVehiculo.setVisible(true);
			this.vistaVehiculo.listenerAniadirButton(new ActionListener() { 
				public void actionPerformed(ActionEvent e) {
					Vehiculo miVehiculo = new Vehiculo();
					vistaVehiculo.establecerBordesDefecto();
					miVehiculo.setPlazas(vistaVehiculo.getPlazasBoxText());
					miVehiculo.setCombustible(vistaVehiculo.getCombustibleBoxText());
					miVehiculo.setTipo(vistaVehiculo.getTipoBoxText());
					miVehiculo.setCoste(vistaVehiculo.getCosteSpinnerText());
					miVehiculo.setMatricula(vistaVehiculo.getMatriculaText());
					miVehiculo.setModelo(vistaVehiculo.getModeloText());
					miVehiculo.setTiendaID(vistaVehiculo.getTiendasBox());
					miVehiculo.setExtras(vistaVehiculo.getExtrasText());
					int validar = validarDatos.validarVehiculo(miVehiculo);
					VehiculoDao vehiculo = new VehiculoDao();
					if (validar == 0) {
						if (vehiculo.aniadirVehiculo(miVehiculo)) {
							vistaVehiculo.setVisible(false);
							vistaVehiculo.avisarVehiculoAniadidoCorrecto();
							ControladorGeneral.logger.info("Vehiculo añadido correctamente");
							cont.actualizarVehiculo();
						}
					} else {
						vistaVehiculo.mostrarError(validar);
						ControladorGeneral.logger.warning("Error al añadir un vehiculo");
					}
				}
			});
		}
	}

	public void eliminarVehiculo() {
		String matricula = vistaVehiculo.mostrarVentanaBajaVehiculo();
		if (matricula != null) {
			VehiculoDao vehiculo = new VehiculoDao();
			if (validarDatos.validarMatricula(matricula)) {
				vehiculo.bajaVehiculo(matricula);
				ControladorGeneral.logger.info("Vehiculo eliminado correctamente");
				vistaVehiculo.vehiculoEliminado();
				cont.actualizarVehiculo();
			} else {
				vistaVehiculo.errorMatricula();
			}
		}
	}

	public void modificarVehiculo() {
		TiendaDao tienda = new TiendaDao();
		ArrayList<Integer> tiendas = tienda.buscarTiendas();
		if (tiendas.isEmpty()) {
			vistaVehiculo.mostrarVentanaNoTiendas();
		} else {
			vistaVehiculo.establecerTiendasDisponibles(tiendas);
			vistaVehiculo.removeListenerAniadirButton();
			String matricula = vistaVehiculo.mostrarVentanaConsultarVehiculo();
			VehiculoDao vehiculo = new VehiculoDao();
			Vehiculo miVehiculo = vehiculo.consultarVehiculo(matricula);
			vistaVehiculo.establecerBordesDefecto();
			vistaVehiculo.setPlazasBox(miVehiculo.getPlazas());
			vistaVehiculo.setCombustibleBox(miVehiculo.getCombustible());
			vistaVehiculo.setTipoBox(miVehiculo.getTipo());
			vistaVehiculo.setCosteSpinner(miVehiculo.getCoste());
			vistaVehiculo.setMatriculaText(miVehiculo.getMatricula());
			vistaVehiculo.setModeloText(miVehiculo.getModelo());
			vistaVehiculo.setExtrasText(miVehiculo.getExtras());
			vistaVehiculo.setVisible(true);
			this.vistaVehiculo.listenerModificarButton(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vistaVehiculo.establecerBordesDefecto();
					miVehiculo.setPlazas(vistaVehiculo.getPlazasBoxText());
					miVehiculo.setCombustible(vistaVehiculo.getCombustibleBoxText());
					miVehiculo.setTipo(vistaVehiculo.getTipoBoxText());
					miVehiculo.setCoste(vistaVehiculo.getCosteSpinnerText());
					miVehiculo.setMatricula(vistaVehiculo.getMatriculaText());
					miVehiculo.setModelo(vistaVehiculo.getModeloText());
					miVehiculo.setTiendaID(vistaVehiculo.getTiendasBox());
					miVehiculo.setExtras(vistaVehiculo.getExtrasText());
					int validar = validarDatos.validarVehiculo(miVehiculo);
					if (validar == 0) {
						if (vehiculo.modificarVehiculo(miVehiculo)) {
							vistaVehiculo.setVisible(false);
							vistaVehiculo.avisarVehiculoModificadoCorrecto();
							ControladorGeneral.logger.info("Vehiculo modificado correctamente");
							cont.actualizarVehiculo();
						}
					} else {
						vistaVehiculo.mostrarError(validar);
						ControladorGeneral.logger.warning("Error al modificar un vehiculo");
					}
				}
			});
		}
	}
}
