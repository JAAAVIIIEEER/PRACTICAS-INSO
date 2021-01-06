package vista;

import java.awt.Dimension;

import javax.swing.JOptionPane;

import implementacion.ClienteImpl;
import implementacion.EmpleadoImpl;
import implementacion.TiendaImpl;
import implementacion.VehiculoImpl;

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
		jMenuItem6 = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		jMenuItem19 = new javax.swing.JMenuItem();
		jMenuItem20 = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		jMenuItem14 = new javax.swing.JMenuItem();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenuItem16 = new javax.swing.JMenuItem();
		jMenuItem23 = new javax.swing.JMenuItem();
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
		cambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cambioUsuarioClicked(evt);
			}
		});
		opcionesMenu.add(cambiarUsuario);

		barraMenus.add(opcionesMenu);

		vehiculosMenu.setText("Vehiculos");

		jMenuItem6.setText("Consultar");
		vehiculosMenu.add(jMenuItem6);

		barraMenus.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		jMenuItem9.setText("Consultar");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		tiendaMenu.add(jMenuItem9);

		barraMenus.add(tiendaMenu);

		alquileresMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");
		aniadirCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aniadirClienteClicked(evt);
			}
		});
		alquileresMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");
		bajaCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaClienteClicked(evt);
			}
		});
		alquileresMenu.add(bajaCliente);

		jMenuItem19.setText("Consultar");
		alquileresMenu.add(jMenuItem19);

		jMenuItem20.setText("Modificar");
		alquileresMenu.add(jMenuItem20);

		barraMenus.add(alquileresMenu);

		clientesMenu.setText("Alquileres");

		jMenuItem14.setText("Añadir");
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem14);

		jMenuItem15.setText("Consultar");
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem15);

		jMenuItem16.setText("Modificar");
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem16ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem16);

		jMenuItem23.setText("Finalizar");
		jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem23ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem23);

		barraMenus.add(clientesMenu);

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
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		tiendaMenu = new javax.swing.JMenu();
		aniadirTienda = new javax.swing.JMenuItem();
		bajaTienda = new javax.swing.JMenuItem();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		empleadosMenu = new javax.swing.JMenu();
		aniadirEmpleado = new javax.swing.JMenuItem();
		bajaEmpleado = new javax.swing.JMenuItem();
		jMenuItem12 = new javax.swing.JMenuItem();
		jMenuItem13 = new javax.swing.JMenuItem();
		alquileresMenu = new javax.swing.JMenu();
		aniadirCliente = new javax.swing.JMenuItem();
		bajaCliente = new javax.swing.JMenuItem();
		jMenuItem19 = new javax.swing.JMenuItem();
		jMenuItem20 = new javax.swing.JMenuItem();
		clientesMenu = new javax.swing.JMenu();
		jMenuItem14 = new javax.swing.JMenuItem();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenuItem16 = new javax.swing.JMenuItem();
		jMenuItem23 = new javax.swing.JMenuItem();
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
		cambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cambioUsuarioClicked(evt);
			}
		});
		opcionesMenu.add(cambiarUsuario);

		barraMenus.add(opcionesMenu);

		vehiculosMenu.setText("Vehiculos");

		aniadirVehiculo.setText("Añadir");
		aniadirVehiculo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aniadirVehiculoClicked(evt);
			}
		});
		vehiculosMenu.add(aniadirVehiculo);

		bajaVehiculo.setText("Baja");
		bajaVehiculo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaVehiculoClicked(evt);
			}
		});
		vehiculosMenu.add(bajaVehiculo);

		jMenuItem6.setText("Consultar");
		vehiculosMenu.add(jMenuItem6);

		jMenuItem2.setText("Modificar");
		vehiculosMenu.add(jMenuItem2);

		barraMenus.add(vehiculosMenu);

		tiendaMenu.setText("Tiendas");

		aniadirTienda.setText("Añadir");
		aniadirTienda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aniadirTiendaClicked(evt);
			}
		});
		tiendaMenu.add(aniadirTienda);

		bajaTienda.setText("Eliminar");
		bajaTienda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaTiendaClicked(evt);
			}
		});
		tiendaMenu.add(bajaTienda);

		jMenuItem9.setText("Consultar");
		jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem9ActionPerformed(evt);
			}
		});
		tiendaMenu.add(jMenuItem9);

		jMenuItem3.setText("Modificar");
		tiendaMenu.add(jMenuItem3);

		barraMenus.add(tiendaMenu);

		empleadosMenu.setText("Empleados");

		aniadirEmpleado.setText("Añadir");
		aniadirEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aniadirEmpleadoClicked(evt);
			}
		});
		empleadosMenu.add(aniadirEmpleado);

		bajaEmpleado.setText("Baja");
		bajaEmpleado.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaEmpleadoClicked(evt);
			}
		});
		empleadosMenu.add(bajaEmpleado);

		jMenuItem12.setText("Consultar");
		empleadosMenu.add(jMenuItem12);

		jMenuItem13.setText("Modificar");
		jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem13ActionPerformed(evt);
			}
		});
		empleadosMenu.add(jMenuItem13);

		barraMenus.add(empleadosMenu);

		alquileresMenu.setText("Clientes");

		aniadirCliente.setText("Añadir");
		aniadirCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				aniadirClienteClicked(evt);
			}
		});
		alquileresMenu.add(aniadirCliente);

		bajaCliente.setText("Baja");
		bajaCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bajaClienteClicked(evt);
			}
		});
		alquileresMenu.add(bajaCliente);

		jMenuItem19.setText("Consultar");
		alquileresMenu.add(jMenuItem19);

		jMenuItem20.setText("Modificar");
		alquileresMenu.add(jMenuItem20);

		barraMenus.add(alquileresMenu);

		clientesMenu.setText("Alquileres");

		jMenuItem14.setText("Añadir");
		jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem14ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem14);

		jMenuItem15.setText("Consultar");
		jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem15ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem15);

		jMenuItem16.setText("Modificar");
		jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem16ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem16);

		jMenuItem23.setText("Finalizar");
		jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem23ActionPerformed(evt);
			}
		});
		clientesMenu.add(jMenuItem23);

		barraMenus.add(clientesMenu);

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

	private void aniadirVehiculoClicked(java.awt.event.ActionEvent evt) {
		VistaAniadirVehiculo a = new VistaAniadirVehiculo();
		a.setVisible(true);
	}

	private void bajaVehiculoClicked(java.awt.event.ActionEvent evt) {
		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Vehiculo",
				JOptionPane.QUESTION_MESSAGE);
		// TODO implementar modelos
		VehiculoImpl a = new VehiculoImpl();
		a.bajaVehiculo(baja);
	}

	private void cambioUsuarioClicked(java.awt.event.ActionEvent evt) {
		VistaAutenticar newRegistro = new VistaAutenticar();
		newRegistro.setVisible(true);
		this.setVisible(false);
	}

	private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void aniadirEmpleadoClicked(java.awt.event.ActionEvent evt) {
		VistaAniadirEmpleado aniadir = new VistaAniadirEmpleado();
		aniadir.setVisible(true);
	}

	private void bajaEmpleadoClicked(java.awt.event.ActionEvent evt) {
		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Empleado",
				JOptionPane.QUESTION_MESSAGE);
		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
		// implementacion
		EmpleadoImpl a = new EmpleadoImpl();
		a.eliminarEmpleado(Integer.valueOf(baja));
	}

	private void aniadirTiendaClicked(java.awt.event.ActionEvent evt) {
		VistaAniadirTienda aniadir = new VistaAniadirTienda();
		aniadir.setVisible(true);
	}

	private void bajaTiendaClicked(java.awt.event.ActionEvent evt) {
		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Tienda",
				JOptionPane.QUESTION_MESSAGE);
		// TODO Implementar modelo
		TiendaImpl a = new TiendaImpl();
		a.eliminarTienda(Integer.valueOf(baja));
	}

	private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void aniadirClienteClicked(java.awt.event.ActionEvent evt) {
		VistaAniadirCliente aniadir = new VistaAniadirCliente();
		aniadir.setVisible(true);
	}

	private void bajaClienteClicked(java.awt.event.ActionEvent evt) {
		String baja = JOptionPane.showInputDialog(null, "Introduce el identificador:", "Baja Cliente",
				JOptionPane.QUESTION_MESSAGE);
		// TODO Implementar modelos esto solo es una prueba de funcionamiento de la
		// implementacion
		ClienteImpl a = new ClienteImpl();
		a.eliminarCliente(Integer.valueOf(baja));
	}

	private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
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
	private javax.swing.JMenu clientesMenu;
	private javax.swing.JMenu alquileresMenu;
	private javax.swing.JMenu ofertasMenu;
	private javax.swing.JMenu incidenciasMenu;
	private javax.swing.JMenuBar barraMenus;
	private javax.swing.JMenuItem cambiarUsuario;
	private javax.swing.JMenuItem aniadirEmpleado;
	private javax.swing.JMenuItem bajaEmpleado;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem14;
	private javax.swing.JMenuItem jMenuItem15;
	private javax.swing.JMenuItem jMenuItem16;
	private javax.swing.JMenuItem aniadirCliente;
	private javax.swing.JMenuItem bajaCliente;
	private javax.swing.JMenuItem jMenuItem19;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem20;
	private javax.swing.JMenuItem jMenuItem21;
	private javax.swing.JMenuItem jMenuItem22;
	private javax.swing.JMenuItem jMenuItem23;
	private javax.swing.JMenuItem jMenuItem24;
	private javax.swing.JMenuItem jMenuItem25;
	private javax.swing.JMenuItem jMenuItem26;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem aniadirVehiculo;
	private javax.swing.JMenuItem bajaVehiculo;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem aniadirTienda;
	private javax.swing.JMenuItem bajaTienda;
	private javax.swing.JMenuItem jMenuItem9;
	// End of variables declaration
}
