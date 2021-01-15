package vista;

import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

public class OfertasPanel extends VistaPanelPadre {
	
	@SuppressWarnings("serial")
	public OfertasPanel() {
		jScrollPane = super.jScrollPane;
		jTable = super.jTable;
	    
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
	            "ID", "Inicio", "Fin", "Tipo", "Especificacion", "Descuento", "Estado", "", "", "", "" 
	        }){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
	}
	
	public void setValue(String valor, int fila, int col) {
		jTable.setValueAt(valor, fila, col);
	} 
	
    // Variables declaration - do not modify                    
	private javax.swing.JScrollPane jScrollPane;
	private javax.swing.JTable jTable;
    // End of variables declaration  
}