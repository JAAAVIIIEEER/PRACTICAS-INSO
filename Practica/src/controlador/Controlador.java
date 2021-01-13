package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.*;
import vista.*;
import modelo.*;

public class Controlador{
	
	private VistaAutenticar vistaAutenticar;
	private int errores = 0;
	private VistaGeneral vistaGeneral;
	private VistaAlquiler vistaAlquiler;
	private VistaEmpleado vistaEmpleado;
	private VistaVehiculo vistaVehiculo;
	private VistaTienda vistaTienda;
	private VistaCliente vistaCliente;
	private VistaOferta vistaOferta;
	private ValidarDatos validar;
	
	private final boolean visible = true;
	private final boolean noVisible = false;
	
	private final int aniadir = 0;
	private final int modificar = 1;

	public Controlador() {
		this.vistaAutenticar = new VistaAutenticar();
		this.vistaAlquiler = new VistaAlquiler();
		this.vistaEmpleado = new VistaEmpleado();
		this.vistaVehiculo = new VistaVehiculo();
		this.vistaTienda = new VistaTienda();
		this.vistaCliente = new VistaCliente();
		this.vistaOferta = new VistaOferta();
		this.validar = new ValidarDatos();
	}
	
	public void mostrarVentanaAniadirAlquiler(boolean estado) {
		this.vistaAlquiler.setVisible(true);
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
		// TODO
		// this.aniadirVehiculo.setVisible(estado);
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
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				EmpleadoDao empleado = new EmpleadoDao();
				if (empleado.aniadirEmpleado(miEmpleado)) {
					mostrarVentanaAniadirEmpleado(noVisible);
					vistaEmpleado.avisarEmpleadoAniadidoCorrecto();
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
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				if (empleado.modificarEmpleado(miEmpleado)) {
					mostrarVentanaAniadirEmpleado(noVisible);
					vistaEmpleado.avisarEmpleadoModificadoCorrecto();
				}
			}
		});	
	}
	
	private void listenerAniadirVehiculo() {
		this.vistaGeneral.listenerAniadirVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaVehiculo.removeListenerAniadirButton();
				vistaVehiculo.establecerEstadoDefecto();
				gestionarNuevoVehiculo();
			}
		});
	}
	
	private void gestionarNuevoVehiculo() {
		this.mostrarVentanaAniadirVehiculo(visible);
		this.vistaVehiculo.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehiculo miVehiculo = new Vehiculo();
				miVehiculo.setPlazas(vistaVehiculo.getPlazasBoxText());
				miVehiculo.setCombustible(vistaVehiculo.getCombustibleBoxText());
				miVehiculo.setTipo(vistaVehiculo.getTipoBoxText());
				miVehiculo.setCoste(vistaVehiculo.getCosteSpinnerText());
				miVehiculo.setMatricula(vistaVehiculo.getMatriculaText());
				miVehiculo.setMarca(vistaVehiculo.getMarcaText());
				miVehiculo.setTiendaID(vistaVehiculo.getTiendasBox());
				miVehiculo.setExtras(vistaVehiculo.getExtrasText());
				VehiculoDao vehiculo = new VehiculoDao();
				if (vehiculo.aniadirVehiculo(miVehiculo)) {
					mostrarVentanaAniadirVehiculo(noVisible);
					vistaVehiculo.avisarVehiculoAniadidoCorrecto();
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
			}
		});
	}
	
	private void listenerModificarVehiculo() {
		this.vistaGeneral.listenerModificarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaVehiculo.removeListenerAniadirButton();
				gestionarModificarVehiculo();
			}
		});
	}
	
	private void gestionarModificarVehiculo() {
		String matricula = vistaVehiculo.mostrarVentanaConsultarVehiculo();
		VehiculoDao vehiculo = new VehiculoDao();
		Vehiculo miVehiculo = vehiculo.consultarVehiculo(matricula);
		vistaVehiculo.setPlazasBox(miVehiculo.getPlazas());
		vistaVehiculo.setCombustibleBox(miVehiculo.getCombustible());
		vistaVehiculo.setTipoBox(miVehiculo.getTipo());
		vistaVehiculo.setCosteSpinner(miVehiculo.getCoste());
		vistaVehiculo.setMatriculaText(miVehiculo.getMatricula());
		vistaVehiculo.setMarcaText(miVehiculo.getMarca());
		mostrarVentanaAniadirVehiculo(visible);
		this.vistaVehiculo.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miVehiculo.setPlazas(vistaVehiculo.getPlazasBoxText());
				miVehiculo.setCombustible(vistaVehiculo.getCombustibleBoxText());
				miVehiculo.setTipo(vistaVehiculo.getTipoBoxText());
				miVehiculo.setCoste(vistaVehiculo.getCosteSpinnerText());
				miVehiculo.setMatricula(vistaVehiculo.getMatriculaText());
				miVehiculo.setMarca(vistaVehiculo.getMarcaText());
//				miVehiculo.setNombre(vistaVehiculo.getNombreText());
//				miVehiculo.setApellidos(vistaVehiculo.getApellidosText());
//				miVehiculo.setTipo(vistaVehiculo.getTipoText());
				if (vehiculo.modificarVehiculo(miVehiculo)) {
					mostrarVentanaAniadirVehiculo(noVisible);
					vistaVehiculo.avisarVehiculoModificadoCorrecto();
				}
			}
		});	
	}
	
	private void listenerAniadirTienda() {
		this.vistaGeneral.listenerAniadirTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaTienda.removeListenerAniadirButton();
				vistaTienda.establecerEstadoDefecto();
				gestionarNuevaTienda();
			}
		});
	}
	
	private void gestionarNuevaTienda() {
		this.mostrarVentanaAniadirTienda(visible);
		this.vistaTienda.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tienda miTienda = new Tienda();
				miTienda.setProvincia(vistaTienda.getProvinciaText());
				miTienda.setMunicipio(vistaTienda.getMunicipioText());
				miTienda.setVia(vistaTienda.getCalleText());
				miTienda.setNumero(vistaTienda.getNumeroText());
				miTienda.setEmail(vistaTienda.getEmailText());
				miTienda.setTelefono(vistaTienda.getTelefonoText());
				TiendaDao tienda = new TiendaDao();
				if (tienda.aniadirTienda(miTienda)) {
					mostrarVentanaAniadirTienda(noVisible);
					vistaTienda.avisarTiendaAniadidaCorrecto();
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
		vistaTienda.setProvinciaText(miTienda.getProvincia());
		vistaTienda.setMunicipioText(miTienda.getMunicipio());
		vistaTienda.setCalleText(miTienda.getVia());
		vistaTienda.setNumeroText(miTienda.getNumero());
		vistaTienda.setEmailText(miTienda.getEmail());
		vistaTienda.setTelefonoText(miTienda.getTelefono());
		mostrarVentanaAniadirTienda(visible);
		this.vistaTienda.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miTienda.setProvincia(vistaTienda.getProvinciaText());
				miTienda.setMunicipio(vistaTienda.getMunicipioText());
				miTienda.setVia(vistaTienda.getCalleText());
				miTienda.setNumero(vistaTienda.getNumeroText());
				miTienda.setEmail(vistaTienda.getEmailText());
				miTienda.setTelefono(vistaTienda.getTelefonoText());
				if (tienda.modificarTienda(miTienda)) {
					mostrarVentanaAniadirTienda(noVisible);
					vistaTienda.avisarTiendaModificadoCorrecto();
				}
			}
		});	
	}
	
	private void listenerAniadirAlquiler() {
		this.vistaGeneral.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaAlquiler.removeListenerAniadirButton();
				vistaAlquiler.establecerEstadoDefecto();
				gestionaNuevoAlquiler();
			}
		});
	}
	
	private void gestionaNuevoAlquiler() {
		this.mostrarVentanaAniadirAlquiler(visible);
		this.vistaAlquiler.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler miAlquiler = new Alquiler();
				miAlquiler.setDniCliente(vistaAlquiler.getClienteDNIText());
				miAlquiler.setDniEmpleado(vistaAlquiler.getDniEmpleadoText());
				miAlquiler.setFecha1(vistaAlquiler.getFechaInicio());
				miAlquiler.setFecha2(vistaAlquiler.getFechaFin());
				miAlquiler.setMatVehiculo(vistaAlquiler.getVehiculo());
				// TODO Funcion para calcular el coste y buscar posible oferta
				miAlquiler.setOferta(0);
				miAlquiler.setCoste(0);
				AlquilerDao alquiler = new AlquilerDao();
				if (alquiler.aniadirAlquiler(miAlquiler)) {
					mostrarVentanaAniadirAlquiler(noVisible);
					vistaAlquiler.avisarAlquilerAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerFinalizarAlquiler() {
		this.vistaGeneral.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaAlquiler.mostrarVentanaFinalizarAlquiler();
				TiendaDao alquiler = new TiendaDao();
				alquiler.eliminarTienda(Integer.parseInt(id));
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
		mostrarVentanaAniadirAlquiler(visible);
		this.vistaAlquiler.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miAlquiler.setDniCliente(vistaAlquiler.getClienteDNIText());
				miAlquiler.setDniEmpleado(vistaAlquiler.getDniEmpleadoText());
				miAlquiler.setFecha1(vistaAlquiler.getFechaInicio());
				miAlquiler.setFecha2(vistaAlquiler.getFechaFin());
				miAlquiler.setMatVehiculo(vistaAlquiler.getVehiculo());
				miAlquiler.setId(Integer.parseInt(id));
				// TODO Funcion para calcular el coste y buscar posible oferta
				miAlquiler.setOferta(0);
				miAlquiler.setCoste(0);
				if (alquiler.modificarAlquiler(miAlquiler)) {
					mostrarVentanaAniadirAlquiler(noVisible);
					vistaAlquiler.avisarAlquilerModificadoCorrecto();
				}
			}
		});	
	}
	
	private void listenerAniadirCliente() {
		this.vistaGeneral.listenerAniadirCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vistaCliente.establecerEstadoDefecto();
				vistaCliente.removeListenerAniadirButton();
				gestionaNuevoCliente();
			}
		});
	}
	
	private void gestionaNuevoCliente() {
		this.mostrarVentanaAniadirCliente(visible);
		this.vistaCliente.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente miCliente = new Cliente();
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
				ClienteDao cliente = new ClienteDao();
				if (cliente.aniadirCliente(miCliente)) {
					mostrarVentanaAniadirCliente(noVisible);
					vistaCliente.avisarClienteAniadidoCorrecto();
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
			}
		});
	}
	
	private void listenerModificarCliente() {
		this.vistaGeneral.listenerModificarCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
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
				if (cliente.modificarCliente(miCliente)) {
					mostrarVentanaAniadirCliente(noVisible);
					vistaCliente.avisarClienteModificadoCorrecto();
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
		}
	}
	
	private void aniadirListenerAutenticar() {
		this.vistaAutenticar.addButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	validar(evt);
            }
        });	
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
    		this.vistaAutenticar.setVisible(false);;
		}
		this.vistaAutenticar.getTextFieldUsuario().setText("");
		this.vistaAutenticar.getPasswordText().setText("");
	}
}

