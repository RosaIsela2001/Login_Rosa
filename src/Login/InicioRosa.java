
package Login;

import Menus.Menu;

public class InicioRosa extends javax.swing.JFrame {

    String nombre="Rosa",clave="123";
    
    
    public InicioRosa() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextNombre = new javax.swing.JTextField();
        TextClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 210, 60));
        getContentPane().add(TextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 210, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("NOMBRE: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 150, 50));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("CONTRASEÑA: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 200, -1));

        jButton1.setText("SALIR");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Sesion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 230, 190));

        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Ingresar.png"))); // NOI18N
        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 130, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Palmeras.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreActionPerformed

    
    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
       Menu ventana = new Menu();
        
        if(TextNombre.getText().equals(nombre) && TextClave.getText().equals(clave)){
        ventana.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_BotonIngresarMouseClicked

    
    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(InicioRosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioRosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioRosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioRosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioRosa().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonIngresar;
    private javax.swing.JTextField TextClave;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
