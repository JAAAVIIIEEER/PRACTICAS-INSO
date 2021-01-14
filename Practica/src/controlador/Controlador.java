package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import implementacion.*;
import vista.*;
import modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.*;

public class Controlador {

	private VistaAutenticar vistaAutenticar;
	private int errores = 0;
	private VistaGeneral vistaGeneral;
	private VistaAlquiler vistaAlquiler;
	private VistaEmpleado vistaEmpleado;
	private VistaVehiculo vistaVehiculo;
	private VistaTienda vistaTienda;
	private VistaCliente vistaCliente;
	private VistaOferta vistaOferta;
	private VistaIncidencia vistaIncidencia;
	private ValidarDatos validarDatos;

	private final boolean visible = true;
	private final boolean noVisible = false;

	private static Logger logger = Logger.getLogger("RentLeonLog");

	public Controlador() {
		this.vistaAutenticar = new VistaAutenticar();
		this.vistaAlquiler = new VistaAlquiler();
		this.vistaEmpleado = new VistaEmpleado();
		this.vistaVehiculo = new VistaVehiculo();
		this.vistaTienda = new VistaTienda();
		this.vistaCliente = new VistaCliente();
		this.vistaOferta = new VistaOferta();
		this.vistaIncidencia = new VistaIncidencia();
		this.validarDatos = new ValidarDatos();
		establecerLog();
	}

