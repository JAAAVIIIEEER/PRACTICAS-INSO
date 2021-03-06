package vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VistaOferta extends javax.swing.JFrame {

    public VistaOferta() {
        initComponents();
    }
                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        diaInicioSpinner = new javax.swing.JSpinner();
        mesInicioBox = new javax.swing.JComboBox<String>();
        anioInicioSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        diaFinalSpinner = new javax.swing.JSpinner();
        mesFinalBox = new javax.swing.JComboBox<String>();
        anioFinalSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        tipoBox = new javax.swing.JComboBox<String>();
        aniadirButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descuentoSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        especificacionText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));   
        setSize(518, 166);
        setLocationRelativeTo(null);
        setResizable(false);
        
        SpinnerModel modelSpinnerDescuentos = new SpinnerNumberModel(0, 0, 100, 1);
        descuentoSpinner.setModel(modelSpinnerDescuentos);

        jLabel1.setText("Descuento");

        mesInicioBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha Inicio");

        mesFinalBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Fecha Fin");

        tipoBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Modelo", "Vehiculo", "Combustible" }));

        aniadirButton.setText("Añadir");

        jLabel4.setText("Tipo");

        jLabel6.setText("Especificacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(diaInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesInicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anioInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diaFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mesFinalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anioFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descuentoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(especificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(aniadirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descuentoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(especificacionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioInicioSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesFinalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioFinalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aniadirButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>   
    
    public void listenerAniadirButton(ActionListener listenForButtons) {
    	this.setTitle("Añadir Oferta");
		this.aniadirButton.setText("Añadir");
		this.aniadirButton.addActionListener(listenForButtons);
	}

	public void listenerModificarButton(ActionListener listenForButtons) {
		this.setTitle("Modificar Oferta");
		this.aniadirButton.setText("Modificar");
		this.aniadirButton.addActionListener(listenForButtons);
	}

	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadirButton.getActionListeners()) {
			aniadirButton.removeActionListener(al);
		}
	}

    public String getTipoBox() {
		return tipoBox.getSelectedItem().toString();
	}

	public void setTipoBox(String tipo) {
		this.tipoBox.setSelectedItem(tipo);
	}

	public Date getFechaInicio() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioInicioSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesInicioBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaInicioSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public void setFechaInicio(Date fechaInicio) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaInicio);
		this.diaInicioSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesInicioBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioInicioSpinner.setValue(cal.get(Calendar.YEAR));
	}

	public Date getFechaFinal() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, Integer.valueOf(anioFinalSpinner.getValue().toString()));
		cal.set(Calendar.MONTH, mesFinalBox.getSelectedIndex());
		cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(diaFinalSpinner.getValue().toString()));
		return new Date(cal.getTimeInMillis());
	}

	public void setFechaFinal(Date fechaFin) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fechaFin);
		this.diaFinalSpinner.setValue(cal.get(Calendar.DAY_OF_MONTH));
		this.mesFinalBox.setSelectedIndex(cal.get(Calendar.MONTH));
		this.anioFinalSpinner.setValue(cal.get(Calendar.YEAR));
	}

	public int getDescuentoSpinner() {
		return Integer.parseInt(descuentoSpinner.getValue().toString());
	}

	public void setDescuentoSpinner(int descuentoSpinner) {
		this.descuentoSpinner.setValue(descuentoSpinner);
	}

	public String getEspecificacionText() {
		return especificacionText.getText();
	}

	public void setEspecificacionText(String especificacion) {
		this.especificacionText.setText(especificacion);;
	}
	
	public void avisarOfertaAniadidoCorrecto() {
		JOptionPane.showMessageDialog(null, "Oferta añadida correctamente", "Oferta Añadida", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public void avisarOfertaModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Oferta modificada correctamente", "Oferta Modificada", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public String mostrarVentanaFinalizarOferta() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el ID:", "Finalizar Oferta",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}

	public String mostrarVentanaConsultarOferta() {
		String dni = JOptionPane.showInputDialog(null, "Introduce el ID:", "Consultar Oferta",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
	}
	
	public void ofertaFinalizada() {
		JOptionPane.showMessageDialog(null, "Oferta finalizada correctamente", "Oferta Finalizada", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void errorNumero() {
		JOptionPane.showMessageDialog(null, "Numero no valido", "Error ID", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void establecerEstadoDefecto() {
		mesInicioBox.setSelectedIndex(0);
		mesFinalBox.setSelectedIndex(0);
		tipoBox.setSelectedIndex(0);
		especificacionText.setText("");
		diaInicioSpinner.setValue(1);
		diaFinalSpinner.setValue(1);
		anioInicioSpinner.setValue(1900);
		anioFinalSpinner.setValue(1900);
		descuentoSpinner.setValue(0);
	}
	
	public void mostrarError(int estado) {
		switch(estado) {
		case 1:
			especificacionText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Fechas no validas", "Fecha Invalida", JOptionPane.ERROR_MESSAGE);
			break;
		}
	}
	
	public void establecerBordesDefecto() {
		especificacionText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}
                
    private javax.swing.JComboBox<String> mesInicioBox;
    private javax.swing.JComboBox<String> mesFinalBox;
    private javax.swing.JComboBox<String> tipoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner diaInicioSpinner;
    private javax.swing.JSpinner anioInicioSpinner;
    private javax.swing.JSpinner diaFinalSpinner;
    private javax.swing.JSpinner anioFinalSpinner;
    private javax.swing.JSpinner descuentoSpinner;
    private javax.swing.JTextField especificacionText;
    private javax.swing.JButton aniadirButton;               
}