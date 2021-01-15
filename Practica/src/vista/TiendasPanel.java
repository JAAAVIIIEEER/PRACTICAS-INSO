package vista;

import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

public class TiendasPanel extends VistaPanelPadre {

	@SuppressWarnings("serial")
	public TiendasPanel() {
		jScrollPane = super.jScrollPane;
		jTable = super.jTable;

		jTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null }, },
				new String[] { "ID", "Provincia", "Municipio", "Calle", "Portal", "Telefono", "Email", "", "", "",
						"" }) {
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