	public void establecerLog() {
		try {
			FileHandler fh = new FileHandler(".\\logs\\RentLeonLog.log");
			logger.addHandler(fh);
			fh.setFormatter(new MyFormatter());
			logger.setUseParentHandlers(false);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mostrarVentanaAniadirAlquiler(boolean estado) {
		this.vistaAlquiler.setVisible(estado);
	}

	public void mostrarVentanaAniadirEmpleado(boolean estado) {
		this.vistaEmpleado.setVisible(estado);
	}

	public void mostrarVentanaAniadirVehiculo(boolean estado) {
		this.vistaVehiculo.setVisible(estado);
	}

	public void mostrarVentanaAniadirCliente(boolean estado) {
		this.vistaCliente.setVisible(estado);
	}

	public void mostrarVentanaAniadirTienda(boolean estado) {
		this.vistaTienda.setVisible(estado);
	}

	public void mostrarVentanaAniadirOferta(boolean estado) {
		this.vistaOferta.setVisible(estado);
	}

	public void mostrarVentanaAniadirIncidencia(boolean estado) {
		this.vistaIncidencia.setVisible(estado);
	}

	public void mostrarVentanaAutenticar() {
		this.errores = 0;
		aniadirListenerAutenticar();
		vistaAutenticar.setVisible(true);
	}

	private void mostrarVentanaAutenticarSec() {
		this.errores = 0;
		vistaAutenticar.setVisible(true);
	}

	private void listenerCambiarUsuario() {
		this.vistaGeneral.addButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mostrarVentanaAutenticarSec();
			}
		});
	}

	private void listenerAniadirEmpleado() {
		this.vistaGeneral.listenerAniadirEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaEmpleado.establecerBordesDefecto();
				vistaEmpleado.removeListenerAniadirButton();
				vistaEmpleado.establecerEstadoDefecto();
				gestionarNuevoEmpleado();
			}
		});
	}

	private void gestionarNuevoEmpleado() {
		this.mostrarVentanaAniadirEmpleado(visible);
		this.vistaEmpleado.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado miEmpleado = new Empleado();
				vistaEmpleado.establecerBordesDefecto();
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				int validar = validarDatos.validarEmpleado(miEmpleado);
				EmpleadoDao empleado = new EmpleadoDao();
				if (validar == 0) {
					if (empleado.aniadirEmpleado(miEmpleado)) {
						mostrarVentanaAniadirEmpleado(noVisible);
						vistaEmpleado.avisarEmpleadoAniadidoCorrecto();
						logger.info("Empleado añadido correctamente");
					}
				} else {
					vistaEmpleado.mostrarError(validar);
					logger.warning("Error al añadir un empleado");
				}
			}
		});
	}

	private void listenerBajaEmpleado() {
		this.vistaGeneral.listenerBajaEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String dni = vistaEmpleado.mostrarVentanaBajaEmpleado();
				EmpleadoDao empleado = new EmpleadoDao();
				empleado.eliminarEmpleado(dni);
				logger.info("Empleado eliminado correctamente");
			}
		});
	}

	private void listenerModificarEmpleado() {
		this.vistaGeneral.listenerModificarEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaEmpleado.removeListenerAniadirButton();
				gestionarModificarEmpleado();
			}
		});
	}

	private void gestionarModificarEmpleado() {
		String dni = vistaEmpleado.mostrarVentanaConsultarEmpleado();
		EmpleadoDao empleado = new EmpleadoDao();
		Empleado miEmpleado = empleado.consultarEmpleado(dni);
		vistaEmpleado.establecerBordesDefecto();
		vistaEmpleado.setDNIText(miEmpleado.getUsuarioDNI());
		vistaEmpleado.setContraseniaText(miEmpleado.getContrasenia());
		vistaEmpleado.setNacimientoDate(miEmpleado.getNacimiento());
		vistaEmpleado.setEmailText(miEmpleado.getEmail());
		vistaEmpleado.setTelefonoText(miEmpleado.getTelefono());
		vistaEmpleado.setNombreText(miEmpleado.getNombre());
		vistaEmpleado.setApellido1Text(miEmpleado.getApellido1());
		vistaEmpleado.setApellido2Text(miEmpleado.getApellido2());
		vistaEmpleado.setTipoText(miEmpleado.getTipo());
		mostrarVentanaAniadirEmpleado(visible);
		this.vistaEmpleado.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaEmpleado.establecerBordesDefecto();
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				int validar = validarDatos.validarEmpleado(miEmpleado);
				if (validar == 0) {
					if (empleado.modificarEmpleado(miEmpleado)) {
						mostrarVentanaAniadirEmpleado(noVisible);
						vistaEmpleado.avisarEmpleadoModificadoCorrecto();
						logger.info("Empleado modificado correctamente");
					}
				} else {
					vistaEmpleado.mostrarError(validar);
					logger.warning("Error al modificar un empleado");
				}
			}
		});
	}

	private void listenerAniadirVehiculo() {
		this.vistaGeneral.listenerAniadirVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				TiendaDao tienda = new TiendaDao();
				ArrayList<Integer> tiendas = tienda.buscarTiendas();
				if (tiendas.isEmpty()) {
					vistaVehiculo.mostrarVentanaNoTiendas();
				} else {
					vistaVehiculo.establecerTiendasDisponibles(tiendas);
					vistaVehiculo.removeListenerAniadirButton();
					vistaVehiculo.establecerBordesDefecto();
					vistaVehiculo.establecerEstadoDefecto();
					gestionarNuevoVehiculo();
				}
			}
		});
	}

	private void gestionarNuevoVehiculo() {
		this.mostrarVentanaAniadirVehiculo(visible);
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
						mostrarVentanaAniadirVehiculo(noVisible);
						vistaVehiculo.avisarVehiculoAniadidoCorrecto();
						logger.info("Vehiculo añadido correctamente");
					}
				} else {
					vistaVehiculo.mostrarError(validar);
					logger.warning("Error al añadir un vehiculo");
				}
			}
		});
	}

	private void listenerBajaVehiculo() {
		this.vistaGeneral.listenerBajaVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String matricula = vistaVehiculo.mostrarVentanaBajaVehiculo();
				VehiculoDao vehiculo = new VehiculoDao();
				vehiculo.bajaVehiculo(matricula);
				logger.info("Vehiculo eliminado correctamente");
			}
		});
	}

	private void listenerModificarVehiculo() {
		this.vistaGeneral.listenerModificarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {		
				TiendaDao tienda = new TiendaDao();
				ArrayList<Integer> tiendas = tienda.buscarTiendas();
				if (tiendas.isEmpty()) {
					vistaVehiculo.mostrarVentanaNoTiendas();
				} else {
					vistaVehiculo.establecerTiendasDisponibles(tiendas);
					vistaVehiculo.removeListenerAniadirButton();
					gestionarModificarVehiculo();
				}
			}
		});
	}

	private void gestionarModificarVehiculo() {
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
		mostrarVentanaAniadirVehiculo(visible);
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
						mostrarVentanaAniadirVehiculo(noVisible);
						vistaVehiculo.avisarVehiculoModificadoCorrecto();
						logger.info("Vehiculo modificado correctamente");
					}
				} else {
					vistaVehiculo.mostrarError(validar);
					logger.warning("Error al modificar un vehiculo");
				}
			}
		});
	}

	private void listenerAniadirTienda() {
		this.vistaGeneral.listenerAniadirTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaTienda.removeListenerAniadirButton();
				vistaTienda.establecerEstadoDefecto();
				vistaTienda.establecerBordesDefecto();
				gestionarNuevaTienda();
			}
		});
	}

	private void gestionarNuevaTienda() {
		this.mostrarVentanaAniadirTienda(visible);
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
						mostrarVentanaAniadirTienda(noVisible);
						vistaTienda.avisarTiendaAniadidaCorrecto();
						logger.info("Tienda añadida correctamente");
					}
				} else {
					vistaTienda.mostrarError(validar);
					logger.warning("Error al añadir una tienda");
				}
			}
		});
	}

	private void listenerBajaTienda() {
		this.vistaGeneral.listenerBajaTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaTienda.mostrarVentanaBajaTienda();
				TiendaDao tienda = new TiendaDao();
				tienda.eliminarTienda(Integer.parseInt(id));
				logger.info("Tienda eliminada correctamente");
			}
		});
	}

	private void listenerModificarTienda() {
		this.vistaGeneral.listenerModificarTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaTienda.removeListenerAniadirButton();
				gestionarModificarTienda();
			}
		});
	}

	private void gestionarModificarTienda() {
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
		mostrarVentanaAniadirTienda(visible);
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
						mostrarVentanaAniadirTienda(noVisible);
						vistaTienda.avisarTiendaModificadoCorrecto();
						logger.info("Error al modificar una tienda");
					}
				} else {
					vistaTienda.mostrarError(validar);
					logger.warning("Error al modificar una tienda");
				}
			}
		});
	}

	private void listenerAniadirAlquiler() {
		this.vistaGeneral.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				VehiculoDao vehiculo = new VehiculoDao();
				ArrayList<String> vehiculos = vehiculo.buscarVehiculosDisponibles();
				if(vehiculos.isEmpty()) {
					vistaAlquiler.mostrarVentanaNoVehiculos();
				} else {
					vistaAlquiler.removeListenerAniadirButton();
					vistaAlquiler.establecerVehiculosDisponibles(vehiculos);
					vistaAlquiler.establecerEstadoDefecto();
					vistaAlquiler.establecerBordesDefecto();
					gestionaNuevoAlquiler();
				}
			}
		});
	}

	private void gestionaNuevoAlquiler() {
		this.mostrarVentanaAniadirAlquiler(visible);
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
				int coste = (int) (alquiler.calcularCoste(vistaAlquiler.getVehiculo()) * dias * (1 - descuento / 100));
				miAlquiler.setCoste(coste);
				int validar = validarDatos.validarAlquiler(miAlquiler);
				if (validar == 0) {
					if (alquiler.aniadirAlquiler(miAlquiler)) {
						mostrarVentanaAniadirAlquiler(noVisible);
						vistaAlquiler.avisarAlquilerAniadidoCorrecto(coste);
						logger.info("Alquiler añadido correctamente");
					}
				} else {
					vistaAlquiler.mostrarError(validar);
					logger.warning("Error al añadir un alquiler");
				}
			}
		});
	}

	private void listenerFinalizarAlquiler() {
		this.vistaGeneral.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaAlquiler.mostrarVentanaFinalizarAlquiler();
				AlquilerDao alquiler = new AlquilerDao();
				alquiler.finalizarAlquiler(Integer.parseInt(id));
				logger.info("Alquiler finalizado correctamente");
			}
		});
	}

	private void listenerModificarAlquiler() {
		this.vistaGeneral.listenerModificarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaAlquiler.removeListenerAniadirButton();
				gestionarModificarAlquiler();
			}
		});
	}

	private void gestionarModificarAlquiler() {
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
		mostrarVentanaAniadirAlquiler(visible);
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
						mostrarVentanaAniadirAlquiler(noVisible);
						vistaAlquiler.avisarAlquilerModificadoCorrecto(coste);
						logger.info("Alquiler modificado correctamente");
					}
				} else {
					vistaAlquiler.mostrarError(validar);
					logger.info("Error al modificar un alquiler");
				}
			}
		});
	}

	private void listenerAniadirCliente() {
		this.vistaGeneral.listenerAniadirCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaCliente.establecerEstadoDefecto();
				vistaCliente.removeListenerAniadirButton();
				vistaCliente.establecerBordesDefecto();
				gestionaNuevoCliente();
			}
		});
	}

	private void gestionaNuevoCliente() {
		this.mostrarVentanaAniadirCliente(visible);
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
						mostrarVentanaAniadirCliente(noVisible);
						vistaCliente.avisarClienteAniadidoCorrecto();
						logger.info("Cliente añadido correctamente");
					}
				} else {
					vistaCliente.mostrarError(validar);
					logger.warning("Error al añadir un cliente");
				}
			}
		});
	}

	private void listenerBajaCliente() {
		this.vistaGeneral.listenerBajaCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String dni = vistaCliente.mostrarVentanaBajaCliente();
				ClienteDao cliente = new ClienteDao();
				cliente.eliminarCliente(dni);
				logger.info("Cliente eliminado correctamente");
			}
		});
	}

	private void listenerModificarCliente() {
		this.vistaGeneral.listenerModificarCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaCliente.establecerBordesDefecto();
				vistaCliente.removeListenerAniadirButton();
				gestionarModificarCliente();
			}
		});
	}

	private void gestionarModificarCliente() {
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
		mostrarVentanaAniadirCliente(visible);
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
						mostrarVentanaAniadirCliente(noVisible);
						vistaCliente.avisarClienteModificadoCorrecto();
						logger.info("Cliente modificado correctamente");
					}
				} else {
					vistaCliente.mostrarError(validar);
					logger.warning("Error al modificar un cliente");
				}
			}
		});
	}

	private void aniadirListenerAutenticar() {
		this.vistaAutenticar.addButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				validar(evt);
			}
		});
	}

	private void listenerAniadirOferta() {
		this.vistaGeneral.listenerAniadirOferta(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaOferta.removeListenerAniadirButton();
				vistaOferta.establecerBordesDefecto();
				vistaOferta.establecerEstadoDefecto();
				gestionarNuevaOferta();
			}
		});
	}

	private void gestionarNuevaOferta() {
		this.mostrarVentanaAniadirOferta(visible);
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
						mostrarVentanaAniadirOferta(noVisible);
						vistaOferta.avisarOfertaAniadidoCorrecto();
						logger.info("Oferta añadida correctamente");
					}
				} else {
					vistaOferta.mostrarError(validar);
					logger.warning("Error al añadir una oferta");
				}
			}
		});
	}

	private void listenerFinalizarOferta() {
		this.vistaGeneral.listenerFinalizarOferta(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaOferta.mostrarVentanaFinalizarOferta();
				OfertaDao oferta = new OfertaDao();
				oferta.eliminarOferta(Integer.valueOf(id));
				logger.info("Oferta Finalizada Correctamente");
			}
		});
	}

	private void listenerModificarOferta() {
		this.vistaGeneral.listenerModificarOferta(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaOferta.establecerBordesDefecto();
				vistaOferta.removeListenerAniadirButton();
				gestionarModificarOferta();
			}
		});
	}

	private void gestionarModificarOferta() {
		String id = vistaOferta.mostrarVentanaConsultarOferta();
		OfertaDao oferta = new OfertaDao();
		Oferta miOferta = oferta.buscarOferta(Integer.valueOf(id));
		vistaOferta.setFechaInicio(miOferta.getFechaInicio());
		vistaOferta.setFechaFinal(miOferta.getFechaFin());
		vistaOferta.setTipoBox(miOferta.getTipoOferta());
		vistaOferta.setEspecificacionText(miOferta.getEspecificacion());
		vistaOferta.setDescuentoSpinner(miOferta.getDescuento());
		mostrarVentanaAniadirOferta(visible);
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
						mostrarVentanaAniadirOferta(noVisible);
						vistaOferta.avisarOfertaModificadoCorrecto();
						logger.info("Oferta Añadida Correctamente");
					}
				} else {
					vistaOferta.mostrarError(validar);
					logger.warning("Error al modificar una oferta");
				}
			}
		});
	}

	private void listenerAniadirIncidencia() {
		this.vistaGeneral.listenerAniadirIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaIncidencia.removeListenerAniadirButton();
				vistaIncidencia.establecerEstadoDefecto();
				gestionarNuevaIncidencia();
			}
		});
	}

	private void gestionarNuevaIncidencia() {
		this.mostrarVentanaAniadirIncidencia(visible);
		this.vistaIncidencia.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Incidencia miIncidencia = new Incidencia();
				miIncidencia.setAlquilerID(vistaIncidencia.getIdAlquilerText());
				miIncidencia.setTipo(vistaIncidencia.getTipoBox());
				miIncidencia.setInforme(vistaIncidencia.getInformeText());
				IncidenciaDao incidencia = new IncidenciaDao();
				if (incidencia.almacenarIncidencia(miIncidencia)) {
					mostrarVentanaAniadirIncidencia(noVisible);
					vistaIncidencia.avisarIncidenciaAniadidoCorrecto();
					logger.info("Incidencia Añadida Correctamente");
				}
			}
		});
	}

	private void listenerFinalizarIncidencia() {
		this.vistaGeneral.listenerFinalizarIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaIncidencia.mostrarVentanaFinalizarIncidencia();
				IncidenciaDao incidencia = new IncidenciaDao();
				incidencia.finalizarIncidencia(Integer.valueOf(id));
				logger.info("Incidencia Finalizada");
			}
		});
	}

	private void listenerModificarIncidencia() {
		this.vistaGeneral.listenerModificarIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaIncidencia.removeListenerAniadirButton();
				gestionarModificarIncidencia();
			}
		});
	}

	private void gestionarModificarIncidencia() {
		String id = vistaIncidencia.mostrarVentanaConsultarIncidencia();
		IncidenciaDao incidencia = new IncidenciaDao();
		Incidencia miIncidencia = incidencia.consultarIncidencia(Integer.valueOf(id));
		vistaIncidencia.setTipoBox(miIncidencia.getTipo());
		vistaIncidencia.setIdAlquilerText(miIncidencia.getAlquilerID());
		vistaIncidencia.setInformeText(miIncidencia.getInforme());
		mostrarVentanaAniadirIncidencia(visible);
		this.vistaIncidencia.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miIncidencia.setAlquilerID(vistaIncidencia.getIdAlquilerText());
				miIncidencia.setTipo(vistaIncidencia.getTipoBox());
				miIncidencia.setInforme(vistaIncidencia.getInformeText());
				if (incidencia.modificarIncidencia(miIncidencia)) {
					mostrarVentanaAniadirIncidencia(noVisible);
					vistaIncidencia.avisarIncidenciaModificadoCorrecto();
					logger.info("Incidencia Modificada");
				}
			}
		});
	}

	private void aniadirListenerGeneral(int estado) {
		listenerCambiarUsuario();
		listenerAniadirAlquiler();
		listenerFinalizarAlquiler();
		listenerModificarAlquiler();
		listenerAniadirCliente();
		listenerBajaCliente();
		listenerModificarCliente();
		listenerAniadirIncidencia();
		listenerFinalizarIncidencia();
		listenerModificarIncidencia();
		// Cargar los listener de administrador
		if (estado == 0) {
			listenerAniadirEmpleado();
			listenerBajaEmpleado();
			listenerModificarEmpleado();
			listenerAniadirVehiculo();
			listenerBajaVehiculo();
			listenerModificarVehiculo();
			listenerAniadirTienda();
			listenerBajaTienda();
			listenerModificarTienda();
			listenerAniadirOferta();
			listenerFinalizarOferta();
			listenerModificarOferta();
		}
	}

	private void validar(ActionEvent evt) {
		if (vistaGeneral != null) {
			vistaGeneral.dispose();
		}
		String usuario = this.vistaAutenticar.getTextFieldUsuario().getText();
		String contrasenia = String.valueOf(this.vistaAutenticar.getPasswordText().getPassword());
		AutenticarDao autenticar = new AutenticarDao();
		int estado = autenticar.autenticarConexion(usuario, contrasenia);
		if (estado == 2) {
			errores += 1;
			if (errores < 3) {
				this.vistaAutenticar.avisarAutentificacionErronea();
			} else {
				this.vistaAutenticar.cerrarProgramaErrorAutenticacion();
			}
		} else {
			vistaGeneral = new VistaGeneral(estado);
			vistaGeneral.setVisible(true);
			aniadirListenerGeneral(estado);
			this.vistaAutenticar.setVisible(false);
			;
		}
		this.vistaAutenticar.getTextFieldUsuario().setText("");
		this.vistaAutenticar.getPasswordText().setText("");
	}

	private class MyFormatter extends Formatter {

		@Override
		public String format(LogRecord record) {
			StringBuilder sb = new StringBuilder();
			DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
			Date timeStamp = new Date(record.getMillis());
			sb.append(simple.format(timeStamp));
			sb.append(" ");
			sb.append(record.getLevel()).append(':');
			sb.append(record.getMessage()).append('\n');
			return sb.toString();
		}
	}
}
