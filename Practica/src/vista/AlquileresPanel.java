package vista;

import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AlquileresPanel extends VistaPanelPadre {

	@SuppressWarnings("serial")
	public AlquileresPanel() {
		jScrollPane = super.jScrollPane;
		jTable = super.jTable;

		jTable.setModel(new javax.swing.table.DefaultTableModel( 
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null }, },
				new String[] { "ID", "Inicio", "Fin", "Coste", "Vehiculo", "Empleado", "Cliente", "Oferta", "Estado",
						"", "" }) {
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