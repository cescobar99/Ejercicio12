
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ejercicio12 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio12
     */
    public Ejercicio12() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        txtNumeroPeli = new javax.swing.JTextField();
        txtNumeroDias = new javax.swing.JTextField();
        txtMontoTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Video Tienda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 11, 110, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Numero De Dias De Alquiler");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("MontoTotal");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 255, 0));
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 255, 0));
        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        txtNumeroPeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroPeliKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        txtNumeroDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDiasKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 160, -1));

        txtMontoTotal.setEditable(false);
        txtMontoTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("Numero De Peliculas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
    String MontoT;
    int NumeroPeli, NumeroDias;
    double op1, op2=0;
    if(txtNumeroPeli.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite el numero de peliculas", "Error", JOptionPane.ERROR_MESSAGE);
    txtNumeroPeli.requestFocusInWindow();
    }
    else if(txtNumeroDias.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite el numero de dias a alquilae", "Error", JOptionPane.ERROR_MESSAGE);
    txtNumeroDias.requestFocusInWindow();
    }
    else {
    NumeroPeli= Integer.parseInt(txtNumeroPeli.getText());
    NumeroDias= Integer.parseInt(txtNumeroDias.getText());
    op1= NumeroPeli-1;
    op2= ((op1*1500)*NumeroDias);
    }
    MontoT= String.valueOf(op2);
    txtMontoTotal.setText(MontoT);
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtNumeroDias.setText("");
    txtNumeroPeli.setText("");
    txtMontoTotal.setText("");
    
    txtNumeroPeli.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeroPeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPeliKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtNumeroPeliKeyTyped

    private void txtNumeroDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDiasKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtNumeroDiasKeyTyped

    private void txtMontoTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTotalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoTotalKeyReleased

    private void txtMontoTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoTotalKeyTyped
   char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtMontoTotalKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNumeroDias;
    private javax.swing.JTextField txtNumeroPeli;
    // End of variables declaration//GEN-END:variables
}
