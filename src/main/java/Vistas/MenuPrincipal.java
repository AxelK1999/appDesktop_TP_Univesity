package Vistas;

import Controladores.ControladorCampo;
import Controladores.ControladorCultivos;
import Controladores.ControladorLote;
import Controladores.ControladorProyectosLote;


public class MenuPrincipal extends javax.swing.JFrame {

 
	ControladorProyectosLote controladorProyectosLote;
	ControladorCampo controladorCampo;
	ControladorCultivos controladorCultivos;
	ControladorLote controladorLote;
    
	public MenuPrincipal(ControladorProyectosLote CP,ControladorCampo CC, ControladorCultivos CCultivos,ControladorLote controladorLote) {
        
		this.controladorProyectosLote = CP;
		this.controladorCampo = CC;
		this.controladorCultivos = CCultivos;
		this.controladorLote = controladorLote;
		
		initComponents();
        jPanelTdSyCam.setVisible(false);
        jPanelPro.setVisible(false);
        jPanelLot.setVisible(false);
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPro = new javax.swing.JButton();
        btnLot = new javax.swing.JButton();
        btnOpTdSyC = new javax.swing.JButton();
        jPanelTdSyCam = new javax.swing.JPanel();
        btnRegTdS = new javax.swing.JButton();
        btnRegCam = new javax.swing.JButton();
        btnActCam = new javax.swing.JButton();
        jPanelPro = new javax.swing.JPanel();
        btnIniPro = new javax.swing.JButton();
        btnCanPro = new javax.swing.JButton();
        btnRegInc = new javax.swing.JButton();
        btnFinLab = new javax.swing.JButton();
        btnLisPro = new javax.swing.JButton();
        jPanelLot = new javax.swing.JPanel();
        btnUniLot = new javax.swing.JButton();
        btnSepLot = new javax.swing.JButton();
        btnActLot = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Administración de Campos");

        jLabel2.setText("AGRO SRL");

        btnPro.setText("Opciones");
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });

        btnLot.setText("Opciones");
        btnLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotActionPerformed(evt);
            }
        });

        btnOpTdSyC.setText("Opciones");
        btnOpTdSyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpTdSyCActionPerformed(evt);
            }
        });

        btnRegTdS.setText("Registrar Tipo de Suelo");

        btnRegCam.setText("Registrar Campo");
        btnRegCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCamActionPerformed(evt);
            }
        });

        btnActCam.setText("Actualizar Campo");

        javax.swing.GroupLayout jPanelTdSyCamLayout = new javax.swing.GroupLayout(jPanelTdSyCam);
        jPanelTdSyCam.setLayout(jPanelTdSyCamLayout);
        jPanelTdSyCamLayout.setHorizontalGroup(
            jPanelTdSyCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTdSyCamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTdSyCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTdSyCamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegTdS))
                    .addGroup(jPanelTdSyCamLayout.createSequentialGroup()
                        .addGroup(jPanelTdSyCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActCam)
                            .addComponent(btnRegCam))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTdSyCamLayout.setVerticalGroup(
            jPanelTdSyCamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTdSyCamLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnRegTdS)
                .addGap(18, 18, 18)
                .addComponent(btnRegCam)
                .addGap(18, 18, 18)
                .addComponent(btnActCam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnIniPro.setText("Iniciar Proyecto");
        btnIniPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniProActionPerformed(evt);
            }
        });

        btnCanPro.setText("Cancelar Proyecto");

        btnRegInc.setText("Registrar Incidencia");

        btnFinLab.setText("Finalizar Laboreo");

        btnLisPro.setText("Listar Proyectos");

        javax.swing.GroupLayout jPanelProLayout = new javax.swing.GroupLayout(jPanelPro);
        jPanelPro.setLayout(jPanelProLayout);
        jPanelProLayout.setHorizontalGroup(
            jPanelProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniPro)
                    .addComponent(btnCanPro)
                    .addComponent(btnRegInc)
                    .addComponent(btnFinLab)
                    .addComponent(btnLisPro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProLayout.setVerticalGroup(
            jPanelProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnIniPro)
                .addGap(18, 18, 18)
                .addComponent(btnCanPro)
                .addGap(18, 18, 18)
                .addComponent(btnRegInc)
                .addGap(18, 18, 18)
                .addComponent(btnFinLab)
                .addGap(18, 18, 18)
                .addComponent(btnLisPro)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnUniLot.setText("Unir Lote");

        btnSepLot.setText("Separar Lote");

        btnActLot.setText("Actualizar Lote");

        jButton1.setText("Registrar Lote");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLotLayout = new javax.swing.GroupLayout(jPanelLot);
        jPanelLot.setLayout(jPanelLotLayout);
        jPanelLotLayout.setHorizontalGroup(
            jPanelLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLotLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActLot))
                    .addGroup(jPanelLotLayout.createSequentialGroup()
                        .addGroup(jPanelLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUniLot)
                            .addComponent(btnSepLot)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLotLayout.setVerticalGroup(
            jPanelLotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLotLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnUniLot)
                .addGap(18, 18, 18)
                .addComponent(btnSepLot)
                .addGap(18, 18, 18)
                .addComponent(btnActLot)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel3.setText("¿Qué desea administrar?");

        jLabel4.setText("Tipos de Suelos");

        jLabel5.setText("y Campos");

        jLabel6.setText("Proyectos");

        jLabel7.setText("Lotes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnOpTdSyC))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPro)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(44, 44, 44))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelTdSyCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jPanelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLot)
                                .addGap(16, 16, 16)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPro)
                    .addComponent(btnLot)
                    .addComponent(btnOpTdSyC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanelPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelTdSyCam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        pack();
    }

    private void btnOpTdSyCActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelTdSyCam.setVisible(true);
        jPanelPro.setVisible(false);
        jPanelLot.setVisible(false);
    }

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {
        jPanelTdSyCam.setVisible(false);
        jPanelPro.setVisible(true);
        jPanelLot.setVisible(false);
    }//GEN-LAST:event_btnProActionPerformed

    private void btnLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotActionPerformed
        jPanelTdSyCam.setVisible(false);
        jPanelPro.setVisible(false);
        jPanelLot.setVisible(true);
    }//GEN-LAST:event_btnLotActionPerformed

    private void btnRegCamActionPerformed(java.awt.event.ActionEvent evt) {
        //new MenuRegistrarCampo(controladorCampo,controladorLote).setVisible(true);
        dispose();
        
    }

    private void btnIniProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniProActionPerformed
        new MenuIniciarProyecto(controladorProyectosLote).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnIniProActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuRegistrarLote(controladorLote).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /*
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActCam;
    private javax.swing.JButton btnActLot;
    private javax.swing.JButton btnCanPro;
    private javax.swing.JButton btnFinLab;
    private javax.swing.JButton btnIniPro;
    private javax.swing.JButton btnLisPro;
    private javax.swing.JButton btnLot;
    private javax.swing.JButton btnOpTdSyC;
    private javax.swing.JButton btnPro;
    private javax.swing.JButton btnRegCam;
    private javax.swing.JButton btnRegInc;
    private javax.swing.JButton btnRegTdS;
    private javax.swing.JButton btnSepLot;
    private javax.swing.JButton btnUniLot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelLot;
    private javax.swing.JPanel jPanelPro;
    private javax.swing.JPanel jPanelTdSyCam;
    // End of variables declaration//GEN-END:variables
}