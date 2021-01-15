package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import implementacion.EmpleadoDao;
import implementacion.ValidarDatos;
import modelo.Empleado;
import vista.VistaEmpleado;

public class ControladorEmpleados {
	
	private VistaEmpleado vistaEmpleado;
	private ValidarDatos validarDatos;
	
	public ControladorEmpleados (VistaEmpleado vistaEmpleados) {
		this.vistaEmpleado = vistaEmpleados;
		this.validarDatos = new ValidarDatos();
	}

	public void aniadirEmpleado() {
		vistaEmpleado.establecerBordesDefecto();
		vistaEmpleado.removeListenerAniadirButton();
		vistaEmpleado.establecerEstadoDefecto();
		vistaEmpleado.setVisible(true);
		this.vistaEmpleado.listenerAniadirButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empleado miEmpleado = new Empleado();
				vistaEmpleado.establecerBordesDefecto();
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				int validar = validarDatos.validarEmpleado(miEmpleado);
				EmpleadoDao empleado = new EmpleadoDao();
				if (validar == 0) {
					if (empleado.aniadirEmpleado(miEmpleado)) {
						vistaEmpleado.setVisible(false);
						vistaEmpleado.avisarEmpleadoAniadidoCorrecto();
						ControladorGeneral.logger.info("Empleado añadido correctamente");
					}
				} else {
					vistaEmpleado.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al añadir un empleado");
				}
			}
		});
	}
	
	public void bajaEmpleado() {
		String dni = vistaEmpleado.mostrarVentanaBajaEmpleado();
		EmpleadoDao empleado = new EmpleadoDao();
		empleado.eliminarEmpleado(dni);
		ControladorGeneral.logger.info("Empleado eliminado correctamente");
	}
	
	public void modificarEmpleado() {
		vistaEmpleado.removeListenerAniadirButton();
		String dni = vistaEmpleado.mostrarVentanaConsultarEmpleado();
		EmpleadoDao empleado = new EmpleadoDao();
		Empleado miEmpleado = empleado.consultarEmpleado(dni);
		vistaEmpleado.establecerBordesDefecto();
		vistaEmpleado.setDNIText(miEmpleado.getUsuarioDNI());
		vistaEmpleado.setContraseniaText(miEmpleado.getContrasenia());
		vistaEmpleado.setNacimientoDate(miEmpleado.getNacimiento());
		vistaEmpleado.setEmailText(miEmpleado.getEmail());
		vistaEmpleado.setTelefonoText(miEmpleado.getTelefono());
		vistaEmpleado.setNombreText(miEmpleado.getNombre());
		vistaEmpleado.setApellido1Text(miEmpleado.getApellido1());
		vistaEmpleado.setApellido2Text(miEmpleado.getApellido2());
		vistaEmpleado.setTipoText(miEmpleado.getTipo());
		vistaEmpleado.setVisible(true);
		this.vistaEmpleado.listenerModificarButton(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vistaEmpleado.establecerBordesDefecto();
				miEmpleado.setUsuarioDNI(vistaEmpleado.getDNIText());
				miEmpleado.setContrasenia(vistaEmpleado.getContraseniaText());
				miEmpleado.setNacimiento(vistaEmpleado.getNacimientoDate());
				miEmpleado.setEmail(vistaEmpleado.getEmailText());
				miEmpleado.setTelefono(vistaEmpleado.getTelefonoText());
				miEmpleado.setNombre(vistaEmpleado.getNombreText());
				miEmpleado.setApellido1(vistaEmpleado.getApellido1Text());
				miEmpleado.setApellido2(vistaEmpleado.getApellido2Text());
				miEmpleado.setTipo(vistaEmpleado.getTipoText());
				int validar = validarDatos.validarEmpleado(miEmpleado);
				if (validar == 0) {
					if (empleado.modificarEmpleado(miEmpleado)) {
						vistaEmpleado.setVisible(false);
						vistaEmpleado.avisarEmpleadoModificadoCorrecto();
						ControladorGeneral.logger.info("Empleado modificado correctamente");
					}
				} else {
					vistaEmpleado.mostrarError(validar);
					ControladorGeneral.logger.warning("Error al modificar un empleado");
				}
			}
		});
	}
	
	public String consultarEmpleado() {
		String dniEmpleado = vistaEmpleado.mostrarVentanaConsultarEmpleado();
		EmpleadoDao consulta = new EmpleadoDao();
		Empleado miEmpleado = consulta.consultarEmpleado(dniEmpleado);
		if (miEmpleado.getUsuarioDNI() != null) {
			String texto = "";
			texto += "<html>DNI: " + miEmpleado.getUsuarioDNI() + "<br>";
			texto += "Tipo: " + miEmpleado.getTipo() + "<br>";
			texto += "Nombre: " + miEmpleado.getNombre() + "<br>";
			texto += "Apellido 1: " + miEmpleado.getApellido1() + "<br>";
			texto += "Apellido 2: " + miEmpleado.getApellido2() + "<br>";
			texto += "Nacimiento: " + miEmpleado.getNacimiento() + "<br>";
			texto += "Telefono: " + miEmpleado.getTelefono() + "<br>";
			texto += "Email: " + miEmpleado.getEmail() + "<br></html>";
			return texto;
		} else {
			return "";
		}
	}
}
