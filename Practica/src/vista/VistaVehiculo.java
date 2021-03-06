 package vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VistaVehiculo extends javax.swing.JFrame {

	public VistaVehiculo() {
		initComponents();
	}
	
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		plazasBox = new javax.swing.JComboBox<Integer>();
		jLabel2 = new javax.swing.JLabel();
		combustibleBox = new javax.swing.JComboBox<String>();
		matriculaText = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		aniadirButton = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		costeSpinner = new javax.swing.JSpinner();
		jLabel5 = new javax.swing.JLabel();
		tipoBox = new javax.swing.JComboBox<String>();
		modeloText = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		tiendasBox = new javax.swing.JComboBox<Object>();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		extrasText = new javax.swing.JTextPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setSize(509, 237);
		setLocationRelativeTo(null);
		setResizable(false);

		SpinnerModel modelSpinner = new SpinnerNumberModel(50, 0, 3000, 50);
		costeSpinner.setModel(modelSpinner);

		jLabel1.setText("Plazas");

		plazasBox.setModel(new javax.swing.DefaultComboBoxModel<Integer>(new Integer[] { 2, 3, 4, 5, 7, 9 }));

		jLabel2.setText("Combustible");

		combustibleBox.setModel(new javax.swing.DefaultComboBoxModel<String>(
				new String[] { "Diesel", "Gasolina", "Electrico", "Hibrido" }));

		jLabel3.setText("Matricula");

		aniadirButton.setText("Validar");

		jLabel4.setText("Coste");

		costeSpinner.setToolTipText("");
		costeSpinner.setOpaque(false);
		costeSpinner.setVerifyInputWhenFocusTarget(false);

		jLabel5.setText("Tipo");

		tipoBox.setModel(
				new javax.swing.DefaultComboBoxModel<String>(new String[] { "Turismo", "Furgoneta", "Caravana" }));

		jLabel6.setText("Modelo");

		jLabel7.setText("Tienda");

		jLabel8.setText("Extras");

		jScrollPane2.setViewportView(extrasText);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addGroup(layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(41, 41, 41).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel5)
										.addComponent(jLabel4).addComponent(jLabel3))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(layout.createSequentialGroup()
																.addComponent(combustibleBox,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 123,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(jLabel7))
														.addGroup(layout.createSequentialGroup()
																.addComponent(plazasBox,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(166, 166, 166).addComponent(jLabel6))
														.addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE,
																123, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false).addComponent(modeloText).addComponent(
																				tiendasBox, 0, 123, Short.MAX_VALUE))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		layout.createSequentialGroup()
																				.addComponent(jLabel8)
																				.addGap(49, 49, 49))))
												.addGroup(layout.createSequentialGroup().addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(matriculaText,
																javax.swing.GroupLayout.PREFERRED_SIZE, 123,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(costeSpinner,
																javax.swing.GroupLayout.PREFERRED_SIZE, 123,
																javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGap(80, 80, 80).addComponent(jScrollPane2,
																javax.swing.GroupLayout.PREFERRED_SIZE, 168,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(layout.createSequentialGroup().addGap(223, 223, 223)
										.addComponent(aniadirButton)))
						.addContainerGap(30, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(plazasBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1)
								.addComponent(modeloText, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel6))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(combustibleBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(tiendasBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(costeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel3).addComponent(matriculaText,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(3, 3, 3).addComponent(jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE, 66,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(18, 18, 18).addComponent(aniadirButton)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}

	public void listenerAniadirButton(ActionListener listenerForButtons) {
		this.setTitle("Añadir Vehiculo");
		this.aniadirButton.setText("Añadir");
		this.aniadirButton.addActionListener(listenerForButtons);
	}

	public void listenerModificarButton(ActionListener listenerForButtons) {
		this.setTitle("Modificar Vehiculo");
		this.aniadirButton.setText("Modificar");
		this.aniadirButton.addActionListener(listenerForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadirButton.getActionListeners()) {
			aniadirButton.removeActionListener(al);
		}
	}

	public void avisarVehiculoAniadidoCorrecto() {
		JOptionPane.showMessageDialog(null, "Vehiculo añadido correctamente", "Vehiculo Añadido", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public void avisarVehiculoModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Vehiculo modificado correctamente", "Vehiculo Modificado", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public String mostrarVentanaBajaVehiculo() {
		String mat = JOptionPane.showInputDialog(null, "Introduce la matricula:", "Baja Vehiculo",
				JOptionPane.QUESTION_MESSAGE);
		return mat;
	}
	
	public void vehiculoEliminado() {
		JOptionPane.showMessageDialog(null, "Vehiculo eliminado correctamente", "Vehiculo Eliminado", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void errorMatricula() {
		JOptionPane.showMessageDialog(null, "Matricula no valida", "Error Matricula", JOptionPane.ERROR_MESSAGE);
	}

	public int getPlazasBoxText() {
		return Integer.parseInt(this.plazasBox.getSelectedItem().toString());
	}

	public String getCombustibleBoxText() {
		return this.combustibleBox.getSelectedItem().toString();
	}

	public String getTipoBoxText() {
		return this.tipoBox.getSelectedItem().toString();
	}

	public int getCosteSpinnerText() {
		return Integer.parseInt(this.costeSpinner.getValue().toString());
	}

	public String getMatriculaText() {
		return matriculaText.getText();
	}

	public String getModeloText() {
		return modeloText.getText();
	}

	public String mostrarVentanaConsultarVehiculo() {
		String dni = JOptionPane.showInputDialog(null, "Introduce la matricula:", "Consultar Vehiculo",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public void mostrarVentanaNoTiendas() {
		JOptionPane.showMessageDialog(null, "No hay tiendas disponibles", "Error tiendas", JOptionPane.ERROR_MESSAGE);
	}

	public void setPlazasBox(int plazas) {
		this.plazasBox.setSelectedItem(plazas);
	}

	public void setCombustibleBox(String combustible) {
		this.combustibleBox.setSelectedItem(combustible);
	}

	public void setTipoBox(String tipo) {
		this.tipoBox.setSelectedItem(tipo);
	}

	public void setCosteSpinner(int coste) {
		this.costeSpinner.setValue(coste);
	}

	public void setMatriculaText(String matricula) {
		this.matriculaText.setText(matricula);
	}

	public void setModeloText(String marca) {
		this.modeloText.setText(marca);
	}

	public int getTiendasBox() {
		return Integer.valueOf(tiendasBox.getSelectedItem().toString());
	}

	public void setTiendasBox(int tiendasBox) {
		this.tiendasBox.setSelectedItem(String.valueOf(tiendasBox));
	}

	public String getExtrasText() {
		return extrasText.getText();
	}

	public void setExtrasText(String extrasText) {
		this.extrasText.setText(extrasText);
	}

	public void establecerEstadoDefecto() {
		plazasBox.setSelectedIndex(0);
		tipoBox.setSelectedIndex(0);
		plazasBox.setSelectedIndex(0);
		tiendasBox.setSelectedItem(null);
		tiendasBox.setSelectedIndex(0);
		matriculaText.setText("");
		modeloText.setText("");
		extrasText.setText("");
		costeSpinner.setValue(0);
	}

	public void establecerTiendasDisponibles(ArrayList<Integer> tiendas) {
		tiendasBox.setModel(new DefaultComboBoxModel<Object>(tiendas.toArray()));
	}

	public void mostrarError(int estado) {
		switch (estado) {
		case 1:
			matriculaText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			modeloText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		}
	}

	public void establecerBordesDefecto() {
		matriculaText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		modeloText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}

	private javax.swing.JButton aniadirButton;
	private javax.swing.JComboBox<Integer> plazasBox;
	private javax.swing.JComboBox<String> combustibleBox;
	private javax.swing.JComboBox<String> tipoBox;
	private javax.swing.JComboBox<Object> tiendasBox;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JSpinner costeSpinner;
	private javax.swing.JTextField matriculaText;
	private javax.swing.JTextField modeloText;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextPane extrasText;
}
