package Vistas;

import Controladores.*;
import Modelos.Campo;
import Modelos.Suelo;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IF_registrar_lote extends javax.swing.JPanel {

    ControladorLote ctrllote = new ControladorLote();
    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    
    public IF_registrar_lote() {
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_campos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        box_tds = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_sup = new javax.swing.JTextField();
        btn_cargar_lote = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRAR UN NUEVO LOTE");
        jLabel1.setAlignmentY(0.0F);

        jLabel2.setText("Seleccione el Campo:");

        box_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_camposActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione el Tipo de Suelo:");

        box_tds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Ingrese la superficie del lote (en has):");

        btn_cargar_lote.setText("REGISTRAR");
        btn_cargar_lote.setAlignmentY(0.0F);
        btn_cargar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargar_loteActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(box_tds, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cargar_lote)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtRes)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_cargar_lote)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void box_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_camposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_camposActionPerformed

    private void btn_cargar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargar_loteActionPerformed
        //String c = (String) box_campos.getSelectedItem();
        //String s = (String) box_tds.getSelectedItem();
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = patronIdentificar.matcher((String) box_campos.getSelectedItem());
        if(matcher.find()){
            Campo camposelec = ctrlcampo.consultarCampo(Integer.parseInt(matcher.group(1)));
            
            matcher = patronIdentificar.matcher((String) box_tds.getSelectedItem());
            if(matcher.find()){
                Suelo sueloselec = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcher.group(1)));
                
                try{
                    //float suping = Float.parseFloat(txt_sup.getText());
                    //System.out.println(suping);
                    //PENDING control de errores ingreso sup y que sea mayor que cero
                    
                    int res = ctrllote.agregarLote(Float.parseFloat(txt_sup.getText()), camposelec.getNroCampo(), sueloselec.getNroSuelo());
                    if(res==1){
                        txtRes.setText("¡REGISTRADO EXITOSAMENTE!");
                    }else{
                        txtRes.setText("¡ERROR, vuelva a intentarlo!");
                    }
                    
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    txtRes.setText("Superficie ingresada no válida. Intente de nuevo.");
                }
                     
            }else{
                System.out.println("Error matcher suelo");
            }
            
        }else{
            System.out.println("Error matcher campo");
        }
    }//GEN-LAST:event_btn_cargar_loteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campos;
    private javax.swing.JComboBox<String> box_tds;
    private javax.swing.JButton btn_cargar_lote;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtRes;
    private javax.swing.JTextField txt_sup;
    // End of variables declaration//GEN-END:variables
}
