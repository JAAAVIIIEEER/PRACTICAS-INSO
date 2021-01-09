package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.*;
import vista.VistaAutenticar;
import vista.VistaGeneral;

public class AutenticarController{
	
	private VistaAutenticar vista;
	private int errores = 0;
	private VistaGeneral general;

	public AutenticarController(VistaAutenticar vista) {
		this.vista = vista;
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
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerBajaEmpleado() {
		this.general.listenerBajaEmpleado(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gestionBajaEmpleado();
			}
		});
	}
	
	private void gestionBajaEmpleado() {
		String dni = this.general.mostrarVentanaBajaEmpleado();
		EmpleadoImpl empleado = new EmpleadoImpl();
		empleado.eliminarEmpleado(dni);
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
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerBajaVehiculo() {
		this.general.listenerBajaVehiculo(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
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
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerBajaTienda() {
		this.general.listenerBajaTienda(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
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
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerFinalizarAlquiler() {
		this.general.listenerFinalizarAlquiler(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
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
				EmpleadoImpl empleado = new EmpleadoImpl();
			}
		});
	}
	
	private void listenerBajaCliente() {
		this.general.listenerBajaCliente(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				EmpleadoImpl empleado = new EmpleadoImpl();
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

