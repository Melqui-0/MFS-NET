
package mfs;

import java.awt.Color;
import javax.swing.JOptionPane;
import static mfs.Empty.nm;
import static mfs.Empty.pn;
import static mfs.Empty.pn2;

public class Material_etiqueta_396 extends javax.swing.JPanel {

    /**
     * Creates new form Material_etiqueta_396
     */
    public Material_etiqueta_396() {
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

        bloque4 = new javax.swing.JPanel();
        NPS7 = new javax.swing.JPanel();
        npaescanear7 = new javax.swing.JLabel();
        QT7 = new javax.swing.JLabel();
        FQT7 = new javax.swing.JLabel();
        DISP7 = new javax.swing.JLabel();
        idsp7 = new javax.swing.JLabel();
        descripcion7 = new javax.swing.JLabel();
        npecaneado7 = new javax.swing.JLabel();
        serial7 = new javax.swing.JLabel();
        cantidadrequerida7 = new javax.swing.JLabel();
        cantidadfinal7 = new javax.swing.JLabel();

        bloque4.setBackground(new java.awt.Color(255, 255, 255));
        bloque4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS7.setBackground(new java.awt.Color(255, 255, 255));
        NPS7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS7.setFocusable(false);
        NPS7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS7MouseClicked(evt);
            }
        });

        npaescanear7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear7.setText("01KL396");

        QT7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT7.setText("QT:");

        FQT7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT7.setText("FQT:");

        DISP7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP7.setText("IDSP:");

        idsp7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp7.setText("A");

        descripcion7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion7.setText("LABEL weight 400 - 3700");

        npecaneado7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado7.setText("PF  2L01-");

        serial7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial7.setText("-             -            -");

        cantidadrequerida7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida7.setText("00002");

        cantidadfinal7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal7.setText("00000");

        javax.swing.GroupLayout NPS7Layout = new javax.swing.GroupLayout(NPS7);
        NPS7.setLayout(NPS7Layout);
        NPS7Layout.setHorizontalGroup(
            NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS7Layout.createSequentialGroup()
                        .addComponent(npecaneado7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(NPS7Layout.createSequentialGroup()
                        .addGroup(NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS7Layout.createSequentialGroup()
                                .addComponent(DISP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS7Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida7)
                                .addGap(28, 28, 28)
                                .addComponent(FQT7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal7)))
                        .addGap(12, 12, 12)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        NPS7Layout.setVerticalGroup(
            NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear7)
                    .addComponent(QT7)
                    .addComponent(FQT7)
                    .addComponent(cantidadrequerida7)
                    .addComponent(cantidadfinal7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP7)
                    .addComponent(idsp7)
                    .addComponent(descripcion7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado7)
                    .addComponent(serial7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bloque4Layout = new javax.swing.GroupLayout(bloque4);
        bloque4.setLayout(bloque4Layout);
        bloque4Layout.setHorizontalGroup(
            bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NPS7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bloque4Layout.setVerticalGroup(
            bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque4Layout.createSequentialGroup()
                .addComponent(NPS7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 535, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloque4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bloque4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NPS7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS7MouseClicked
        if (evt.getClickCount()>1){
            if (this.idsp7.getText().equals("A")){
                pn = this.npaescanear7.getText().toUpperCase();
                pn2 = this.npaescanear7.getText().substring(3).toUpperCase();
                nm = 7;
                all.f2_funcion.Funcion_F2();

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Part to Add");
            }
        } /*else {
            pn = this.npaescanear7.getText().toUpperCase();
            pn2 = this.npaescanear7.getText().substring(3).toUpperCase();
            nm = 7;
            this.NPS7.setBackground(Color.black);
            this.DISP7.setForeground(Color.white);
            this.FQT7.setForeground(Color.white);
            this.QT7.setForeground(Color.white);
            this.cantidadfinal7.setForeground(Color.white);
            this.cantidadrequerida7.setForeground(Color.white);
            this.descripcion7.setForeground(Color.white);
            this.idsp7.setForeground(Color.white);
            this.npaescanear7.setForeground(Color.white);
            this.npecaneado7.setForeground(Color.white);
            this.serial7.setForeground(Color.white);
        }*/
    }//GEN-LAST:event_NPS7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel DISP7;
    public javax.swing.JLabel FQT7;
    public javax.swing.JPanel NPS7;
    public javax.swing.JLabel QT7;
    public javax.swing.JPanel bloque4;
    public javax.swing.JLabel cantidadfinal7;
    public javax.swing.JLabel cantidadrequerida7;
    public javax.swing.JLabel descripcion7;
    public javax.swing.JLabel idsp7;
    public javax.swing.JLabel npaescanear7;
    public javax.swing.JLabel npecaneado7;
    public javax.swing.JLabel serial7;
    // End of variables declaration//GEN-END:variables
}
