package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import implementacion.AlquilerDao;
import implementacion.OfertaDao;
import implementacion.ValidarDatos;
import implementacion.VehiculoDao;
import modelo.Alquiler;
import modelo.Oferta;
import vista.VistaAlquiler;

public class ControladorAlquileres {

	private VistaAlquiler vistaAlquiler;
	private ValidarDatos validarDatos;

	public ControladorAlquileres(VistaAlquiler vistaAlquiler) {
		this.vistaAlquiler = vistaAlquiler;
		this.validarDatos = new ValidarDatos();
	}

	public void aniadirAlquiler() {
		VehiculoDao vehiculo = new VehiculoDao();
		ArrayList<String> vehiculos = vehiculo.buscarVehiculosDisponibles();
		if (vehiculos.isEmpty()) {
			vistaAlquiler.mostrarVentanaNoVehiculos();
		} else {
			vistaAlquiler.removeListenerAniadirButton();
			vistaAlquiler.establecerVehiculosDisponibles(vehiculos);
			vistaAlquiler.establecerEstadoDefecto();
			vistaAlquiler.establecerBordesDefecto();
			vistaAlquiler.setVisible(true);
			this.vistaAlquiler.listenerAniadirButton(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Alquiler miAlquiler = new Alquiler();
					vistaAlquiler.establecerBordesDefecto();
					miAlquiler.setDniCliente(vistaAlquiler.getClienteDNIText());
					miAlquiler.setDniEmpleado(vistaAlquiler.getDniEmpleadoText());
					miAlquiler.setFecha1(vistaAlquiler.getFechaInicio());
					miAlquiler.setFecha2(vistaAlquiler.getFechaFin());
					miAlquiler.setMatVehiculo(vistaAlquiler.getVehiculo());
					OfertaDao oferta = new OfertaDao();
					Oferta posibleOferta = oferta.buscarPosibleOferta(vistaAlquiler.getVehiculo());
					double descuento = 0;
					if (posibleOferta != null) {
						miAlquiler.setOferta(posibleOferta.getOfertaid());
						descuento = posibleOferta.getDescuento();
					} else {
						miAlquiler.setOferta(null);
					}
					int milisecondsByDay = 86400000;
					int dias = (int) ((vistaAlquiler.getFechaFin().getTime() - vistaAlquiler.getFechaInicio().getTime())
							/ milisecondsByDay);
					AlquilerDao alquiler = new AlquilerDao();
					int coste = (int) (alquiler.calcularCoste(vistaAlquiler.getVehiculo()) * dias
							* (1 - descuento / 100));
					miAlquiler.setCoste(coste);
					int validar = validarDatos.validarAlquiler(miAlquiler);
					if (validar == 0) {
						if (alquiler.aniadirAlquiler(miAlquiler)) {
							vistaAlquiler.setVisible(false);
							vistaAlquiler.avisarAlquilerAniadidoCorrecto(coste);
							ControladorGeneral.logger.info("Alquiler añadido correctamente");
						}
					} else {
						vistaAlquiler.mostrarError(validar);
						ControladorGeneral.logger.warning("Error al añadir un alquiler");
					}
				}
			});
		}
	}

	public void finalizarAlquiler() {
		String id = vistaAlquiler.mostrarVentanaFinalizarAlquiler();
		if (id != null) {
			AlquilerDao alquiler = new AlquilerDao();
			if (validarDatos.validarNumero(id)) {
				alquiler.finalizarAlquiler(Integer.parseInt(id));
				ControladorGeneral.logger.info("Alquiler finalizado correctamente");
				vistaAlquiler.alquilerFinalizado();
			} else {
				vistaAlquiler.errorNumero();
			}
		}
	}

	public void modificarAlquiler() {
		vistaAlquiler.removeListenerAniadirButton();
		String id = vistaAlquiler.mostrarVentanaConsultarAlquiler();
		AlquilerDao alquiler = new AlquilerDao();
		Alquiler miAlquiler = alquiler.consultarAlquiler(Integer.parseInt(id));
		vistaAlquiler.setClienteDNIText(miAlquiler.getDniCliente());
		vistaAlquiler.setInicioDate(miAlquiler.getFecha1());
		vistaAlquiler.setFinalDate(miAlquiler.getFecha2());
		vistaAlquiler.setVehiculosDisponiblesBox(miAlquiler.getMatVehiculo());
		vistaAlquiler.setDniEmpleadoText(miAlquiler.getDniEmpleado());
		VehiculoDao vehiculo = new VehiculoDao();
		vistaAlquiler.establecerBordesDefecto();
		ArrayList<String> vehiculosDisponibles = vehiculo.buscarVehiculosDisponibles();
		vehiculosDisponibles.add(miAlquiler.getMatVehiculo());
		vistaAlquiler.establecerVehiculosDisponibles(vehiculosDisponibles);
		vistaAlquiler.setVisible(true);
		this.vistaAlquiler.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler miAlquiler = new Alquiler();
				vistaAlquiler.establecerBordesDefecto();
				miAlquiler.setDniCliente(vistaAlquiler.getClienteDNIText());
				miAlquiler.setDniEmpleado(vistaAlquiler.getDniEmpleadoText());
				miAlquiler.setFecha1(vistaAlquiler.getFechaInicio());
				miAlquiler.setFecha2(vistaAlquiler.getFechaFin());
				miAlquiler.setMatVehiculo(vistaAlquiler.getVehiculo());
				OfertaDao oferta = new OfertaDao();
				Oferta posibleOferta = oferta.buscarPosibleOferta(vistaAlquiler.getVehiculo());
				double descuento = 0;
				if (posibleOferta != null) {
					miAlquiler.setOferta(posibleOferta.getOfertaid());
					descuento = posibleOferta.getDescuento();
				} else {
					miAlquiler.setOferta(null);
				}
				int milisecondsByDay = 86400000;
				int dias = (int) ((vistaAlquiler.getFechaFin().getTime() - vistaAlquiler.getFechaInicio().getTime())
						/ milisecondsByDay);
				AlquilerDao alquiler = new AlquilerDao();
				int coste = (int) (alquiler.calcularCoste(vistaAlquiler.getVehiculo()) * dias * (1 - descuento / 100));
				miAlquiler.setCoste(coste);
				int validar = validarDatos.validarAlquiler(miAlquiler);
				if (validar == 0) {
					if (alquiler.modificarAlquiler(miAlquiler)) {
						vistaAlquiler.setVisible(false);
						vistaAlquiler.avisarAlquilerModificadoCorrecto(coste);
						ControladorGeneral.logger.info("Alquiler modificado correctamente");
					}
				} else {
					vistaAlquiler.mostrarError(validar);
					ControladorGeneral.logger.info("Error al modificar un alquiler");
				}
			}
		});
	}
}
