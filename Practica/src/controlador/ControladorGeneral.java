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

public class ControladorGeneral {

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

	public static Logger logger = Logger.getLogger("RentLeonLog");

	public ControladorGeneral() {
		this.vistaAutenticar = new VistaAutenticar();
		this.vistaAlquiler = new VistaAlquiler();
		this.vistaEmpleado = new VistaEmpleado();
		this.vistaVehiculo = new VistaVehiculo();
		this.vistaTienda = new VistaTienda();
		this.vistaCliente = new VistaCliente();
		this.vistaOferta = new VistaOferta();
		this.vistaIncidencia = new VistaIncidencia();
		establecerLog();
	}

	public void establecerLog() {
		try {
			FileHandler fh = new FileHandler(".\\logs\\RentLeonLog.log");
			logger.addHandler(fh);
			fh.setFormatter(new MyFormatter());
			logger.setUseParentHandlers(false);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
				ControladorEmpleados empCont = new ControladorEmpleados(vistaEmpleado);
				empCont.aniadirEmpleado();
			}
		});
	}

	private void listenerBajaEmpleado() {
		this.vistaGeneral.listenerBajaEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorEmpleados empCont = new ControladorEmpleados(vistaEmpleado);
				empCont.bajaEmpleado();
			}
		});
	}

	private void listenerModificarEmpleado() {
		this.vistaGeneral.listenerModificarEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorEmpleados empCont = new ControladorEmpleados(vistaEmpleado);
				empCont.modificarEmpleado();
			}
		});
	}

	private void listenerAniadirVehiculo() {
		this.vistaGeneral.listenerAniadirVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorVehiculos vCont = new ControladorVehiculos(vistaVehiculo);
				vCont.aniadirVehiculo();
			}
		});
	}

	private void listenerBajaVehiculo() {
		this.vistaGeneral.listenerBajaVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorVehiculos vCont = new ControladorVehiculos(vistaVehiculo);
				vCont.eliminarVehiculo();
			}
		});
	}

	private void listenerModificarVehiculo() {
		this.vistaGeneral.listenerModificarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorVehiculos vCont = new ControladorVehiculos(vistaVehiculo);
				vCont.modificarVehiculo();
			}
		});
	}

	private void listenerAniadirTienda() {
		this.vistaGeneral.listenerAniadirTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.aniadirTienda();
				actualizarTiendas();
			}
		});
	}

	private void listenerBajaTienda() {
		this.vistaGeneral.listenerBajaTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.bajaTienda();
				actualizarTiendas();
			}
		});
	}

	private void listenerModificarTienda() {
		this.vistaGeneral.listenerModificarTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.modificarTienda();
				actualizarTiendas();
			}
		});
	}

	private void listenerAniadirAlquiler() {
		this.vistaGeneral.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.aniadirAlquiler();
				actualizarAlquileres();
			}
		});
	}

	private void listenerFinalizarAlquiler() {
		this.vistaGeneral.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.finalizarAlquiler();
				actualizarAlquileres();
			}
		});
	}

	private void listenerModificarAlquiler() {
		this.vistaGeneral.listenerModificarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.modificarAlquiler();
				actualizarAlquileres();
			}
		});
	}

	private void listenerAniadirCliente() {
		this.vistaGeneral.listenerAniadirCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorClientes cCont = new ControladorClientes(vistaCliente);
				cCont.aniadirCliente();
			}
		});
	}

	private void listenerBajaCliente() {
		this.vistaGeneral.listenerBajaCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorClientes cCont = new ControladorClientes(vistaCliente);
				cCont.eliminarCliente();
			}
		});
	}

	private void listenerModificarCliente() {
		this.vistaGeneral.listenerModificarCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorClientes cCont = new ControladorClientes(vistaCliente);
				cCont.modificarCliente();
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
				ControladorOfertas oCont = new ControladorOfertas(vistaOferta);
				oCont.aniadirOferta();
			}
		});
	}

	private void listenerFinalizarOferta() {
		this.vistaGeneral.listenerFinalizarOferta(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorOfertas oCont = new ControladorOfertas(vistaOferta);
				oCont.finalizarOferta();
			}
		});
	}

	private void listenerModificarOferta() {
		this.vistaGeneral.listenerModificarOferta(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorOfertas oCont = new ControladorOfertas(vistaOferta);
				oCont.modificarOferta();
			}
		});
	}

	private void listenerAniadirIncidencia() {
		this.vistaGeneral.listenerAniadirIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorIncidencias iCont = new ControladorIncidencias(vistaIncidencia);
				iCont.aniadirIncidencia();
			}
		});
	}

	private void listenerFinalizarIncidencia() {
		this.vistaGeneral.listenerFinalizarIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorIncidencias iCont = new ControladorIncidencias(vistaIncidencia);
				iCont.finalizarIncidencia();
			}
		});
	}

	private void listenerModificarIncidencia() {
		this.vistaGeneral.listenerModificarIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorIncidencias iCont = new ControladorIncidencias(vistaIncidencia);
				iCont.modificarIncidencia();
			}
		});
	}

	private void listenerTabAlquileresClicked() {
		this.vistaGeneral.listenerValoresTablaAlquileres(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getTablaAlquileres()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getTablaAlquileres()));
				} else {
					actualizarAlquileres();
					vistaGeneral.getjTabbedPane().addTab("Alquileres", vistaGeneral.getTablaAlquileres());
				}
			}
		});
	}

	private void actualizarAlquileres() {
		AlquilerDao alquiler = new AlquilerDao();
		ArrayList<Alquiler> listaAlquileres = alquiler.listarAlquileres();
		int i = 0;
		for (Alquiler miAlquiler : listaAlquileres) {
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getId()), i, 0);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getFecha1()), i, 1);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getFecha2()), i, 2);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getCoste()), i, 3);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getMatVehiculo()), i, 4);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getDniEmpleado()), i, 5);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getDniCliente()), i, 6);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getOferta()), i, 7);
			vistaGeneral.establecerValorAlquiler(String.valueOf(miAlquiler.getEstado()), i, 8);
			i += 1;
		}
	}

	private void listenerTabClientesClicked() {
		this.vistaGeneral.listenerValoresTablaClientes(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getClientesPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getClientesPanel()));
				} else {
					actualizarClientes();
					vistaGeneral.getjTabbedPane().addTab("Clientes", vistaGeneral.getClientesPanel());
				}
			}
		});
	}

	private void actualizarClientes() {
		ClienteDao cliente = new ClienteDao();
		ArrayList<Cliente> listaClientes = cliente.listarClientes();
		int i = 0;
		for (Cliente miCliente : listaClientes) {
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getDNI()), i, 0);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getNombre()), i, 1);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getApellido1()), i, 2);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getApellido2()), i, 3);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getNacimiento()), i, 4);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getTelefono()), i, 5);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getEmail()), i, 6);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getProvincia()), i, 7);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getMunicipio()), i, 8);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getCalle()), i, 9);
			vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getPortal()), i, 10);
			i += 1;
		}
	}

	private void listenerTabEmpleadosClicked() {
		this.vistaGeneral.listenerValoresTablaEmpleados(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getEmpleadosPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getEmpleadosPanel()));
				} else {
					actualizaEmpleados();
					vistaGeneral.getjTabbedPane().addTab("Empleados", vistaGeneral.getEmpleadosPanel());
				}
			}
		});
	}

	private void actualizaEmpleados() {
		EmpleadoDao empleado = new EmpleadoDao();
		ArrayList<Empleado> listaEmpleados = empleado.listarEmpleados();
		int i = 0;
		for (Empleado miEmpleado : listaEmpleados) {
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getUsuarioDNI()), i, 0);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getNombre()), i, 1);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getApellido1()), i, 2);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getApellido2()), i, 3);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getNacimiento()), i, 4);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getTelefono()), i, 5);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getEmail()), i, 6);
			vistaGeneral.establecerValorEmpleado(String.valueOf(miEmpleado.getTipo()), i, 7);
			i += 1;
		}
	}

	private void listenerTabIncidenciasClicked() {
		this.vistaGeneral.listenerValoresTablaIncidencias(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getIncidenciasPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getIncidenciasPanel()));
				} else {
					actualizarIncidencias();
					vistaGeneral.getjTabbedPane().addTab("Incidencias", vistaGeneral.getIncidenciasPanel());
				}
			}
		});
	}

	private void actualizarIncidencias() {
		IncidenciaDao incidencia = new IncidenciaDao();
		ArrayList<Incidencia> listaIncidencias = incidencia.listarIncidencias();
		int i = 0;
		for (Incidencia miIncidencia : listaIncidencias) {
			vistaGeneral.establecerValorIncidencia(String.valueOf(miIncidencia.getId()), i, 0);
			vistaGeneral.establecerValorIncidencia(String.valueOf(miIncidencia.getAlquilerID()), i, 1);
			vistaGeneral.establecerValorIncidencia(String.valueOf(miIncidencia.getTipo()), i, 2);
			vistaGeneral.establecerValorIncidencia(String.valueOf(miIncidencia.getEstado()), i, 3);
			vistaGeneral.establecerValorIncidencia(String.valueOf(miIncidencia.getInforme()), i, 4);
			i += 1;
		}
	}

	private void listenerTabOfertasClicked() {
		this.vistaGeneral.listenerValoresTablaOfertas(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getOfertasPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getOfertasPanel()));
				} else {
					actualizaOfertas();
					vistaGeneral.getjTabbedPane().addTab("Ofertas", vistaGeneral.getOfertasPanel());
				}
			}
		});
	}

	private void actualizaOfertas() {
		OfertaDao oferta = new OfertaDao();
		ArrayList<Oferta> listaOfertas = oferta.listarOfertas();
		int i = 0;
		for (Oferta miOferta : listaOfertas) {
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getOfertaid()), i, 0);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getFechaInicio()), i, 1);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getFechaFin()), i, 2);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getTipoOferta()), i, 3);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getEspecificacion()), i, 4);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getDescuento()), i, 5);
			vistaGeneral.establecerValorOferta(String.valueOf(miOferta.getEstado()), i, 6);
			i += 1;
		}
	}

	private void listenerTabTiendasClicked() {
		this.vistaGeneral.listenerValoresTablaTiendas(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getTiendasPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getTiendasPanel()));
				} else {
					actualizarTiendas();
					vistaGeneral.getjTabbedPane().addTab("Tiendas", vistaGeneral.getTiendasPanel());
				}
			}
		});
	}

	private void actualizarTiendas() {
		TiendaDao tienda = new TiendaDao();
		ArrayList<Tienda> listaTiendas = tienda.listarTiendas();
		int i = 0;
		for (Tienda miTienda : listaTiendas) {
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getId()), i, 0);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getProvincia()), i, 1);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getMunicipio()), i, 2);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getVia()), i, 3);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getNumero()), i, 4);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getTelefono()), i, 5);
			vistaGeneral.establecerValorTienda(String.valueOf(miTienda.getEmail()), i, 6);
			i += 1;
		}
	}

	private void listenerTabVehiculosClicked() {
		this.vistaGeneral.listenerValoresTablaVehiculos(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getCochesPanel()) != -1) {
					vistaGeneral.getjTabbedPane()
							.remove(vistaGeneral.getjTabbedPane().indexOfComponent(vistaGeneral.getCochesPanel()));
				} else {
					actualizarVehiculo();
					vistaGeneral.getjTabbedPane().addTab("Vehiculos", vistaGeneral.getCochesPanel());
				}
			}
		});
	}

	private void actualizarVehiculo() {
		VehiculoDao vehiculo = new VehiculoDao();
		ArrayList<Vehiculo> listaVehiculos = vehiculo.listarVehiculos();
		int i = 0;
		for (Vehiculo miVehiculo : listaVehiculos) {
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getMatricula()), i, 0);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getTipo()), i, 1);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getCombustible()), i, 2);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getPlazas()), i, 3);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getCoste()), i, 4);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getExtras()), i, 5);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getTiendaID()), i, 6);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getEstado()), i, 7);
			vistaGeneral.establecerValorVehiculo(String.valueOf(miVehiculo.getModelo()), i, 8);
			i += 1;
		}
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
		listenerTabAlquileresClicked();
		listenerTabOfertasClicked();
		listenerTabClientesClicked();
		listenerTabVehiculosClicked();
		listenerTabTiendasClicked();
		listenerTabIncidenciasClicked();
		if (estado == 0) {
			listenerTabEmpleadosClicked();
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
