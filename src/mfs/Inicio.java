package mfs;

import java.awt.event.KeyEvent;
import javax.swing.InputMap;

import javax.swing.KeyStroke;
import java.awt.event.KeyAdapter;
import javax.swing.JOptionPane;



public class Inicio extends javax.swing.JFrame {



    
    public Inicio() {
        initComponents();
        this.setLayout(null);
    }
    
    InputMap map = new InputMap();

       //map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false), "pressed");
       //map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true), "released");

       //btnAceptar.setInputMap(0, map);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CHGPWD = new javax.swing.JButton();
        SINGOFF = new javax.swing.JButton();
        EXTWK = new javax.swing.JButton();
        NEWWK = new javax.swing.JButton();
        EXTFUN = new javax.swing.JButton();
        APPLY = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 218, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CHGPWD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CHGPWD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/F2.jpg"))); // NOI18N
        CHGPWD.setText("Chg Pwd");
        CHGPWD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CHGPWD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CHGPWD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CHGPWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHGPWDActionPerformed(evt);
            }
        });
        CHGPWD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CHGPWDKeyTyped(evt);
            }
        });

        SINGOFF.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SINGOFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f3.jpg"))); // NOI18N
        SINGOFF.setText("Sing Off");
        SINGOFF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SINGOFF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SINGOFF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SINGOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SINGOFFActionPerformed(evt);
            }
        });
        SINGOFF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SINGOFFKeyTyped(evt);
            }
        });

        EXTWK.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EXTWK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f4.jpg"))); // NOI18N
        EXTWK.setText("Exist Work");
        EXTWK.setToolTipText("");
        EXTWK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXTWK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EXTWK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        EXTWK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EXTWK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXTWKActionPerformed(evt);
            }
        });
        EXTWK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EXTWKKeyTyped(evt);
            }
        });

        NEWWK.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        NEWWK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f5.jpg"))); // NOI18N
        NEWWK.setText("New Work");
        NEWWK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NEWWK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NEWWK.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        NEWWK.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        NEWWK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NEWWKKeyTyped(evt);
            }
        });

        EXTFUN.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EXTFUN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f6.jpg"))); // NOI18N
        EXTFUN.setText("Ext Func");
        EXTFUN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXTFUN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EXTFUN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EXTFUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXTFUNActionPerformed(evt);
            }
        });
        EXTFUN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EXTFUNKeyTyped(evt);
            }
        });

        APPLY.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        APPLY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f7.jpg"))); // NOI18N
        APPLY.setText("Re-Apply");
        APPLY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APPLY.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        APPLY.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        APPLY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                APPLYKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Welcome to MFS Training....");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CHGPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EXTFUN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(APPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SINGOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EXTWK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NEWWK)))
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(401, 401, 401))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NEWWK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CHGPWD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SINGOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXTWK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(APPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EXTFUN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104)
                .addComponent(jButton1)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHGPWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHGPWDActionPerformed
       all.cambio.ID.setText(Login.usuario);
       all.cambio.setVisible(true);
    }//GEN-LAST:event_CHGPWDActionPerformed

    private void SINGOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SINGOFFActionPerformed
        this.setVisible(false);
        all.login.setVisible(true);
    }//GEN-LAST:event_SINGOFFActionPerformed

    private void EXTWKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXTWKActionPerformed
        all.work.setVisible(true);
        all.work.orden = 0;
    }//GEN-LAST:event_EXTWKActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int F4 = evt.getKeyChar();
        if (F4 == KeyEvent.VK_F4){
            all.work.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        int F4 = evt.getKeyChar();
        if (F4 == KeyEvent.VK_F4){
            all.work.setVisible(true);
        }
    }//GEN-LAST:event_formKeyTyped

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        int F4 = evt.getKeyChar();
        if (F4 == KeyEvent.VK_F4){
            all.work.setVisible(true);
        }
    }//GEN-LAST:event_formKeyReleased

    private void EXTFUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXTFUNActionPerformed
        all.fun2.setVisible(true);
    }//GEN-LAST:event_EXTFUNActionPerformed

    private void CHGPWDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CHGPWDKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_CHGPWDKeyTyped

    private void SINGOFFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SINGOFFKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_SINGOFFKeyTyped

    private void EXTWKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXTWKKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_EXTWKKeyTyped

    private void NEWWKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NEWWKKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_NEWWKKeyTyped

    private void EXTFUNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EXTFUNKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_EXTFUNKeyTyped

    private void APPLYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APPLYKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                all.cambio.setVisible(true);
                break;
            case KeyEvent.VK_3:
                this.setVisible(false);
                all.login.setVisible(true);
                break;
            case KeyEvent.VK_4:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_5:
                all.work.setVisible(true);
                break;
            case KeyEvent.VK_6:
                all.fun2.setVisible(true);
                break;
            case KeyEvent.VK_7:
                all.work.setVisible(true);
                break;
        }
    }//GEN-LAST:event_APPLYKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Consultas consultas = new Consultas();
        this.setVisible(false);
        consultas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APPLY;
    private javax.swing.JButton CHGPWD;
    private javax.swing.JButton EXTFUN;
    private javax.swing.JButton EXTWK;
    private javax.swing.JButton NEWWK;
    private javax.swing.JButton SINGOFF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
