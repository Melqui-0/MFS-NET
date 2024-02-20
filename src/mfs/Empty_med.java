package mfs;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Empty_med extends javax.swing.JFrame {


    
    
    public final void extender(){
        GraphicsEnvironment env = 
        GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | Empty_med.MAXIMIZED_BOTH);
    }
    
    
    int xx, yy;
    public static String pn, pn2;
    public static int nm, TotalWU;
    public static String nps [];
        
    
    public Empty_med() {    
        initComponents();
        extender();
        this.setLayout(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        f2 = new javax.swing.JButton();
        EndJob = new javax.swing.JButton();
        AutoLog = new javax.swing.JButton();
        ExtFunc = new javax.swing.JButton();
        Rework = new javax.swing.JButton();
        Suspender = new javax.swing.JButton();
        ViewIns = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cntr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cronometro = new javax.swing.JLabel();
        milisegundos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        User500 = new javax.swing.JLabel();
        work500 = new javax.swing.JLabel();
        cuerpo = new javax.swing.JScrollPane();
        bloque1 = new javax.swing.JPanel();
        Imagen_rack = new javax.swing.JPanel();
        Material_rack = new javax.swing.JPanel();
        Material_ext_magueras = new javax.swing.JPanel();
        Imagen_ext_mangueras = new javax.swing.JPanel();
        Material_etiqueta_534 = new javax.swing.JPanel();
        Imagen_etiqueta_534 = new javax.swing.JPanel();
        Material_etiqueta_396 = new javax.swing.JPanel();
        Imagen_etiqueta_396 = new javax.swing.JPanel();
        Material_etiqueta_1952 = new javax.swing.JPanel();
        Imagen_etiqueta_1952 = new javax.swing.JPanel();
        Material_pdu_485 = new javax.swing.JPanel();
        Imagen_pdu_485 = new javax.swing.JPanel();
        Material_bisagras_del_421 = new javax.swing.JPanel();
        Imagen_bisagras_del_421 = new javax.swing.JPanel();
        bisagraslatch1 = new javax.swing.JPanel();
        NPS29 = new javax.swing.JPanel();
        npaescanear29 = new javax.swing.JLabel();
        QT29 = new javax.swing.JLabel();
        FQT29 = new javax.swing.JLabel();
        DISP29 = new javax.swing.JLabel();
        idsp29 = new javax.swing.JLabel();
        descripcion29 = new javax.swing.JLabel();
        npecaneado29 = new javax.swing.JLabel();
        serial29 = new javax.swing.JLabel();
        cantidadrequerida29 = new javax.swing.JLabel();
        cantidadfinal29 = new javax.swing.JLabel();
        NPS32 = new javax.swing.JPanel();
        npaescanear32 = new javax.swing.JLabel();
        QT32 = new javax.swing.JLabel();
        FQT32 = new javax.swing.JLabel();
        DISP32 = new javax.swing.JLabel();
        idsp32 = new javax.swing.JLabel();
        descripcion32 = new javax.swing.JLabel();
        npecaneado32 = new javax.swing.JLabel();
        serial32 = new javax.swing.JLabel();
        cantidadrequerida32 = new javax.swing.JLabel();
        cantidadfinal32 = new javax.swing.JLabel();
        NPS33 = new javax.swing.JPanel();
        npaescanear33 = new javax.swing.JLabel();
        QT33 = new javax.swing.JLabel();
        FQT33 = new javax.swing.JLabel();
        DISP33 = new javax.swing.JLabel();
        idsp33 = new javax.swing.JLabel();
        descripcion33 = new javax.swing.JLabel();
        npecaneado33 = new javax.swing.JLabel();
        serial33 = new javax.swing.JLabel();
        cantidadrequerida33 = new javax.swing.JLabel();
        cantidadfinal33 = new javax.swing.JLabel();
        NPS35 = new javax.swing.JPanel();
        npaescanear35 = new javax.swing.JLabel();
        QT35 = new javax.swing.JLabel();
        FQT35 = new javax.swing.JLabel();
        DISP35 = new javax.swing.JLabel();
        idsp35 = new javax.swing.JLabel();
        descripcion35 = new javax.swing.JLabel();
        npecaneado35 = new javax.swing.JLabel();
        serial35 = new javax.swing.JLabel();
        cantidadrequerida35 = new javax.swing.JLabel();
        cantidadfinal35 = new javax.swing.JLabel();
        Bisagrastraseras = new javax.swing.JPanel();
        bisagratraserair = new javax.swing.JLabel();
        change6 = new javax.swing.JCheckBox();
        Material_rieles_PDU = new javax.swing.JPanel();
        Imagen_rieles_pdu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 1280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        f2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f2dd.png"))); // NOI18N
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        f2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                f2KeyTyped(evt);
            }
        });

        EndJob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f3d.png"))); // NOI18N
        EndJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndJobActionPerformed(evt);
            }
        });
        EndJob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EndJobKeyTyped(evt);
            }
        });

        AutoLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f4d.png"))); // NOI18N
        AutoLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoLogActionPerformed(evt);
            }
        });
        AutoLog.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AutoLogKeyTyped(evt);
            }
        });

        ExtFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f5d.png"))); // NOI18N
        ExtFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtFuncActionPerformed(evt);
            }
        });
        ExtFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ExtFuncKeyTyped(evt);
            }
        });

        Rework.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f6d.png"))); // NOI18N
        Rework.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReworkActionPerformed(evt);
            }
        });
        Rework.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ReworkKeyTyped(evt);
            }
        });

        Suspender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f7d.png"))); // NOI18N
        Suspender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuspenderActionPerformed(evt);
            }
        });
        Suspender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SuspenderKeyTyped(evt);
            }
        });

        ViewIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f8.png"))); // NOI18N
        ViewIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInsActionPerformed(evt);
            }
        });
        ViewIns.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ViewInsKeyTyped(evt);
            }
        });

        Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/f11.png"))); // NOI18N
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        Remover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RemoverKeyTyped(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/ncm.png"))); // NOI18N
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton9KeyTyped(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/viewcoll.png"))); // NOI18N
        jButton10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton10KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(f2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndJob)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AutoLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExtFunc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rework)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Suspender)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ViewIns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Remover))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EndJob)
                        .addComponent(AutoLog))
                    .addComponent(ExtFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rework)
                    .addComponent(Suspender)
                    .addComponent(ViewIns)
                    .addComponent(Remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Country: USA");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("0001 / 0001");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Mach Num: 7800KE78G");

        Cntr.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Cntr.setText("Cntr: 000063H7Q8");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Mctl:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Order: A3CMLW");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("User:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Brof: 895");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Model: S42");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Oper: 500");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Prod ID: RSRCK");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Schd: 2023-09-01");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Sys Num: 1AVM176");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("WT SYS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFocusable(false);

        Cronometro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Cronometro.setText("0 hrs : 0 m : 0s");

        milisegundos.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        milisegundos.setText(".000");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/ojo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/ojo 2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Cronometro)
                        .addGap(10, 10, 10)
                        .addComponent(milisegundos)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milisegundos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        User500.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        work500.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        cuerpo.setDoubleBuffered(true);
        cuerpo.setFocusCycleRoot(true);
        cuerpo.setPreferredSize(new java.awt.Dimension(1024, 1280));

        bloque1.setBackground(new java.awt.Color(255, 255, 255));
        bloque1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Imagen_rack.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_rack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_rackLayout = new javax.swing.GroupLayout(Imagen_rack);
        Imagen_rack.setLayout(Imagen_rackLayout);
        Imagen_rackLayout.setHorizontalGroup(
            Imagen_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_rackLayout.setVerticalGroup(
            Imagen_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        Material_rack.setBackground(new java.awt.Color(255, 255, 255));
        Material_rack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_rackLayout = new javax.swing.GroupLayout(Material_rack);
        Material_rack.setLayout(Material_rackLayout);
        Material_rackLayout.setHorizontalGroup(
            Material_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_rackLayout.setVerticalGroup(
            Material_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Material_ext_magueras.setBackground(new java.awt.Color(255, 255, 255));
        Material_ext_magueras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_ext_maguerasLayout = new javax.swing.GroupLayout(Material_ext_magueras);
        Material_ext_magueras.setLayout(Material_ext_maguerasLayout);
        Material_ext_maguerasLayout.setHorizontalGroup(
            Material_ext_maguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_ext_maguerasLayout.setVerticalGroup(
            Material_ext_maguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        Imagen_ext_mangueras.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_ext_mangueras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_ext_manguerasLayout = new javax.swing.GroupLayout(Imagen_ext_mangueras);
        Imagen_ext_mangueras.setLayout(Imagen_ext_manguerasLayout);
        Imagen_ext_manguerasLayout.setHorizontalGroup(
            Imagen_ext_manguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_ext_manguerasLayout.setVerticalGroup(
            Imagen_ext_manguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        Material_etiqueta_534.setBackground(new java.awt.Color(255, 255, 255));
        Material_etiqueta_534.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_etiqueta_534Layout = new javax.swing.GroupLayout(Material_etiqueta_534);
        Material_etiqueta_534.setLayout(Material_etiqueta_534Layout);
        Material_etiqueta_534Layout.setHorizontalGroup(
            Material_etiqueta_534Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_etiqueta_534Layout.setVerticalGroup(
            Material_etiqueta_534Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_etiqueta_534.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_etiqueta_534.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_etiqueta_534Layout = new javax.swing.GroupLayout(Imagen_etiqueta_534);
        Imagen_etiqueta_534.setLayout(Imagen_etiqueta_534Layout);
        Imagen_etiqueta_534Layout.setHorizontalGroup(
            Imagen_etiqueta_534Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_etiqueta_534Layout.setVerticalGroup(
            Imagen_etiqueta_534Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Material_etiqueta_396.setBackground(new java.awt.Color(255, 255, 255));
        Material_etiqueta_396.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_etiqueta_396Layout = new javax.swing.GroupLayout(Material_etiqueta_396);
        Material_etiqueta_396.setLayout(Material_etiqueta_396Layout);
        Material_etiqueta_396Layout.setHorizontalGroup(
            Material_etiqueta_396Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_etiqueta_396Layout.setVerticalGroup(
            Material_etiqueta_396Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_etiqueta_396.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_etiqueta_396.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_etiqueta_396Layout = new javax.swing.GroupLayout(Imagen_etiqueta_396);
        Imagen_etiqueta_396.setLayout(Imagen_etiqueta_396Layout);
        Imagen_etiqueta_396Layout.setHorizontalGroup(
            Imagen_etiqueta_396Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_etiqueta_396Layout.setVerticalGroup(
            Imagen_etiqueta_396Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Material_etiqueta_1952.setBackground(new java.awt.Color(255, 255, 255));
        Material_etiqueta_1952.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_etiqueta_1952Layout = new javax.swing.GroupLayout(Material_etiqueta_1952);
        Material_etiqueta_1952.setLayout(Material_etiqueta_1952Layout);
        Material_etiqueta_1952Layout.setHorizontalGroup(
            Material_etiqueta_1952Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_etiqueta_1952Layout.setVerticalGroup(
            Material_etiqueta_1952Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_etiqueta_1952.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_etiqueta_1952.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_etiqueta_1952Layout = new javax.swing.GroupLayout(Imagen_etiqueta_1952);
        Imagen_etiqueta_1952.setLayout(Imagen_etiqueta_1952Layout);
        Imagen_etiqueta_1952Layout.setHorizontalGroup(
            Imagen_etiqueta_1952Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_etiqueta_1952Layout.setVerticalGroup(
            Imagen_etiqueta_1952Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Material_pdu_485.setBackground(new java.awt.Color(255, 255, 255));
        Material_pdu_485.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_pdu_485Layout = new javax.swing.GroupLayout(Material_pdu_485);
        Material_pdu_485.setLayout(Material_pdu_485Layout);
        Material_pdu_485Layout.setHorizontalGroup(
            Material_pdu_485Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_pdu_485Layout.setVerticalGroup(
            Material_pdu_485Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_pdu_485.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_pdu_485.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_pdu_485Layout = new javax.swing.GroupLayout(Imagen_pdu_485);
        Imagen_pdu_485.setLayout(Imagen_pdu_485Layout);
        Imagen_pdu_485Layout.setHorizontalGroup(
            Imagen_pdu_485Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_pdu_485Layout.setVerticalGroup(
            Imagen_pdu_485Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3414, Short.MAX_VALUE)
        );

        Material_bisagras_del_421.setBackground(new java.awt.Color(255, 255, 255));
        Material_bisagras_del_421.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_bisagras_del_421Layout = new javax.swing.GroupLayout(Material_bisagras_del_421);
        Material_bisagras_del_421.setLayout(Material_bisagras_del_421Layout);
        Material_bisagras_del_421Layout.setHorizontalGroup(
            Material_bisagras_del_421Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_bisagras_del_421Layout.setVerticalGroup(
            Material_bisagras_del_421Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        Imagen_bisagras_del_421.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_bisagras_del_421.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_bisagras_del_421Layout = new javax.swing.GroupLayout(Imagen_bisagras_del_421);
        Imagen_bisagras_del_421.setLayout(Imagen_bisagras_del_421Layout);
        Imagen_bisagras_del_421Layout.setHorizontalGroup(
            Imagen_bisagras_del_421Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_bisagras_del_421Layout.setVerticalGroup(
            Imagen_bisagras_del_421Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        bisagraslatch1.setBackground(new java.awt.Color(255, 255, 255));
        bisagraslatch1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS29.setBackground(new java.awt.Color(255, 255, 255));
        NPS29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS29.setFocusable(false);
        NPS29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS29MouseClicked(evt);
            }
        });

        npaescanear29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear29.setText("01KU111");

        QT29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT29.setText("QT:");

        FQT29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT29.setText("FQT:");

        DISP29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP29.setText("IDSP:");

        idsp29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp29.setText("A");

        descripcion29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion29.setText("HINGE hinge tall pn");

        npecaneado29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado29.setText("PF  2L01-");

        serial29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial29.setText("-             -            -");

        cantidadrequerida29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida29.setText("00001");

        cantidadfinal29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal29.setText("00000");

        javax.swing.GroupLayout NPS29Layout = new javax.swing.GroupLayout(NPS29);
        NPS29.setLayout(NPS29Layout);
        NPS29Layout.setHorizontalGroup(
            NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS29Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS29Layout.createSequentialGroup()
                        .addComponent(npecaneado29, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(NPS29Layout.createSequentialGroup()
                        .addGroup(NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS29Layout.createSequentialGroup()
                                .addComponent(DISP29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion29, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS29Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida29)
                                .addGap(28, 28, 28)
                                .addComponent(FQT29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal29)))
                        .addGap(12, 12, 12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        NPS29Layout.setVerticalGroup(
            NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear29)
                    .addComponent(QT29)
                    .addComponent(FQT29)
                    .addComponent(cantidadrequerida29)
                    .addComponent(cantidadfinal29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP29)
                    .addComponent(idsp29)
                    .addComponent(descripcion29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado29)
                    .addComponent(serial29))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS32.setBackground(new java.awt.Color(255, 255, 255));
        NPS32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS32.setFocusable(false);
        NPS32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS32MouseClicked(evt);
            }
        });

        npaescanear32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear32.setText("01KU112");

        QT32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT32.setText("QT:");

        FQT32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT32.setText("FQT:");

        DISP32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP32.setText("IDSP:");

        idsp32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp32.setText("A");

        descripcion32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion32.setText("HINGE Hinge short pn");

        npecaneado32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado32.setText("PF  2L01-");

        serial32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial32.setText("-             -            -");

        cantidadrequerida32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida32.setText("00001");

        cantidadfinal32.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal32.setText("00000");

        javax.swing.GroupLayout NPS32Layout = new javax.swing.GroupLayout(NPS32);
        NPS32.setLayout(NPS32Layout);
        NPS32Layout.setHorizontalGroup(
            NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS32Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS32Layout.createSequentialGroup()
                        .addComponent(npecaneado32, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(NPS32Layout.createSequentialGroup()
                        .addGroup(NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS32Layout.createSequentialGroup()
                                .addComponent(DISP32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion32, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS32Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida32)
                                .addGap(28, 28, 28)
                                .addComponent(FQT32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal32)))
                        .addGap(12, 12, 12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        NPS32Layout.setVerticalGroup(
            NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear32)
                    .addComponent(QT32)
                    .addComponent(FQT32)
                    .addComponent(cantidadrequerida32)
                    .addComponent(cantidadfinal32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP32)
                    .addComponent(idsp32)
                    .addComponent(descripcion32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado32)
                    .addComponent(serial32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS33.setBackground(new java.awt.Color(255, 255, 255));
        NPS33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS33.setFocusable(false);
        NPS33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS33MouseClicked(evt);
            }
        });

        npaescanear33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear33.setText("01KU137");

        QT33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT33.setText("QT:");

        FQT33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT33.setText("FQT:");

        DISP33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP33.setText("IDSP:");

        idsp33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp33.setText("A");

        descripcion33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion33.setText("BRACKET Latch Bracket");

        npecaneado33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado33.setText("PF  2L01-");

        serial33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial33.setText("-             -            -");

        cantidadrequerida33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida33.setText("00001");

        cantidadfinal33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal33.setText("00000");

        javax.swing.GroupLayout NPS33Layout = new javax.swing.GroupLayout(NPS33);
        NPS33.setLayout(NPS33Layout);
        NPS33Layout.setHorizontalGroup(
            NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS33Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS33Layout.createSequentialGroup()
                        .addComponent(npecaneado33, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(NPS33Layout.createSequentialGroup()
                        .addGroup(NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS33Layout.createSequentialGroup()
                                .addComponent(DISP33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion33, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS33Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida33)
                                .addGap(28, 28, 28)
                                .addComponent(FQT33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal33)))
                        .addGap(12, 12, 12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        NPS33Layout.setVerticalGroup(
            NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear33)
                    .addComponent(QT33)
                    .addComponent(FQT33)
                    .addComponent(cantidadrequerida33)
                    .addComponent(cantidadfinal33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP33)
                    .addComponent(idsp33)
                    .addComponent(descripcion33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado33)
                    .addComponent(serial33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS35.setBackground(new java.awt.Color(255, 255, 255));
        NPS35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS35.setFocusable(false);
        NPS35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS35MouseClicked(evt);
            }
        });

        npaescanear35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear35.setText("46C6380");

        QT35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT35.setText("QT:");

        FQT35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT35.setText("FQT:");

        DISP35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP35.setText("IDSP:");

        idsp35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp35.setText("A");

        descripcion35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion35.setText("SCREW M5x16 BLACK");

        npecaneado35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado35.setText("PF  2L01-");

        serial35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial35.setText("-             -            -");

        cantidadrequerida35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida35.setText("00006");

        cantidadfinal35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal35.setText("00000");

        javax.swing.GroupLayout NPS35Layout = new javax.swing.GroupLayout(NPS35);
        NPS35.setLayout(NPS35Layout);
        NPS35Layout.setHorizontalGroup(
            NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS35Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS35Layout.createSequentialGroup()
                        .addComponent(npecaneado35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial35, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(NPS35Layout.createSequentialGroup()
                        .addGroup(NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS35Layout.createSequentialGroup()
                                .addComponent(DISP35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion35, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS35Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida35)
                                .addGap(28, 28, 28)
                                .addComponent(FQT35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal35)))
                        .addGap(12, 12, 12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        NPS35Layout.setVerticalGroup(
            NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear35)
                    .addComponent(QT35)
                    .addComponent(FQT35)
                    .addComponent(cantidadrequerida35)
                    .addComponent(cantidadfinal35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP35)
                    .addComponent(idsp35)
                    .addComponent(descripcion35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado35)
                    .addComponent(serial35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bisagraslatch1Layout = new javax.swing.GroupLayout(bisagraslatch1);
        bisagraslatch1.setLayout(bisagraslatch1Layout);
        bisagraslatch1Layout.setHorizontalGroup(
            bisagraslatch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bisagraslatch1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bisagraslatch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NPS29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPS32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPS33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPS35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bisagraslatch1Layout.setVerticalGroup(
            bisagraslatch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bisagraslatch1Layout.createSequentialGroup()
                .addComponent(NPS29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bisagrastraseras.setBackground(new java.awt.Color(255, 255, 255));
        Bisagrastraseras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        javax.swing.GroupLayout BisagrastraserasLayout = new javax.swing.GroupLayout(Bisagrastraseras);
        Bisagrastraseras.setLayout(BisagrastraserasLayout);
        BisagrastraserasLayout.setHorizontalGroup(
            BisagrastraserasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BisagrastraserasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BisagrastraserasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bisagratraserair)
                    .addComponent(change6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BisagrastraserasLayout.setVerticalGroup(
            BisagrastraserasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BisagrastraserasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bisagratraserair)
                .addGap(18, 18, 18)
                .addComponent(change6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Material_rieles_PDU.setBackground(new java.awt.Color(255, 255, 255));
        Material_rieles_PDU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_rieles_PDULayout = new javax.swing.GroupLayout(Material_rieles_PDU);
        Material_rieles_PDU.setLayout(Material_rieles_PDULayout);
        Material_rieles_PDULayout.setHorizontalGroup(
            Material_rieles_PDULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_rieles_PDULayout.setVerticalGroup(
            Material_rieles_PDULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4554, Short.MAX_VALUE)
        );

        Imagen_rieles_pdu.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_rieles_pdu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_rieles_pduLayout = new javax.swing.GroupLayout(Imagen_rieles_pdu);
        Imagen_rieles_pdu.setLayout(Imagen_rieles_pduLayout);
        Imagen_rieles_pduLayout.setHorizontalGroup(
            Imagen_rieles_pduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_rieles_pduLayout.setVerticalGroup(
            Imagen_rieles_pduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4554, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bloque1Layout = new javax.swing.GroupLayout(bloque1);
        bloque1.setLayout(bloque1Layout);
        bloque1Layout.setHorizontalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Material_rieles_PDU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_bisagras_del_421, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_pdu_485, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_1952, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_396, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_534, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_ext_magueras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bisagraslatch1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_rack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_ext_mangueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bisagrastraseras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rieles_pdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        bloque1Layout.setVerticalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_ext_magueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_ext_mangueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_rieles_PDU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rieles_pdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bisagraslatch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bisagrastraseras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1233, Short.MAX_VALUE))
        );

        cuerpo.setViewportView(bloque1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(User500, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)
                                        .addComponent(Cntr)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(173, 173, 173)
                                                        .addComponent(jLabel6)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(168, 168, 168))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(267, 267, 267)
                                                .addComponent(jLabel8)
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addComponent(work500, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(146, 146, 146)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Cntr)
                                .addComponent(jLabel1))
                            .addComponent(work500, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User500, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 12522, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 12775, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ReworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReworkActionPerformed
        all.funcion_rework.rework();
    }//GEN-LAST:event_ReworkActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        all.f2_funcion.Funcion_F2();
    }//GEN-LAST:event_f2ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x =evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_formMouseDragged

    private void ExtFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExtFuncActionPerformed

    private void EndJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndJobActionPerformed
        if (all.material_rack.idsp.getText().equals("I") && all.material_extmangueras.idsp1.getText().equals("I") && all.material_extmangueras.idsp2.getText().equals("I") && all.material_extmangueras.idsp3.getText().equals("I") && all.material_etiqueta_534.idsp4.getText().equals("I") && all.material_extmangueras.idsp5.getText().equals("I") && all.material_etiqueta_534.idsp6.getText().equals("I") && all.material_etiqueta_396.idsp7.getText().equals("I") && all.material_etiqueta_1952.idsp9.getText().equals("I") && all.material_pdu_485.idsp10.getText().equals("I") && all.material_pdu_485.idsp13.getText().equals("I") && all.material_pdu_485.idsp14.getText().equals("I") && all.material_pdu_485.idsp15.getText().equals("I") && all.material_pdu_485.idsp16.getText().equals("I") && all.material_pdu_485.idsp17.getText().equals("I") && all.material_pdu_485.idsp18.getText().equals("I") && all.material_pdu_485.idsp19.getText().equals("I") && all.material_pdu_485.idsp20.getText().equals("I") && all.material_pdu_485.idsp21.getText().equals("I") && all.material_pdu_485.idsp22.getText().equals("I") && all.material_pdu_485.idsp23.getText().equals("I")  && all.material_bisagras_del_421.idsp28.getText().equals("I") && all.material_bisagras_del_421.idsp30.getText().equals("I") && all.material_bisagras_del_421.idsp31.getText().equals("I") && idsp29.getText().equals("I") && idsp32.getText().equals("I") && idsp33.getText().equals("I") && idsp35.getText().equals("I") && all.imagen_rack.change.getText().equals("Completo") && all.imagen_extmangueras.change1.getText().equals("Completo") && all.imagen_etiqueta_534.change2.getText().equals("Completo") && all.imagen_etiqueta_396.change3.getText().equals("Completo") && all.imagen_etiqueta_1952.change4.getText().equals("Completo") && all.imagen_pdu_485.change5.getText().equals("Completo") && change6.getText().equals("Completo") && all.imagen_bisagras_del_421.change7.getText().equals("Completo")){
            if (all.imagen_rack.change.isSelected() && all.imagen_extmangueras.change1.isSelected() && all.imagen_etiqueta_534.change2.isSelected() && all.imagen_etiqueta_396.change3.isSelected() && all.imagen_etiqueta_1952.change4.isSelected() && all.imagen_pdu_485.change5.isSelected() && change6.isSelected() && all.imagen_bisagras_del_421.change7.isSelected()){
            JOptionPane.showMessageDialog(null, "Operación finalizada....");
            this.setVisible(false);
            TotalWU ++;
            all.crono.mTimer.stop();
            all.entrenador.totalwuentto.setText("" + TotalWU);
            if (all.entrenador.jLabel13.getText().equals(" ")){
                all.entrenador.jLabel13.setText("Easy");
                all.entrenador.jLabel23.setText(Cronometro.getText());
                all.entrenador.jLabel33.setText(all.login.usuario);
                all.limpiar.Limpiar_empty_easy();
                all.crono.reboot();
                all.abrir.setVisible(true);
            } else if (all.entrenador.jLabel14.getText().equals(" ")){
                all.entrenador.jLabel14.setText("Easy");
                all.entrenador.jLabel24.setText(Cronometro.getText());
                all.entrenador.jLabel34.setText(all.login.usuario);
                all.limpiar.Limpiar_empty_easy();
                all.crono.reboot();
                all.abrir.setVisible(true);
                } else if (all.entrenador.jLabel15.getText().equals(" ")){
                    all.entrenador.jLabel15.setText("Easy");
                    all.entrenador.jLabel25.setText(Cronometro.getText());
                    all.entrenador.jLabel35.setText(all.login.usuario);
                    all.limpiar.Limpiar_empty_easy();
                    all.crono.reboot();
                    all.abrir.setVisible(true);
                    } else if (all.entrenador.jLabel16.getText().equals(" ")){
                        all.entrenador.jLabel16.setText("Easy");
                        all.entrenador.jLabel26.setText(Cronometro.getText());
                        all.entrenador.jLabel36.setText(all.login.usuario);
                        all.limpiar.Limpiar_empty_easy();
                        all.crono.reboot();
                        all.abrir.setVisible(true);
                        } else if (all.entrenador.jLabel18.getText().equals(" ")){
                            all.entrenador.jLabel18.setText("Easy");
                            all.entrenador.jLabel28.setText(Cronometro.getText());
                            all.entrenador.jLabel38.setText(all.login.usuario);
                            all.limpiar.Limpiar_empty_easy();
                            all.crono.reboot();
                            all.abrir.setVisible(true);
                            } else if (all.entrenador.jLabel17.getText().equals(" ")){
                                all.entrenador.jLabel17.setText("Easy");
                                all.entrenador.jLabel27.setText(Cronometro.getText());
                                all.entrenador.jLabel37.setText(all.login.usuario);
                                all.limpiar.Limpiar_empty_easy();
                                all.crono.reboot();
                                all.abrir.setVisible(true);
                                } else if (all.entrenador.jLabel19.getText().equals(" ")){
                                       all.entrenador.jLabel19.setText("Easy");
                                       all.entrenador.jLabel29.setText(Cronometro.getText());
                                       all.entrenador.jLabel39.setText(all.login.usuario);
                                       all.limpiar.Limpiar_empty_easy();
                                       all.crono.reboot();
                                       all.abrir.setVisible(true);
                                       } else if (all.entrenador.jLabel20.getText().equals(" ")){
                                           all.entrenador.jLabel20.setText("Easy");
                                           all.entrenador.jLabel30.setText(Cronometro.getText());
                                           all.entrenador.jLabel40.setText(all.login.usuario);
                                           all.limpiar.Limpiar_empty_easy();
                                           all.crono.reboot();
                                           all.abrir.setVisible(true);
                                             } else if (all.entrenador.jLabel21.getText().equals(" ")){
                                                 all.entrenador.jLabel21.setText("Easy");
                                                 all.entrenador.jLabel31.setText(Cronometro.getText());
                                                 all.entrenador.jLabel41.setText(all.login.usuario);
                                                 all.limpiar.Limpiar_empty_easy();
                                                 all.crono.reboot();
                                                 all.abrir.setVisible(true);
                                                   } else if (all.entrenador.jLabel12.getText().equals(" ")){
                                                        all.entrenador.jLabel12.setText("Easy");
                                                        all.entrenador.jLabel22.setText(Cronometro.getText());
                                                        all.entrenador.jLabel32.setText(all.login.usuario);
                                                        all.limpiar.Limpiar_empty_easy();
                                                        all.crono.reboot();
                                                        all.abrir.setVisible(true);
                                                        }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan numeros de parte por ingresar.");
            JOptionPane.showMessageDialog(null, "No se puede finalizar...");
        }
    }//GEN-LAST:event_EndJobActionPerformed

    private void AutoLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoLogActionPerformed
        all.F4_funcion.F4_funcion();
    }//GEN-LAST:event_AutoLogActionPerformed

    private void SuspenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuspenderActionPerformed
        all.suspender.setVisible(true);
        all.crono.mTimer.stop();
    }//GEN-LAST:event_SuspenderActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        all.remover_funcion.remover();
    }//GEN-LAST:event_RemoverActionPerformed

    private void f2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f2KeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_f2KeyTyped

    private void ViewInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewInsActionPerformed

    private void EndJobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EndJobKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_EndJobKeyTyped

    private void AutoLogKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AutoLogKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_AutoLogKeyTyped

    private void ExtFuncKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExtFuncKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_ExtFuncKeyTyped

    private void ReworkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReworkKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_ReworkKeyTyped

    private void SuspenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SuspenderKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_SuspenderKeyTyped

    private void ViewInsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ViewInsKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_ViewInsKeyTyped

    private void RemoverKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RemoverKeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_RemoverKeyTyped

    private void jButton9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_jButton9KeyTyped

    private void jButton10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton10KeyTyped
        int btn = evt.getKeyChar();
        switch (btn) {
            case KeyEvent.VK_2:
                f2ActionPerformed(null);
                break;
            case KeyEvent.VK_3:
                EndJobActionPerformed(null);
                break;
            case KeyEvent.VK_4:
                AutoLogActionPerformed(null);
                break;
            case KeyEvent.VK_5:
                ExtFuncActionPerformed(null);
                break;
            case KeyEvent.VK_6:
                ReworkActionPerformed(null);
                break;
            case KeyEvent.VK_7:
                SuspenderActionPerformed(null);
                break;
            case KeyEvent.VK_8:
                ViewInsActionPerformed(null);
                break;
            case KeyEvent.VK_0:
                RemoverActionPerformed(null);
                break;
        }
    }//GEN-LAST:event_jButton10KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cronometro.setVisible(false);
        milisegundos.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cronometro.setVisible(true);
        milisegundos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NPS29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS29MouseClicked
        if (evt.getClickCount()>1){
            if (this.idsp29.getText().equals("A")){
                pn = this.npaescanear29.getText().toUpperCase();
                pn2 = this.npaescanear29.getText().substring(3).toUpperCase();
                nm = 29;
                f2ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Part to Add");
            }
        }/* else {
            pn = this.npaescanear29.getText().toUpperCase();
            pn2 = this.npaescanear29.getText().substring(3).toUpperCase();
            nm = 29;
            this.NPS29.setBackground(Color.black);
            this.DISP29.setForeground(Color.white);
            this.FQT29.setForeground(Color.white);
            this.QT29.setForeground(Color.white);
            this.cantidadfinal29.setForeground(Color.white);
            this.cantidadrequerida29.setForeground(Color.white);
            this.descripcion29.setForeground(Color.white);
            this.idsp29.setForeground(Color.white);
            this.npaescanear29.setForeground(Color.white);
            this.npecaneado29.setForeground(Color.white);
            this.serial29.setForeground(Color.white);
        }*/
    }//GEN-LAST:event_NPS29MouseClicked

    private void NPS32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS32MouseClicked
        if (evt.getClickCount()>1){
            if (this.idsp32.getText().equals("A")){
                pn = this.npaescanear32.getText().toUpperCase();
                pn2 = this.npaescanear32.getText().substring(3).toUpperCase();
                nm = 32;
                f2ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Part to Add");
            }
        }/* else {
            pn = this.npaescanear32.getText().toUpperCase();
            pn2 = this.npaescanear32.getText().substring(3).toUpperCase();
            nm = 32;
            this.NPS32.setBackground(Color.black);
            this.DISP32.setForeground(Color.white);
            this.FQT32.setForeground(Color.white);
            this.QT32.setForeground(Color.white);
            this.cantidadfinal32.setForeground(Color.white);
            this.cantidadrequerida32.setForeground(Color.white);
            this.descripcion32.setForeground(Color.white);
            this.idsp32.setForeground(Color.white);
            this.npaescanear32.setForeground(Color.white);
            this.npecaneado32.setForeground(Color.white);
            this.serial32.setForeground(Color.white);
        }*/
    }//GEN-LAST:event_NPS32MouseClicked

    private void NPS33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS33MouseClicked
        if (evt.getClickCount()>1){
            if (this.idsp33.getText().equals("A")){
                pn = this.npaescanear33.getText().toUpperCase();
                pn2 = this.npaescanear33.getText().substring(3).toUpperCase();
                nm = 33;
                f2ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Part to Add");
            }
        }/* else {
            pn = this.npaescanear33.getText().toUpperCase();
            pn2 = this.npaescanear33.getText().substring(3).toUpperCase();
            nm = 33;
            this.NPS33.setBackground(Color.black);
            this.DISP33.setForeground(Color.white);
            this.FQT33.setForeground(Color.white);
            this.QT33.setForeground(Color.white);
            this.cantidadfinal33.setForeground(Color.white);
            this.cantidadrequerida33.setForeground(Color.white);
            this.descripcion33.setForeground(Color.white);
            this.idsp33.setForeground(Color.white);
            this.npaescanear33.setForeground(Color.white);
            this.npecaneado33.setForeground(Color.white);
            this.serial33.setForeground(Color.white);
        }*/
    }//GEN-LAST:event_NPS33MouseClicked

    private void NPS35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS35MouseClicked
        if (evt.getClickCount()>1){
            if (this.idsp35.getText().equals("A")){
                pn = this.npaescanear35.getText().toUpperCase();
                pn2 = this.npaescanear35.getText().substring(3).toUpperCase();
                nm = 35;
                f2ActionPerformed(null);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Part to Add");
            }
        }/* else {
            pn = this.npaescanear35.getText().toUpperCase();
            pn2 = this.npaescanear35.getText().substring(3).toUpperCase();
            nm = 35;
            this.NPS35.setBackground(Color.black);
            this.DISP35.setForeground(Color.white);
            this.FQT35.setForeground(Color.white);
            this.QT35.setForeground(Color.white);
            this.cantidadfinal35.setForeground(Color.white);
            this.cantidadrequerida35.setForeground(Color.white);
            this.descripcion35.setForeground(Color.white);
            this.idsp35.setForeground(Color.white);
            this.npaescanear35.setForeground(Color.white);
            this.npecaneado35.setForeground(Color.white);
            this.serial35.setForeground(Color.white);
        }*/
    }//GEN-LAST:event_NPS35MouseClicked

    private void change6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change6StateChanged
        if (idsp29.getText().equals("I") && idsp32.getText().equals("I") && idsp33.getText().equals("I") && idsp35.getText().equals("I")){
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Empty_med().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutoLog;
    private javax.swing.JPanel Bisagrastraseras;
    private javax.swing.JLabel Cntr;
    public javax.swing.JLabel Cronometro;
    public javax.swing.JLabel DISP29;
    public javax.swing.JLabel DISP32;
    public javax.swing.JLabel DISP33;
    public javax.swing.JLabel DISP35;
    private javax.swing.JButton EndJob;
    private javax.swing.JButton ExtFunc;
    public javax.swing.JLabel FQT29;
    public javax.swing.JLabel FQT32;
    public javax.swing.JLabel FQT33;
    public javax.swing.JLabel FQT35;
    public javax.swing.JPanel Imagen_bisagras_del_421;
    public javax.swing.JPanel Imagen_etiqueta_1952;
    public javax.swing.JPanel Imagen_etiqueta_396;
    public javax.swing.JPanel Imagen_etiqueta_534;
    public javax.swing.JPanel Imagen_ext_mangueras;
    public javax.swing.JPanel Imagen_pdu_485;
    public javax.swing.JPanel Imagen_rack;
    private javax.swing.JPanel Imagen_rieles_pdu;
    public javax.swing.JPanel Material_bisagras_del_421;
    public javax.swing.JPanel Material_etiqueta_1952;
    public javax.swing.JPanel Material_etiqueta_396;
    public javax.swing.JPanel Material_etiqueta_534;
    public javax.swing.JPanel Material_ext_magueras;
    public javax.swing.JPanel Material_pdu_485;
    public javax.swing.JPanel Material_rack;
    private javax.swing.JPanel Material_rieles_PDU;
    public javax.swing.JPanel NPS29;
    public javax.swing.JPanel NPS32;
    public javax.swing.JPanel NPS33;
    public javax.swing.JPanel NPS35;
    public javax.swing.JLabel QT29;
    public javax.swing.JLabel QT32;
    public javax.swing.JLabel QT33;
    public javax.swing.JLabel QT35;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Rework;
    private javax.swing.JButton Suspender;
    public javax.swing.JLabel User500;
    private javax.swing.JButton ViewIns;
    public javax.swing.JPanel bisagraslatch1;
    public javax.swing.JLabel bisagratraserair;
    public javax.swing.JPanel bloque1;
    public javax.swing.JLabel cantidadfinal29;
    public javax.swing.JLabel cantidadfinal32;
    public javax.swing.JLabel cantidadfinal33;
    public javax.swing.JLabel cantidadfinal35;
    public javax.swing.JLabel cantidadrequerida29;
    public javax.swing.JLabel cantidadrequerida32;
    public javax.swing.JLabel cantidadrequerida33;
    public javax.swing.JLabel cantidadrequerida35;
    public javax.swing.JCheckBox change6;
    public javax.swing.JScrollPane cuerpo;
    public javax.swing.JLabel descripcion29;
    public javax.swing.JLabel descripcion32;
    public javax.swing.JLabel descripcion33;
    public javax.swing.JLabel descripcion35;
    public javax.swing.JButton f2;
    public javax.swing.JLabel idsp29;
    public javax.swing.JLabel idsp32;
    public javax.swing.JLabel idsp33;
    public javax.swing.JLabel idsp35;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel milisegundos;
    public javax.swing.JLabel npaescanear29;
    public javax.swing.JLabel npaescanear32;
    public javax.swing.JLabel npaescanear33;
    public javax.swing.JLabel npaescanear35;
    public javax.swing.JLabel npecaneado29;
    public javax.swing.JLabel npecaneado32;
    public javax.swing.JLabel npecaneado33;
    public javax.swing.JLabel npecaneado35;
    public javax.swing.JLabel serial29;
    public javax.swing.JLabel serial32;
    public javax.swing.JLabel serial33;
    public javax.swing.JLabel serial35;
    public javax.swing.JLabel work500;
    // End of variables declaration//GEN-END:variables
}
