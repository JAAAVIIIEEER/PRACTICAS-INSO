package vista;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import implementacion.AlquilerImpl;
import implementacion.ClienteImpl;
import implementacion.EmpleadoImpl;
import implementacion.TiendaImpl;
import implementacion.VehiculoImpl;
import modelo.Alquiler;
import modelo.Empleado;
import modelo.Tienda;
import modelo.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rauls
 */
public class VistaGeneral extends javax.swing.JFrame {

	private final int administrador = 0;
	private final int base = 1;

	private int estado;

	/**
	 * Creates new form InterfazAdministrador
	 */
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
		jMenuItem24 = new javax.swing.JMenuItem();
		jMenuItem25 = new javax.swing.JMenuItem();
		jMenuItem26 = new javax.swing.JMenuItem();

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
		consultarVehiculo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarVehiculoClicked(evt);
			}
		});
		vehiculosMenu.add(consultarVehiculo);

		barraMenus.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		consultarTienda.setText("Consultar");
		consultarTienda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarTiendaClicked(evt);
			}
		});
		tiendaMenu.add(consultarTienda);

		barraMenus.add(tiendaMenu);

		clientesMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");

		clientesMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");

		clientesMenu.add(bajaCliente);

		consultarCliente.setText("Consultar");
		consultarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarClienteClicked(evt);
			}
		});
		clientesMenu.add(consultarCliente);

		modificarCliente.setText("Modificar");

		clientesMenu.add(modificarCliente);

		barraMenus.add(clientesMenu);

		alquileresMenu.setText("Alquileres");

		aniadirAlquiler.setText("Añadir");

		alquileresMenu.add(aniadirAlquiler);

		consultarAlquiler.setText("Consultar");
		consultarAlquiler.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarAlquilerClicked(evt);
			}
		});
		alquileresMenu.add(consultarAlquiler);

		modificarAlquiler.setText("Modificar");

		alquileresMenu.add(modificarAlquiler);

		finalizarAlquiler.setText("Finalizar");

		alquileresMenu.add(finalizarAlquiler);

		barraMenus.add(alquileresMenu);

		incidenciasMenu.setText("Incidencias");

		jMenuItem24.setText("Añadir");
		jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem24ActionPerformed(evt);
			}
		});
		incidenciasMenu.add(jMenuItem24);

		jMenuItem25.setText("Consultar");
		incidenciasMenu.add(jMenuItem25);

		jMenuItem26.setText("Modificar");
		incidenciasMenu.add(jMenuItem26);

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

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
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
		jMenuItem21 = new javax.swing.JMenuItem();
		jMenuItem22 = new javax.swing.JMenuItem();
		incidenciasMenu = new javax.swing.JMenu();
		jMenuItem24 = new javax.swing.JMenuItem();
		jMenuItem25 = new javax.swing.JMenuItem();
		jMenuItem26 = new javax.swing.JMenuItem();

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
		consultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarEmpleadoClicked(evt);
			}
		});
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
		consultarCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				consultarClienteClicked(evt);
			}
		});
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

		jMenuItem21.setText("Añadir");
		ofertasMenu.add(jMenuItem21);

		jMenuItem22.setText("Modificar");
		ofertasMenu.add(jMenuItem22);

		barraMenus.add(ofertasMenu);

		incidenciasMenu.setText("Incidencias");

		jMenuItem24.setText("Añadir");
		jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem24ActionPerformed(evt);
			}
		});
		incidenciasMenu.add(jMenuItem24);

		jMenuItem25.setText("Consultar");
		incidenciasMenu.add(jMenuItem25);

		jMenuItem26.setText("Modificar");
		incidenciasMenu.add(jMenuItem26);

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
	}// </editor-fold>
	
	public void addButtonListener(ActionListener listenerForButtons) {
		cambiarUsuario.addActionListener(listenerForButtons);
	}
	
	public void listenerAniadirEmpleado(ActionListener listenerForButtons) {
		this.aniadirEmpleado.addActionListener(listenerForButtons);
	}

	public void listenerBajaEmpleado(ActionListener listenerForButtons) {
		this.bajaEmpleado.addActionListener(listenerForButtons);	
	}
	
	public String mostrarVentanaBajaEmpleado() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Baja Empleado",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}
	
	public void listenerModificarEmpleado(ActionListener listenerForButtons) {
		this.modificarEmpleado.addActionListener(listenerForButtons);
//		String modificacion = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Vehiculo a modificar",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Añadir implementacion de modelos
//		EmpleadoImpl consulta = new EmpleadoImpl();
//		consulta.consultarEmpleado(Integer.valueOf(modificacion));
//		VistaAniadirEmpleado a = new VistaAniadirEmpleado();
//		a.setVisible(true);
	}

	public void listenerAniadirVehiculo(ActionListener listenerForButtons) {
		this.aniadirVehiculo.addActionListener(listenerForButtons);
//		VistaAniadirVehiculo a = new VistaAniadirVehiculo();
//		a.setVisible(true);
	}

	public void listenerBajaVehiculo(ActionListener listenerForButtons) {
		this.bajaVehiculo.addActionListener(listenerForButtons);
//		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Vehiculo",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO implementar modelos
//		VehiculoImpl a = new VehiculoImpl();
//		a.bajaVehiculo(baja);
	}
	
	public void listenerModificarVehiculo(ActionListener listenerForButtons) {
		this.modificarVehiculo.addActionListener(listenerForButtons);
//		String modificacion = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Vehiculo a modificar",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Añadir implementacion de modelos
//		VehiculoImpl consulta = new VehiculoImpl();
//		consulta.consultarVehiculo(modificacion);
//		VistaAniadirVehiculo a = new VistaAniadirVehiculo();
//		a.setVisible(true);
	}
	
	public void listenerAniadirTienda(ActionListener listenerForButtons) {
		this.aniadirTienda.addActionListener(listenerForButtons);
//		VistaAniadirTienda aniadir = new VistaAniadirTienda();
//		aniadir.setVisible(true);
	}

	public void listenerBajaTienda(ActionListener listenerForButtons) {
		this.bajaTienda.addActionListener(listenerForButtons);
//		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Tienda",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Implementar modelo
//		TiendaImpl a = new TiendaImpl();
//		a.eliminarTienda(Integer.valueOf(baja));
	}
	
	public void listenerModificarTienda(ActionListener listenerForButtons) {
		this.modificarTienda.addActionListener(listenerForButtons);
//		String modificacion = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Vehiculo a modificar",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Añadir implementacion de modelos
//		TiendaImpl consulta = new TiendaImpl();
//		consulta.consultarTienda(Integer.valueOf(modificacion));
//		VistaAniadirTienda a = new VistaAniadirTienda();
//		a.setVisible(true);
	}
	
	public void listenerAniadirAlquiler(ActionListener listenerForButtons) {
		this.aniadirAlquiler.addActionListener(listenerForButtons);
//		VistaAniadirAlquiler a = new VistaAniadirAlquiler();
//		a.setVisible(true);
	}

	public void listenerFinalizarAlquiler(ActionListener listenerForButtons) {
		this.finalizarAlquiler.addActionListener(listenerForButtons);
//		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Finalizar Alquiler",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
//		// implementacion
//		AlquilerImpl a = new AlquilerImpl();
//		a.finalizarAlquiler(Integer.valueOf(baja));
	}

	public void listenerModificarAlquiler(ActionListener listenerForButtons) {
		this.modificarAlquiler.addActionListener(listenerForButtons);
//		String modificacion = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Vehiculo a modificar",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Añadir implementacion de modelos
//		AlquilerImpl consulta = new AlquilerImpl();
//		consulta.consultarAlquiler(Integer.valueOf(modificacion));
//		VistaAniadirAlquiler a = new VistaAniadirAlquiler();
//		a.setVisible(true);
	}
	
	public void listenerAniadirCliente(ActionListener listenerForButtons) {
		this.aniadirCliente.addActionListener(listenerForButtons);
//		VistaAniadirCliente aniadir = new VistaAniadirCliente();
//		aniadir.setVisible(true);
	}

	public void listenerBajaCliente(ActionListener listenerForButtons) {
		this.bajaCliente.addActionListener(listenerForButtons);
//		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Cliente",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
//		// implementacion
//		ClienteImpl a = new ClienteImpl();
//		a.eliminarCliente(Integer.valueOf(baja));
	}
	
	public void listenerModificarCliente(ActionListener listenerForButtons) {
		this.modificarCliente.addActionListener(listenerForButtons);
//		String dniCliente = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Consultar Cliente",
//				JOptionPane.QUESTION_MESSAGE);
//		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
//		// implementacion
//		ClienteImpl consulta = new ClienteImpl();
//		consulta.consultarCliente(dniCliente);
//		VistaAniadirCliente a = new VistaAniadirCliente();
//		a.setVisible(true);
	}
	

	private void consultarVehiculoClicked(java.awt.event.ActionEvent evt) {
		String matConsulta = JOptionPane.showInputDialog(null, "Introduce la matricula:", "Vehiculo a consultar",
				JOptionPane.QUESTION_MESSAGE);
		VehiculoImpl consulta = new VehiculoImpl();
		Vehiculo a = consulta.consultarVehiculo(matConsulta);
	}
	
	private void consultarTiendaClicked(java.awt.event.ActionEvent evt) {
		String idConsultar = JOptionPane.showInputDialog(null, "Introduce el ID:", "Tienda a consultar",
				JOptionPane.QUESTION_MESSAGE);
		// TODO Añadir implementacion de modelos
		TiendaImpl consulta = new TiendaImpl();
		Tienda a = consulta.consultarTienda(Integer.valueOf(idConsultar));
	}
	
	private void consultarEmpleadoClicked(java.awt.event.ActionEvent evt) {
		String idConsultar = JOptionPane.showInputDialog(null, "Introduce el ID:", "Tienda a consultar",
				JOptionPane.QUESTION_MESSAGE);
		EmpleadoImpl consulta = new EmpleadoImpl();
		Empleado a = consulta.consultarEmpleado(Integer.valueOf(idConsultar));
	}

	
	private void consultarClienteClicked(java.awt.event.ActionEvent evt) {
		String dniCliente = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Consultar Cliente",
				JOptionPane.QUESTION_MESSAGE);
		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
		// implementacion
		ClienteImpl a = new ClienteImpl();
		a.consultarCliente(dniCliente);
	}

	private void consultarAlquilerClicked(java.awt.event.ActionEvent evt) {
		String idConsultar = JOptionPane.showInputDialog(null, "Introduce el ID:", "Cliente a consultar",
				JOptionPane.QUESTION_MESSAGE);
		AlquilerImpl consulta = new AlquilerImpl();
		Alquiler a = consulta.consultarAlquiler(Integer.valueOf(idConsultar));
	}

	private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// Variables declaration - do not modify
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
	private javax.swing.JMenuItem jMenuItem21;
	private javax.swing.JMenuItem jMenuItem22;
	private javax.swing.JMenuItem finalizarAlquiler;
	private javax.swing.JMenuItem jMenuItem24;
	private javax.swing.JMenuItem jMenuItem25;
	private javax.swing.JMenuItem jMenuItem26;
	private javax.swing.JMenuItem modificarTienda;
	private javax.swing.JMenuItem aniadirVehiculo;
	private javax.swing.JMenuItem bajaVehiculo;
	private javax.swing.JMenuItem consultarVehiculo;
	private javax.swing.JMenuItem aniadirTienda;
	private javax.swing.JMenuItem bajaTienda;
	private javax.swing.JMenuItem consultarTienda;
	// End of variables declaration
}
