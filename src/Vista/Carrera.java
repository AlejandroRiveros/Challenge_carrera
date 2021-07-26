/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.carrera;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class Carrera extends javax.swing.JFrame {

    /**
     * Creates new form Carrera
     */
    public Carrera() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Circuito Moto GP");
    }

    public JLabel getcorredor1() {
        return jLabel_corredor1;
    }
    
    public JLabel getcorredor2(){
        return jLabel_corredor2;
    }
    
    public JLabel getcorredor3(){
        return jLabel_corredor3;
    }
    
    public JLabel getmeta(){
        return jLabel_meta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_meta = new javax.swing.JLabel();
        jButton_iniciar_carrera = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel_corredor2 = new javax.swing.JLabel();
        jLabel_corredor3 = new javax.swing.JLabel();
        jLabel_corredor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_meta.setBackground(new java.awt.Color(240, 0, 0));
        jLabel_meta.setOpaque(true);
        getContentPane().add(jLabel_meta, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 0, 20, 350));

        jButton_iniciar_carrera.setText("Iniciar carrera");
        jButton_iniciar_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_iniciar_carreraActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_iniciar_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel_corredor2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corredor_2.jpg"))); // NOI18N

        jLabel_corredor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corredor_3.jpg"))); // NOI18N

        jLabel_corredor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corredor_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel_corredor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_corredor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel_corredor1))
                .addGap(0, 546, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel_corredor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel_corredor2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_corredor3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_iniciar_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_iniciar_carreraActionPerformed
        
        
        jLabel_corredor1.setLocation(0, jLabel_corredor1.getLocation().y);
        jLabel_corredor2.setLocation(0, jLabel_corredor2.getLocation().y);
        jLabel_corredor3.setLocation(0, jLabel_corredor3.getLocation().y);

        carrera corredor1 = new carrera(jLabel_corredor1,this);
        carrera corredor2 = new carrera(jLabel_corredor2, this);
        carrera corredor3= new carrera(jLabel_corredor3, this);
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
    }//GEN-LAST:event_jButton_iniciar_carreraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_iniciar_carrera;
    private javax.swing.JLabel jLabel_corredor1;
    private javax.swing.JLabel jLabel_corredor2;
    private javax.swing.JLabel jLabel_corredor3;
    private javax.swing.JLabel jLabel_meta;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
