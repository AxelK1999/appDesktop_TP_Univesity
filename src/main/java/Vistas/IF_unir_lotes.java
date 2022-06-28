package Vistas;

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Modelos.Campo;
import Modelos.Lote;
import Modelos.Suelo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IF_unir_lotes extends javax.swing.JPanel {

    ControladorLote ctrllote = new ControladorLote();
    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("UNIR DOS LOTES");

        jLabel2.setText("Seleccionar Campo:");

        box_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        txtRes.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(box_campos, 0, 194, Short.MAX_VALUE)
                    .addComponent(box_tds, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box_primer_lote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box_segundo_lote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_unir_lotes)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtRes)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(box_primer_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(box_segundo_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_unir_lotes)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void box_primer_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_primer_loteActionPerformed
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = patronIdentificar.matcher((String) box_campos.getSelectedItem());
        if(matcher.find()){
            Campo camposelec = ctrlcampo.consultarCampo(Integer.parseInt(matcher.group(1)));
            
            matcher = patronIdentificar.matcher((String) box_tds.getSelectedItem());
            if(matcher.find()){
                Suelo sueloselec = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcher.group(1)));
                
                List<Object> lote1list = ctrllote.consultar("where fk_nro_campo = "+camposelec.getNroCampo()+" and fk_nro_suelo = "+sueloselec.getNroSuelo());
                //List<Object> lote1list = ctrllote.consultar(" where fk_nro_campo = 4 and fk_nro_suelo = 4");
                for( Object Lote1Consultado : lote1list){
                    box_primer_lote.addItem("ID "+((Lote)Lote1Consultado).getNroLote()+" - SUP: "+((Lote)Lote1Consultado).getSuperficie());
                }
                //PENDING solucionar error en consulta
                
            }else{
                System.out.println("Error box primer lote: lote");
            }
        }else{
            System.out.println("Error box primer lote: campo");
        }
        
    }//GEN-LAST:event_box_primer_loteActionPerformed

    private void box_segundo_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_segundo_loteActionPerformed
        
        
        
    }//GEN-LAST:event_box_segundo_loteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campos;
    private javax.swing.JComboBox<String> box_primer_lote;
    private javax.swing.JComboBox<String> box_segundo_lote;
    private javax.swing.JComboBox<String> box_tds;
    private javax.swing.JButton btn_unir_lotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtRes;
    // End of variables declaration//GEN-END:variables
}
