package Vistas;

import Controladores.ControladorCultivos;

public class IF_registrar_tds extends javax.swing.JPanel {

    ControladorCultivos ctrlcultivo = new ControladorCultivos();
    
    public IF_registrar_tds() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaCaracteristicas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtRes = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRAR TIPO DE SUELO");

        jLabel2.setText("Ingresar características del nuevo Tipo de Suelo:");

        txtareaCaracteristicas.setColumns(20);
        txtareaCaracteristicas.setLineWrap(true);
        txtareaCaracteristicas.setRows(5);
        txtareaCaracteristicas.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtareaCaracteristicas);

        jButton1.setText("REGISTRAR TIPO DE SUELO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtRes.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(txtRes)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(txtRes)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res = ctrlcultivo.agregarTipoSuelo(txtareaCaracteristicas.getText());
        if(res==1){
            txtRes.setText("¡Registro Exitoso!");
        }else if(res==-4){
            txtRes.setText("¡Error: Característica ingresada nula!");
        }else if(res==-10){
            txtRes.setText("¡Error: Característica ingresada ya existente!");
        }else if(res==-11){
            txtRes.setText("¡Error: Característica ingresada muy larga!");
        }else{
            txtRes.setText("¡Error: Coding!");
            System.out.print("wep");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtRes;
    private javax.swing.JTextArea txtareaCaracteristicas;
    // End of variables declaration//GEN-END:variables
}
