/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

/**
 *
 * @author JP
 */

public class Frame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public Frame() {
        initComponents();
    }
                        
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuVista = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemAlquileres = new javax.swing.JMenuItem();
        jMenuItemIncidencias = new javax.swing.JMenuItem();
        jMenuItemOfertas = new javax.swing.JMenuItem();
        jMenuItemCoches = new javax.swing.JMenuItem();
        jMenuItemTiendas = new javax.swing.JMenuItem();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        clientesPanel =  new ClientesPanel();
        alquileresPanel = new AlquileresPanel();
        incidenciasPanel = new IncidenciasPanel();
        ofertasPanel = new OfertasPanel();
        empleadosPanel = new EmpleadosPanel();
        cochesPanel = new CochesPanel();
        tiendasPanel = new TiendasPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      
        jTabbedPane.addTab("Alquileres", alquileresPanel);   
      
        jMenuInicio.setText("Inicio");
   
        	jMenuItemCerrarSesion.setText("Cerrar Sesión");
        	jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
	    		public void actionPerformed(java.awt.event.ActionEvent evt) {
	    			jMenuItemCerrarSesionActionPerformed(evt);
	    		}
	    	});
        	jMenuInicio.add(jMenuItemCerrarSesion);
        	
        jMenuBar.add(jMenuInicio);
	    
        jMenuVista.setText("Vista");

        	jMenuItemClientes.setText("Clientes");
        	jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
        			jMenuItemClientesActionPerformed(evt);
        		}
        	});
        	jMenuVista.add(jMenuItemClientes);
        
        	jMenuItemAlquileres.setText("Alquileres");
        	jMenuItemAlquileres.addActionListener(new java.awt.event.ActionListener() {
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
        			jMenuItemAlquileresActionPerformed(evt);
        		}
        	});
        	jMenuVista.add(jMenuItemAlquileres);
        
        	jMenuItemIncidencias.setText("Incidencias");
        	jMenuItemIncidencias.addActionListener(new java.awt.event.ActionListener() {
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
        			jMenuItemIncidenciasActionPerformed(evt);
        		}
        	});
        	jMenuVista.add(jMenuItemIncidencias);

        	jMenuItemOfertas.setText("Ofertas");
        	jMenuItemOfertas.addActionListener(new java.awt.event.ActionListener() {
        		public void actionPerformed(java.awt.event.ActionEvent evt) {
        			jMenuItemOfertasActionPerformed(evt);
        		}
        	});
        	jMenuVista.add(jMenuItemOfertas);
        	
        	jMenuItemEmpleados.setText("Empleados");
  	        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
  	            public void actionPerformed(java.awt.event.ActionEvent evt) {
  	                jMenuItemEmpleadosActionPerformed(evt);
  	            }
  	        });
  	        jMenuVista.add(jMenuItemEmpleados);

        	jMenuItemCoches.setText("Coches");
	        jMenuItemCoches.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jMenuItemCochesActionPerformed(evt);
	            }
	        });
	        jMenuVista.add(jMenuItemCoches);
	       
	
	        jMenuItemTiendas.setText("Tiendas");
	        jMenuItemTiendas.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	jMenuItemTiendasActionPerformed(evt);
	            }
	        });
	        jMenuVista.add(jMenuItemTiendas);
	        
        jMenuBar.add(jMenuVista);

        setJMenuBar(jMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane)
        );

        pack();
    }                      

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {  
    	if(jTabbedPane.indexOfComponent(clientesPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(clientesPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Clientes", clientesPanel);  
    	}
    }                                 

    private void jMenuItemAlquileresActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(alquileresPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(alquileresPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Alquileres", alquileresPanel);  
    	}
    }                                          

    private void jMenuItemIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(incidenciasPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(incidenciasPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Incidencias", incidenciasPanel);  
    	}
    }                                          
    
    private void jMenuItemOfertasActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(ofertasPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(ofertasPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Ofertas", ofertasPanel);  
    	}
    }                                          

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(empleadosPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(empleadosPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Empleados", empleadosPanel);  
    	}
    }  
    
    private void jMenuItemCochesActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(cochesPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(cochesPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Coches", cochesPanel);  
    	}
    }   
    
    private void jMenuItemTiendasActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	if(jTabbedPane.indexOfComponent(tiendasPanel) != -1) {
    		jTabbedPane.remove(jTabbedPane.indexOfComponent(tiendasPanel)); 
    	} else {
    		// SE DEBE ACTUALIZAR LA TABLA
    		jTabbedPane.addTab("Tiendas", tiendasPanel);  
    	}
    }  
    
    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenu jMenuVista;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemAlquileres;
    private javax.swing.JMenuItem jMenuItemIncidencias;
    private javax.swing.JMenuItem jMenuItemOfertas;
    private javax.swing.JMenuItem jMenuItemCoches;
    private javax.swing.JMenuItem jMenuItemTiendas;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private ClientesPanel clientesPanel;
    private AlquileresPanel alquileresPanel;
    private IncidenciasPanel incidenciasPanel;
    private OfertasPanel ofertasPanel;
    private EmpleadosPanel empleadosPanel;
    private CochesPanel cochesPanel;
    private TiendasPanel tiendasPanel;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration                   

}
