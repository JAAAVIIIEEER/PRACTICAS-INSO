package UI;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

public class CochesPanel extends VistaPanelPadre {
	
	public CochesPanel() {
		jScrollPane = super.jScrollPane;
		jTable = super.jTable;
    
	    // Cargar la tabla de clientes 
		
		// AQUI VA LO DEL BLOQUEO DE CELLS
	    
	    jTable.setModel(new javax.swing.table.DefaultTableModel(
	        new Object [][] {
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	        },
	        new String [] {
	            "DNI", "Title 2", "Title 3", "Title 4", "Title 2", "Title 3", "Title 4","Title 2", "Title 3", "Title 4", "Title 2" 
	        }));
	}
	@Override
	void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {} 
	
	@Override
	void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {}
	
	@Override
	void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {}
    
	
    // Variables declaration - do not modify                    
	private javax.swing.JScrollPane jScrollPane;
	private javax.swing.JTable jTable;
    // End of variables declaration    
}