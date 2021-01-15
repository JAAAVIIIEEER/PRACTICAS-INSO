package vista;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VistaGeneral extends javax.swing.JFrame {

	public VistaGeneral(int estado) {
		if (estado == 1) 
			initComponentsBase();
		else 
			initComponentsAdmin();
	}
	
	private void initComponentsBase() {
		jTabbedPane = new javax.swing.JTabbedPane();
		jMenuBar = new javax.swing.JMenuBar();
		jMenuInicio = new javax.swing.JMenu();
		jMenuVista = new javax.swing.JMenu();
		jMenuItemClientes = new javax.swing.JMenuItem();
		jMenuItemAlquileres = new javax.swing.JMenuItem();
		jMenuItemIncidencias = new javax.swing.JMenuItem();
		jMenuItemOfertas = new javax.swing.JMenuItem();
		jMenuItemCoches = new javax.swing.JMenuItem();
		jMenuItemTiendas = new javax.swing.JMenuItem();
		jMenuItemEmpleados = new javax.swing.JMenuItem();
		jMenuItemCerrarSesion = new javax.swing.JMenuItem();
		clientesPanel = new ClientesPanel();
		tablaAlquileres = new AlquileresPanel();
		incidenciasPanel = new IncidenciasPanel();
		ofertasPanel = new OfertasPanel();
		empleadosPanel = new EmpleadosPanel();
		cochesPanel = new VehiculosPanel();
		tiendasPanel = new TiendasPanel(); 
		vehiculosMenu = new javax.swing.JMenu();
		aniadirVehiculo = new javax.swing.JMenuItem();
		bajaVehiculo = new javax.swing.JMenuItem();
		modificarVehiculo = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		aniadirTienda = new javax.swing.JMenuItem();
		bajaTienda = new javax.swing.JMenuItem();
		modificarTienda = new javax.swing.JMenuItem();
		empleadosMenu = new javax.swing.JMenu();
		aniadirEmpleado = new javax.swing.JMenuItem();
		bajaEmpleado = new javax.swing.JMenuItem();
		modificarEmpleado = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		modificarCliente = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirAlquiler = new javax.swing.JMenuItem();
		modificarAlquiler = new javax.swing.JMenuItem();
		finalizarAlquiler = new javax.swing.JMenuItem();
		ofertasMenu = new javax.swing.JMenu();
		aniadirOferta = new javax.swing.JMenuItem();
		modificarOferta = new javax.swing.JMenuItem();
		finalizarOferta = new javax.swing.JMenuItem();
		incidenciasMenu = new javax.swing.JMenu();
		aniadirIncidencia = new javax.swing.JMenuItem();
		modificarIncidencia = new javax.swing.JMenuItem();
		finalizarIncidencia = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Empleado Base RentLeon");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(1000, 790);
		setLocationRelativeTo(null);
		setResizable(false);

		jTabbedPane.addTab("Alquileres", tablaAlquileres);

		jMenuInicio.setText("Inicio");

		jMenuItemCerrarSesion.setText("Cerrar Sesión");
		jMenuInicio.add(jMenuItemCerrarSesion); 

		jMenuBar.add(jMenuInicio);

		jMenuVista.setText("Vista");

		jMenuItemClientes.setText("Clientes");
		jMenuVista.add(jMenuItemClientes);

		jMenuItemAlquileres.setText("Alquileres");
		jMenuVista.add(jMenuItemAlquileres);

		jMenuItemIncidencias.setText("Incidencias");
		jMenuVista.add(jMenuItemIncidencias);

		jMenuItemCoches.setText("Coches");
		jMenuVista.add(jMenuItemCoches);

		jMenuBar.add(jMenuVista);

		clientesMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");

		clientesMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");

		clientesMenu.add(bajaCliente);

		modificarCliente.setText("Modificar");

		clientesMenu.add(modificarCliente);

		jMenuBar.add(clientesMenu);

		alquileresMenu.setText("Alquileres");

		aniadirAlquiler.setText("Añadir");

		alquileresMenu.add(aniadirAlquiler);

		modificarAlquiler.setText("Modificar");

		alquileresMenu.add(modificarAlquiler);

		finalizarAlquiler.setText("Finalizar");

		alquileresMenu.add(finalizarAlquiler);

		jMenuBar.add(alquileresMenu);

		incidenciasMenu.setText("Incidencias");

		aniadirIncidencia.setText("Añadir");
		incidenciasMenu.add(aniadirIncidencia);

		modificarIncidencia.setText("Modificar");
		incidenciasMenu.add(modificarIncidencia);

		finalizarIncidencia.setText("Finalizar");
		incidenciasMenu.add(finalizarIncidencia);

		jMenuBar.add(incidenciasMenu);

		setJMenuBar(jMenuBar);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jTabbedPane));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jTabbedPane));

		pack();
	}

	private void initComponentsAdmin() {

		jTabbedPane = new javax.swing.JTabbedPane();
		jMenuBar = new javax.swing.JMenuBar();
		jMenuInicio = new javax.swing.JMenu();
		jMenuVista = new javax.swing.JMenu();
		jMenuItemClientes = new javax.swing.JMenuItem();
		jMenuItemAlquileres = new javax.swing.JMenuItem();
		jMenuItemIncidencias = new javax.swing.JMenuItem();
		jMenuItemOfertas = new javax.swing.JMenuItem();
		jMenuItemCoches = new javax.swing.JMenuItem();
		jMenuItemTiendas = new javax.swing.JMenuItem();
		jMenuItemEmpleados = new javax.swing.JMenuItem();
		jMenuItemCerrarSesion = new javax.swing.JMenuItem();
		clientesPanel = new ClientesPanel();
		tablaAlquileres = new AlquileresPanel();
		incidenciasPanel = new IncidenciasPanel();
		ofertasPanel = new OfertasPanel();
		empleadosPanel = new EmpleadosPanel();
		cochesPanel = new VehiculosPanel();
		tiendasPanel = new TiendasPanel(); 
		vehiculosMenu = new javax.swing.JMenu();
		aniadirVehiculo = new javax.swing.JMenuItem();
		bajaVehiculo = new javax.swing.JMenuItem();
		modificarVehiculo = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		aniadirTienda = new javax.swing.JMenuItem();
		bajaTienda = new javax.swing.JMenuItem();
		modificarTienda = new javax.swing.JMenuItem();
		empleadosMenu = new javax.swing.JMenu();
		aniadirEmpleado = new javax.swing.JMenuItem();
		bajaEmpleado = new javax.swing.JMenuItem();
		modificarEmpleado = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		modificarCliente = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirAlquiler = new javax.swing.JMenuItem();
		modificarAlquiler = new javax.swing.JMenuItem();
		finalizarAlquiler = new javax.swing.JMenuItem();
		ofertasMenu = new javax.swing.JMenu();
		aniadirOferta = new javax.swing.JMenuItem();
		modificarOferta = new javax.swing.JMenuItem();
		finalizarOferta = new javax.swing.JMenuItem();
		incidenciasMenu = new javax.swing.JMenu();
		aniadirIncidencia = new javax.swing.JMenuItem();
		modificarIncidencia = new javax.swing.JMenuItem();
		finalizarIncidencia = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Administración RentLeon");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(1000, 790);
		setLocationRelativeTo(null);
		setResizable(false);

		jTabbedPane.addTab("Alquileres", tablaAlquileres);

		jMenuInicio.setText("Inicio");

		jMenuItemCerrarSesion.setText("Cerrar Sesión");
		jMenuInicio.add(jMenuItemCerrarSesion);

		jMenuBar.add(jMenuInicio);

		jMenuVista.setText("Vista");

		jMenuItemClientes.setText("Clientes");
		jMenuVista.add(jMenuItemClientes);

		jMenuItemAlquileres.setText("Alquileres");
		jMenuVista.add(jMenuItemAlquileres);

		jMenuItemIncidencias.setText("Incidencias");
		jMenuVista.add(jMenuItemIncidencias);

		jMenuItemOfertas.setText("Ofertas");
		jMenuVista.add(jMenuItemOfertas);

		jMenuItemEmpleados.setText("Empleados");

		jMenuVista.add(jMenuItemEmpleados);

		jMenuItemCoches.setText("Vehiculos");
		jMenuVista.add(jMenuItemCoches);

		jMenuItemTiendas.setText("Tiendas");

		jMenuVista.add(jMenuItemTiendas);

		jMenuBar.add(jMenuVista);

		vehiculosMenu.setText("Vehiculos");

		aniadirVehiculo.setText("Añadir");

		vehiculosMenu.add(aniadirVehiculo);

		bajaVehiculo.setText("Baja");

		vehiculosMenu.add(bajaVehiculo);

		modificarVehiculo.setText("Modificar");

		vehiculosMenu.add(modificarVehiculo);

		jMenuBar.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		aniadirTienda.setText("Añadir");

		tiendaMenu.add(aniadirTienda);

		bajaTienda.setText("Eliminar");

		tiendaMenu.add(bajaTienda);

		modificarTienda.setText("Modificar");

		tiendaMenu.add(modificarTienda);

		jMenuBar.add(tiendaMenu);

		empleadosMenu.setText("Empleados");

		aniadirEmpleado.setText("Añadir");

		empleadosMenu.add(aniadirEmpleado);

		bajaEmpleado.setText("Baja");

		empleadosMenu.add(bajaEmpleado);

		modificarEmpleado.setText("Modificar");

		empleadosMenu.add(modificarEmpleado);

		jMenuBar.add(empleadosMenu);

		clientesMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");

		clientesMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");

		clientesMenu.add(bajaCliente);

		modificarCliente.setText("Modificar");

		clientesMenu.add(modificarCliente);

		jMenuBar.add(clientesMenu);

		alquileresMenu.setText("Alquileres");

		aniadirAlquiler.setText("Añadir");

		alquileresMenu.add(aniadirAlquiler);

		modificarAlquiler.setText("Modificar");

		alquileresMenu.add(modificarAlquiler);

		finalizarAlquiler.setText("Finalizar");

		alquileresMenu.add(finalizarAlquiler);

		jMenuBar.add(alquileresMenu);

		ofertasMenu.setText("Ofertas");

		aniadirOferta.setText("Añadir");
		ofertasMenu.add(aniadirOferta);

		modificarOferta.setText("Modificar");
		ofertasMenu.add(modificarOferta);

		finalizarOferta.setText("Finalizar");
		ofertasMenu.add(finalizarOferta);

		jMenuBar.add(ofertasMenu);

		incidenciasMenu.setText("Incidencias");

		aniadirIncidencia.setText("Añadir");
		incidenciasMenu.add(aniadirIncidencia);

		modificarIncidencia.setText("Modificar");
		incidenciasMenu.add(modificarIncidencia);

		finalizarIncidencia.setText("Finalizar");
		incidenciasMenu.add(finalizarIncidencia);

		jMenuBar.add(incidenciasMenu);

		setJMenuBar(jMenuBar);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jTabbedPane));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jTabbedPane));

		pack();
	}

	public void addButtonListener(ActionListener listenerForButtons) {
		this.jMenuItemCerrarSesion.addActionListener(listenerForButtons);
	}

	public void listenerAniadirEmpleado(ActionListener listenerForButtons) {
		this.aniadirEmpleado.addActionListener(listenerForButtons);
	}

	public void listenerBajaEmpleado(ActionListener listenerForButtons) {
		this.bajaEmpleado.addActionListener(listenerForButtons);
	}

	public void listenerModificarEmpleado(ActionListener listenerForButtons) {
		this.modificarEmpleado.addActionListener(listenerForButtons);
	}

	public void listenerAniadirVehiculo(ActionListener listenerForButtons) {
		this.aniadirVehiculo.addActionListener(listenerForButtons);
	}

	public void listenerBajaVehiculo(ActionListener listenerForButtons) {
		this.bajaVehiculo.addActionListener(listenerForButtons);
	}

	public void listenerModificarVehiculo(ActionListener listenerForButtons) {
		this.modificarVehiculo.addActionListener(listenerForButtons);
	}

	public void listenerAniadirTienda(ActionListener listenerForButtons) {
		this.aniadirTienda.addActionListener(listenerForButtons);
	}

	public void listenerBajaTienda(ActionListener listenerForButtons) {
		this.bajaTienda.addActionListener(listenerForButtons);
	}

	public void listenerModificarTienda(ActionListener listenerForButtons) {
		this.modificarTienda.addActionListener(listenerForButtons);
	}

	public void listenerAniadirAlquiler(ActionListener listenerForButtons) {
		this.aniadirAlquiler.addActionListener(listenerForButtons);
	}

	public void listenerFinalizarAlquiler(ActionListener listenerForButtons) {
		this.finalizarAlquiler.addActionListener(listenerForButtons);
	}

	public void listenerModificarAlquiler(ActionListener listenerForButtons) {
		this.modificarAlquiler.addActionListener(listenerForButtons);
	}

	public void listenerAniadirCliente(ActionListener listenerForButtons) {
		this.aniadirCliente.addActionListener(listenerForButtons);
	}

	public void listenerBajaCliente(ActionListener listenerForButtons) {
		this.bajaCliente.addActionListener(listenerForButtons);
	}

	public void listenerModificarCliente(ActionListener listenerForButtons) {
		this.modificarCliente.addActionListener(listenerForButtons);
	}

	public void listenerAniadirOferta(ActionListener listenerForButtons) {
		this.aniadirOferta.addActionListener(listenerForButtons);
	}

	public void listenerFinalizarOferta(ActionListener listenerForButtons) {
		this.finalizarOferta.addActionListener(listenerForButtons);
	}

	public void listenerModificarOferta(ActionListener listenerForButtons) {
		this.modificarOferta.addActionListener(listenerForButtons);
	}

	public void listenerAniadirIncidencia(ActionListener listenerForButtons) {
		this.aniadirIncidencia.addActionListener(listenerForButtons);
	}

	public void listenerFinalizarIncidencia(ActionListener listenerForButtons) {
		this.finalizarIncidencia.addActionListener(listenerForButtons);
	}

	public void listenerModificarIncidencia(ActionListener listenerForButtons) {
		this.modificarIncidencia.addActionListener(listenerForButtons);
	}

	public void listenerValoresTablaAlquileres(ActionListener listenerForButtons) {
		this.jMenuItemAlquileres.addActionListener(listenerForButtons);
	}

	public void establecerValorAlquiler(String valor, int fila, int col) {
		tablaAlquileres.setValue(valor, fila, col);
	}

	public void listenerValoresTablaClientes(ActionListener listenerForButtons) {
		this.jMenuItemClientes.addActionListener(listenerForButtons);
	}

	public void establecerValorCliente(String valor, int fila, int col) {
		clientesPanel.setValue(valor, fila, col);
	}

	public void listenerValoresTablaEmpleados(ActionListener listenerForButtons) {
		this.jMenuItemEmpleados.addActionListener(listenerForButtons);
	}

	public void establecerValorEmpleado(String valor, int fila, int col) {
		empleadosPanel.setValue(valor, fila, col);
	}

	public void listenerValoresTablaIncidencias(ActionListener listenerForButtons) {
		this.jMenuItemIncidencias.addActionListener(listenerForButtons);
	}

	public void establecerValorIncidencia(String valor, int fila, int col) {
		this.incidenciasPanel.setValue(valor, fila, col);
	}

	public void listenerValoresTablaOfertas(ActionListener listenerForButtons) {
		this.jMenuItemOfertas.addActionListener(listenerForButtons);
	}

	public void establecerValorOferta(String valor, int fila, int col) {
		this.ofertasPanel.setValue(valor, fila, col);
	}

	public void listenerValoresTablaTiendas(ActionListener listenerForButtons) {
		this.jMenuItemTiendas.addActionListener(listenerForButtons);
	}

	public void establecerValorTienda(String valor, int fila, int col) {
		this.tiendasPanel.setValue(valor, fila, col);
	}

	public void listenerValoresTablaVehiculos(ActionListener listenerForButtons) {
		this.jMenuItemCoches.addActionListener(listenerForButtons);
	}

	public void establecerValorVehiculo(String valor, int fila, int col) {
		this.cochesPanel.setValue(valor, fila, col);
	}

	public EmpleadosPanel getEmpleadosPanel() {
		return empleadosPanel;
	}

	public javax.swing.JTabbedPane getjTabbedPane() {
		return jTabbedPane;
	}

	public AlquileresPanel getTablaAlquileres() {
		return tablaAlquileres;
	}

	public ClientesPanel getClientesPanel() {
		return clientesPanel;
	}

	public OfertasPanel getOfertasPanel() {
		return ofertasPanel;
	}

	public VehiculosPanel getCochesPanel() {
		return cochesPanel;
	}

	public TiendasPanel getTiendasPanel() {
		return tiendasPanel;
	}

	public IncidenciasPanel getIncidenciasPanel() {
		return incidenciasPanel;
	}
	
	public void vaciarTiendas() {
		this.tiendasPanel.vaciarTabla();
	}
	
	public void vaciarAlquileres() {
		this.tablaAlquileres.vaciarTabla();
	}
	
	public void vaciarClientes() {
		this.clientesPanel.vaciarTabla();
	}
	
	public void vaciarEmpleados() {
		this.empleadosPanel.vaciarTabla();
	}
	
	public void vaciarIncidencias() {
		this.incidenciasPanel.vaciarTabla();
	}
	
	public void vaciarOfertas() {
		this.ofertasPanel.vaciarTabla();
	}
	
	public void vaciarVehiculos() {
		this.cochesPanel.vaciarTabla();
	}

	// Variables declaration - do not modify
	private javax.swing.JMenu jMenuInicio;
	private javax.swing.JMenu jMenuVista;
	private javax.swing.JMenu vehiculosMenu;
	private javax.swing.JMenu tiendaMenu;
	private javax.swing.JMenu empleadosMenu;
	private javax.swing.JMenu alquileresMenu;
	private javax.swing.JMenu clientesMenu;
	private javax.swing.JMenu ofertasMenu;
	private javax.swing.JMenu incidenciasMenu;
	private javax.swing.JMenuBar jMenuBar;
	private javax.swing.JMenuItem jMenuItemClientes;
	private javax.swing.JMenuItem jMenuItemAlquileres;
	private javax.swing.JMenuItem jMenuItemIncidencias;
	private javax.swing.JMenuItem jMenuItemOfertas;
	private javax.swing.JMenuItem jMenuItemCoches;
	private javax.swing.JMenuItem jMenuItemTiendas;
	private javax.swing.JMenuItem jMenuItemEmpleados;
	private javax.swing.JMenuItem jMenuItemCerrarSesion;
	private javax.swing.JMenuItem aniadirEmpleado;
	private javax.swing.JMenuItem bajaEmpleado;
	private javax.swing.JMenuItem modificarEmpleado;
	private javax.swing.JMenuItem aniadirAlquiler;
	private javax.swing.JMenuItem modificarAlquiler;
	private javax.swing.JMenuItem aniadirCliente;
	private javax.swing.JMenuItem bajaCliente;
	private javax.swing.JMenuItem modificarVehiculo;
	private javax.swing.JMenuItem modificarCliente;
	private javax.swing.JMenuItem aniadirOferta;
	private javax.swing.JMenuItem modificarOferta;
	private javax.swing.JMenuItem finalizarOferta;
	private javax.swing.JMenuItem finalizarAlquiler;
	private javax.swing.JMenuItem aniadirIncidencia;
	private javax.swing.JMenuItem modificarIncidencia;
	private javax.swing.JMenuItem finalizarIncidencia;
	private javax.swing.JMenuItem modificarTienda;
	private javax.swing.JMenuItem aniadirVehiculo;
	private javax.swing.JMenuItem bajaVehiculo;
	private javax.swing.JMenuItem aniadirTienda;
	private javax.swing.JMenuItem bajaTienda;
	private ClientesPanel clientesPanel;
	private AlquileresPanel tablaAlquileres;
	private IncidenciasPanel incidenciasPanel;
	private OfertasPanel ofertasPanel;
	private EmpleadosPanel empleadosPanel;
	private VehiculosPanel cochesPanel;
	private TiendasPanel tiendasPanel;
	private javax.swing.JTabbedPane jTabbedPane;
	// End of variables declaration
}
