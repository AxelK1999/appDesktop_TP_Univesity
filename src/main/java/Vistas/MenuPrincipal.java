package Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo_MenuPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_L = new javax.swing.JMenu();
        item_registrar_lote = new javax.swing.JMenuItem();
        item_unir_lotes = new javax.swing.JMenuItem();
        item_separar_lotes = new javax.swing.JMenuItem();
        item_actualizar_lote = new javax.swing.JMenuItem();
        menu_TdSyC = new javax.swing.JMenu();
        item_registrar_campo = new javax.swing.JMenuItem();
        item_actualizar_campo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_P = new javax.swing.JMenu();
        item_iniciar_p = new javax.swing.JMenuItem();
        item_cancelar_p = new javax.swing.JMenuItem();
        item_registrar_incidencia = new javax.swing.JMenuItem();
        item_finalizar_laboreo = new javax.swing.JMenuItem();
        item_listar_p = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo_MenuPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));
        fondo_MenuPrincipal.setLayout(new java.awt.CardLayout());

        menu_L.setText("Lotes");

        item_registrar_lote.setText("Registrar Lote");
        item_registrar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_registrar_loteActionPerformed(evt);
            }
        });
        menu_L.add(item_registrar_lote);

        item_unir_lotes.setText("Unir Lotes");
        item_unir_lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_unir_lotesActionPerformed(evt);
            }
        });
        menu_L.add(item_unir_lotes);

        item_separar_lotes.setText("Separar Lotes");
        item_separar_lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_separar_lotesActionPerformed(evt);
            }
        });
        menu_L.add(item_separar_lotes);

        item_actualizar_lote.setText("Actualizar Lote");
        item_actualizar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_actualizar_loteActionPerformed(evt);
            }
        });
        menu_L.add(item_actualizar_lote);

        jMenuBar1.add(menu_L);

        menu_TdSyC.setText("Campos");

        item_registrar_campo.setText("Registrar Campo");
        item_registrar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_registrar_campoActionPerformed(evt);
            }
        });
        menu_TdSyC.add(item_registrar_campo);

        item_actualizar_campo.setText("Actualizar Campo");
        item_actualizar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_actualizar_campoActionPerformed(evt);
            }
        });
        menu_TdSyC.add(item_actualizar_campo);

        jMenuItem1.setText("Listar Campos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_TdSyC.add(jMenuItem1);

        jMenuBar1.add(menu_TdSyC);

        menu_P.setText("Proyectos");

        item_iniciar_p.setText("Iniciar Proyecto");
        item_iniciar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_iniciar_pActionPerformed(evt);
            }
        });
        menu_P.add(item_iniciar_p);

        item_cancelar_p.setText("Cancelar Proyecto");
        item_cancelar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cancelar_pActionPerformed(evt);
            }
        });
        menu_P.add(item_cancelar_p);

        item_registrar_incidencia.setText("Registrar Incidencia");
        item_registrar_incidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_registrar_incidenciaActionPerformed(evt);
            }
        });
        menu_P.add(item_registrar_incidencia);

        item_finalizar_laboreo.setText("Finalizar Laboreo");
        item_finalizar_laboreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_finalizar_laboreoActionPerformed(evt);
            }
        });
        menu_P.add(item_finalizar_laboreo);

        item_listar_p.setText("Listar Proyectos");
        item_listar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_listar_pActionPerformed(evt);
            }
        });
        menu_P.add(item_listar_p);

        jMenuBar1.add(menu_P);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo_MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo_MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_unir_lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_unir_lotesActionPerformed
        IF_unir_lotes ventana_unir_lotes = new IF_unir_lotes();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_unir_lotes);
        actualizarVentana();
        
        
    }//GEN-LAST:event_item_unir_lotesActionPerformed

    private void item_registrar_incidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_registrar_incidenciaActionPerformed
        IF_registrar_incidencia ventana_registrar_incidencia = new IF_registrar_incidencia();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_registrar_incidencia);
        actualizarVentana();
    }//GEN-LAST:event_item_registrar_incidenciaActionPerformed

    private void item_registrar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_registrar_loteActionPerformed
        IF_registrar_lote ventana_registrar_lote = new IF_registrar_lote();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_registrar_lote);
        actualizarVentana();
    }//GEN-LAST:event_item_registrar_loteActionPerformed

    private void item_separar_lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_separar_lotesActionPerformed
        IF_separar_lotes ventana_separar_lotes = new IF_separar_lotes();
          fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_separar_lotes);
        actualizarVentana();
    }//GEN-LAST:event_item_separar_lotesActionPerformed

    private void item_actualizar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_actualizar_loteActionPerformed
        IF_actualizar_lote ventana_actualizar_lote = new IF_actualizar_lote();
         fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_actualizar_lote);
        actualizarVentana();
    }//GEN-LAST:event_item_actualizar_loteActionPerformed

    private void item_registrar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_registrar_campoActionPerformed
        IF_registrar_campo ventana_registrar_campo = new IF_registrar_campo();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_registrar_campo);
        actualizarVentana();
    }//GEN-LAST:event_item_registrar_campoActionPerformed

    private void item_actualizar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_actualizar_campoActionPerformed
        IF_actualizar_campo ventana_actualizar_campo = new IF_actualizar_campo();
         fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_actualizar_campo);
        actualizarVentana();
    }//GEN-LAST:event_item_actualizar_campoActionPerformed

    private void item_iniciar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_iniciar_pActionPerformed
        IF_iniciar_p ventana_iniciar_p = new IF_iniciar_p();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_iniciar_p);
        actualizarVentana();
    }//GEN-LAST:event_item_iniciar_pActionPerformed

    private void item_cancelar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cancelar_pActionPerformed
        IF_cancelar_p ventana_cancelar_p = new IF_cancelar_p();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_cancelar_p);
        actualizarVentana();
        
    }//GEN-LAST:event_item_cancelar_pActionPerformed
    
    private void actualizarVentana(){
        fondo_MenuPrincipal.repaint(); //Actualiza el repitado de todo los componenetes hijos (limpiando correctamente elementos viejos)
        fondo_MenuPrincipal.revalidate();//vuelva a calcular el dise??o (que es necesario al agregar componentes)
    }
    
    private void item_finalizar_laboreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_finalizar_laboreoActionPerformed
        IF_finalizar_laboreo ventana_finalizar_laboreo = new IF_finalizar_laboreo();

       fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_finalizar_laboreo);
        actualizarVentana();
        
        //fondo_MenuPrincipal.add(ventana_finalizar_laboreo);
        //ventana_finalizar_laboreo.show();
    }//GEN-LAST:event_item_finalizar_laboreoActionPerformed

    private void item_listar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_listar_pActionPerformed
        IF_listar_p ventana_listar_p = new IF_listar_p();
       
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_listar_p);
        actualizarVentana();
    }//GEN-LAST:event_item_listar_pActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        IF_listar_campos ventana_listar_campos = new IF_listar_campos();
        fondo_MenuPrincipal.removeAll();
        fondo_MenuPrincipal.add(ventana_listar_campos);
        actualizarVentana();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
/*
    public static void main(String args[]) {
        // Set the Nimbus look and feel//
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        // If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        // For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo_MenuPrincipal;
    private javax.swing.JMenuItem item_actualizar_campo;
    private javax.swing.JMenuItem item_actualizar_lote;
    private javax.swing.JMenuItem item_cancelar_p;
    private javax.swing.JMenuItem item_finalizar_laboreo;
    private javax.swing.JMenuItem item_iniciar_p;
    private javax.swing.JMenuItem item_listar_p;
    private javax.swing.JMenuItem item_registrar_campo;
    private javax.swing.JMenuItem item_registrar_incidencia;
    private javax.swing.JMenuItem item_registrar_lote;
    private javax.swing.JMenuItem item_separar_lotes;
    private javax.swing.JMenuItem item_unir_lotes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu_L;
    private javax.swing.JMenu menu_P;
    private javax.swing.JMenu menu_TdSyC;
    // End of variables declaration//GEN-END:variables
}
