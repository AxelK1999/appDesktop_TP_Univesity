package Vistas_borrar;

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;
import Modelos.Campo;
import Modelos.Suelo;

public class MenuRegistrarLote extends javax.swing.JFrame {

  
	ControladorLote controladorLote;
	
    public MenuRegistrarLote(ControladorLote controladorLote) {
        this.controladorLote = controladorLote;
    	initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSupLot = new javax.swing.JTextField(10);
        txtNumCam = new javax.swing.JTextField(10);
        txtNumSue = new javax.swing.JTextField(10);
        btnRegLot = new javax.swing.JButton();
        txtRet = new javax.swing.JLabel();
        btnVol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRAR NUEVO LOTE");

        jLabel2.setText("Superficie del Lote");

        jLabel3.setText("N�mero de Campo");

        jLabel4.setText("N�mero de Suelo");

        btnRegLot.setText("REGISTRAR");
        btnRegLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLotActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(txtRet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupLot)
                            .addComponent(txtNumCam, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtNumSue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnVol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegLot)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSupLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumSue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegLot)
                    .addComponent(btnVol))
                .addGap(18, 18, 18)
                .addComponent(txtRet)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnRegLotActionPerformed(java.awt.event.ActionEvent evt) {
        float supLot;
        int numCam, numSue;
        
        supLot = Float.parseFloat(txtSupLot.getText());
        numCam = Integer.parseInt(txtNumCam.getText());
        numSue = Integer.parseInt(txtNumSue.getText());
  
        if( controladorLote.agregarLote(supLot,numCam ,numSue) == 1){
            txtRet.setText("Operaci�n Exitosa");
        }else{
            txtRet.setText("Operaci�n Fallida. Reintente por favor.");
        }
    }//GEN-LAST:event_btnRegLotActionPerformed

    private void btnVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolActionPerformed
        new MenuPrincipal_borrar(new ControladorProyectosLote(),new ControladorCampo() ,new ControladorCultivos(),controladorLote).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnVolActionPerformed

    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistrarLote().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegLot;
    private javax.swing.JButton btnVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNumCam;
    private javax.swing.JTextField txtNumSue;
    private javax.swing.JLabel txtRet;
    private javax.swing.JTextField txtSupLot;
    // End of variables declaration//GEN-END:variables
}