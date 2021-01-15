package vista;

import javax.swing.*;

@SuppressWarnings("serial")
public class PanelPadre extends JPanel {

	public PanelPadre() {
		jScrollPane = new javax.swing.JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTable = new javax.swing.JTable();

		jScrollPane.setViewportView(jTable);

		// Panel Principal

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(this);
		this.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jPanel1Layout.createSequentialGroup().addContainerGap()
						.add(jScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 941,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(jScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)

		);
	}
	javax.swing.JScrollPane jScrollPane;
	javax.swing.JTable jTable;
}
