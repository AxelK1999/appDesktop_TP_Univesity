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

public class IF_separar_lotes extends javax.swing.JPanel {

    ControladorLote ctrllote = new ControladorLote();
    ControladorCampo ctrlcampo = new ControladorCampo();
    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    Campo camposelec = new Campo();
    Suelo sueloselec = new Suelo();
    
    public IF_separar_lotes() {
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
        
        box_lote.removeAllItems();
        box_lote.setEnabled(false);
        txt_sup.setEditable(false);
        
        btn_separar_lotes.setVisible(false);
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
        box_lote = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_sup = new javax.swing.JTextField();
        btn_separar_lotes = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();
        btn_bucar_lote = new javax.swing.JButton();
        txtC_S = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SEPARAR UN LOTE");

        jLabel2.setText("Seleccionar Campo:");

        box_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Seleccionar Tipo de Suelo:");

        box_tds.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Seleccionar Lote:");

        box_lote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Ingresar Superficie del nuevo Lote (en has):");

        btn_separar_lotes.setText("SEPARAR LOTE");
        btn_separar_lotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_separar_lotesActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        btn_bucar_lote.setText("BUSCAR LOTE");
        btn_bucar_lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bucar_loteActionPerformed(evt);
            }
        });

        txtC_S.setText("Seleccione Campo-Suelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtRes)
                                .addGap(137, 137, 137))
                            .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_separar_lotes)
                            .addGap(81, 81, 81)))
                    .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_bucar_lote)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtC_S)
                            .addComponent(jLabel1))
                        .addGap(168, 168, 168))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(box_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(box_tds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btn_bucar_lote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtC_S)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(box_lote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(txt_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_separar_lotes)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bucar_loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bucar_loteActionPerformed
        
        Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcherC;
        matcherC = patronIdentificar.matcher((String) box_campos.getSelectedItem());
        if(matcherC.find()){
            camposelec = ctrlcampo.consultarCampo(Integer.parseInt(matcherC.group(1)));
            Matcher matcherS;
            matcherS = patronIdentificar.matcher((String) box_tds.getSelectedItem());
            if(matcherS.find()){
                sueloselec = ctrlcultivo.consultarTipoSuelo(Integer.parseInt(matcherS.group(1)));
                
                List<Object[]> lote1list = ctrllote.consultaNativa("select * from lote where fk_nro_campo = "+ Integer.parseInt(matcherC.group(1)) +" and fk_nro_suelo = " + Integer.parseInt(matcherS.group(1)));
                if(lote1list.size()>0){
                    
                    box_lote.removeAllItems();
                    for(Object[] L : lote1list){
                        box_lote.addItem("ID "+L[0]+" - SUP: "+L[1]);
                    }
                    txtC_S.setText("¡Combinación válida!");
                    box_campos.setEnabled(false);
                    box_tds.setEnabled(false);
                    box_lote.setEnabled(true);
                    txt_sup.setEditable(true);
                    btn_separar_lotes.setVisible(true);
                    
                }else{
                    txtC_S.setText("La combinación no posee lotes");
                }
                
            }else{
                System.out.println("Error box suelo");
            }
        }else{
            System.out.println("Error box campo");
        }
    }//GEN-LAST:event_btn_bucar_loteActionPerformed

    private void btn_separar_lotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_separar_lotesActionPerformed
        
        if(Integer.parseInt(txt_sup.getText())>0){
            //PENDING capturar posible mal ingreso por teclado
            System.out.println(txt_sup.getText());
            Pattern patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
            Matcher matcher = patronIdentificar.matcher((String) box_lote.getSelectedItem());
            if(matcher.find()){
                Lote loteA = ctrllote.consultarLote(Integer.parseInt(matcher.group(1)));
                if(Float.parseFloat(txt_sup.getText())<loteA.getSuperficie()){
                    
                    Lote loteN = new Lote();
                    loteN.setSuperficie(Float.parseFloat(txt_sup.getText()));
                    loteA.setSuperficie(loteA.getSuperficie()-Float.parseFloat(txt_sup.getText()));
                    ctrllote.agregarLote(loteN.getSuperficie(), camposelec.getNroCampo(), sueloselec.getNroSuelo());
                    ctrllote.actualizarLote(loteA.getNroLote(), loteA.getSuperficie(), camposelec, sueloselec);
                    
                    txtRes.setText("¡SEPARCIÓN EXITOSA!");
                }else{
                    txtRes.setText("Superficie ingresada muy grande");
                }
            }else{
                System.out.println("Error box lotes");
            }
        }else{
            txtRes.setText("Superficie ingresada no válida");
        }
    }//GEN-LAST:event_btn_separar_lotesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_campos;
    private javax.swing.JComboBox<String> box_lote;
    private javax.swing.JComboBox<String> box_tds;
    private javax.swing.JButton btn_bucar_lote;
    private javax.swing.JButton btn_separar_lotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtC_S;
    private javax.swing.JLabel txtRes;
    private javax.swing.JTextField txt_sup;
    // End of variables declaration//GEN-END:variables
}
