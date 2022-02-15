package Vistas_borrar;

import Controladores.*;


public class MenuIniciarProyecto extends javax.swing.JFrame {

	ControladorProyectosLote controladorProyectos;
    
	public MenuIniciarProyecto(ControladorProyectosLote controladorProyectosLote) {
        this.controladorProyectos=controladorProyectosLote;
		initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumLot = new javax.swing.JTextField(7);
        jLabel3 = new javax.swing.JLabel();
        txtNumCul = new javax.swing.JTextField(7);
        btnIniPro = new javax.swing.JButton();
        txtRet = new javax.swing.JLabel();
        btnVol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INICIAR NUEVO PROYECTO");

        jLabel2.setText("N�mero de Lote");

        jLabel3.setText("N�mero del Cultivo");

        btnIniPro.setText("INICIAR");
        btnIniPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniProActionPerformed(evt);
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
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumCul)
                    .addComponent(txtNumLot))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnVol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniPro)
                    .addComponent(txtRet))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumCul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniPro)
                    .addComponent(btnVol))
                .addGap(18, 18, 18)
                .addComponent(txtRet)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnIniProActionPerformed(java.awt.event.ActionEvent evt) {
        int numLot,numCul,ret=1;
        
        numLot = Integer.parseInt(txtNumLot.getText());
        numCul = Integer.parseInt(txtNumCul.getText());
        
        controladorProyectos.agregarProyecto("Inicial", numLot, numCul);
        //pasar par�metros al controlador
        
        if(ret == 1){
            txtRet.setText("Operaci�n Exitosa");
        }else{
            txtRet.setText("Operaci�n Fallida. Reintente por favor.");
        }
    }//GEN-LAST:event_btnIniProActionPerformed

    private void btnVolActionPerformed(java.awt.event.ActionEvent evt) {
        new MenuPrincipal_borrar(controladorProyectos,new ControladorCampo(),new ControladorCultivos(),new ControladorLote()).setVisible(true);
        dispose();
        
    }

    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIniciarProyecto().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniPro;
    private javax.swing.JButton btnVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNumCul;
    private javax.swing.JTextField txtNumLot;
    private javax.swing.JLabel txtRet;
    // End of variables declaration//GEN-END:variables
}