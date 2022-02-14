package Vistas;

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;

public class MenuRegistrarCampo extends javax.swing.JFrame {

	ControladorCampo controladorCampo;
	ControladorLote controladorLote;
	
    public MenuRegistrarCampo(ControladorCampo controladorCampo, ControladorLote controladorLote) {
        this.controladorCampo = controladorCampo;
        this.controladorLote = controladorLote; 
    	initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDirCam = new javax.swing.JTextField(10);
        btnRegCam = new javax.swing.JButton();
        txtRet = new javax.swing.JLabel();
        btnVol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRA NUEVO CAMPO");

        jLabel2.setText("DirecciÃ³n del Campo");

        txtDirCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirCamActionPerformed(evt);
            }
        });

        btnRegCam.setText("REGISTRAR");
        btnRegCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCamActionPerformed(evt);
            }
        });

        btnVol.setText("VOLVER");
        btnVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(txtRet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDirCam, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnVol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegCam)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDirCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegCam)
                    .addComponent(btnVol))
                .addGap(34, 34, 34)
                .addComponent(txtRet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtDirCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirCamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirCamActionPerformed

    private void btnRegCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCamActionPerformed
        String dirCam;
        //float supLot;
       // int numSue;
        
        dirCam = txtDirCam.getText();
      
        //TODO
        if(controladorCampo.agregarCampo(dirCam,1) == 1){  //1--> clave de estado Inicial
            txtRet.setText("Operación Exitosa");
        }else{
            txtRet.setText("Operación Fallida. Reintente por favor.");
        }
    }//GEN-LAST:event_btnRegCamActionPerformed

    private void btnVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolActionPerformed
        new MenuPrincipal(new ControladorProyectosLote(), controladorCampo, new ControladorCultivos(), controladorLote).setVisible(true);
        dispose();
   
    }//GEN-LAST:event_btnVolActionPerformed

    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistrarCampo().setVisible(true);
            }
        });
    }
    */

    private javax.swing.JButton btnRegCam;
    private javax.swing.JButton btnVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDirCam;
    private javax.swing.JLabel txtRet;

  
}