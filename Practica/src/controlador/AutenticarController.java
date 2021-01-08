package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.AutenticarImpl;
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
	
	private void aniadirListenerGeneral() {
		this.general.addButtonListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mostrarVentanaAutenticarSec();
			}
		});
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
    		aniadirListenerGeneral();
    		this.vista.setVisible(false);;
		}
		this.vista.getTextFieldUsuario().setText("");
		this.vista.getPasswordText().setText("");
	}
}

