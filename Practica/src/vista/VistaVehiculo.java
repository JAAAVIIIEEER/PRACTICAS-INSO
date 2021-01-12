package vista;

import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

import implementacion.VehiculoDao;

public class VistaVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form VistaVehiculo
     */
    public VistaVehiculo() {
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

       jLabel1 = new javax.swing.JLabel();
       plazasBox = new javax.swing.JComboBox();
       jLabel2 = new javax.swing.JLabel();
       combustibleBox = new javax.swing.JComboBox();
       matriculaText = new javax.swing.JTextField();
       jLabel3 = new javax.swing.JLabel();
       aniadirButton = new javax.swing.JButton();
       jLabel4 = new javax.swing.JLabel();
       costeSpinner = new javax.swing.JSpinner();
       jLabel5 = new javax.swing.JLabel();
       tipoBox = new javax.swing.JComboBox();
       marcaText = new javax.swing.JTextField();
       jLabel6 = new javax.swing.JLabel();
       tiendasBox = new javax.swing.JComboBox();
       jLabel7 = new javax.swing.JLabel();
       jLabel8 = new javax.swing.JLabel();
       jScrollPane2 = new javax.swing.JScrollPane();
       extrasText = new javax.swing.JTextPane();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setText("Plazas");

       plazasBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "7", "9" }));

       jLabel2.setText("Combustible");

       combustibleBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Diesel", "Gasolina", "Electrico", "Hibrido" }));

       jLabel3.setText("Matricula");

       aniadirButton.setText("Validar");

       jLabel4.setText("Coste");

       costeSpinner.setToolTipText("");
       costeSpinner.setOpaque(false);
       costeSpinner.setVerifyInputWhenFocusTarget(false);

       jLabel5.setText("Tipo");

       tipoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Turismo", "Furgoneta", "Caravana" }));

       jLabel6.setText("Marca");

       jLabel7.setText("Tienda");

       jLabel8.setText("Extras");

       jScrollPane2.setViewportView(extrasText);

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(41, 41, 41)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel1)
                           .addComponent(jLabel2)
                           .addComponent(jLabel5)
                           .addComponent(jLabel4)
                           .addComponent(jLabel3))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(layout.createSequentialGroup()
                                       .addComponent(combustibleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                       .addComponent(jLabel7))
                                   .addGroup(layout.createSequentialGroup()
                                       .addComponent(plazasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                       .addGap(166, 166, 166)
                                       .addComponent(jLabel6))
                                   .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                       .addComponent(marcaText)
                                       .addComponent(tiendasBox, 0, 123, Short.MAX_VALUE))
                                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                       .addComponent(jLabel8)
                                       .addGap(49, 49, 49))))
                           .addGroup(layout.createSequentialGroup()
                               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(costeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                               .addGap(80, 80, 80)
                               .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                   .addGroup(layout.createSequentialGroup()
                       .addGap(223, 223, 223)
                       .addComponent(aniadirButton)))
               .addContainerGap(30, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(20, 20, 20)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(plazasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel1)
                   .addComponent(marcaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel6))
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2)
                   .addComponent(combustibleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel7)
                   .addComponent(tiendasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel5)
                   .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel8))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(18, 18, 18)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(costeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel4))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel3)
                           .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addGap(3, 3, 3)
                       .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGap(18, 18, 18)
               .addComponent(aniadirButton)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       pack();
    }// </editor-fold>                        
    
    public void listenerAniadirButton(ActionListener listenerForButtons) {
    	this.aniadirButton.setText("Añadir");
    	this.aniadirButton.addActionListener(listenerForButtons);
    }
    
    public void listenerModificarButton(ActionListener listenerForButtons) {
    	this.aniadirButton.setText("Modificar");
    	this.aniadirButton.addActionListener(listenerForButtons);
    }
    
    public void removeListenerAniadirButton() {
		for (ActionListener al : aniadirButton.getActionListeners()) {
			aniadirButton.removeActionListener(al);
		}
	}
    
    public void avisarVehiculoAniadidoCorrecto() {
    	JOptionPane.showMessageDialog(null, "Vehiculo añadido correctamente", null, JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    public void avisarVehiculoModificadoCorrecto() {
    	JOptionPane.showMessageDialog(null, "Vehiculo modificado correctamente", null, JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    public String mostrarVentanaBajaVehiculo() {
		String mat = JOptionPane.showInputDialog(null, "Introduce la matricula:", "Baja Vehiculo",
				JOptionPane.QUESTION_MESSAGE);
		return mat;
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
    
    public String getMarcaText() {
    	return marcaText.getText();
    }
    
    public String mostrarVentanaConsultarVehiculo() {
		String dni = JOptionPane.showInputDialog(null, "Introduce la matricula:", "Consultar Vehiculo",
				JOptionPane.QUESTION_MESSAGE);
		return dni;
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
		this.matriculaText.setText(matricula);	}

	public void setMarcaText(String marca) {
		this.marcaText.setText(marca);
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
		//tiendasBox.setSelectedIndex(0);
		matriculaText.setText("");
		marcaText.setText("");
		extrasText.setText("");
		costeSpinner.setValue(0);
	}

    // Variables declaration - do not modify                     
    private javax.swing.JButton aniadirButton;
	private javax.swing.JComboBox plazasBox;
    private javax.swing.JComboBox combustibleBox;
    private javax.swing.JComboBox tipoBox;
    private javax.swing.JComboBox tiendasBox;
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
    private javax.swing.JTextField marcaText;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane extrasText;
    // End of variables declaration               
}
