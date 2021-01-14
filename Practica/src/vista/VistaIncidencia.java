package vista;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class VistaIncidencia extends javax.swing.JFrame {

    public VistaIncidencia() {
        initComponents();
    }
                         
    private void initComponents() {

    	idAlquilerText = new javax.swing.JTextField();
        tipoBox = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        informeText = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aniadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));   
        setSize(400, 327);
        setLocationRelativeTo(null);
        setResizable(false);

        tipoBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Retraso", "Accidente ", "Desperfecto"}));

        jScrollPane1.setViewportView(informeText);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Informe");

        jLabel2.setText("Tipo");

        jLabel3.setText("ID Alquiler");

        aniadir.setText("Añadir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(idAlquilerText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(aniadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idAlquilerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aniadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>    
    
    public void listenerAniadirButton(ActionListener listenForButtons) {
    	this.setTitle("Añadir Incidencia");
		this.aniadir.setText("Añadir");
		this.aniadir.addActionListener(listenForButtons);
	}

	public void listenerModificarButton(ActionListener listenForButtons) {
		this.setTitle("Modificar Incidencia");
		this.aniadir.setText("Modificar");
		this.aniadir.addActionListener(listenForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadir.getActionListeners()) {
			aniadir.removeActionListener(al);
		}
	}
    
    public String getTipoBox() {
		return tipoBox.getSelectedItem().toString();
	}

	public void setTipoBox(String tipoBox) {
		this.tipoBox.setSelectedItem(tipoBox);
	}

	public int getIdAlquilerText() {
		return Integer.valueOf(idAlquilerText.getText());
	}

	public void setIdAlquilerText(int idAlquilerText) {
		this.idAlquilerText.setText(String.valueOf(idAlquilerText));
	}

	public String getInformeText() {
		return informeText.getText();
	}

	public void setInformeText(String informeText) {
		this.informeText.setText(informeText);
	}
	
	public void avisarIncidenciaAniadidoCorrecto() {
		JOptionPane.showMessageDialog(null, "Incidencia añadida correctamente", "Incidencia Añadida", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void avisarIncidenciaModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Incidencia modificada correctamente", "Incidencia Modificada", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public String mostrarVentanaFinalizarIncidencia() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el ID:", "Finalizar Incidencia",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public String mostrarVentanaConsultarIncidencia() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el ID:", "Consultar Incidencia",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}
	
	public void establecerEstadoDefecto() {
		tipoBox.setSelectedIndex(0);
		idAlquilerText.setText("");
		informeText.setText("");
	}
                    
    private javax.swing.JComboBox<String> tipoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField idAlquilerText;
    private javax.swing.JTextPane informeText;
    private javax.swing.JButton aniadir;                 
}
