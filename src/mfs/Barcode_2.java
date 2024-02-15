/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mfs;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author 102976781
 */
public class Barcode_2 extends javax.swing.JFrame {

    /**
     *
     */
    String npescaneado, npingresado;

    
    public Barcode_2 () {
        //this.npescaneado = npscan.getText();
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

        npscan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LogPart = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Sustituto = new javax.swing.JButton();
        Country = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        npfinal = new javax.swing.JLabel();
        ecfinal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        secfinal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        npscan.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        npscan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npscanActionPerformed(evt);
            }
        });
        npscan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npscanKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Part Number:");

        LogPart.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LogPart.setText("F2 = Log Part");
        LogPart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogPartActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Cancel.setText("Esc = Cancel");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Sustituto.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Sustituto.setText("F4 = Sustitute");
        Sustituto.setEnabled(false);

        Country.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Country.setText("F6 = Country");
        Country.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Scan in Barcode...");

        npfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        ecfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Sequence Number");

        secfinal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Ec Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(npscan, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogPart)
                            .addComponent(Sustituto))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ecfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(npscan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(npfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ecfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LogPart)
                            .addComponent(Cancel))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Country)
                            .addComponent(Sustituto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npscanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npscanActionPerformed
 
    }//GEN-LAST:event_npscanActionPerformed

    private void npscanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npscanKeyTyped
        char enter = evt.getKeyChar();
        if (enter == KeyEvent.VK_ENTER){
            this.npescaneado = npscan.getText();
            if (npescaneado.startsWith("p") | npescaneado.startsWith("P")){
                if (npescaneado.length() == 8){    
                npfinal.setText("00000" + npescaneado.substring(1).toUpperCase());
                npingresado = npescaneado.substring(1);
                npscan.setText("");
            }else{
            JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
            npscan.setText("");
            }
            } else if (npescaneado.startsWith("11s") | npescaneado.startsWith("11S")){
                if (npescaneado.length() == 22){    
                npfinal.setText("00000" + npescaneado.substring(3, 10).toUpperCase());
                if (npescaneado.substring(3, 10).toUpperCase().equals("01KL468")){
                ecfinal.setText("10000P45486");
                }
                secfinal.setText(npescaneado.substring(10).toUpperCase());
                npingresado = npescaneado.substring(3, 10);
                npscan.setText("");
            } else{
                    JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
                    npscan.setText("");
                }
            }else{
            JOptionPane.showMessageDialog(null, "INVALID BARCODE - no matching rule");   
            npscan.setText("");
            }
        } else if (enter == KeyEvent.VK_ESCAPE){
            CancelActionPerformed(null);
        }
    }//GEN-LAST:event_npscanKeyTyped

    private void LogPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogPartActionPerformed
        if (all.opcempty.empty == true){
            if (this.npingresado.toUpperCase().equals(all.empty.npaescanear.getText())){
                all.empty.npaescanear.setText("000" + npingresado.toUpperCase());
                all.empty.idsp.setText("I");
                all.empty.npecaneado.setText("000" + npingresado.toUpperCase());
                all.empty.cantidadfinal.setText(all.empty.cantidadrequerida.getText());
                all.empty.serial.setText(npescaneado.substring(10).toUpperCase());
                all.empty.NPS.setBackground(Color.BLUE);
                all.empty.npaescanear.setForeground(Color.WHITE);
                all.empty.QT.setForeground(Color.WHITE);
                all.empty.cantidadrequerida.setForeground(Color.WHITE);
                all.empty.FQT.setForeground(Color.WHITE);
                all.empty.cantidadfinal.setForeground(Color.WHITE);
                all.empty.DISP.setForeground(Color.WHITE);
                all.empty.idsp.setForeground(Color.WHITE);
                all.empty.descripcion.setForeground(Color.WHITE);
                all.empty.npecaneado.setForeground(Color.WHITE);
                all.empty.serial.setForeground(Color.WHITE);
                npfinal.setText("");
                ecfinal.setText("");
                secfinal.setText("");
                npscan.requestFocus();
                this.setVisible(false);
            } else if(this.npingresado.toUpperCase().equals(all.empty.npaescanear.getText().substring(3))){
                all.empty.npaescanear.setText("000" + npingresado.toUpperCase());
                all.empty.idsp.setText("I");
                all.empty.npecaneado.setText("000" + npingresado.toUpperCase());
                all.empty.cantidadfinal.setText(all.empty.cantidadrequerida.getText());
                all.empty.serial.setText(npescaneado.substring(10).toUpperCase());
                all.empty.NPS.setBackground(Color.BLUE);
                all.empty.npaescanear.setForeground(Color.WHITE);
                all.empty.QT.setForeground(Color.WHITE);
                all.empty.cantidadrequerida.setForeground(Color.WHITE);
                all.empty.FQT.setForeground(Color.WHITE);
                all.empty.cantidadfinal.setForeground(Color.WHITE);
                all.empty.DISP.setForeground(Color.WHITE);
                all.empty.idsp.setForeground(Color.WHITE);
                all.empty.descripcion.setForeground(Color.WHITE);
                all.empty.npecaneado.setForeground(Color.WHITE);
                all.empty.serial.setForeground(Color.WHITE);
                npfinal.setText("");
                ecfinal.setText("");
                secfinal.setText("");
                npscan.requestFocus();
                this.setVisible(false);
            }else if (this.npingresado.toUpperCase().equals(all.empty.npaescanear.getText().substring(3)) && this.secfinal.getText().equals(all.empty.serial.getText()) && all.empty.idsp.getText().equals("R")){
                all.empty.npaescanear.setText(npingresado.toUpperCase());
                all.empty.idsp.setText("D");
                all.empty.npecaneado.setText("000" + npingresado.toUpperCase());
                all.empty.cantidadfinal.setText(all.empty.cantidadrequerida.getText());
                all.empty.serial.setText(npescaneado.substring(10).toUpperCase());
                all.empty.NPS.setBackground(Color.YELLOW);
                all.empty.npaescanear.setForeground(Color.BLACK);
                all.empty.QT.setForeground(Color.BLACK);
                all.empty.cantidadrequerida.setForeground(Color.BLACK);
                all.empty.FQT.setForeground(Color.BLACK);
                all.empty.cantidadfinal.setForeground(Color.BLACK);
                all.empty.DISP.setForeground(Color.BLACK);
                all.empty.idsp.setForeground(Color.BLACK);
                all.empty.descripcion.setForeground(Color.BLACK);
                all.empty.npecaneado.setForeground(Color.BLACK);
                all.empty.serial.setForeground(Color.BLACK);
                npfinal.setText("");
                ecfinal.setText("");
                secfinal.setText("");
                npscan.requestFocus();
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "FC15 ");
        }
        } else if (all.opcempty.empty231 == true){
            if (this.npingresado.toUpperCase().equals(all.empty_231.npaescanear.getText())){
            all.empty_231.npaescanear.setText("000" + npingresado.toUpperCase());
            all.empty_231.idsp.setText("I");
            all.empty_231.npecaneado.setText("000" + npingresado.toUpperCase());
            all.empty_231.cantidadfinal.setText(all.empty_231.cantidadrequerida.getText());
            all.empty_231.serial.setText(npescaneado.substring(10).toUpperCase());
            all.empty_231.NPS.setBackground(Color.BLUE);
            all.empty_231.npaescanear.setForeground(Color.WHITE);
            all.empty_231.QT.setForeground(Color.WHITE);
            all.empty_231.cantidadrequerida.setForeground(Color.WHITE);
            all.empty_231.FQT.setForeground(Color.WHITE);
            all.empty_231.cantidadfinal.setForeground(Color.WHITE);
            all.empty_231.DISP.setForeground(Color.WHITE);
            all.empty_231.idsp.setForeground(Color.WHITE);
            all.empty_231.descripcion.setForeground(Color.WHITE);
            all.empty_231.npecaneado.setForeground(Color.WHITE);
            all.empty_231.serial.setForeground(Color.WHITE);
            npfinal.setText("");
            ecfinal.setText("");
            secfinal.setText("");
            npscan.requestFocus();
            this.setVisible(false);
        } else if(this.npingresado.toUpperCase().equals(all.empty_231.npaescanear.getText().substring(3))){
            all.empty_231.npaescanear.setText("000" + npingresado.toUpperCase());
            all.empty_231.idsp.setText("I");
            all.empty_231.npecaneado.setText("000" + npingresado.toUpperCase());
            all.empty_231.cantidadfinal.setText(all.empty_231.cantidadrequerida.getText());
            all.empty_231.serial.setText(npescaneado.substring(10).toUpperCase());
            all.empty_231.NPS.setBackground(Color.BLUE);
            all.empty_231.npaescanear.setForeground(Color.WHITE);
            all.empty_231.QT.setForeground(Color.WHITE);
            all.empty_231.cantidadrequerida.setForeground(Color.WHITE);
            all.empty_231.FQT.setForeground(Color.WHITE);
            all.empty_231.cantidadfinal.setForeground(Color.WHITE);
            all.empty_231.DISP.setForeground(Color.WHITE);
            all.empty_231.idsp.setForeground(Color.WHITE);
            all.empty_231.descripcion.setForeground(Color.WHITE);
            all.empty_231.npecaneado.setForeground(Color.WHITE);
            all.empty_231.serial.setForeground(Color.WHITE);
            npfinal.setText("");
            ecfinal.setText("");
            secfinal.setText("");
            npscan.requestFocus();
            this.setVisible(false);
        }else if (this.npingresado.toUpperCase().equals(all.empty_231.npaescanear.getText().substring(3)) && this.secfinal.getText().equals(all.empty_231.serial.getText()) && all.empty_231.idsp.getText().equals("R")){
            all.empty_231.npaescanear.setText(npingresado.toUpperCase());
            all.empty_231.idsp.setText("D");
            all.empty_231.npecaneado.setText("000" + npingresado.toUpperCase());
            all.empty_231.cantidadfinal.setText(all.empty_231.cantidadrequerida.getText());
            all.empty_231.serial.setText(npescaneado.substring(10).toUpperCase());
            all.empty_231.NPS.setBackground(Color.YELLOW);
            all.empty_231.npaescanear.setForeground(Color.BLACK);
            all.empty_231.QT.setForeground(Color.BLACK);
            all.empty_231.cantidadrequerida.setForeground(Color.BLACK);
            all.empty_231.FQT.setForeground(Color.BLACK);
            all.empty_231.cantidadfinal.setForeground(Color.BLACK);
            all.empty_231.DISP.setForeground(Color.BLACK);
            all.empty_231.idsp.setForeground(Color.BLACK);
            all.empty_231.descripcion.setForeground(Color.BLACK);
            all.empty_231.npecaneado.setForeground(Color.BLACK);
            all.empty_231.serial.setForeground(Color.BLACK);
            npfinal.setText("");
            ecfinal.setText("");
            secfinal.setText("");
            npscan.requestFocus();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "FC15 ");
        }
        }
    }//GEN-LAST:event_LogPartActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * @param args the command line arguments
     *         boolean min=entradaTeclado.substring(0).startsWith("a");
        boolean may=entradaTeclado.substring(0).startsWith("A");
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
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barcode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Country;
    private javax.swing.JButton LogPart;
    private javax.swing.JButton Sustituto;
    public javax.swing.JLabel ecfinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel npfinal;
    public javax.swing.JTextField npscan;
    public javax.swing.JLabel secfinal;
    // End of variables declaration//GEN-END:variables
}
