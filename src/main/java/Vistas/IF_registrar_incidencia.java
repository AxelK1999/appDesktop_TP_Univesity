package Vistas;

import Controladores.ControladorCampo;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;
import Modelos.Campo;
import Modelos.Lote;
import Modelos.Proyecto;
import Modelos.DetalleProyecto;
import Modelos.SituacionAnormal;
import java.util.List;
import javax.swing.JOptionPane;

public class IF_registrar_incidencia extends javax.swing.JPanel {

    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorLote ctrllote = new ControladorLote();
    ControladorProyectosLote ctrlproyecto = new ControladorProyectosLote();
    
    public IF_registrar_incidencia() {
        initComponents();
        
        box_campo.removeAllItems();
        box_lote.removeAllItems();
        box_proyecto.removeAllItems();
        box_detalle.removeAllItems();
        box_incidencia.removeAllItems();
        btn_registrar_incidencia.setVisible(false);
        
        List<Campo> listaCampos = ctrlcampo.obtenerCampos();
        
        if(listaCampos.size() == 0){
            JOptionPane.showMessageDialog(null,"No se encontraron campos registrados");
        }
        for(Campo C : listaCampos){
            box_campo.addItem(C.getNroCampo()+"- Dir "+C.getDireccion());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        box_campo = new javax.swing.JComboBox<>();
        box_lote = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        box_incidencia = new javax.swing.JComboBox<>();
        box_proyecto = new javax.swing.JComboBox<>();
        btn_registrar_incidencia = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();
        box_detalle = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRAR UNA INCIDENCIA");

        box_campo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_campoActionPerformed(evt);
            }
        });

        box_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_loteActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione Campo");

        jLabel3.setText("Seleccione Lote");

        jLabel4.setText("Seleccione Proyecto");

        jLabel5.setText("Seleccione Incidencia");

        box_incidencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        box_proyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_proyectoActionPerformed(evt);
            }
        });

        btn_registrar_incidencia.setText("REGISTRAR INCIDENCIA");
        btn_registrar_incidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_incidenciaActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        box_detalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_detalleActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione Detalle del Proyecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(box_incidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(box_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(box_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrar_incidencia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(txtRes)))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(box_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(box_proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(box_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(box_incidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_registrar_incidencia)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_incidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_incidenciaActionPerformed
        
        String IncidenciaSeleccionado = (String)box_incidencia.getSelectedItem();
        System.err.println(IncidenciaSeleccionado);
        String detalleSeleccionado = (String)box_detalle.getSelectedItem();
        System.err.println(detalleSeleccionado);
        if(IncidenciaSeleccionado != null && detalleSeleccionado != null){
            int res = ctrlproyecto.registrarSAenDetalle(Integer.parseInt(detalleSeleccionado.split("-")[0] ),Integer.parseInt(IncidenciaSeleccionado.split("-")[0] ));
            if(res == 1){
                txtRes.setText("¡REGISTRO EXITOSO!");
            }else{
                txtRes.setText("Error en la registración de incidencia");
            }
        }else{
            txtRes.setText("Error en la registración de incidencia");
        }
        
    }//GEN-LAST:event_btn_registrar_incidenciaActionPerformed

    private void box_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_campoActionPerformed
        
        String campoSeleccionado = (String)box_campo.getSelectedItem();
        System.err.println(campoSeleccionado);
        if(campoSeleccionado != null){
            
            List<Lote> listLotes = ctrllote.obtenerLotesDeCampo(Integer.parseInt(campoSeleccionado.split("-")[0] ));
            box_lote.removeAllItems();

            if(listLotes.size()< 1){
                JOptionPane.showMessageDialog(null,"No se encontraron lotes registrados en el campo seleccionado");
            }
            for(Lote L : listLotes){
                box_lote.addItem( L.getNroLote() + "- Sup " + L.getSuperficie());
            }
        }
    }//GEN-LAST:event_box_campoActionPerformed

    private void box_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_loteActionPerformed
        
        String loteSeleccionado = (String)box_lote.getSelectedItem();
        System.err.println(loteSeleccionado);
        if(loteSeleccionado != null){
            List<Proyecto> listProyecto = ctrlproyecto.obtenerProyectosDeLote(Integer.parseInt(loteSeleccionado.split("-")[0] ));
            box_proyecto.removeAllItems();

            if(listProyecto.size()< 1){
                JOptionPane.showMessageDialog(null,"No se encontraron proyectos registrados en el lote seleccionado");
            }
            for(Proyecto P : listProyecto){
                box_proyecto.addItem(P.getNroProyecto() + "- Est " + P.getEstado());
            }
        }
    }//GEN-LAST:event_box_loteActionPerformed

    private void box_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_proyectoActionPerformed
        
        String proyectoSeleccionado = (String)box_proyecto.getSelectedItem();
        System.err.println(proyectoSeleccionado);
        if(proyectoSeleccionado != null){
            List<DetalleProyecto> listDetalle = ctrlproyecto.obtenerDetallesDeProyecto(Integer.parseInt(proyectoSeleccionado.split("-")[0] ));
            box_detalle.removeAllItems();

            if(listDetalle.size()< 1){
                JOptionPane.showMessageDialog(null,"No se encontraron detalles registrados en el proyecto seleccionado");
            }
            for(DetalleProyecto D : listDetalle){
                box_detalle.addItem(D.getNroDetalle() + "- Etapa " + D.getLaboreo().getEtapaLaboreo());
            }
        }
    }//GEN-LAST:event_box_proyectoActionPerformed

    private void box_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_detalleActionPerformed
        
        String detalleSeleccionado = (String)box_detalle.getSelectedItem();
        System.err.println(detalleSeleccionado);
        if(detalleSeleccionado != null){
            
            List<SituacionAnormal> listSA = ctrlproyecto.obtenerSituacionesAnormales();
            if(listSA.size()<1){
                JOptionPane.showMessageDialog(null,"No se encontraron situaciones anormales");
            }else{
                for(SituacionAnormal SA: listSA){
                    box_incidencia.addItem(SA.getIdIncidencia()+"- Nombre: "+SA.getNombreIncidencia());
                }
                btn_registrar_incidencia.setVisible(true);
            }
        }else{
            btn_registrar_incidencia.setVisible(false);
        }
        
    }//GEN-LAST:event_box_detalleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campo;
    private javax.swing.JComboBox<String> box_detalle;
    private javax.swing.JComboBox<String> box_incidencia;
    private javax.swing.JComboBox<String> box_lote;
    private javax.swing.JComboBox<String> box_proyecto;
    private javax.swing.JButton btn_registrar_incidencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel txtRes;
    // End of variables declaration//GEN-END:variables
}
