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

public class IF_actualizar_lote extends javax.swing.JPanel {

    ControladorLote ctrllote = new ControladorLote();
    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    Campo camposelec = new Campo();
    Suelo sueloselec = new Suelo();
    
    public IF_actualizar_lote() {
        initComponents();
        
        box_campos.removeAllItems();
        List<Object> camposlist = ctrlcampo.obtenerCampos();
        for( Object CampoConsultado : camposlist){
            box_campos.addItem("ID "+((Campo)CampoConsultado).getNroCampo()+" - "+((Campo)CampoConsultado).getDireccion());
        }
        
        box_tds.removeAllItems();
        List<Object> suelolist = ctrlcultivo.obtenerSuelos();
        for( Object SueloConsultado : suelolist){
            box_tds.addItem("ID "+((Suelo)SueloConsultado).getNroSuelo()+" - "+((Suelo)SueloConsultado).getCaractersticasSuelo());
        }
        
        box_lote.removeAllItems();
        box_lote.setEnabled(false);
        box_nuevo_tds.setEnabled(false);
        txt_sup.setEditable(false);
        btn_actualizar_lote.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_campos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        box_tds = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        box_lote = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_sup = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        box_nuevo_tds = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_actualizar_lote = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();
        btn_buscar_lote = new javax.swing.JButton();
        txtC_S = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ACTUALIZAR UN LOTE");

        jLabel2.setText("Seleccionar Campo:");

        box_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Seleccionar Tipo de Suelo:");

        box_tds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Seleccionar Lote:");

        box_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("NUEVOS VALORES");

        txt_sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_supActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecionar nuevo Tipo de Suelo:");

        box_nuevo_tds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Ingresar nueva Superficie (en has):");

        btn_actualizar_lote.setText("ACTUALIZAR LOTE");
        btn_actualizar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_loteActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        btn_buscar_lote.setText("BUSCAR LOTE");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(box_nuevo_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btn_actualizar_lote))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtC_S)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btn_buscar_lote))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btn_buscar_lote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtC_S)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(box_nuevo_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_actualizar_lote)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_supActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_supActionPerformed

    private void btn_actualizar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_loteActionPerformed
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher1;
        Matcher matcher2;
        matcher1 = patronIdentificar.matcher((String) box_lote.getSelectedItem());
        matcher2 = patronIdentificar.matcher((String) box_nuevo_tds.getSelectedItem());
        if(matcher1.find() && matcher2.find()){
            Lote loteselec = ctrllote.consultarLote(Integer.parseInt(matcher1.group(1)));
            Suelo suelonuevo = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcher2.group(1)));
            try{
                Float suping = Float.parseFloat(txt_sup.getText());
                //PENDING control de errores ingreso sup y que sea mayor que cero
                if(suping>0){
                    int res = ctrllote.actualizarLote(loteselec.getNroLote(), suping, camposelec, suelonuevo);
                    if(res==1){
                        txtRes.setText("¡REGISTRADO EXITOSAMENTE!");
                    }else{
                        txtRes.setText("¡ERROR, vuelva a intentarlo!");
                    }
                }else{
                    txtRes.setText("Superficie ingresada no válida. Intente de nuevo.");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                txtRes.setText("Superficie ingresada no válida. Intente de nuevo.");
            }
        
        }else{
            System.out.println("Error box lotes");
        }
        
    }//GEN-LAST:event_btn_actualizar_loteActionPerformed

    private void btn_buscar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_loteActionPerformed
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = patronIdentificar.matcher((String) box_campos.getSelectedItem());
        if(matcher.find()){
            camposelec = ctrlcampo.consultarCampo(Integer.parseInt(matcher.group(1)));
            
            matcher = patronIdentificar.matcher((String) box_tds.getSelectedItem());
            if(matcher.find()){
                sueloselec = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcher.group(1)));
                
                List<Object[]> lote1list = ctrllote.obtenerLotesPorC_S(camposelec.getNroCampo(),sueloselec.getNroSuelo());
                if(lote1list.size()>0){
                    box_lote.setEnabled(true);
                    box_nuevo_tds.setEnabled(true);
                    txt_sup.setEditable(true);
                    for(Object[] L : lote1list){
                        box_lote.addItem("ID "+L[0]+" - SUP: "+L[1]);
                    }
                    
                    box_nuevo_tds.removeAllItems();
                    List<Object> suelolist = ctrlcultivo.consultar(new Suelo(),"");
                    for( Object SueloConsultado : suelolist){
                        box_nuevo_tds.addItem("ID "+((Suelo)SueloConsultado).getNroSuelo()+" - "+((Suelo)SueloConsultado).getCaractersticasSuelo());
                    }
                    
                    txtC_S.setText("¡Combinación válida!");
                    box_campos.setEnabled(false);
                    box_tds.setEnabled(false);
                    btn_buscar_lote.setEnabled(false);
                    btn_actualizar_lote.setVisible(true);
                }else{
                    txtC_S.setText("La combinación no posee lotes");
                }
                
            }else{
                System.out.println("Error box suelo");
            }
        }else{
            System.out.println("Error box campo");
        }
        
    }//GEN-LAST:event_btn_buscar_loteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campos;
    private javax.swing.JComboBox<String> box_lote;
    private javax.swing.JComboBox<String> box_nuevo_tds;
    private javax.swing.JComboBox<String> box_tds;
    private javax.swing.JButton btn_actualizar_lote;
    private javax.swing.JButton btn_buscar_lote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtC_S;
    private javax.swing.JLabel txtRes;
    private javax.swing.JTextField txt_sup;
    // End of variables declaration//GEN-END:variables
}
