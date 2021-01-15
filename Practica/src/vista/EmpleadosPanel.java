package vista;

import java.awt.event.ActionListener;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

public class EmpleadosPanel extends VistaPanelPadre {

	@SuppressWarnings("serial")
	public EmpleadosPanel() {

		jScrollPane = super.jScrollPane;
		jTable = super.jTable;

		// Cargar la tabla de clientes

		// AQUI VA LO DEL BLOQUEO DE CELLS

		jTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null }, },
				new String[] { "DNI", "Nombre", "Apellido 1", "Apellido 2", "Nacimiento", "Telefono", "Email", "Tipo",
						"", "", "" }) {
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