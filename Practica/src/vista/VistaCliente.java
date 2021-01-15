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
public class VistaCliente extends javax.swing.JFrame {

	public VistaCliente() {
		initComponents();
	}

	private void initComponents() {

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
		aniadirButton = new javax.swing.JButton();
		paisText = new javax.swing.JTextField();
		provinciaText = new javax.swing.JTextField();
		municipioText = new javax.swing.JTextField();
		calleText = new javax.swing.JTextField();
		portalText = new javax.swing.JTextField();
		letraText = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		pisoText = new javax.swing.JTextField();
		jLabel15 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(497, 294);
		setLocationRelativeTo(null);
		setResizable(false);

		jLabel3.setText("Nombre");

		jLabel4.setText("Apelliido 1");

		mesBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

		jLabel5.setText("Apellido 2");

		jLabel6.setText("Fecha Nacimiento");

		jLabel7.setText("Telefono");

		jLabel8.setText("DNI");

		jLabel9.setText("Email");

		aniadirButton.setText("Agregar");

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jLabel1.setText("Dirección");

		jLabel2.setText("Pais");

		jLabel10.setText("Provincia");

		jLabel11.setText("Municipio");

		jLabel12.setText("Calle");

		jLabel13.setText("Nº");

		jLabel14.setText("Letra");

		jLabel15.setText("Piso");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(48, 48, 48).addComponent(jLabel3)
										.addGap(101, 101, 101).addComponent(jLabel4).addGap(107, 107, 107)
										.addComponent(jLabel5)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										layout.createSequentialGroup().addGap(73, 73, 73).addComponent(jLabel7)
												.addGap(115, 115, 115).addComponent(jLabel9).addGap(112, 112, 112)
												.addComponent(jLabel8))
								.addGroup(layout.createSequentialGroup().addGap(82, 82, 82).addComponent(jLabel6)
										.addGap(18, 18, 18)
										.addComponent(diaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(anioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(194, 194, 194)
										.addComponent(aniadirButton))
								.addGroup(layout.createSequentialGroup().addGap(192, 192, 192).addComponent(jLabel1)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(provinciaText, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
								.addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel10).addGap(24, 24, 24)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(municipioText, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(calleText, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(23, 23, 23).addComponent(jLabel11)
										.addGap(59, 59, 59).addComponent(jLabel12)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(portalText, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel13)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(pisoText, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel15))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(letraText, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 21, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(25, 25, 25)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3).addComponent(jLabel5))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(apellido1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(apellido2Text, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
						.addComponent(jLabel9).addComponent(jLabel7))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(dniText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(19, 19, 19)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(diaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(anioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
				.addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(paisText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(provinciaText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(municipioText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(calleText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(portalText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(pisoText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(letraText, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2).addComponent(jLabel10).addComponent(jLabel11)
												.addComponent(jLabel12).addComponent(jLabel13))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel14).addComponent(jLabel15)))
								.addGap(26, 26, 26)))
				.addGap(18, 18, 18).addComponent(aniadirButton).addContainerGap()));
		pack();
	}// </editor-fold>

	public void listenerAniadirButton(ActionListener listenerForButtons) {
		this.setTitle("Añadir Cliente");
		this.aniadirButton.setText("Añadir");
		this.aniadirButton.addActionListener(listenerForButtons);
	}

	public void listenerModificarButton(ActionListener listenerForButtons) {
		this.setTitle("Modificar Cliente");
		this.aniadirButton.setText("Modificar");
		this.aniadirButton.addActionListener(listenerForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadirButton.getActionListeners()) {
			aniadirButton.removeActionListener(al);
		}
	}

	public void avisarClienteAniadidoCorrecto() {
		JOptionPane.showMessageDialog(null, "Cliente añadido correctamente", "Cliente Añadido",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void avisarClienteModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Cliente modificado correctamente", "Cliente Modificado",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

	public String mostrarVentanaBajaCliente() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Baja Cliente",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public String mostrarVentanaConsultarCliente() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el DNI:", "Consultar Cliente",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public String getDNIText() {
		return dniText.getText();
	}

	public String getNombreText() {
		return nombreText.getText();
	}

	public String getApellido1Text() {
		return apellido1Text.getText();
	}

	public String getApellido2Text() {
		return apellido2Text.getText();
	}

	public String getTelefonoText() {
		return telefonoText.getText();
	}

	public String getEmailText() {
		return emailText.getText();
	}

	public Date getNacimientoDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public void setApellido1Text(String apellido1) {
		this.apellido1Text.setText(apellido1);
	}

	public void setApellido2Text(String apellido2) {
		this.apellido2Text.setText(apellido2);
	}

	public void setNombreText(String nombre) {
		this.nombreText.setText(nombre);
	}

	public void setTelefonoText(String telefono) {
		this.telefonoText.setText(telefono);
	}

	public void setDNIText(String dni) {
		this.dniText.setText(dni);
	}

	public void setEmailText(String email) {
		this.emailText.setText(email);
	}

	public void setNacimientoDate(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		this.diaSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioSpinner.setValue(cal.get(Calendar.YEAR));
	}

	public String getPaisText() {
		return paisText.getText();
	}

	public void setPaisText(String paisText) {
		this.paisText.setText(paisText);
	}

	public String getProvinciaText() {
		return provinciaText.getText();
	}

	public void setProvinciaText(String provinciaText) {
		this.provinciaText.setText(provinciaText);
	}

	public String getMunicipioText() {
		return municipioText.getText();
	}

	public void setMunicipioText(String municipioText) {
		this.municipioText.setText(municipioText);
	}

	public Integer getPortalText() {
		try {
			return Integer.parseInt(portalText.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public void setPortalText(Integer portalText) {
		this.portalText.setText(String.valueOf(portalText));
	}

	public Integer getPisoText() {
		try {
			return Integer.parseInt(pisoText.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public void setPisoText(int pisoText) {
		this.pisoText.setText(String.valueOf(pisoText));
	}

	public String getLetraText() {
		return letraText.getText();
	}

	public void setLetraText(String letraText) {
		this.letraText.setText(letraText);
	}

	public String getCalleText() {
		return calleText.getText();
	}

	public void setCalleText(String calleText) {
		this.calleText.setText(calleText);
	}

	public void establecerEstadoDefecto() {
		mesBox.setSelectedIndex(0);
		dniText.setText("");
		nombreText.setText("");
		apellido1Text.setText("");
		apellido2Text.setText("");
		telefonoText.setText("");
		dniText.setText("");
		paisText.setText("");
		emailText.setText("");
		provinciaText.setText("");
		municipioText.setText("");
		calleText.setText("");
		portalText.setText("");
		letraText.setText("");
		diaSpinner.setValue(1);
		anioSpinner.setValue(1900);
	}

	public void mostrarError(int estado) {
		switch (estado) {
		case 1:
			nombreText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			apellido1Text.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 3:
			apellido2Text.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 4:
			telefonoText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 5:
			emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 6:
			dniText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 7:
			paisText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 8:
			provinciaText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 9:
			municipioText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 10:
			calleText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 11:
			portalText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 12:
			pisoText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		}
	}

	public void establecerBordesDefecto() {
		nombreText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		apellido1Text.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		apellido2Text.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		telefonoText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		emailText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		dniText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		paisText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		provinciaText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		municipioText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		calleText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		portalText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		pisoText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		letraText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}

	// Variables declaration - do not modify
	private javax.swing.JButton aniadirButton;
	private javax.swing.JComboBox<String> mesBox;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;;
	private javax.swing.JSpinner diaSpinner;
	private javax.swing.JSpinner anioSpinner;
	private javax.swing.JTextField nombreText;
	private javax.swing.JTextField apellido1Text;
	private javax.swing.JTextField apellido2Text;
	private javax.swing.JTextField telefonoText;
	private javax.swing.JTextField dniText;
	private javax.swing.JTextField emailText;
	private javax.swing.JTextField paisText;
	private javax.swing.JTextField provinciaText;
	private javax.swing.JTextField municipioText;
	private javax.swing.JTextField calleText;
	private javax.swing.JTextField portalText;
	private javax.swing.JTextField letraText;
	private javax.swing.JTextField pisoText;
	// End of variables declaration
}
