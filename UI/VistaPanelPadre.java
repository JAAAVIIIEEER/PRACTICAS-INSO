package UI;

import java.awt.Image;

import javax.swing.*;

public class VistaPanelPadre extends JPanel {
	
	public VistaPanelPadre() {
	    jPanelBotones = new javax.swing.JPanel();
	    jScrollPane = new javax.swing.JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    jTable = new javax.swing.JTable();
	    jButtonAñadir = new javax.swing.JButton();
	    jButtonEditar = new javax.swing.JButton();
	    jButtonEliminar = new javax.swing.JButton(); 
	    
	    jScrollPane.setViewportView(jTable);
	    
	    // Añadir cliente
	    
	    Image imagen = new ImageIcon("D:\\Downloads\\add.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
	    jButtonAñadir.setIcon(new ImageIcon(imagen));
	    jButtonAñadir.setBorder(null);
	    jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            jButtonAñadirActionPerformed(evt);
	        }
	    });
	    
	    // Editar cliente
	    
	    Image imagen2 = new ImageIcon("D:\\Downloads\\male_user_edit.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
	    jButtonEditar.setIcon(new ImageIcon(imagen2));
	    jButtonEditar.setBorder(null);
	    jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	jButtonEditarActionPerformed(evt);
	        }
	    });
	
	    // Eliminar cliente
	    
	    Image imagen3 = new ImageIcon("D:\\Downloads\\delete.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
	    jButtonEliminar.setIcon(new ImageIcon(imagen3));
	    jButtonEliminar.setBorder(null);
	    jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	jButtonEliminarActionPerformed(evt);
	        }
	    });
	    
	    // Panel de los botones
	    
	    org.jdesktop.layout.GroupLayout jPanelBotonesLayout = new org.jdesktop.layout.GroupLayout(jPanelBotones);
	    jPanelBotones.setLayout(jPanelBotonesLayout);
	    jPanelBotonesLayout.setHorizontalGroup(
	        jPanelBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
	        .add(jPanelBotonesLayout.createSequentialGroup()
	            .addContainerGap()
	            .add(jPanelBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
	                .add(jButtonAñadir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	                .add(jButtonEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	                .add(jButtonEliminar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
	            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    jPanelBotonesLayout.setVerticalGroup(
	        jPanelBotonesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
	        .add(jPanelBotonesLayout.createSequentialGroup()
	        	.addContainerGap()
	            .add(jButtonAñadir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	            .add(18, 18, 18)
	            .add(jButtonEditar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	            .add(18, 18, 18)
	            .add(jButtonEliminar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    
	    // Panel Principal 
	    
	    org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(this);
	    this.setLayout(jPanel1Layout);
	    jPanel1Layout.setHorizontalGroup(
	        jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
	        .add(jPanel1Layout.createSequentialGroup()
	            .addContainerGap()
	            .add(jScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 941, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
	            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
	            .add(jPanelBotones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
	    );
	    jPanel1Layout.setVerticalGroup(
	        jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
	        .add(jScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
	        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelBotones, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    );
	}
	
	void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {} 
	
	void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {}
	
	void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {}
    
    // Variables declaration - do not modify                     
	javax.swing.JButton jButtonAñadir;
	javax.swing.JButton jButtonEditar;
	javax.swing.JButton jButtonEliminar;
	javax.swing.JPanel jPanelBotones;
	javax.swing.JScrollPane jScrollPane;
	javax.swing.JTable jTable;
    // End of variables declaration          
}


