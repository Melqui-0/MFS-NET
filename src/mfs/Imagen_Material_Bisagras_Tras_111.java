/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mfs;

/**
 *
 * @author MelquiAzarelRamirezR
 */
public class Imagen_Material_Bisagras_Tras_111 extends javax.swing.JPanel {

    /**
     * Creates new form Imagen_Material_Bisagras_Tras_111
     */
    public Imagen_Material_Bisagras_Tras_111() {
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

        Imagen_Material_Bisagras_Tras_111 = new javax.swing.JPanel();
        bisagratraserair = new javax.swing.JLabel();
        change6 = new javax.swing.JCheckBox();

        Imagen_Material_Bisagras_Tras_111.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Bisagras_Tras_111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bisagratraserair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/BIZATRAS.jpg"))); // NOI18N

        change6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change6.setText("Incompleto");
        change6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change6StateChanged(evt);
            }
        });
        change6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Imagen_Material_Bisagras_Tras_111Layout = new javax.swing.GroupLayout(Imagen_Material_Bisagras_Tras_111);
        Imagen_Material_Bisagras_Tras_111.setLayout(Imagen_Material_Bisagras_Tras_111Layout);
        Imagen_Material_Bisagras_Tras_111Layout.setHorizontalGroup(
            Imagen_Material_Bisagras_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_Material_Bisagras_Tras_111Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_Material_Bisagras_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bisagratraserair)
                    .addComponent(change6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_Material_Bisagras_Tras_111Layout.setVerticalGroup(
            Imagen_Material_Bisagras_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_Material_Bisagras_Tras_111Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bisagratraserair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagen_Material_Bisagras_Tras_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imagen_Material_Bisagras_Tras_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void change6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change6StateChanged
        if (all.material_bisagras_tras_111.idsp29.getText().equals("I") && all.material_bisagras_tras_111.idsp32.getText().equals("I") && all.material_bisagras_tras_111.idsp33.getText().equals("I") && all.material_bisagras_tras_111.idsp35.getText().equals("I")){
            change6.setSelected(true);
            change6ActionPerformed(null);
        }
    }//GEN-LAST:event_change6StateChanged

    private void change6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change6ActionPerformed
        if (change6.isSelected()){
            change6.setText("Completo");
        } else {
            change6.setText("Incompleto");
        }
    }//GEN-LAST:event_change6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Imagen_Material_Bisagras_Tras_111;
    public javax.swing.JLabel bisagratraserair;
    public javax.swing.JCheckBox change6;
    // End of variables declaration//GEN-END:variables
}
