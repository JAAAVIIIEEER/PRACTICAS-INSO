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
				gestionarNuevoEmpleado();
			}
		});
	}
	
	private void gestionarNuevoEmpleado() {
		this.mostrarVentanaAniadirEmpleado(visible);
		this.vistaEmpleado.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado miEmpleado = new Empleado();
				miEmpleado.setDNI(vistaEmpleado.getDNIText());
				miEmpleado.setUsuario(vistaEmpleado.getUsuarioText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellidos(vistaEmpleado.getApellidosText());
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
				gestionarModificarEmpleado();
			}
		});
	}
	
	private void gestionarModificarEmpleado() {
		String dni = vistaEmpleado.mostrarVentanaConsultarEmpleado();
		EmpleadoDao empleado = new EmpleadoDao();
		Empleado miEmpleado = empleado.consultarEmpleado(dni);
		vistaEmpleado.setDNIText(miEmpleado.getDNI());
		vistaEmpleado.setUsuarioText(miEmpleado.getUsuario());
		vistaEmpleado.setContraseniaText(miEmpleado.getContrasenia());
		vistaEmpleado.setNacimientoDate(miEmpleado.getNacimiento());
		vistaEmpleado.setEmailText(miEmpleado.getEmail());
		vistaEmpleado.setTelefonoText(miEmpleado.getTelefono());
		vistaEmpleado.setNombreText(miEmpleado.getNombre());
		vistaEmpleado.setApellidosText(miEmpleado.getApellidos());
		vistaEmpleado.setTipoText(miEmpleado.getTipo());
		mostrarVentanaAniadirEmpleado(visible);
		this.vistaEmpleado.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miEmpleado.setDNI(vistaEmpleado.getDNIText());
				miEmpleado.setUsuario(vistaEmpleado.getUsuarioText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellidos(vistaEmpleado.getApellidosText());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				if (empleado.modificarEmpleado(miEmpleado)) {
					mostrarVentanaAniadirEmpleado(noVisible);
					vistaEmpleado.avisarEmpleadoAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerAniadirVehiculo() {
		this.vistaGeneral.listenerAniadirVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
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
//				miVehiculo.setNombre(vistaEmpleado.getNombreText());
//				miVehiculo.setApellidos(vistaEmpleado.getApellidosText());
//				miVehiculo.setTipo(vistaEmpleado.getTipoText());
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
				String id = vistaVehiculo.mostrarVentanaBajaVehiculo();
				VehiculoDao vehiculo = new VehiculoDao();
				vehiculo.bajaVehiculo(id);
			}
		});
	}
	
	private void listenerModificarVehiculo() {
		this.vistaGeneral.listenerModificarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionarModificarVehiculo();
			}
		});
	}
	
	private void gestionarModificarVehiculo() {
//		String id = vistaEmpleado.mostrarVentanaConsultarEmpleado();
//		VehiculoDao vehiculo = new VehiculoDao();
//		Vehiculo miVehiculo = vehiculo.consultarVehiculo(Integer.valueOf(id));
//		vistaVehiculo.setDNIText(miEmpleado.getDNI());
//		vistaVehiculo.setUsuarioText(miEmpleado.getUsuario());
//		vistaVehiculo.setContraseniaText(miEmpleado.getContrasenia());
//		vistaVehiculo.setNacimientoDate(miEmpleado.getNacimiento());
//		vistaVehiculo.setEmailText(miEmpleado.getEmail());
//		vistaVehiculo.setTelefonoText(miEmpleado.getTelefono());
//		vistaVehiculo.setNombreText(miEmpleado.getNombre());
//		mostrarVentanaAniadirVehiculo(visible);
//		this.vistaEmpleado.listenerAniadirButton(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				miEmpleado.setDNI(vistaEmpleado.getDNIText());
//				miEmpleado.setUsuario(vistaEmpleado.getUsuarioText());
//				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
//				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
//				miEmpleado.setEmail(vistaEmpleado.getEmailText());
//				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
//				miEmpleado.setNombre(vistaEmpleado.getNombreText());
//				miEmpleado.setApellidos(vistaEmpleado.getApellidosText());
//				miEmpleado.setTipo(vistaEmpleado.getTipoText());
//				EmpleadoDao empleado = new EmpleadoDao();
//				if (empleado.modificarEmpleado(miEmpleado)) {
//					mostrarVentanaAniadirVehiculo(noVisible);
//					vistaEmpleado.avisarEmpleadoAniadidoCorrecto();
//				}
//			}
//		});	
	}
	
	private void listenerAniadirTienda() {
		this.vistaGeneral.listenerAniadirTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
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
//				miVehiculo.setMatricula(vistaTienda.getMatriculaText());
//				miVehiculo.setMarca(vistaTienda.getMarcaText());
//				miVehiculo.setNombre(vistaEmpleado.getNombreText());
//				miVehiculo.setApellidos(vistaEmpleado.getApellidosText());
//				miVehiculo.setTipo(vistaEmpleado.getTipoText());
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
				EmpleadoDao empleado = new EmpleadoDao();
			}
		});
	}
	
	private void listenerAniadirAlquiler() {
		this.vistaGeneral.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionaNuevoAlquiler();
			}
		});
	}
	
	private void gestionaNuevoAlquiler() {
		this.mostrarVentanaAniadirAlquiler(visible);
		this.vistaAlquiler.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler miAlquiler = new Alquiler();
				miAlquiler.setDni(vistaAlquiler.getDNIText());
				miAlquiler.setFecha1(vistaAlquiler.getFechaInicio());
				miAlquiler.setFecha2(vistaAlquiler.getFechaFin());
				miAlquiler.setMatVehiculo(vistaAlquiler.getVehiculo());
//				miAlquiler.setMatricula(vistaAlquiler.getMatriculaText());
//				miAlquiler.setMarca(vistaAlquiler.getMarcaText());
//				miVehiculo.setNombre(vistaEmpleado.getNombreText());
//				miVehiculo.setApellidos(vistaEmpleado.getApellidosText());
//				miVehiculo.setTipo(vistaEmpleado.getTipoText());
				AlquilerDao alquiler = new AlquilerDao();
				if (alquiler.aniadirAlquiler(miAlquiler)) {
					mostrarVentanaAniadirAlquiler(noVisible);
					vistaAlquiler.avisaAlquilerAniadidoCorrecto();
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
				EmpleadoDao empleado = new EmpleadoDao();
			}
		});
	}
	
	private void listenerAniadirCliente() {
		this.vistaGeneral.listenerAniadirCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
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
				miCliente.setApellidos(vistaCliente.getApellidosText());
				miCliente.setTelefono(vistaCliente.getTelefonoText());
				miCliente.setNacimiento(vistaCliente.getNacimientoDate());
				miCliente.setEmail(vistaCliente.getEmailText());
//				miVehiculo.setNombre(vistaEmpleado.getNombreText());
//				miVehiculo.setApellidos(vistaEmpleado.getApellidosText());
//				miVehiculo.setTipo(vistaEmpleado.getTipoText());
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
				EmpleadoDao empleado = new EmpleadoDao();
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

