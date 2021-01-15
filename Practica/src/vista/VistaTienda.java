package vista;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VistaTienda extends javax.swing.JFrame {

	public VistaTienda() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        provinciaText = new javax.swing.JTextField();
        municipioText = new javax.swing.JTextField();
        calleText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numeroText = new javax.swing.JTextField();
        aniadir = new javax.swing.JButton();
        emailText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        telefonoText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));   
        setSize(522, 196);
        setLocationRelativeTo(null);
        setResizable(false);

        jLabel1.setText("Provincia");

        jLabel2.setText("Municipio");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setText("Calle");

        jLabel5.setText("Numero");

        aniadir.setText("Añadir");

        jLabel6.setText("Email");

        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contacto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(aniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(municipioText)
                            .addComponent(provinciaText)
                            .addComponent(calleText)
                            .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailText)
                                    .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(provinciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(municipioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(aniadir))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
	}// </editor-fold>

	public void listenerAniadirButton(ActionListener listenerForButtons) {
		this.setTitle("Añadir Tienda");
		this.aniadir.setText("Añadir");
		this.aniadir.addActionListener(listenerForButtons);
	}

	public void listenerModificarButton(ActionListener listenerForButtons) {
		this.setTitle("Modificar Tienda");
		this.aniadir.setText("Modificar");
		this.aniadir.addActionListener(listenerForButtons);
	}
	
	public void removeListenerAniadirButton() {
		for (ActionListener al : aniadir.getActionListeners()) {
			aniadir.removeActionListener(al);
		}
	}

	public void avisarTiendaAniadidaCorrecto() {
		JOptionPane.showMessageDialog(null, "Tienda añadida correctamente", "Tienda Añadida", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public void avisarTiendaModificadoCorrecto() {
		JOptionPane.showMessageDialog(null, "Tienda modificada correctamente", "Tienda Modificada", JOptionPane.INFORMATION_MESSAGE,
				null);
	}

	public String mostrarVentanaBajaTienda() {
		String id = JOptionPane.showInputDialog(null, "Introduce el ID:", "Baja Tienda", JOptionPane.QUESTION_MESSAGE);
		return id;
	}
	
	public void tiendaEliminada() {
		JOptionPane.showMessageDialog(null, "Tienda eliminada correctamente", "Tienda Eliminada", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void errorNumero() {
		JOptionPane.showMessageDialog(null, "Numero no valido", "Error ID", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getProvinciaText() {
		return provinciaText.getText();
	}

	public String getMunicipioText() {
		return municipioText.getText();
	}

	public String getCalleText() {
		return calleText.getText();
	}

	public Integer getNumeroText() {
		try {
			return Integer.parseInt(numeroText.getText());
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public String mostrarVentanaConsultarTienda() {
		String id = JOptionPane.showInputDialog(null, "Introduce el ID:", "Consultar tienda",
				JOptionPane.QUESTION_MESSAGE);
		return id;
	}

	public void setProvinciaText(String provincia) {
		this.provinciaText.setText(provincia);
	}

	public void setMunicipioText(String municipio) {
		this.municipioText.setText(municipio);
	}

	public void setCalleText(String calle) {
		this.calleText.setText(calle);
	}

	public void setNumeroText(int numero) {
		this.numeroText.setText(String.valueOf(numero));
	}
	
	public String getEmailText() {
		return emailText.getText();
	}

	public void setEmailText(String email) {
		this.emailText.setText(email);
	}

	public String getTelefonoText() {
		return telefonoText.getText();
	}

	public void setTelefonoText(String telefonoText) {
		this.telefonoText.setText(telefonoText);
	}

	public void establecerEstadoDefecto() {
		provinciaText.setText("");
		municipioText.setText("");
		calleText.setText("");
		numeroText.setText("");
		emailText.setText("");
		telefonoText.setText("");
	}
	
	public void mostrarError(int estado) {
		switch(estado) {
		case 1:
			provinciaText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 2:
			municipioText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 3:
			calleText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 4:
			numeroText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 5:
			emailText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		case 6:
			telefonoText.setBorder(BorderFactory.createLineBorder(Color.RED));
			break;
		}
	}
	
	public void establecerBordesDefecto() {
		provinciaText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		municipioText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		calleText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		numeroText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		telefonoText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
		emailText.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
	}

	private javax.swing.JButton aniadir;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JTextField provinciaText;
	private javax.swing.JTextField municipioText;
	private javax.swing.JTextField calleText;
	private javax.swing.JTextField numeroText;
	private javax.swing.JTextField emailText;
	private javax.swing.JTextField telefonoText;
}
