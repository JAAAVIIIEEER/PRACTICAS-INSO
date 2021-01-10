package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.*;
import vista.*;
import modelo.*;

public class Controlador{
	
	private VistaAutenticar vista;
	private int errores = 0;
	private VistaGeneral general;
	private VistaAniadirAlquiler aniadirAlquiler;
	private VistaAniadirEmpleado aniadirEmpleado;
	private VistaAniadirVehiculo aniadirVehiculo;
	private VistaAniadirTienda vistaTienda;
	private VistaAniadirCliente vistaCliente;
	private VistaAniadirOferta vistaOferta;
	
	private final boolean visible = true;
	private final boolean noVisible = false;

	public Controlador() {
		this.vista = new VistaAutenticar();
		this.aniadirAlquiler = new VistaAniadirAlquiler();
		this.aniadirEmpleado = new VistaAniadirEmpleado();
		this.aniadirVehiculo = new VistaAniadirVehiculo();
		this.vistaTienda = new VistaAniadirTienda();
		this.vistaCliente = new VistaAniadirCliente();
		this.vistaOferta = new VistaAniadirOferta();
	}
	
	public void mostrarVentanaAniadirAlquiler(boolean estado) {
		this.aniadirAlquiler.setVisible(true);
	}
	
	public void mostrarVentanaAniadirEmpleado(boolean estado) {
		this.aniadirEmpleado.setVisible(estado);
	}
	
	public void mostrarVentanaAniadirVehiculo(boolean estado) {
		this.aniadirVehiculo.setVisible(estado);
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
		vista.setVisible(true);
	}
	
	private void mostrarVentanaAutenticarSec() {
		this.errores = 0;
		vista.setVisible(true);
	}
	
