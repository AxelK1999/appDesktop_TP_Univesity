package Vistas;

import Controladores.ControladorCampo;
import java.util.*;
import Modelos.Campo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IF_actualizar_campo extends javax.swing.JPanel {
    
    ControladorCampo ctrlcampo = new ControladorCampo();
    
    public IF_actualizar_campo() {
        initComponents();
        
        jComboBoxSelectCampo.removeAllItems();
        List<Object> camposlist = ctrlcampo.obtenerCampos();
        for( Object CampoConsultado : camposlist){
            jComboBoxSelectCampo.addItem("ID "+((Campo)CampoConsultado).getNroCampo()+" - "+((Campo)CampoConsultado).getDireccion()+" Est "+((Campo)CampoConsultado).getEstado().getIdEstado());
        }
        
        /*
        ControladorCampo CC = new ControladorCampo();
	List campoList = CC.consultar(" ");
	
        if(campoList != null){				
            Iterator it = campoList.iterator();
            while(it.hasNext()){
                Campo campo = (Campo)it.next();
                System.out.print(campo.getDireccion()+"\n");
            }		
        }else
            System.out.print("lista vacia");
        */
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxSelectCampo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDireccionCampo = new javax.swing.JTextField();
        btnActualzarCampo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Seleccione el Campo");

        jComboBoxSelectCampo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSelectCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectCampoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Ingrese la nueva direccion");

        jTextFieldDireccionCampo.setText(" ");
        jTextFieldDireccionCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionCampoActionPerformed(evt);
            }
        });

        btnActualzarCampo.setText("Actualizar");
        btnActualzarCampo.setToolTipText("");
        btnActualzarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualzarCampoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Actualizar Direccion del Campo");

        txtRes.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldDireccionCampo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxSelectCampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(btnActualzarCampo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(txtRes)))
                .addGap(234, 234, 234))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jComboBoxSelectCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDireccionCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualzarCampo)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDireccionCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionCampoActionPerformed
    
    private void jComboBoxSelectCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectCampoActionPerformed
        
    }//GEN-LAST:event_jComboBoxSelectCampoActionPerformed

    private void btnActualzarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualzarCampoActionPerformed
        //System.out.println((String)jComboBoxSelectCampo.getSelectedItem());
        Pattern patronIdentificar = Pattern.compile("Est ([0-9]+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = patronIdentificar.matcher((String)jComboBoxSelectCampo.getSelectedItem());
        if(matcher.find()){
            int nro_estado = Integer.parseInt(matcher.group(1));
            System.out.println(nro_estado);
            patronIdentificar = Pattern.compile("ID ([0-9]+)",Pattern.CASE_INSENSITIVE);
            matcher = patronIdentificar.matcher((String)jComboBoxSelectCampo.getSelectedItem());
            if(matcher.find()){
                int id_campo = Integer.parseInt(matcher.group(1));
                System.out.println(id_campo);
                int res = ctrlcampo.actualizarCampo(id_campo,jTextFieldDireccionCampo.getText(),nro_estado);
                if(res==1){
                    txtRes.setText("¡Actualización Exitosa!");
                }
                // PENDING Controlar el correcto ingreso de la nueva direccion
            }else{
                System.out.println("No anda tu ID");
            }
        }else{
            System.out.println("No anda tu Est");
        }
    }//GEN-LAST:event_btnActualzarCampoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualzarCampo;
    private javax.swing.JComboBox<String> jComboBoxSelectCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldDireccionCampo;
    private javax.swing.JLabel txtRes;
    // End of variables declaration//GEN-END:variables
}
