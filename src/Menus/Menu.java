
package Menus;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        InsertarUsuario = new javax.swing.JMenu();
        InsertarProducto = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Punto_Venta");
        jMenu1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        jMenu5.setText("jMenu5");
        jMenu1.add(jMenu5);

        jMenu15.setText("jMenu15");
        jMenu1.add(jMenu15);

        jMenu16.setText("jMenu16");
        jMenu1.add(jMenu16);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Insertar");
        jMenu2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        InsertarUsuario.setText("Usuario");
        jMenu2.add(InsertarUsuario);

        InsertarProducto.setText("Producto");
        jMenu2.add(InsertarProducto);

        jMenu8.setText("jMenu8");
        jMenu2.add(jMenu8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Actualizar");
        jMenu3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        jMenu9.setText("jMenu9");
        jMenu3.add(jMenu9);

        jMenu10.setText("jMenu10");
        jMenu3.add(jMenu10);

        jMenu11.setText("jMenu11");
        jMenu3.add(jMenu11);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Eliminar");
        jMenu4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        jMenu12.setText("jMenu12");
        jMenu4.add(jMenu12);

        jMenu13.setText("jMenu13");
        jMenu4.add(jMenu13);

        jMenu14.setText("jMenu14");
        jMenu4.add(jMenu14);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu InsertarProducto;
    private javax.swing.JMenu InsertarUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
