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
	private ValidarDatos validarDatos;
	private VistaConsultas vistaConsultas;

	private final boolean visible = true;
	private final boolean noVisible = false;

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
		this.validarDatos = new ValidarDatos();
		this.vistaConsultas = new VistaConsultas();
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

	public void mostrarVentanaConsultas(boolean estado) {
		this.vistaConsultas.setVisible(estado);
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

			}
		});
	}

	private void listenerConsultarEmpleado() {
		this.vistaGeneral.listenerConsultarEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorEmpleados empCont = new ControladorEmpleados(vistaEmpleado);
				String texto = empCont.consultarEmpleado();
				if (texto.equals("")) {
					vistaConsultas.mostrarError();
				} else {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				}
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

	private void listenerConsultarVehiculo() {
		this.vistaGeneral.listenerConsultarVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorVehiculos vCont = new ControladorVehiculos(vistaVehiculo);
				String texto = vCont.consultarVehiculo();
				if (texto.equals("")) {
					vistaConsultas.mostrarError();
				} else {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				}
			}
		});
	}

	private void listenerAniadirTienda() {
		this.vistaGeneral.listenerAniadirTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.aniadirTienda();
			}
		});
	}

	private void listenerBajaTienda() {
		this.vistaGeneral.listenerBajaTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.bajaTienda();

			}
		});
	}

	private void listenerModificarTienda() {
		this.vistaGeneral.listenerModificarTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				tCont.modificarTienda();
			}
		});
	}

	private void listenerConsultarTienda() {
		this.vistaGeneral.listenerConsultarTienda(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorTiendas tCont = new ControladorTiendas(vistaTienda);
				String texto = tCont.consultarTienda();
				if (texto.equals("")) {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				} else {
					vistaConsultas.mostrarError();
				}
			}
		});
	}

	private void listenerAniadirAlquiler() {
		this.vistaGeneral.listenerAniadirAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.aniadirAlquiler();
			}
		});
	}

	private void listenerFinalizarAlquiler() {
		this.vistaGeneral.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.finalizarAlquiler();
			}
		});
	}

	private void listenerModificarAlquiler() {
		this.vistaGeneral.listenerModificarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				aCont.modificarAlquiler();
			}
		});
	}

	private void listenerConsultarAlquiler() {
		this.vistaGeneral.listenerConsultarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorAlquileres aCont = new ControladorAlquileres(vistaAlquiler);
				String texto = aCont.consultarAlquiler();
				if (texto.equals("")) {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				} else {
					vistaConsultas.mostrarError();
				}
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

	private void listenerConsultarCliente() {
		this.vistaGeneral.listenerConsultarCliente(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorClientes cCont = new ControladorClientes(vistaCliente);
				String texto = cCont.consultarCliente();
				if (texto.equals("")) {
					vistaConsultas.mostrarError();
				} else {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
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

	private void listenerConsultarOferta() {
		this.vistaGeneral.listenerConsultarOferta(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorOfertas oCont = new ControladorOfertas(vistaOferta);
				String texto = oCont.consultarOferta();
				if (texto.equals("")) {
					vistaConsultas.mostrarError();
				} else {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				}
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

	private void listenerConsultarIncidencia() {
		this.vistaGeneral.listenerConsultarIncidencia(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorIncidencias iCont = new ControladorIncidencias(vistaIncidencia);
				String texto = iCont.consultarIncidencia();
				if (texto.equals("")) {
					vistaConsultas.mostrarError();
				} else {
					vistaConsultas.setText(texto);
					mostrarVentanaConsultas(true);
				}
			}
		});
	}

	private void listenerTabAlquileresClicked() {
		this.vistaGeneral.listenerValoresTablaAlquileres(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AlquilerDao alquiler = new AlquilerDao();
				ArrayList<Alquiler> listaAlquileres = alquiler.listarAlquileres();
				int i = 1;
				vistaGeneral.establecerValorAlquiler("ID", 0, 0);
				vistaGeneral.establecerValorAlquiler("Fecha Recogida", 0, 1);
				vistaGeneral.establecerValorAlquiler("Fecha Entrega", 0, 2);
				vistaGeneral.establecerValorAlquiler("Coste", 0, 3);
				vistaGeneral.establecerValorAlquiler("Vehiculo", 0, 4);
				vistaGeneral.establecerValorAlquiler("Empleado", 0, 5);
				vistaGeneral.establecerValorAlquiler("Cliente", 0, 6);
				vistaGeneral.establecerValorAlquiler("Oferta", 0, 7);
				vistaGeneral.establecerValorAlquiler("Estado", 0, 8);
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
		});
	}

	private void listenerTabClientesClicked() {
		this.vistaGeneral.listenerValoresTablaClientes(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ClienteDao cliente = new ClienteDao();
				ArrayList<Cliente> listaClientes = cliente.listarClientes();
				int i = 1;
				vistaGeneral.establecerValorCliente("DNI", 0, 0);
				vistaGeneral.establecerValorCliente("Nombre", 0, 1);
				vistaGeneral.establecerValorCliente("Apellido 1", 0, 2);
				vistaGeneral.establecerValorCliente("Apellido 2", 0, 3);
				vistaGeneral.establecerValorCliente("Fecha Nacimiento", 0, 4);
				vistaGeneral.establecerValorCliente("Telefono", 0, 5);
				vistaGeneral.establecerValorCliente("Email", 0, 6);
				vistaGeneral.establecerValorCliente("Pais", 0, 7);
				vistaGeneral.establecerValorCliente("Provincia", 0, 8);
				vistaGeneral.establecerValorCliente("Municipio", 0, 9);
				vistaGeneral.establecerValorCliente("Calle", 0, 10);
				vistaGeneral.establecerValorCliente("Portal", 0, 11);
				vistaGeneral.establecerValorCliente("Piso", 0, 12);
				vistaGeneral.establecerValorCliente("Letra", 0, 13);
				for (Cliente miCliente : listaClientes) {
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getDNI()), i, 0);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getNombre()), i, 1);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getApellido1()), i, 2);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getApellido2()), i, 3);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getNacimiento()), i, 4);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getTelefono()), i, 5);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getEmail()), i, 6);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getPais()), i, 7);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getProvincia()), i, 8);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getMunicipio()), i, 9);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getCalle()), i, 10);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getPortal()), i, 11);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getPiso()), i, 12);
					vistaGeneral.establecerValorCliente(String.valueOf(miCliente.getLetra()), i, 13);
					i += 1;
				}
			}
		});
	}

	private void listenerTabEmpleadosClicked() {
		this.vistaGeneral.listenerValoresTablaEmpleados(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				EmpleadoDao empleado = new EmpleadoDao();
				ArrayList<Empleado> listaEmpleados = empleado.listarEmpleados();
				int i = 1;
				vistaGeneral.establecerValorEmpleado("DNI", 0, 0);
				vistaGeneral.establecerValorEmpleado("Nombre", 0, 1);
				vistaGeneral.establecerValorEmpleado("Apellido 1", 0, 2);
				vistaGeneral.establecerValorEmpleado("Apellido 2", 0, 3);
				vistaGeneral.establecerValorEmpleado("Fecha Nacimiento", 0, 4);
				vistaGeneral.establecerValorEmpleado("Telefono", 0, 5);
				vistaGeneral.establecerValorEmpleado("Email", 0, 6);
				vistaGeneral.establecerValorEmpleado("Tipo", 0, 7);

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
		});
	}

	private void listenerTabIncidenciasClicked() {
		this.vistaGeneral.listenerValoresTablaIncidencias(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				IncidenciaDao incidencia = new IncidenciaDao();
				ArrayList<Incidencia> listaIncidencias = incidencia.listarIncidencias();
				int i = 1;
				vistaGeneral.establecerValorCliente("ID", 0, 0);
				vistaGeneral.establecerValorCliente("Alquiler ID", 0, 1);
				vistaGeneral.establecerValorCliente("Tipo", 0, 2);
				vistaGeneral.establecerValorCliente("Estado", 0, 3);
				vistaGeneral.establecerValorCliente("Informe", 0, 4);

				for (Incidencia miIncidencia : listaIncidencias) {
					vistaGeneral.establecerValorCliente(String.valueOf(miIncidencia.getId()), i, 0);
					vistaGeneral.establecerValorCliente(String.valueOf(miIncidencia.getAlquilerID()), i, 1);
					vistaGeneral.establecerValorCliente(String.valueOf(miIncidencia.getTipo()), i, 2);
					vistaGeneral.establecerValorCliente(String.valueOf(miIncidencia.getEstado()), i, 3);
					vistaGeneral.establecerValorCliente(String.valueOf(miIncidencia.getInforme()), i, 4);
					i += 1;
				}
			}
		});
	}

	private void listenerTabOfertasClicked() {
		this.vistaGeneral.listenerValoresTablaOfertas(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OfertaDao oferta = new OfertaDao();
				ArrayList<Oferta> listaOfertas = oferta.listarOfertas();
				int i = 1;
				vistaGeneral.establecerValorOferta("ID", 0, 0);
				vistaGeneral.establecerValorOferta("Inicio", 0, 1);
				vistaGeneral.establecerValorOferta("Fin", 0, 2);
				vistaGeneral.establecerValorOferta("Tipo", 0, 3);
				vistaGeneral.establecerValorOferta("Especificacion", 0, 4);
				vistaGeneral.establecerValorOferta("Descuento", 0, 5);
				vistaGeneral.establecerValorOferta("Estado", 0, 6);
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
		});
	}

	private void listenerTabTiendasClicked() {
		this.vistaGeneral.listenerValoresTablaTiendas(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TiendaDao tienda = new TiendaDao();
				ArrayList<Tienda> listaTiendas = tienda.listarTiendas();
				int i = 1;
				vistaGeneral.establecerValorTienda("ID", 0, 0);
				vistaGeneral.establecerValorTienda("Provincia", 0, 1);
				vistaGeneral.establecerValorTienda("Municipio", 0, 2);
				vistaGeneral.establecerValorTienda("Calle", 0, 3);
				vistaGeneral.establecerValorTienda("Portal", 0, 4);
				vistaGeneral.establecerValorTienda("Telefono", 0, 5);
				vistaGeneral.establecerValorTienda("Email", 0, 6);
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
		});
	}

	private void listenerTabVehiculosClicked() {
		this.vistaGeneral.listenerValoresTablaVehiculos(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VehiculoDao vehiculo = new VehiculoDao();
				ArrayList<Vehiculo> listaVehiculos = vehiculo.listarVehiculos();
				int i = 1;
				vistaGeneral.establecerValorVehiculo("Matricula", 0, 0);
				vistaGeneral.establecerValorVehiculo("Tipo", 0, 1);
				vistaGeneral.establecerValorVehiculo("Combustible", 0, 2);
				vistaGeneral.establecerValorVehiculo("Plazas", 0, 3);
				vistaGeneral.establecerValorVehiculo("Coste", 0, 4);
				vistaGeneral.establecerValorVehiculo("Extras", 0, 5);
				vistaGeneral.establecerValorVehiculo("Tienda", 0, 6);
				vistaGeneral.establecerValorVehiculo("Estado", 0, 7);
				vistaGeneral.establecerValorVehiculo("Modelo", 0, 8);
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
		listenerConsultarVehiculo();
		listenerConsultarTienda();
		listenerConsultarAlquiler();
		listenerConsultarCliente();
		listenerConsultarIncidencia();
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
			listenerConsultarEmpleado();
			listenerConsultarOferta();
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
