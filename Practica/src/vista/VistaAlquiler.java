package vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VistaAlquiler extends javax.swing.JFrame {

	public VistaAlquiler() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		dniClienteText = new javax.swing.JTextField();
		mesInicioBox = new javax.swing.JComboBox<String>();
		mesFinalBox = new javax.swing.JComboBox<String>();
		vehiculosDisponiblesBox = new javax.swing.JComboBox<Object>();
		jLabel2 = new javax.swing.JLabel();
		diaFinalSpinner = new javax.swing.JSpinner();
		anioFinalSpinner = new javax.swing.JSpinner();
		anioInicioSpinner = new javax.swing.JSpinner();
		diaInicioSpinner = new javax.swing.JSpinner();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		aniadirButton = new javax.swing.JButton();
		dniEmpleadoText = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(530, 179);
		setLocationRelativeTo(null);
		setResizable(false);

		jLabel1.setText("Cliente DNI");

		mesInicioBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

		mesFinalBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo",
				"Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

		jLabel2.setText("Vehiculo");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel3.setText("Fecha Inicio");

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel4.setText("Fecha Fin");

		aniadirButton.setText("Añadir");

		jLabel5.setText("Empleado DNI");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(diaInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(mesInicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel3).addComponent(dniEmpleadoText,
												javax.swing.GroupLayout.PREFERRED_SIZE, 109,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(79, 79, 79).addComponent(jLabel5)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel4)
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(dniClienteText, javax.swing.GroupLayout.PREFERRED_SIZE,
														105, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(anioInicioSpinner,
																javax.swing.GroupLayout.PREFERRED_SIZE, 84,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(44, 44, 44).addComponent(diaFinalSpinner,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(mesFinalBox, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(anioFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(layout.createSequentialGroup().addGap(4, 4, 4)
												.addComponent(aniadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(196, 196, 196))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												layout.createSequentialGroup()
														.addComponent(vehiculosDisponiblesBox,
																javax.swing.GroupLayout.PREFERRED_SIZE, 109,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(9, 9, 9))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
												.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jLabel2).addGap(51, 51, 51))))
						.addGap(32, 32, 32)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap(19, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel5))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(vehiculosDisponiblesBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dniClienteText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dniEmpleadoText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(jLabel4))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(mesInicioBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(mesFinalBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(diaFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(anioFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(anioInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(diaInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32).addComponent(aniadirButton).addContainerGap()));

		pack();
	}

	public void listenerAniadirButton(ActionListener listenForButtons) {
		this.setTitle("Añadir Alquiler");
		this.aniadirButton.setText("Añadir");
		this.aniadirButton.addActionListener(listenForButtons);
	}

	public void listenerModificarButton(ActionListener listenForButtons) {
		this.setTitle("Modificar Alquiler");
		this.aniadirButton.setText("Modificar");
		this.aniadirButton.addActionListener(listenForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadirButton.getActionListeners()) {
			aniadirButton.removeActionListener(al);
		}
	}

	public void avisarAlquilerAniadidoCorrecto(int coste) {
		JOptionPane.showMessageDialog(null, "Alquiler añadido correctamente " + coste, "Alquiler Añadido",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void avisarAlquilerModificadoCorrecto(int coste) {
		JOptionPane.showMessageDialog(null, "Alquiler añadido correctamente " + coste, "Alquiler Modificado",
				JOptionPane.INFORMATION_MESSAGE, null);
	}

	public String mostrarVentanaFinalizarAlquiler() {
		String id = JOptionPane.showInputDialog(null, "Introduce el ID:", "Finalizar Alquiler",
				JOptionPane.QUESTION_MESSAGE);
		return id;
	}

	public String mostrarVentanaConsultarAlquiler() {
		String id = JOptionPane.showInputDialog(null, "Introduce el ID:", "Consultar Alquiler",
				JOptionPane.QUESTION_MESSAGE);
		return id;
	}

	public void mostrarVentanaNoVehiculos() {
		JOptionPane.showMessageDialog(null, "No hay vehiculos disponibles", "Error vehiculos",
				JOptionPane.ERROR_MESSAGE);
	}

	public Date getFechaInicio() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioInicioSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesInicioBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaInicioSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public Date getFechaFin() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioFinalSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesFinalBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaFinalSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public String getClienteDNIText() {
		return dniClienteText.getText();
	}

	public String getVehiculo() {
		return vehiculosDisponiblesBox.getSelectedItem().toString();
	}

	public void setVehiculosDisponiblesBox(String vehiculo) {
		this.vehiculosDisponiblesBox.setSelectedItem(vehiculo);
	}

	public void setClienteDNIText(String dni) {
		this.dniClienteText.setText(dni);
	}

	public void setInicioDate(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		this.diaInicioSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesInicioBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioInicioSpinner.setValue(cal.get(Calendar.YEAR));
	}

	public void setFinalDate(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		this.diaFinalSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesFinalBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioFinalSpinner.setValue(cal.get(Calendar.YEAR));
	}

	public String getDniEmpleadoText() {
		return dniEmpleadoText.getText();
	}

	public void setDniEmpleadoText(String dniEmpleadoText) {
		this.dniEmpleadoText.setText(dniEmpleadoText);
	}

	public void establecerEstadoDefecto() {
		mesInicioBox.setSelectedIndex(0);
		mesFinalBox.setSelectedIndex(0);
		vehiculosDisponiblesBox.setSelectedItem(0);
		dniEmpleadoText.setText("");
		dniClienteText.setText("");
		diaFinalSpinner.setValue(1);
		anioFinalSpinner.setValue(1900);
		diaInicioSpinner.setValue(1);
		anioInicioSpinner.setValue(1900);
	}

	public void establecerVehiculosDisponibles(ArrayList<String> vehiculos) {
		vehiculosDisponiblesBox.setModel(new DefaultComboBoxModel<Object>(vehiculos.toArray()));
	}

	public void mostrarError(int estado) {
		switch (estado) {
		case 1:
			dniEmpleadoText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			dniClienteText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Fechas no validas", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}

	public void establecerBordesDefecto() {
		dniEmpleadoText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		dniClienteText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}

	private javax.swing.JButton aniadirButton;
	private javax.swing.JComboBox<String> mesInicioBox;
	private javax.swing.JComboBox<String> mesFinalBox;
	private javax.swing.JComboBox<Object> vehiculosDisponiblesBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JSpinner diaFinalSpinner;
	private javax.swing.JSpinner anioFinalSpinner;
	private javax.swing.JSpinner anioInicioSpinner;
	private javax.swing.JSpinner diaInicioSpinner;
	private javax.swing.JTextField dniClienteText;
	private javax.swing.JTextField dniEmpleadoText;

}
