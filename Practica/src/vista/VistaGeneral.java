package vista;

import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VistaGeneral extends javax.swing.JFrame {

	private final int base = 1;
	
	public VistaGeneral(int estado) {
		if (estado == base) {
			initComponentsBase();
		} else {
			initComponentsAdmin();
		}
	}

	private void initComponentsBase() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		barraMenus = new javax.swing.JMenuBar();
		opcionesMenu = new javax.swing.JMenu();
		cambiarUsuario = new javax.swing.JMenuItem();
		vehiculosMenu = new javax.swing.JMenu();
		consultarVehiculo = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		consultarTienda = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		consultarCliente = new javax.swing.JMenuItem();
		modificarCliente = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirAlquiler = new javax.swing.JMenuItem();
		consultarAlquiler = new javax.swing.JMenuItem();
		modificarAlquiler = new javax.swing.JMenuItem();
		finalizarAlquiler = new javax.swing.JMenuItem();
		incidenciasMenu = new javax.swing.JMenu();
		aniadirIncidencia = new javax.swing.JMenuItem();
		consultarIncidencia = new javax.swing.JMenuItem();
		modificarIncidencia = new javax.swing.JMenuItem();
		finalizarIncidencia = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Empleado Base RentLeon");

		jLabel1.setText("Aqluileres Activos:");

		jLabel2.setText("0");

		jLabel3.setText("Vehiculos Disponibles:");

		jLabel4.setText("0");

		opcionesMenu.setText("Opciones");

		cambiarUsuario.setText("Cambiar Usuario");
		
		opcionesMenu.add(cambiarUsuario);

		barraMenus.add(opcionesMenu);

		vehiculosMenu.setText("Vehiculos");

		consultarVehiculo.setText("Consultar");

		vehiculosMenu.add(consultarVehiculo);

		barraMenus.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		consultarTienda.setText("Consultar");
		
		tiendaMenu.add(consultarTienda);

		barraMenus.add(tiendaMenu);

		clientesMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");

		clientesMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");

		clientesMenu.add(bajaCliente);

		consultarCliente.setText("Consultar");

		clientesMenu.add(consultarCliente);

		modificarCliente.setText("Modificar");

		clientesMenu.add(modificarCliente);

		barraMenus.add(clientesMenu);

		alquileresMenu.setText("Alquileres");

		aniadirAlquiler.setText("Añadir");

		alquileresMenu.add(aniadirAlquiler);

		consultarAlquiler.setText("Consultar");
		alquileresMenu.add(consultarAlquiler);

		modificarAlquiler.setText("Modificar");

		alquileresMenu.add(modificarAlquiler);

		finalizarAlquiler.setText("Finalizar");

		alquileresMenu.add(finalizarAlquiler);

		barraMenus.add(alquileresMenu);

		incidenciasMenu.setText("Incidencias");

		aniadirIncidencia.setText("Añadir");
		incidenciasMenu.add(aniadirIncidencia);

		consultarIncidencia.setText("Consultar");
		incidenciasMenu.add(consultarIncidencia);

		modificarIncidencia.setText("Modificar");
		incidenciasMenu.add(modificarIncidencia);
		
		finalizarIncidencia.setText("Finalizar");
		incidenciasMenu.add(finalizarIncidencia);

		barraMenus.add(incidenciasMenu);

		setJMenuBar(barraMenus);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel4))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)))
						.addContainerGap(1228, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3).addComponent(jLabel4))
								.addContainerGap(697, Short.MAX_VALUE)));

		pack();
	}

	private void initComponentsAdmin() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		barraMenus = new javax.swing.JMenuBar();
		opcionesMenu = new javax.swing.JMenu();
		cambiarUsuario = new javax.swing.JMenuItem();
		vehiculosMenu = new javax.swing.JMenu();
		aniadirVehiculo = new javax.swing.JMenuItem();
		bajaVehiculo = new javax.swing.JMenuItem();
		consultarVehiculo = new javax.swing.JMenuItem();
		modificarVehiculo = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		aniadirTienda = new javax.swing.JMenuItem();
		bajaTienda = new javax.swing.JMenuItem();
		consultarTienda = new javax.swing.JMenuItem();
		modificarTienda = new javax.swing.JMenuItem();
		empleadosMenu = new javax.swing.JMenu();
		aniadirEmpleado = new javax.swing.JMenuItem();
		bajaEmpleado = new javax.swing.JMenuItem();
		consultarEmpleado = new javax.swing.JMenuItem();
		modificarEmpleado = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		consultarCliente = new javax.swing.JMenuItem();
		modificarCliente = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirAlquiler = new javax.swing.JMenuItem();
		consultarAlquiler = new javax.swing.JMenuItem();
		modificarAlquiler = new javax.swing.JMenuItem();
		finalizarAlquiler = new javax.swing.JMenuItem();
		ofertasMenu = new javax.swing.JMenu();
		aniadirOferta = new javax.swing.JMenuItem();
		modificarOferta = new javax.swing.JMenuItem();
		consultarOferta = new javax.swing.JMenuItem();
		finalizarOferta = new javax.swing.JMenuItem();
		incidenciasMenu = new javax.swing.JMenu();
		aniadirIncidencia = new javax.swing.JMenuItem();
		consultarIncidencia = new javax.swing.JMenuItem();
		modificarIncidencia = new javax.swing.JMenuItem();
		finalizarIncidencia = new javax.swing.JMenuItem();

		this.setTitle("Administración RentLeon");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Aqluileres Activos:");

		jLabel2.setText("0");

		jLabel3.setText("Vehiculos Disponibles:");

		jLabel4.setText("0");

		opcionesMenu.setText("Opciones");

		cambiarUsuario.setText("Cambiar Usuario");

		opcionesMenu.add(cambiarUsuario);

		barraMenus.add(opcionesMenu);

		vehiculosMenu.setText("Vehiculos");

		aniadirVehiculo.setText("Añadir");

		vehiculosMenu.add(aniadirVehiculo);

		bajaVehiculo.setText("Baja");
		
		vehiculosMenu.add(bajaVehiculo);

		consultarVehiculo.setText("Consultar");
		vehiculosMenu.add(consultarVehiculo);

		modificarVehiculo.setText("Modificar");

		vehiculosMenu.add(modificarVehiculo);

		barraMenus.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		aniadirTienda.setText("Añadir");

		tiendaMenu.add(aniadirTienda);

		bajaTienda.setText("Eliminar");

		tiendaMenu.add(bajaTienda);

		consultarTienda.setText("Consultar");

		tiendaMenu.add(consultarTienda);

		modificarTienda.setText("Modificar");

		tiendaMenu.add(modificarTienda);
		
		barraMenus.add(tiendaMenu);

		empleadosMenu.setText("Empleados");

		aniadirEmpleado.setText("Añadir");
	
		empleadosMenu.add(aniadirEmpleado);

		bajaEmpleado.setText("Baja");

		empleadosMenu.add(bajaEmpleado);

		consultarEmpleado.setText("Consultar");

		empleadosMenu.add(consultarEmpleado);

		modificarEmpleado.setText("Modificar");

		empleadosMenu.add(modificarEmpleado);

		barraMenus.add(empleadosMenu);

		clientesMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");

		clientesMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");

		clientesMenu.add(bajaCliente);

		consultarCliente.setText("Consultar");
		clientesMenu.add(consultarCliente);

		modificarCliente.setText("Modificar");

		clientesMenu.add(modificarCliente);

		barraMenus.add(clientesMenu);

		alquileresMenu.setText("Alquileres");

		aniadirAlquiler.setText("Añadir");

		alquileresMenu.add(aniadirAlquiler);

		consultarAlquiler.setText("Consultar");

		alquileresMenu.add(consultarAlquiler);

		modificarAlquiler.setText("Modificar");

		alquileresMenu.add(modificarAlquiler);

		finalizarAlquiler.setText("Finalizar");
		
		alquileresMenu.add(finalizarAlquiler);

		barraMenus.add(alquileresMenu);

		ofertasMenu.setText("Ofertas");

		aniadirOferta.setText("Añadir");
		ofertasMenu.add(aniadirOferta);
		
		consultarOferta.setText("Consultar");
		ofertasMenu.add(consultarOferta);

		modificarOferta.setText("Modificar");
		ofertasMenu.add(modificarOferta);
		
		finalizarOferta.setText("Finalizar");
		ofertasMenu.add(finalizarOferta);
		
		barraMenus.add(ofertasMenu);

		incidenciasMenu.setText("Incidencias");

		aniadirIncidencia.setText("Añadir");
		incidenciasMenu.add(aniadirIncidencia);

		consultarIncidencia.setText("Consultar");
		incidenciasMenu.add(consultarIncidencia);

		modificarIncidencia.setText("Modificar");
		incidenciasMenu.add(modificarIncidencia);
		
		finalizarIncidencia.setText("Finalizar");
		incidenciasMenu.add(finalizarIncidencia);

		barraMenus.add(incidenciasMenu);

		setJMenuBar(barraMenus);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel4))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)))
						.addContainerGap(1228, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3).addComponent(jLabel4))
								.addContainerGap(697, Short.MAX_VALUE)));

		pack();
	}
	
	public void addButtonListener(ActionListener listenerForButtons) {
		this.cambiarUsuario.addActionListener(listenerForButtons);
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

	public void listenerConsultarVehiculo(ActionListener listenerForButtons) {
		this.consultarVehiculo.addActionListener(listenerForButtons);
	}
	
	public void listenerConsultarTienda(ActionListener listenerForButtons) {
		this.consultarTienda.addActionListener(listenerForButtons);
	}
	
	public void listenerConsultarEmpleado(ActionListener listenerForButtons) {
		this.consultarEmpleado.addActionListener(listenerForButtons);
	}

	
	public void listenerConsultarCliente(ActionListener listenerForButtons) {
		this.consultarCliente.addActionListener(listenerForButtons);
	}

	public void listenerConsultarAlquiler(ActionListener listenerForButtons) {
		this.consultarAlquiler.addActionListener(listenerForButtons);
	}
	
	public void listenerConsultarOferta(ActionListener listenerForButtons) {
		this.consultarOferta.addActionListener(listenerForButtons);
	}
	
	public void listenerConsultarIncidencia(ActionListener listenerForButtons) {
		this.consultarIncidencia.addActionListener(listenerForButtons);
	}

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenu opcionesMenu;
	private javax.swing.JMenu vehiculosMenu;
	private javax.swing.JMenu tiendaMenu;
	private javax.swing.JMenu empleadosMenu;
	private javax.swing.JMenu alquileresMenu;
	private javax.swing.JMenu clientesMenu;
	private javax.swing.JMenu ofertasMenu;
	private javax.swing.JMenu incidenciasMenu;
	private javax.swing.JMenuBar barraMenus;
	private javax.swing.JMenuItem cambiarUsuario;
	private javax.swing.JMenuItem aniadirEmpleado;
	private javax.swing.JMenuItem bajaEmpleado;
	private javax.swing.JMenuItem consultarEmpleado;
	private javax.swing.JMenuItem modificarEmpleado;
	private javax.swing.JMenuItem aniadirAlquiler;
	private javax.swing.JMenuItem consultarAlquiler;
	private javax.swing.JMenuItem modificarAlquiler;
	private javax.swing.JMenuItem aniadirCliente;
	private javax.swing.JMenuItem bajaCliente;
	private javax.swing.JMenuItem consultarCliente;
	private javax.swing.JMenuItem modificarVehiculo;
	private javax.swing.JMenuItem modificarCliente;
	private javax.swing.JMenuItem aniadirOferta;
	private javax.swing.JMenuItem modificarOferta;
	private javax.swing.JMenuItem consultarOferta;
	private javax.swing.JMenuItem finalizarOferta;
	private javax.swing.JMenuItem finalizarAlquiler;
	private javax.swing.JMenuItem aniadirIncidencia;
	private javax.swing.JMenuItem consultarIncidencia;
	private javax.swing.JMenuItem modificarIncidencia;
	private javax.swing.JMenuItem finalizarIncidencia;
	private javax.swing.JMenuItem modificarTienda;
	private javax.swing.JMenuItem aniadirVehiculo;
	private javax.swing.JMenuItem bajaVehiculo;
	private javax.swing.JMenuItem consultarVehiculo;
	private javax.swing.JMenuItem aniadirTienda;
	private javax.swing.JMenuItem bajaTienda;
	private javax.swing.JMenuItem consultarTienda;
}
