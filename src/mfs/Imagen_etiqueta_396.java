/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mfs;

/**
 *
 * @author MelquiAzarelRamirezR
 */
public class Imagen_etiqueta_396 extends javax.swing.JPanel {

    /**
     * Creates new form Imagen_etiqueta_396
     */
    public Imagen_etiqueta_396() {
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

        bloqueimagen1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        change3 = new javax.swing.JCheckBox();

        bloqueimagen1.setBackground(new java.awt.Color(255, 255, 255));
        bloqueimagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/LBL396.jpg"))); // NOI18N

        change3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change3.setText("Incompleto");
        change3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change3StateChanged(evt);
            }
        });
        change3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloqueimagen1Layout = new javax.swing.GroupLayout(bloqueimagen1);
        bloqueimagen1.setLayout(bloqueimagen1Layout);
        bloqueimagen1Layout.setHorizontalGroup(
            bloqueimagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloqueimagen1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloqueimagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change3)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bloqueimagen1Layout.setVerticalGroup(
            bloqueimagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloqueimagen1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloqueimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloqueimagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void change3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change3StateChanged
        if (all.material_etiqueta_396.idsp7.getText().equals("I")){
            change3.setSelected(true);
            change3ActionPerformed(null);
        }
    }//GEN-LAST:event_change3StateChanged

    private void change3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change3ActionPerformed
        if (change3.isSelected()){
            change3.setText("Completo");
        } else {
            change3.setText("Incompleto");
        }
    }//GEN-LAST:event_change3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel bloqueimagen1;
    public javax.swing.JCheckBox change3;
    private javax.swing.JLabel jLabel16;
    // End of variables declaration//GEN-END:variables
}
