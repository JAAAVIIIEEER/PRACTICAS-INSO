package vista;

import java.awt.Toolkit;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VistaConsultas extends javax.swing.JFrame {

    public VistaConsultas() {
        initComponents();
    }
                      
    private void initComponents() {

        text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(".\\media\\LOGO.png"));
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("RentLeon Consultas");
		setSize(244, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                  

    public void setText(String text) {
    	this.text.setHorizontalAlignment(SwingConstants.CENTER);
    	this.text.setVerticalAlignment(SwingConstants.CENTER);
    	this.text.setText(text);
    }
    
    public void mostrarError() {
    	JOptionPane.showMessageDialog(null, "No se puedo realizar la consultar", "Error Consulta", JOptionPane.ERROR_MESSAGE);
    }
                       
    private javax.swing.JLabel text;                
}
