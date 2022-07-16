package Vistas;

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;
import Modelos.Campo;
import Modelos.Lote;
import Modelos.Proyecto;
import Modelos.Suelo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IF_unir_lotes extends javax.swing.JPanel {

    ControladorLote ctrllote = new ControladorLote();
    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    ControladorProyectosLote ctrlproyecto = new ControladorProyectosLote();
    Campo camposelec = new Campo();
    Suelo sueloselec = new Suelo();
    
    public IF_unir_lotes() {
        initComponents();
        
        box_campos.removeAllItems();
        List<Object> camposlist = ctrlcampo.consultar("as C INNER JOIN C.estado ");
        for( Object CampoConsultado : camposlist){
            box_campos.addItem("ID "+((Campo)CampoConsultado).getNroCampo()+" - "+((Campo)CampoConsultado).getDireccion());
        }
        
        box_tds.removeAllItems();
        List<Object> suelolist = ctrlcultivo.consultar(new Suelo(),"");
        for( Object SueloConsultado : suelolist){
            box_tds.addItem("ID "+((Suelo)SueloConsultado).getNroSuelo()+" - "+((Suelo)SueloConsultado).getCaractersticasSuelo());
        }
        
        box_primer_lote.removeAllItems();
        box_segundo_lote.removeAllItems();
        box_primer_lote.setEnabled(false);
        box_segundo_lote.setEnabled(false);
        
        btn_unir_lotes.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_campos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        box_tds = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        box_primer_lote = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        box_segundo_lote = new javax.swing.JComboBox<>();
        btn_unir_lotes = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();
        btn_buscar_lote = new javax.swing.JButton();
        txtC_S = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("UNIR DOS LOTES");

        jLabel2.setText("Seleccionar Campo:");

        box_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_campos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_camposItemStateChanged(evt);
            }
        });

        jLabel3.setText("Seleccionar Tipo de Suelo:");

        box_tds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Primer Lote a unir:");

        box_primer_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_primer_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_primer_loteActionPerformed(evt);
            }
        });

        jLabel5.setText("Segundo Lote a unir:");

        box_segundo_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_segundo_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_segundo_loteActionPerformed(evt);
            }
        });

        btn_unir_lotes.setText("UNIR LOTES");
        btn_unir_lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unir_lotesActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        btn_buscar_lote.setText("BUSCAR LOTES");
        btn_buscar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_loteActionPerformed(evt);
            }
        });

        txtC_S.setText("Seleccione Campo-Suelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_segundo_lote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_campos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(23, 23, 23))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_primer_lote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_tds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btn_unir_lotes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(txtC_S))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(txtRes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_buscar_lote)))
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_tds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar_lote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtC_S)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_primer_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_segundo_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_unir_lotes)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void box_primer_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_primer_loteActionPerformed
        
    }//GEN-LAST:event_box_primer_loteActionPerformed

    private void box_segundo_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_segundo_loteActionPerformed
        
    }//GEN-LAST:event_box_segundo_loteActionPerformed

    private void box_camposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_camposItemStateChanged
        
    }//GEN-LAST:event_box_camposItemStateChanged

    private void btn_unir_lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unir_lotesActionPerformed
        
        if(!((String) box_primer_lote.getSelectedItem()).equals((String) box_segundo_lote.getSelectedItem())){
            Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
            Matcher matcher1 = patronIdentificar.matcher((String) box_primer_lote.getSelectedItem());
            Matcher matcher2 = patronIdentificar.matcher((String) box_segundo_lote.getSelectedItem());
            if(matcher1.find() && matcher2.find()){
                //PENDING terminar esto
                //UNION DE LOTES (actualizar sup del primer lote)
                Lote L1 = ctrllote.consultarLote(Integer.parseInt(matcher1.group(1)));
                Lote L2 = ctrllote.consultarLote(Integer.parseInt(matcher2.group(1)));
                L1.setSuperficie(L1.getSuperficie()+L2.getSuperficie());
                
                //REDIRECCION DE PROYECTOS VINCULADOS AL SEGUNDO LOTE UNIDO (debe ir dentro de un if)
                List<Proyecto> proyectoslist = ctrlproyecto.consultarTodos(new Proyecto(), " as p where p.loteConProyecto.nroLote = "+L2.getNroLote());
                if(proyectoslist.size()>0){
                    for( Proyecto ProyectosConsultados : proyectoslist){
                        ctrlproyecto.actualizarProyecto(ProyectosConsultados.getNroProyecto(),ProyectosConsultados.getEstado(), ProyectosConsultados.getMotivoCancelar(), L1, ProyectosConsultados.getCultivo());
                    }
                }
                
                //ACTUALIZADO DEL PRIMER LOTE Y BORRADO DEL SEGUNDO LOTE (debe ir dentro de un if)
                ctrllote.actualizarLote(L1.getNroLote(), L1.getSuperficie(), camposelec, sueloselec);
                ctrllote.eliminarLote(L2.getNroLote());
                
                txtRes.setText("¡UNIÓN EXITOSA!");
            }else{
                System.out.println("Error box lotes");
            }
        }else{
            txtRes.setText("No se puede unir el MISMO lote.");
        }
    }//GEN-LAST:event_btn_unir_lotesActionPerformed

    private void btn_buscar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_loteActionPerformed
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = patronIdentificar.matcher((String) box_campos.getSelectedItem());
        if(matcher.find()){
            camposelec = ctrlcampo.consultarCampo(Integer.parseInt(matcher.group(1)));
            
            matcher = patronIdentificar.matcher((String) box_tds.getSelectedItem());
            if(matcher.find()){
                sueloselec = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcher.group(1)));
                
                List<Object[]> lote1list = ctrllote.consultaNativa("select * from lote where fk_nro_campo = "+ camposelec.getNroCampo() +" and fk_nro_suelo = " + sueloselec.getNroSuelo());
                if(lote1list.size()>1){
                    box_primer_lote.setEnabled(true);
                    box_segundo_lote.setEnabled(true);
                    for(Object[] L : lote1list){
                        box_primer_lote.addItem("ID "+L[0]+" - SUP: "+L[1]);
                        box_segundo_lote.addItem("ID "+L[0]+" - SUP: "+L[1]);
                    }
                    
                    txtC_S.setText("¡Combinación válida!");
                    box_campos.setEnabled(false);
                    box_tds.setEnabled(false);
                    btn_unir_lotes.setVisible(true);
                }else{
                    txtC_S.setText("La combinación posee menos de 2 lotes");
                }
                
                /*
                List<Object> lote1list = ctrllote.consultar("where fk_nro_campo = "+camposelec.getNroCampo()+" and fk_nro_suelo = "+sueloselec.getNroSuelo());
                //List<Object> lote1list = ctrllote.consultar(" where fk_nro_campo = 4 and fk_nro_suelo = 4");
                for( Object Lote1Consultado : lote1list){
                    box_primer_lote.addItem("ID "+((Lote)Lote1Consultado).getNroLote()+" - SUP: "+((Lote)Lote1Consultado).getSuperficie());
                }*/
                
            }else{
                System.out.println("Error box suelo");
            }
        }else{
            System.out.println("Error box campo");
        }
        
    }//GEN-LAST:event_btn_buscar_loteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campos;
    private javax.swing.JComboBox<String> box_primer_lote;
    private javax.swing.JComboBox<String> box_segundo_lote;
    private javax.swing.JComboBox<String> box_tds;
    private javax.swing.JButton btn_buscar_lote;
    private javax.swing.JButton btn_unir_lotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtC_S;
    private javax.swing.JLabel txtRes;
    // End of variables declaration//GEN-END:variables
}