	private void listenerCambiarUsuario() {
		this.general.addButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mostrarVentanaAutenticarSec();
			}
		});
	}
	
	private void listenerAniadirEmpleado() {
		this.general.listenerAniadirEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionarNuevoEmpleado();
			}
		});
	}
	
	private void gestionarNuevoEmpleado() {
		this.mostrarVentanaAniadirEmpleado(visible);
		this.aniadirEmpleado.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado miEmpleado = new Empleado();
				miEmpleado.setDNI(aniadirEmpleado.getDNIText());
				miEmpleado.setUsuario(aniadirEmpleado.getUsuarioText());
				miEmpleado.setContrasenia(aniadirEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(aniadirEmpleado.getNacimientoDate());
				miEmpleado.setEmail(aniadirEmpleado.getEmailText());
				miEmpleado.setTelefono(aniadirEmpleado.getTelefonoText());
				miEmpleado.setNombre(aniadirEmpleado.getNombreText());
				miEmpleado.setApellidos(aniadirEmpleado.getApellidosText());
				miEmpleado.setTipo(aniadirEmpleado.getTipoText());
				EmpleadoImpl empleado = new EmpleadoImpl();
				if (empleado.aniadirEmpleado(miEmpleado)) {
					mostrarVentanaAniadirEmpleado(noVisible);
					aniadirEmpleado.avisarEmpleadoAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerBajaEmpleado() {
		this.general.listenerBajaEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String dni = aniadirEmpleado.mostrarVentanaBajaEmpleado();
				EmpleadoImpl empleado = new EmpleadoImpl();
				empleado.eliminarEmpleado(dni);
			}
		});
	}
	
	private void listenerModificarEmpleado() {
		this.general.listenerModificarEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerAniadirVehiculo() {
		this.general.listenerAniadirVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionarNuevoVehiculo();
			}
		});
	}
	
	private void gestionarNuevoVehiculo() {
		this.mostrarVentanaAniadirVehiculo(visible);
		this.aniadirVehiculo.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vehiculo miVehiculo = new Vehiculo();
				miVehiculo.setPlazas(aniadirVehiculo.getPlazasBoxText());
				miVehiculo.setCombustible(aniadirVehiculo.getCombustibleBoxText());
				miVehiculo.setTipo(aniadirVehiculo.getTipoBoxText());
				miVehiculo.setCoste(aniadirVehiculo.getCosteSpinnerText());
				miVehiculo.setMatricula(aniadirVehiculo.getMatriculaText());
				miVehiculo.setMarca(aniadirVehiculo.getMarcaText());
//				miVehiculo.setNombre(aniadirEmpleado.getNombreText());
//				miVehiculo.setApellidos(aniadirEmpleado.getApellidosText());
//				miVehiculo.setTipo(aniadirEmpleado.getTipoText());
				VehiculoImpl vehiculo = new VehiculoImpl();
				if (vehiculo.aniadirVehiculo(miVehiculo)) {
					mostrarVentanaAniadirVehiculo(noVisible);
					aniadirVehiculo.avisarVehiculoAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerBajaVehiculo() {
		this.general.listenerBajaVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = aniadirVehiculo.mostrarVentanaBajaVehiculo();
				VehiculoImpl vehiculo = new VehiculoImpl();
				vehiculo.bajaVehiculo(id);
			}
		});
	}
	
	private void listenerModificarVehiculo() {
		this.general.listenerModificarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerAniadirTienda() {
		this.general.listenerAniadirTienda(new ActionListener() {
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
//				miVehiculo.setNombre(aniadirEmpleado.getNombreText());
//				miVehiculo.setApellidos(aniadirEmpleado.getApellidosText());
//				miVehiculo.setTipo(aniadirEmpleado.getTipoText());
				TiendaImpl tienda = new TiendaImpl();
				if (tienda.aniadirTienda(miTienda)) {
					mostrarVentanaAniadirTienda(noVisible);
					vistaTienda.avisarTiendaAniadidaCorrecto();
				}
			}
		});	
	}
	
	private void listenerBajaTienda() {
		this.general.listenerBajaTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = vistaTienda.mostrarVentanaBajaTienda();
				TiendaImpl tienda = new TiendaImpl();
				tienda.eliminarTienda(Integer.parseInt(id));
			}
		});
	}
	
	private void listenerModificarTienda() {
		this.general.listenerModificarTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerAniadirAlquiler() {
		this.general.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionaNuevoAlquiler();
			}
		});
	}
	
	private void gestionaNuevoAlquiler() {
		this.mostrarVentanaAniadirAlquiler(visible);
		this.aniadirAlquiler.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Alquiler miAlquiler = new Alquiler();
				miAlquiler.setDni(aniadirAlquiler.getDNIText());
				miAlquiler.setFecha1(aniadirAlquiler.getFechaInicio());
				miAlquiler.setFecha2(aniadirAlquiler.getFechaFin());
				miAlquiler.setMatVehiculo(aniadirAlquiler.getVehiculo());
//				miAlquiler.setMatricula(aniadirAlquiler.getMatriculaText());
//				miAlquiler.setMarca(aniadirAlquiler.getMarcaText());
//				miVehiculo.setNombre(aniadirEmpleado.getNombreText());
//				miVehiculo.setApellidos(aniadirEmpleado.getApellidosText());
//				miVehiculo.setTipo(aniadirEmpleado.getTipoText());
				AlquilerImpl alquiler = new AlquilerImpl();
				if (alquiler.aniadirAlquiler(miAlquiler)) {
					mostrarVentanaAniadirAlquiler(noVisible);
					aniadirAlquiler.avisaAlquilerAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerFinalizarAlquiler() {
		this.general.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id = aniadirAlquiler.mostrarVentanaFinalizarAlquiler();
				TiendaImpl alquiler = new TiendaImpl();
				alquiler.eliminarTienda(Integer.parseInt(id));
			}
		});
	}
	
	private void listenerModificarAlquiler() {
		this.general.listenerModificarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerAniadirCliente() {
		this.general.listenerAniadirCliente(new ActionListener() {
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
//				miVehiculo.setNombre(aniadirEmpleado.getNombreText());
//				miVehiculo.setApellidos(aniadirEmpleado.getApellidosText());
//				miVehiculo.setTipo(aniadirEmpleado.getTipoText());
				ClienteImpl cliente = new ClienteImpl();
				if (cliente.aniadirCliente(miCliente)) {
					mostrarVentanaAniadirCliente(noVisible);
					vistaCliente.avisarClienteAniadidoCorrecto();
				}
			}
		});	
	}
	
	private void listenerBajaCliente() {
		this.general.listenerBajaCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String dni = vistaCliente.mostrarVentanaBajaCliente();
				ClienteImpl cliente = new ClienteImpl();
				cliente.eliminarCliente(dni);
			}
		});
	}
	
	private void listenerModificarCliente() {
		this.general.listenerModificarCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
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
		this.vista.addButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	validar(evt);
            }
        });	
	}
	
	private void validar(ActionEvent evt) {
		if (general != null) {
			general.dispose();
		}
		String usuario = this.vista.getTextFieldUsuario().getText();
		String contrasenia = String.valueOf(this.vista.getPasswordText().getPassword());
		AutenticarImpl autenticar = new AutenticarImpl();
		int estado = autenticar.autenticarConexion(usuario, contrasenia);
		if (estado == 2) {
			errores += 1;
			if (errores < 3) {
				this.vista.avisarAutentificacionErronea();
			} else {
				this.vista.cerrarProgramaErrorAutenticacion();
			}
		} else {
			general = new VistaGeneral(estado);
    		general.setVisible(true);
    		aniadirListenerGeneral(estado);
    		this.vista.setVisible(false);;
		}
		this.vista.getTextFieldUsuario().setText("");
		this.vista.getPasswordText().setText("");
	}
}

