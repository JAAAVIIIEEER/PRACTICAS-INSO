package vista;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

import controlador.EmpleadoController;

/**
 *
 * @author rauls
 */
public class VistaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VistaRegistro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        passwordText = new javax.swing.JPasswordField();
        textFieldUsuario = new javax.swing.JTextField();
        buttonValidar = new javax.swing.JButton();
        labelRegistro = new javax.swing.JLabel();
        labelContrasenia = new javax.swing.JLabel();
        setTitle("RentLeon Login");
        setSize(409, 104);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonValidar.setText("Validar");
        buttonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	validarActionPerformed(evt);
            }
        });

        labelRegistro.setText("Usuario");

        labelContrasenia.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(labelRegistro)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelContrasenia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(textFieldUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(buttonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelContrasenia))
                .addGap(13, 13, 13)
                .addComponent(buttonValidar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                                

    private void validarActionPerformed(java.awt.event.ActionEvent evt) {          
    	String contrasenia = String.valueOf(passwordText.getPassword());
    	String usuario = textFieldUsuario.getText();
    	EmpleadoController a = new EmpleadoController();
    	
    	int autenticar = a.autenticarConexion(usuario, contrasenia);
    	
    	if (autenticar == 2) {
    		errores+=1;
    		if (errores == 3) {
    			cerrarProgramaErrorAutenticacion();
    		}
    		avisarAutentificacionErronea();
    	} else {
    		VistaGeneral admin = new VistaGeneral(autenticar);
    		admin.setVisible(true);
    		this.setVisible(false);
    	}
    }
    
    private void avisarAutentificacionErronea() {
    	JOptionPane.showMessageDialog(null, "Contraseña Incorrecta\nIntentelo de nuevo", "Autenticacion Incorrecta", JOptionPane.ERROR_MESSAGE);
    }
    
    private void cerrarProgramaErrorAutenticacion() {
    	JOptionPane.showMessageDialog(null, "Exceso de errores\nCerrando programa", "Autenticacion Incorrecta", JOptionPane.ERROR_MESSAGE);
    	System.exit(0);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonValidar;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField textFieldUsuario;
    private int errores = 0;
    // End of variables declaration                   
}
