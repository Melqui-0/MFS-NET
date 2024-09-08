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
        cuerpo.getVerticalScrollBar().setUnitIncrement(16);

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
        Material_Bisagra_Tras_111 = new javax.swing.JPanel();
        Imagen_Material_Bisagras_Tras_111 = new javax.swing.JPanel();
        Material_rieles_PDU = new javax.swing.JPanel();
        Imagen_rieles_pdu = new javax.swing.JPanel();
        Material_Contrapesos = new javax.swing.JPanel();
        Imagen_contrapesos = new javax.swing.JPanel();
        Material_extensiones = new javax.swing.JPanel();
        Imagen_extensiones = new javax.swing.JPanel();
        Cable_monitor = new javax.swing.JPanel();
        Imagen_cable_monitor = new javax.swing.JPanel();
        Material_monitor = new javax.swing.JPanel();
        Imagen_monitor = new javax.swing.JPanel();
        Material_Llantas = new javax.swing.JPanel();
        Imagen_Material_Llantas = new javax.swing.JPanel();
        Material_Ext_Denali = new javax.swing.JPanel();
        Imagen_Material_Ext_Denali = new javax.swing.JPanel();
        Material_Bisagras_Del_111 = new javax.swing.JPanel();
        Imagen_Material_Bisagra_Del_111 = new javax.swing.JPanel();
        Material_Switch = new javax.swing.JPanel();
        Imagen_Material_Swithc = new javax.swing.JPanel();

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
        Imagen_rack.setPreferredSize(new java.awt.Dimension(912, 621));

        javax.swing.GroupLayout Imagen_rackLayout = new javax.swing.GroupLayout(Imagen_rack);
        Imagen_rack.setLayout(Imagen_rackLayout);
        Imagen_rackLayout.setHorizontalGroup(
            Imagen_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_rackLayout.setVerticalGroup(
            Imagen_rackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 619, Short.MAX_VALUE)
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
        Imagen_ext_mangueras.setPreferredSize(new java.awt.Dimension(912, 568));

        javax.swing.GroupLayout Imagen_ext_manguerasLayout = new javax.swing.GroupLayout(Imagen_ext_mangueras);
        Imagen_ext_mangueras.setLayout(Imagen_ext_manguerasLayout);
        Imagen_ext_manguerasLayout.setHorizontalGroup(
            Imagen_ext_manguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_ext_manguerasLayout.setVerticalGroup(
            Imagen_ext_manguerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 624, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        Material_Bisagra_Tras_111.setBackground(new java.awt.Color(255, 255, 255));
        Material_Bisagra_Tras_111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_Bisagra_Tras_111Layout = new javax.swing.GroupLayout(Material_Bisagra_Tras_111);
        Material_Bisagra_Tras_111.setLayout(Material_Bisagra_Tras_111Layout);
        Material_Bisagra_Tras_111Layout.setHorizontalGroup(
            Material_Bisagra_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        Material_Bisagra_Tras_111Layout.setVerticalGroup(
            Material_Bisagra_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Imagen_Material_Bisagras_Tras_111.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Bisagras_Tras_111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_Material_Bisagras_Tras_111Layout = new javax.swing.GroupLayout(Imagen_Material_Bisagras_Tras_111);
        Imagen_Material_Bisagras_Tras_111.setLayout(Imagen_Material_Bisagras_Tras_111Layout);
        Imagen_Material_Bisagras_Tras_111Layout.setHorizontalGroup(
            Imagen_Material_Bisagras_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_Material_Bisagras_Tras_111Layout.setVerticalGroup(
            Imagen_Material_Bisagras_Tras_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
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

        Material_Contrapesos.setBackground(new java.awt.Color(255, 255, 255));
        Material_Contrapesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_ContrapesosLayout = new javax.swing.GroupLayout(Material_Contrapesos);
        Material_Contrapesos.setLayout(Material_ContrapesosLayout);
        Material_ContrapesosLayout.setHorizontalGroup(
            Material_ContrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_ContrapesosLayout.setVerticalGroup(
            Material_ContrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
        );

        Imagen_contrapesos.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_contrapesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_contrapesosLayout = new javax.swing.GroupLayout(Imagen_contrapesos);
        Imagen_contrapesos.setLayout(Imagen_contrapesosLayout);
        Imagen_contrapesosLayout.setHorizontalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_contrapesosLayout.setVerticalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1134, Short.MAX_VALUE)
        );

        Material_extensiones.setBackground(new java.awt.Color(255, 255, 255));
        Material_extensiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_extensionesLayout = new javax.swing.GroupLayout(Material_extensiones);
        Material_extensiones.setLayout(Material_extensionesLayout);
        Material_extensionesLayout.setHorizontalGroup(
            Material_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_extensionesLayout.setVerticalGroup(
            Material_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_extensiones.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_extensiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_extensionesLayout = new javax.swing.GroupLayout(Imagen_extensiones);
        Imagen_extensiones.setLayout(Imagen_extensionesLayout);
        Imagen_extensionesLayout.setHorizontalGroup(
            Imagen_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_extensionesLayout.setVerticalGroup(
            Imagen_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2355, Short.MAX_VALUE)
        );

        Cable_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Cable_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Cable_monitorLayout = new javax.swing.GroupLayout(Cable_monitor);
        Cable_monitor.setLayout(Cable_monitorLayout);
        Cable_monitorLayout.setHorizontalGroup(
            Cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Cable_monitorLayout.setVerticalGroup(
            Cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Imagen_cable_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_cable_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_cable_monitorLayout = new javax.swing.GroupLayout(Imagen_cable_monitor);
        Imagen_cable_monitor.setLayout(Imagen_cable_monitorLayout);
        Imagen_cable_monitorLayout.setHorizontalGroup(
            Imagen_cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_cable_monitorLayout.setVerticalGroup(
            Imagen_cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Material_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Material_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_monitorLayout = new javax.swing.GroupLayout(Material_monitor);
        Material_monitor.setLayout(Material_monitorLayout);
        Material_monitorLayout.setHorizontalGroup(
            Material_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        Material_monitorLayout.setVerticalGroup(
            Material_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        Imagen_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_monitorLayout = new javax.swing.GroupLayout(Imagen_monitor);
        Imagen_monitor.setLayout(Imagen_monitorLayout);
        Imagen_monitorLayout.setHorizontalGroup(
            Imagen_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        Imagen_monitorLayout.setVerticalGroup(
            Imagen_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        Material_Llantas.setBackground(new java.awt.Color(255, 255, 255));
        Material_Llantas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_LlantasLayout = new javax.swing.GroupLayout(Material_Llantas);
        Material_Llantas.setLayout(Material_LlantasLayout);
        Material_LlantasLayout.setHorizontalGroup(
            Material_LlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_LlantasLayout.setVerticalGroup(
            Material_LlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_Material_Llantas.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Llantas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_Material_LlantasLayout = new javax.swing.GroupLayout(Imagen_Material_Llantas);
        Imagen_Material_Llantas.setLayout(Imagen_Material_LlantasLayout);
        Imagen_Material_LlantasLayout.setHorizontalGroup(
            Imagen_Material_LlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_Material_LlantasLayout.setVerticalGroup(
            Imagen_Material_LlantasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2355, Short.MAX_VALUE)
        );

        Material_Ext_Denali.setBackground(new java.awt.Color(255, 255, 255));
        Material_Ext_Denali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_Ext_DenaliLayout = new javax.swing.GroupLayout(Material_Ext_Denali);
        Material_Ext_Denali.setLayout(Material_Ext_DenaliLayout);
        Material_Ext_DenaliLayout.setHorizontalGroup(
            Material_Ext_DenaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Material_Ext_DenaliLayout.setVerticalGroup(
            Material_Ext_DenaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Imagen_Material_Ext_Denali.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Ext_Denali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_Material_Ext_DenaliLayout = new javax.swing.GroupLayout(Imagen_Material_Ext_Denali);
        Imagen_Material_Ext_Denali.setLayout(Imagen_Material_Ext_DenaliLayout);
        Imagen_Material_Ext_DenaliLayout.setHorizontalGroup(
            Imagen_Material_Ext_DenaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_Material_Ext_DenaliLayout.setVerticalGroup(
            Imagen_Material_Ext_DenaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        Material_Bisagras_Del_111.setBackground(new java.awt.Color(255, 255, 255));
        Material_Bisagras_Del_111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_Bisagras_Del_111Layout = new javax.swing.GroupLayout(Material_Bisagras_Del_111);
        Material_Bisagras_Del_111.setLayout(Material_Bisagras_Del_111Layout);
        Material_Bisagras_Del_111Layout.setHorizontalGroup(
            Material_Bisagras_Del_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        Material_Bisagras_Del_111Layout.setVerticalGroup(
            Material_Bisagras_Del_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Imagen_Material_Bisagra_Del_111.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Bisagra_Del_111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_Material_Bisagra_Del_111Layout = new javax.swing.GroupLayout(Imagen_Material_Bisagra_Del_111);
        Imagen_Material_Bisagra_Del_111.setLayout(Imagen_Material_Bisagra_Del_111Layout);
        Imagen_Material_Bisagra_Del_111Layout.setHorizontalGroup(
            Imagen_Material_Bisagra_Del_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        Imagen_Material_Bisagra_Del_111Layout.setVerticalGroup(
            Imagen_Material_Bisagra_Del_111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        Material_Switch.setBackground(new java.awt.Color(255, 255, 255));
        Material_Switch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Material_SwitchLayout = new javax.swing.GroupLayout(Material_Switch);
        Material_Switch.setLayout(Material_SwitchLayout);
        Material_SwitchLayout.setHorizontalGroup(
            Material_SwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        Material_SwitchLayout.setVerticalGroup(
            Material_SwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        Imagen_Material_Swithc.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_Material_Swithc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout Imagen_Material_SwithcLayout = new javax.swing.GroupLayout(Imagen_Material_Swithc);
        Imagen_Material_Swithc.setLayout(Imagen_Material_SwithcLayout);
        Imagen_Material_SwithcLayout.setHorizontalGroup(
            Imagen_Material_SwithcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Imagen_Material_SwithcLayout.setVerticalGroup(
            Imagen_Material_SwithcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bloque1Layout = new javax.swing.GroupLayout(bloque1);
        bloque1.setLayout(bloque1Layout);
        bloque1Layout.setHorizontalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Material_Switch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Ext_Denali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Llantas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_monitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cable_monitor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_extensiones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_rieles_PDU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_bisagras_del_421, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_pdu_485, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_1952, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_396, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_534, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_ext_magueras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Bisagra_Tras_111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_rack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Contrapesos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Bisagras_Del_111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Bisagras_Tras_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rieles_pdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_contrapesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_extensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_cable_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_ext_mangueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Llantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Ext_Denali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Bisagra_Del_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Swithc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        bloque1Layout.setVerticalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_ext_magueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_ext_mangueras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_etiqueta_534, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_Contrapesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_contrapesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_396, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_Material_Ext_Denali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Ext_Denali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_extensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_extensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_Material_Llantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Llantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cable_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_cable_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_pdu_485, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_rieles_PDU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_rieles_pdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_Material_Bisagra_Del_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Bisagras_Del_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_Material_Bisagras_Tras_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Bisagra_Tras_111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imagen_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_Switch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_Material_Swithc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9142, Short.MAX_VALUE))
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))))
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
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 29753, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30000, Short.MAX_VALUE)
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
        if (all.material_rack.idsp.getText().equals("I") && all.material_extmangueras.idsp1.getText().equals("I") && all.material_extmangueras.idsp2.getText().equals("I") && all.material_extmangueras.idsp3.getText().equals("I") && all.material_etiqueta_534.idsp4.getText().equals("I") && all.material_extmangueras.idsp5.getText().equals("I") && all.material_etiqueta_534.idsp6.getText().equals("I") && all.material_etiqueta_396.idsp7.getText().equals("I") && all.material_etiqueta_1952.idsp9.getText().equals("I") && all.material_pdu_485.idsp10.getText().equals("I") && all.material_pdu_485.idsp13.getText().equals("I") && all.material_pdu_485.idsp14.getText().equals("I") && all.material_pdu_485.idsp15.getText().equals("I") && all.material_pdu_485.idsp16.getText().equals("I") && all.material_pdu_485.idsp17.getText().equals("I") && all.material_pdu_485.idsp18.getText().equals("I") && all.material_pdu_485.idsp19.getText().equals("I") && all.material_pdu_485.idsp20.getText().equals("I") && all.material_pdu_485.idsp21.getText().equals("I") && all.material_pdu_485.idsp22.getText().equals("I") && all.material_pdu_485.idsp23.getText().equals("I")  && all.material_bisagras_del_421.idsp28.getText().equals("I") && all.material_bisagras_del_421.idsp30.getText().equals("I") && all.material_bisagras_del_421.idsp31.getText().equals("I") && all.material_bisagras_tras_111.idsp29.getText().equals("I") && all.material_bisagras_tras_111.idsp32.getText().equals("I") && all.material_bisagras_tras_111.idsp33.getText().equals("I") && all.material_bisagras_tras_111.idsp35.getText().equals("I") && all.imagen_rack.change.getText().equals("Completo") && all.imagen_extmangueras.change1.getText().equals("Completo") && all.imagen_etiqueta_534.change2.getText().equals("Completo") && all.imagen_etiqueta_396.change3.getText().equals("Completo") && all.imagen_etiqueta_1952.change4.getText().equals("Completo") && all.imagen_pdu_485.change5.getText().equals("Completo") && all.imagen_material_bisagras_tras_111.change6.getText().equals("Completo") && all.imagen_bisagras_del_421.change7.getText().equals("Completo")){
            if (all.imagen_rack.change.isSelected() && all.imagen_extmangueras.change1.isSelected() && all.imagen_etiqueta_534.change2.isSelected() && all.imagen_etiqueta_396.change3.isSelected() && all.imagen_etiqueta_1952.change4.isSelected() && all.imagen_pdu_485.change5.isSelected() && all.imagen_material_bisagras_tras_111.change6.isSelected() && all.imagen_bisagras_del_421.change7.isSelected()){
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
    public javax.swing.JPanel Cable_monitor;
    private javax.swing.JLabel Cntr;
    public javax.swing.JLabel Cronometro;
    private javax.swing.JButton EndJob;
    private javax.swing.JButton ExtFunc;
    public javax.swing.JPanel Imagen_Material_Bisagra_Del_111;
    public javax.swing.JPanel Imagen_Material_Bisagras_Tras_111;
    public javax.swing.JPanel Imagen_Material_Ext_Denali;
    public javax.swing.JPanel Imagen_Material_Llantas;
    public javax.swing.JPanel Imagen_Material_Swithc;
    public javax.swing.JPanel Imagen_bisagras_del_421;
    public javax.swing.JPanel Imagen_cable_monitor;
    public javax.swing.JPanel Imagen_contrapesos;
    public javax.swing.JPanel Imagen_etiqueta_1952;
    public javax.swing.JPanel Imagen_etiqueta_396;
    public javax.swing.JPanel Imagen_etiqueta_534;
    public javax.swing.JPanel Imagen_ext_mangueras;
    public javax.swing.JPanel Imagen_extensiones;
    public javax.swing.JPanel Imagen_monitor;
    public javax.swing.JPanel Imagen_pdu_485;
    public javax.swing.JPanel Imagen_rack;
    public javax.swing.JPanel Imagen_rieles_pdu;
    public javax.swing.JPanel Material_Bisagra_Tras_111;
    public javax.swing.JPanel Material_Bisagras_Del_111;
    public javax.swing.JPanel Material_Contrapesos;
    public javax.swing.JPanel Material_Ext_Denali;
    public javax.swing.JPanel Material_Llantas;
    public javax.swing.JPanel Material_Switch;
    public javax.swing.JPanel Material_bisagras_del_421;
    public javax.swing.JPanel Material_etiqueta_1952;
    public javax.swing.JPanel Material_etiqueta_396;
    public javax.swing.JPanel Material_etiqueta_534;
    public javax.swing.JPanel Material_ext_magueras;
    public javax.swing.JPanel Material_extensiones;
    public javax.swing.JPanel Material_monitor;
    public javax.swing.JPanel Material_pdu_485;
    public javax.swing.JPanel Material_rack;
    public javax.swing.JPanel Material_rieles_PDU;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Rework;
    private javax.swing.JButton Suspender;
    public javax.swing.JLabel User500;
    private javax.swing.JButton ViewIns;
    public javax.swing.JPanel bloque1;
    public javax.swing.JScrollPane cuerpo;
    public javax.swing.JButton f2;
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
    public javax.swing.JLabel work500;
    // End of variables declaration//GEN-END:variables
}
