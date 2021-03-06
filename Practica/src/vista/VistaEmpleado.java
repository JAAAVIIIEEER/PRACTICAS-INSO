package vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VistaEmpleado extends javax.swing.JFrame {

	public VistaEmpleado() {
		initComponents();
	}

	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		contraseniaText = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		mesBox = new javax.swing.JComboBox<String>();
		diaSpinner = new javax.swing.JSpinner();
		anioSpinner = new javax.swing.JSpinner();
		nombreText = new javax.swing.JTextField();
		apellido1Text = new javax.swing.JTextField();
		apellido2Text = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		telefonoText = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		dniText = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		emailText = new javax.swing.JTextField();
		aniadir = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		tipoBox = new javax.swing.JComboBox<String>();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(509, 337);
		setLocationRelativeTo(null);
		setResizable(false);

		jLabel2.setText("Contraseña");
 
		jLabel3.setText("Nombre");

		jLabel4.setText("Apelliido 1");

		mesBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

		jLabel5.setText("Apellido 2");

		jLabel6.setText("Fecha Nacimiento");

		jLabel7.setText("Telefono");

		jLabel8.setText("DNI");

		jLabel9.setText("Email");

		aniadir.setText("Agregar");

		jLabel10.setText("Tipo");

		tipoBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Base", "Administrador" }));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addGap(59, 59, 59).addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel4).addGap(56, 56, 56))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(emailText,
														javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18)
												.addComponent(apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE,
														141, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup().addComponent(jLabel5).addGap(55, 55, 55))
										.addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addGap(51, 51, 51).addComponent(jLabel8).addGap(18, 18, 18)
								.addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jLabel2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout
										.createSequentialGroup().addGap(74, 74, 74).addComponent(jLabel7)
										.addGap(126, 126, 126).addComponent(jLabel9).addGap(136, 136, 136)
										.addComponent(jLabel10))
								.addGroup(layout.createSequentialGroup().addGap(99, 99, 99).addComponent(jLabel6)
										.addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(aniadir)
												.addGroup(layout.createSequentialGroup()
														.addComponent(diaSpinner,
																javax.swing.GroupLayout.PREFERRED_SIZE, 37,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(anioSpinner,
																javax.swing.GroupLayout.PREFERRED_SIZE, 70,
																javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(85, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8)
								.addComponent(contraseniaText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jLabel9).addComponent(jLabel10))
						.addGap(2, 2, 2)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(diaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(anioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addGap(18, 18, 18).addComponent(aniadir)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	public void listenerAniadirButton(ActionListener listenForButtons) {
		this.setTitle("Añadir Empleado");
		this.aniadir.setText("Añadir");
		this.aniadir.addActionListener(listenForButtons);
	}

	public void listenerModificarButton(ActionListener listenForButtons) {
		this.setTitle("Modificar Empleado");
		this.aniadir.setText("Modificar");
		this.aniadir.addActionListener(listenForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadir.getActionListeners()) {
			aniadir.removeActionListener(al);
		}
	}

	public String getDNIText() {
		return this.dniText.getText();
	}

	public void setDNIText(String dni) {
		this.dniText.setText(dni);
	}

	public String getContraseniaText() {
		return this.contraseniaText.getText();
	}

	public void setContraseniaText(String contrasenia) {
		this.contraseniaText.setText(contrasenia);
	}

	public Date getNacimientoDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public void setNacimientoDate(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		this.diaSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioSpinner.setValue(cal.get(Calendar.YEAR));
	}
	
	public void mostrarDniNoValido() {
		JOptionPane.showMessageDialog(null, "Formato DNI no valido", "DNI No valido", JOptionPane.ERROR_MESSAGE);
	}
	
	public void empleadoEliminado() {
		JOptionPane.showMessageDialog(null, "Empleado eliminado correctamente", "Empleado Eliminado", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getEmailText() {
		return this.emailText.getText();
	}

	public void setEmailText(String email) {
		this.emailText.setText(email);
	}

	public String getTelefonoText() {
		return this.telefonoText.getText();
	}

	public void setTelefonoText(String telefono) {
		this.telefonoText.setText(telefono);
	}

	public String getNombreText() {
		return this.nombreText.getText();
	}

	public void setNombreText(String nombre) {
		this.nombreText.setText(nombre);
	}

	public String getApellido1Text() {
		return this.apellido1Text.getText();
	}

	public String getApellido2Text() {
		return this.apellido2Text.getText();
	}

	public void setApellido1Text(String apellido1) {
		this.apellido1Text.setText(apellido1);
	}

	public void setApellido2Text(String apellido2) {
		this.apellido2Text.setText(apellido2);
	}

	public String getTipoText() {
		return this.tipoBox.getSelectedItem().toString();
	}

	public void setTipoText(String tipo) {
		this.tipoBox.setSelectedItem(tipo);
	}

	public void avisarEmpleadoAniadidoCorrecto() {
		JOptionPane.showMessageDialog(null, "Empleado añadido correctamente", "Empleado Añadido", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public void avisarEmpleadoModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Empleado modificado correctamente", "Empleado Modificado", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public String mostrarVentanaBajaEmpleado() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Baja Empleado",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public String mostrarVentanaConsultarEmpleado() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Consultar Empleado",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public void establecerEstadoDefecto() {
		mesBox.setSelectedIndex(0);
		tipoBox.setSelectedIndex(0);
		dniText.setText("");
		contraseniaText.setText("");
		nombreText.setText("");
		apellido1Text.setText("");
		apellido2Text.setText("");
		telefonoText.setText("");
		dniText.setText("");
		emailText.setText("");
		diaSpinner.setValue(1);
		anioSpinner.setValue(1900);
	}
	
	public void mostrarError(int estado) {
		switch(estado) {
		case 1:
			dniText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			contraseniaText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 3:
			nombreText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 4:
			apellido1Text.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 5:
			apellido2Text.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 6:
			telefonoText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 7:
			emailText .setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		}
	}
	
	public void establecerBordesDefecto() {
		dniText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		contraseniaText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		nombreText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		apellido1Text.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		apellido2Text.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		telefonoText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		emailText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}

	private javax.swing.JButton aniadir;
	private javax.swing.JComboBox<String> mesBox;
	private javax.swing.JComboBox<String> tipoBox;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JSpinner diaSpinner;
	private javax.swing.JSpinner anioSpinner;
	private javax.swing.JTextField contraseniaText;
	private javax.swing.JTextField nombreText;
	private javax.swing.JTextField apellido1Text;
	private javax.swing.JTextField apellido2Text;
	private javax.swing.JTextField telefonoText;
	private javax.swing.JTextField dniText;
	private javax.swing.JTextField emailText;
}
