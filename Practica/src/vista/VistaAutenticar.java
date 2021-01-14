package vista;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VistaAutenticar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VistaAutenticar() {
        initComponents();
    }
    
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
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));

        buttonValidar.setText("Validar");
        
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
    }      
    
    public void addButtonListener(ActionListener listenerForButtons) {
    	buttonValidar.addActionListener(listenerForButtons);
    }
    
    public JTextField getTextFieldUsuario() {
    	return textFieldUsuario;
    }
    
    public JPasswordField getPasswordText() {
    	return passwordText;
    }
    
    public javax.swing.JButton getValidarButton() {
    	return this.buttonValidar;
    }
    
    public void avisarAutentificacionErronea() {
    	JOptionPane.showMessageDialog(null, "Contraseña Incorrecta\nIntentelo de nuevo", "Autenticacion Incorrecta", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cerrarProgramaErrorAutenticacion() {
    	JOptionPane.showMessageDialog(null, "Exceso de errores\nCerrando programa", "Autenticacion Incorrecta", JOptionPane.ERROR_MESSAGE);
    	System.exit(0);
    }
                 
    private javax.swing.JButton buttonValidar;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField textFieldUsuario;                
}
