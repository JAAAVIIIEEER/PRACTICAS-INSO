package vista;

@SuppressWarnings("serial")
public class ClientesPanel extends PanelPadre {

	public ClientesPanel() {
		jTable = super.jTable;

		jTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null }, },
				new String[] { "DNI", "Nombre", "Apellido 1", "Apellido 2", "Nacimiento", "Telefono", "Email",
						"Provincia", "Municipio", "Calle", "Portal" }) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
	}
	
	public void vaciarTabla() {
		for (int i = 0; i < jTable.getRowCount(); i++) {
			for (int j = 0; j < jTable.getColumnCount(); j++) {
				jTable.setValueAt("", i, j);
			}
		}
	}

	public void setValue(String valor, int fila, int col) {
		jTable.setValueAt(valor, fila, col);
	}

	private javax.swing.JTable jTable;
}
