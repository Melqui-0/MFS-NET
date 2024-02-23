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
        Material_Contrapesos = new javax.swing.JPanel();
        NPS106 = new javax.swing.JPanel();
        npaescanear106 = new javax.swing.JLabel();
        QT106 = new javax.swing.JLabel();
        FQT106 = new javax.swing.JLabel();
        DISP106 = new javax.swing.JLabel();
        idsp106 = new javax.swing.JLabel();
        descripcion106 = new javax.swing.JLabel();
        npecaneado106 = new javax.swing.JLabel();
        serial106 = new javax.swing.JLabel();
        cantidadrequerida106 = new javax.swing.JLabel();
        cantidadfinal106 = new javax.swing.JLabel();
        NPS105 = new javax.swing.JPanel();
        npaescanear105 = new javax.swing.JLabel();
        QT105 = new javax.swing.JLabel();
        FQT105 = new javax.swing.JLabel();
        DISP105 = new javax.swing.JLabel();
        idsp105 = new javax.swing.JLabel();
        descripcion105 = new javax.swing.JLabel();
        npecaneado105 = new javax.swing.JLabel();
        serial105 = new javax.swing.JLabel();
        cantidadrequerida105 = new javax.swing.JLabel();
        cantidadfinal105 = new javax.swing.JLabel();
        NPS104 = new javax.swing.JPanel();
        npaescanear104 = new javax.swing.JLabel();
        QT104 = new javax.swing.JLabel();
        FQT104 = new javax.swing.JLabel();
        DISP104 = new javax.swing.JLabel();
        idsp104 = new javax.swing.JLabel();
        descripcion104 = new javax.swing.JLabel();
        npecaneado104 = new javax.swing.JLabel();
        serial104 = new javax.swing.JLabel();
        cantidadrequerida104 = new javax.swing.JLabel();
        cantidadfinal104 = new javax.swing.JLabel();
        NPS103 = new javax.swing.JPanel();
        npaescanear103 = new javax.swing.JLabel();
        QT103 = new javax.swing.JLabel();
        FQT103 = new javax.swing.JLabel();
        DISP103 = new javax.swing.JLabel();
        idsp103 = new javax.swing.JLabel();
        descripcion103 = new javax.swing.JLabel();
        npecaneado103 = new javax.swing.JLabel();
        serial103 = new javax.swing.JLabel();
        cantidadrequerida103 = new javax.swing.JLabel();
        cantidadfinal103 = new javax.swing.JLabel();
        NPS110 = new javax.swing.JPanel();
        npaescanear110 = new javax.swing.JLabel();
        QT110 = new javax.swing.JLabel();
        FQT110 = new javax.swing.JLabel();
        DISP110 = new javax.swing.JLabel();
        idsp110 = new javax.swing.JLabel();
        descripcion110 = new javax.swing.JLabel();
        npecaneado110 = new javax.swing.JLabel();
        serial110 = new javax.swing.JLabel();
        cantidadrequerida110 = new javax.swing.JLabel();
        cantidadfinal110 = new javax.swing.JLabel();
        NPS111 = new javax.swing.JPanel();
        npaescanear111 = new javax.swing.JLabel();
        QT111 = new javax.swing.JLabel();
        FQT111 = new javax.swing.JLabel();
        DISP111 = new javax.swing.JLabel();
        idsp111 = new javax.swing.JLabel();
        descripcion111 = new javax.swing.JLabel();
        npecaneado111 = new javax.swing.JLabel();
        serial111 = new javax.swing.JLabel();
        cantidadrequerida111 = new javax.swing.JLabel();
        cantidadfinal111 = new javax.swing.JLabel();
        NPS112 = new javax.swing.JPanel();
        npaescanear112 = new javax.swing.JLabel();
        QT112 = new javax.swing.JLabel();
        FQT112 = new javax.swing.JLabel();
        DISP112 = new javax.swing.JLabel();
        idsp112 = new javax.swing.JLabel();
        descripcion112 = new javax.swing.JLabel();
        npecaneado112 = new javax.swing.JLabel();
        serial112 = new javax.swing.JLabel();
        cantidadrequerida112 = new javax.swing.JLabel();
        cantidadfinal112 = new javax.swing.JLabel();
        NPS113 = new javax.swing.JPanel();
        npaescanear113 = new javax.swing.JLabel();
        QT113 = new javax.swing.JLabel();
        FQT113 = new javax.swing.JLabel();
        DISP113 = new javax.swing.JLabel();
        idsp113 = new javax.swing.JLabel();
        descripcion113 = new javax.swing.JLabel();
        npecaneado113 = new javax.swing.JLabel();
        serial113 = new javax.swing.JLabel();
        cantidadrequerida113 = new javax.swing.JLabel();
        cantidadfinal113 = new javax.swing.JLabel();
        NPS116 = new javax.swing.JPanel();
        npaescanear116 = new javax.swing.JLabel();
        QT116 = new javax.swing.JLabel();
        FQT116 = new javax.swing.JLabel();
        DISP116 = new javax.swing.JLabel();
        idsp116 = new javax.swing.JLabel();
        descripcion116 = new javax.swing.JLabel();
        npecaneado116 = new javax.swing.JLabel();
        serial116 = new javax.swing.JLabel();
        cantidadrequerida116 = new javax.swing.JLabel();
        cantidadfinal116 = new javax.swing.JLabel();
        NPS114 = new javax.swing.JPanel();
        npaescanear114 = new javax.swing.JLabel();
        QT114 = new javax.swing.JLabel();
        FQT114 = new javax.swing.JLabel();
        DISP114 = new javax.swing.JLabel();
        idsp114 = new javax.swing.JLabel();
        descripcion114 = new javax.swing.JLabel();
        npecaneado114 = new javax.swing.JLabel();
        serial114 = new javax.swing.JLabel();
        cantidadrequerida114 = new javax.swing.JLabel();
        cantidadfinal114 = new javax.swing.JLabel();
        NPS115 = new javax.swing.JPanel();
        npaescanear115 = new javax.swing.JLabel();
        QT115 = new javax.swing.JLabel();
        FQT115 = new javax.swing.JLabel();
        DISP115 = new javax.swing.JLabel();
        idsp115 = new javax.swing.JLabel();
        descripcion115 = new javax.swing.JLabel();
        npecaneado115 = new javax.swing.JLabel();
        serial115 = new javax.swing.JLabel();
        cantidadrequerida115 = new javax.swing.JLabel();
        cantidadfinal115 = new javax.swing.JLabel();
        NPS117 = new javax.swing.JPanel();
        npaescanear117 = new javax.swing.JLabel();
        QT117 = new javax.swing.JLabel();
        FQT117 = new javax.swing.JLabel();
        DISP117 = new javax.swing.JLabel();
        idsp117 = new javax.swing.JLabel();
        descripcion117 = new javax.swing.JLabel();
        npecaneado117 = new javax.swing.JLabel();
        serial117 = new javax.swing.JLabel();
        cantidadrequerida117 = new javax.swing.JLabel();
        cantidadfinal117 = new javax.swing.JLabel();
        Imagen_contrapesos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        change9 = new javax.swing.JCheckBox();
        Material_extensiones = new javax.swing.JPanel();
        NPS119 = new javax.swing.JPanel();
        npaescanear119 = new javax.swing.JLabel();
        QT119 = new javax.swing.JLabel();
        FQT119 = new javax.swing.JLabel();
        DISP119 = new javax.swing.JLabel();
        idsp119 = new javax.swing.JLabel();
        descripcion119 = new javax.swing.JLabel();
        npecaneado119 = new javax.swing.JLabel();
        serial119 = new javax.swing.JLabel();
        cantidadrequerida119 = new javax.swing.JLabel();
        cantidadfinal119 = new javax.swing.JLabel();
        NPS120 = new javax.swing.JPanel();
        npaescanear120 = new javax.swing.JLabel();
        QT120 = new javax.swing.JLabel();
        FQT120 = new javax.swing.JLabel();
        DISP120 = new javax.swing.JLabel();
        idsp120 = new javax.swing.JLabel();
        descripcion120 = new javax.swing.JLabel();
        npecaneado120 = new javax.swing.JLabel();
        serial120 = new javax.swing.JLabel();
        cantidadrequerida120 = new javax.swing.JLabel();
        cantidadfinal120 = new javax.swing.JLabel();
        NPS123 = new javax.swing.JPanel();
        npaescanear123 = new javax.swing.JLabel();
        QT123 = new javax.swing.JLabel();
        FQT123 = new javax.swing.JLabel();
        DISP123 = new javax.swing.JLabel();
        idsp123 = new javax.swing.JLabel();
        descripcion123 = new javax.swing.JLabel();
        npecaneado123 = new javax.swing.JLabel();
        serial123 = new javax.swing.JLabel();
        cantidadrequerida123 = new javax.swing.JLabel();
        cantidadfinal123 = new javax.swing.JLabel();
        NPS121 = new javax.swing.JPanel();
        npaescanear121 = new javax.swing.JLabel();
        QT121 = new javax.swing.JLabel();
        FQT121 = new javax.swing.JLabel();
        DISP121 = new javax.swing.JLabel();
        idsp121 = new javax.swing.JLabel();
        descripcion121 = new javax.swing.JLabel();
        npecaneado121 = new javax.swing.JLabel();
        serial121 = new javax.swing.JLabel();
        cantidadrequerida121 = new javax.swing.JLabel();
        cantidadfinal121 = new javax.swing.JLabel();
        NPS118 = new javax.swing.JPanel();
        npaescanear118 = new javax.swing.JLabel();
        QT118 = new javax.swing.JLabel();
        FQT118 = new javax.swing.JLabel();
        DISP118 = new javax.swing.JLabel();
        idsp118 = new javax.swing.JLabel();
        descripcion118 = new javax.swing.JLabel();
        npecaneado118 = new javax.swing.JLabel();
        serial118 = new javax.swing.JLabel();
        cantidadrequerida118 = new javax.swing.JLabel();
        cantidadfinal118 = new javax.swing.JLabel();
        NPS122 = new javax.swing.JPanel();
        npaescanear122 = new javax.swing.JLabel();
        QT122 = new javax.swing.JLabel();
        FQT122 = new javax.swing.JLabel();
        DISP122 = new javax.swing.JLabel();
        idsp122 = new javax.swing.JLabel();
        descripcion122 = new javax.swing.JLabel();
        npecaneado122 = new javax.swing.JLabel();
        serial122 = new javax.swing.JLabel();
        cantidadrequerida122 = new javax.swing.JLabel();
        cantidadfinal122 = new javax.swing.JLabel();
        Imagen_extensiones = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        change10 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        Cable_monitor = new javax.swing.JPanel();
        NPS124 = new javax.swing.JPanel();
        npaescanear124 = new javax.swing.JLabel();
        QT124 = new javax.swing.JLabel();
        FQT124 = new javax.swing.JLabel();
        DISP124 = new javax.swing.JLabel();
        idsp124 = new javax.swing.JLabel();
        descripcion124 = new javax.swing.JLabel();
        npecaneado124 = new javax.swing.JLabel();
        serial124 = new javax.swing.JLabel();
        cantidadrequerida124 = new javax.swing.JLabel();
        cantidadfinal124 = new javax.swing.JLabel();
        Imagen_cable_monitor = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        change11 = new javax.swing.JCheckBox();
        Material_monitor = new javax.swing.JPanel();
        NPS127 = new javax.swing.JPanel();
        npaescanear127 = new javax.swing.JLabel();
        QT127 = new javax.swing.JLabel();
        FQT127 = new javax.swing.JLabel();
        DISP127 = new javax.swing.JLabel();
        idsp127 = new javax.swing.JLabel();
        descripcion127 = new javax.swing.JLabel();
        npecaneado127 = new javax.swing.JLabel();
        serial127 = new javax.swing.JLabel();
        cantidadrequerida127 = new javax.swing.JLabel();
        cantidadfinal127 = new javax.swing.JLabel();
        Imagen_monitor = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

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

        Material_Contrapesos.setBackground(new java.awt.Color(255, 255, 255));
        Material_Contrapesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS106.setBackground(new java.awt.Color(255, 255, 255));
        NPS106.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS106.setFocusable(false);
        NPS106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS106MouseClicked(evt);
            }
        });

        npaescanear106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear106.setText("00N8709");

        QT106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT106.setText("QT:");

        FQT106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT106.setText("FQT:");

        DISP106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP106.setText("IDSP:");

        idsp106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp106.setText("A");

        descripcion106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion106.setText("CLIP      \"C\"    CLIP");

        npecaneado106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado106.setText("PF  2L01- PDU4");

        serial106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial106.setText("-             -            -");

        cantidadrequerida106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida106.setText("00002");

        cantidadfinal106.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal106.setText("00000");

        javax.swing.GroupLayout NPS106Layout = new javax.swing.GroupLayout(NPS106);
        NPS106.setLayout(NPS106Layout);
        NPS106Layout.setHorizontalGroup(
            NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS106Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS106Layout.createSequentialGroup()
                        .addComponent(npecaneado106, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial106, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS106Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(npaescanear106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QT106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadrequerida106)
                        .addGap(28, 28, 28)
                        .addComponent(FQT106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadfinal106)
                        .addGap(32, 32, 32))
                    .addGroup(NPS106Layout.createSequentialGroup()
                        .addComponent(DISP106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idsp106)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descripcion106, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        NPS106Layout.setVerticalGroup(
            NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS106Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear106)
                    .addComponent(QT106)
                    .addComponent(FQT106)
                    .addComponent(cantidadrequerida106)
                    .addComponent(cantidadfinal106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP106)
                    .addComponent(idsp106)
                    .addComponent(descripcion106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado106)
                    .addComponent(serial106))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS105.setBackground(new java.awt.Color(255, 255, 255));
        NPS105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS105.setFocusable(false);
        NPS105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS105MouseClicked(evt);
            }
        });

        npaescanear105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear105.setText("46K4314");

        QT105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT105.setText("QT:");

        FQT105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT105.setText("FQT:");

        DISP105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP105.setText("IDSP:");

        idsp105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp105.setText("A");

        descripcion105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion105.setText("SCREW");

        npecaneado105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado105.setText("PF  2L01");

        serial105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial105.setText("-             -            -");

        cantidadrequerida105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida105.setText("00002");

        cantidadfinal105.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal105.setText("00000");

        javax.swing.GroupLayout NPS105Layout = new javax.swing.GroupLayout(NPS105);
        NPS105.setLayout(NPS105Layout);
        NPS105Layout.setHorizontalGroup(
            NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS105Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS105Layout.createSequentialGroup()
                        .addComponent(npecaneado105, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial105, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS105Layout.createSequentialGroup()
                        .addGroup(NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS105Layout.createSequentialGroup()
                                .addComponent(DISP105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion105, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS105Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida105)
                                .addGap(28, 28, 28)
                                .addComponent(FQT105)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal105)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS105Layout.setVerticalGroup(
            NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS105Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear105)
                    .addComponent(QT105)
                    .addComponent(FQT105)
                    .addComponent(cantidadrequerida105)
                    .addComponent(cantidadfinal105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP105)
                    .addComponent(idsp105)
                    .addComponent(descripcion105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado105)
                    .addComponent(serial105))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS104.setBackground(new java.awt.Color(255, 255, 255));
        NPS104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS104.setFocusable(false);
        NPS104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS104MouseClicked(evt);
            }
        });

        npaescanear104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear104.setText("01KL444");

        QT104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT104.setText("QT:");

        FQT104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT104.setText("FQT:");

        DISP104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP104.setText("IDSP:");

        idsp104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp104.setText("A");

        descripcion104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion104.setText("BRACKET    BALLAST BRICK");

        npecaneado104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado104.setText("PF  2L01");

        serial104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial104.setText("-             -            -");

        cantidadrequerida104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida104.setText("00001");

        cantidadfinal104.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal104.setText("00000");

        javax.swing.GroupLayout NPS104Layout = new javax.swing.GroupLayout(NPS104);
        NPS104.setLayout(NPS104Layout);
        NPS104Layout.setHorizontalGroup(
            NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS104Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS104Layout.createSequentialGroup()
                        .addComponent(npecaneado104, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial104, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS104Layout.createSequentialGroup()
                        .addGroup(NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS104Layout.createSequentialGroup()
                                .addComponent(DISP104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion104, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS104Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida104)
                                .addGap(28, 28, 28)
                                .addComponent(FQT104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal104)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS104Layout.setVerticalGroup(
            NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS104Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear104)
                    .addComponent(QT104)
                    .addComponent(FQT104)
                    .addComponent(cantidadrequerida104)
                    .addComponent(cantidadfinal104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP104)
                    .addComponent(idsp104)
                    .addComponent(descripcion104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS104Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado104)
                    .addComponent(serial104))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS103.setBackground(new java.awt.Color(255, 255, 255));
        NPS103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS103.setFocusable(false);
        NPS103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS103MouseClicked(evt);
            }
        });

        npaescanear103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear103.setText("00N8709");

        QT103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT103.setText("QT:");

        FQT103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT103.setText("FQT:");

        DISP103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP103.setText("IDSP:");

        idsp103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp103.setText("A");

        descripcion103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion103.setText("CLIP      \"C\"    CLIP");

        npecaneado103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado103.setText("PF  2L01");

        serial103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial103.setText("-             -            -");

        cantidadrequerida103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida103.setText("00002");

        cantidadfinal103.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal103.setText("00000");

        javax.swing.GroupLayout NPS103Layout = new javax.swing.GroupLayout(NPS103);
        NPS103.setLayout(NPS103Layout);
        NPS103Layout.setHorizontalGroup(
            NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS103Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS103Layout.createSequentialGroup()
                        .addComponent(npecaneado103, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial103, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS103Layout.createSequentialGroup()
                        .addGroup(NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS103Layout.createSequentialGroup()
                                .addComponent(DISP103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion103, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS103Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida103)
                                .addGap(28, 28, 28)
                                .addComponent(FQT103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal103)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS103Layout.setVerticalGroup(
            NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS103Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear103)
                    .addComponent(QT103)
                    .addComponent(FQT103)
                    .addComponent(cantidadrequerida103)
                    .addComponent(cantidadfinal103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP103)
                    .addComponent(idsp103)
                    .addComponent(descripcion103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado103)
                    .addComponent(serial103))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS110.setBackground(new java.awt.Color(255, 255, 255));
        NPS110.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS110.setFocusable(false);
        NPS110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS110MouseClicked(evt);
            }
        });

        npaescanear110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear110.setText("01KL444");

        QT110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT110.setText("QT:");

        FQT110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT110.setText("FQT:");

        DISP110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP110.setText("IDSP:");

        idsp110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp110.setText("A");

        descripcion110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion110.setText("BRACKET    BALLAST BRICK");

        npecaneado110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado110.setText("PF  2L01- PDU4");

        serial110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial110.setText("-             -            -");

        cantidadrequerida110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida110.setText("00001");

        cantidadfinal110.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal110.setText("00000");

        javax.swing.GroupLayout NPS110Layout = new javax.swing.GroupLayout(NPS110);
        NPS110.setLayout(NPS110Layout);
        NPS110Layout.setHorizontalGroup(
            NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS110Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS110Layout.createSequentialGroup()
                        .addComponent(npecaneado110, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial110, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS110Layout.createSequentialGroup()
                        .addGroup(NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS110Layout.createSequentialGroup()
                                .addComponent(DISP110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion110, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS110Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida110)
                                .addGap(28, 28, 28)
                                .addComponent(FQT110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal110)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS110Layout.setVerticalGroup(
            NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS110Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear110)
                    .addComponent(QT110)
                    .addComponent(FQT110)
                    .addComponent(cantidadrequerida110)
                    .addComponent(cantidadfinal110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP110)
                    .addComponent(idsp110)
                    .addComponent(descripcion110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS110Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado110)
                    .addComponent(serial110))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS111.setBackground(new java.awt.Color(255, 255, 255));
        NPS111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS111.setFocusable(false);
        NPS111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS111MouseClicked(evt);
            }
        });

        npaescanear111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear111.setText("46K4314");

        QT111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT111.setText("QT:");

        FQT111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT111.setText("FQT:");

        DISP111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP111.setText("IDSP:");

        idsp111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp111.setText("A");

        descripcion111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion111.setText("SCREW");

        npecaneado111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado111.setText("PF  2L01- PDU4");

        serial111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial111.setText("-             -            -");

        cantidadrequerida111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida111.setText("00002");

        cantidadfinal111.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal111.setText("00000");

        javax.swing.GroupLayout NPS111Layout = new javax.swing.GroupLayout(NPS111);
        NPS111.setLayout(NPS111Layout);
        NPS111Layout.setHorizontalGroup(
            NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS111Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS111Layout.createSequentialGroup()
                        .addComponent(npecaneado111, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial111, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS111Layout.createSequentialGroup()
                        .addGroup(NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS111Layout.createSequentialGroup()
                                .addComponent(DISP111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion111, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS111Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida111)
                                .addGap(28, 28, 28)
                                .addComponent(FQT111)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal111)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS111Layout.setVerticalGroup(
            NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS111Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear111)
                    .addComponent(QT111)
                    .addComponent(FQT111)
                    .addComponent(cantidadrequerida111)
                    .addComponent(cantidadfinal111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP111)
                    .addComponent(idsp111)
                    .addComponent(descripcion111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado111)
                    .addComponent(serial111))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS112.setBackground(new java.awt.Color(255, 255, 255));
        NPS112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS112.setFocusable(false);
        NPS112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS112MouseClicked(evt);
            }
        });

        npaescanear112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear112.setText("00N8709");

        QT112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT112.setText("QT:");

        FQT112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT112.setText("FQT:");

        DISP112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP112.setText("IDSP:");

        idsp112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp112.setText("A");

        descripcion112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion112.setText("CLIP      \"C\"    CLIP");

        npecaneado112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado112.setText("PF  2L01- PDU4");

        serial112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial112.setText("-             -            -");

        cantidadrequerida112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida112.setText("00002");

        cantidadfinal112.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal112.setText("00000");

        javax.swing.GroupLayout NPS112Layout = new javax.swing.GroupLayout(NPS112);
        NPS112.setLayout(NPS112Layout);
        NPS112Layout.setHorizontalGroup(
            NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS112Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS112Layout.createSequentialGroup()
                        .addComponent(npecaneado112, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial112, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS112Layout.createSequentialGroup()
                        .addGroup(NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS112Layout.createSequentialGroup()
                                .addComponent(DISP112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion112, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS112Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida112)
                                .addGap(28, 28, 28)
                                .addComponent(FQT112)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal112)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS112Layout.setVerticalGroup(
            NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS112Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear112)
                    .addComponent(QT112)
                    .addComponent(FQT112)
                    .addComponent(cantidadrequerida112)
                    .addComponent(cantidadfinal112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP112)
                    .addComponent(idsp112)
                    .addComponent(descripcion112))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado112)
                    .addComponent(serial112))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS113.setBackground(new java.awt.Color(255, 255, 255));
        NPS113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS113.setFocusable(false);
        NPS113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS113MouseClicked(evt);
            }
        });

        npaescanear113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear113.setText("01KL444");

        QT113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT113.setText("QT:");

        FQT113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT113.setText("FQT:");

        DISP113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP113.setText("IDSP:");

        idsp113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp113.setText("A");

        descripcion113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion113.setText("BRACKET    BALLAST BRICK");

        npecaneado113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado113.setText("PF  2L01- PDU4");

        serial113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial113.setText("-             -            -");

        cantidadrequerida113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida113.setText("00001");

        cantidadfinal113.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal113.setText("00000");

        javax.swing.GroupLayout NPS113Layout = new javax.swing.GroupLayout(NPS113);
        NPS113.setLayout(NPS113Layout);
        NPS113Layout.setHorizontalGroup(
            NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS113Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS113Layout.createSequentialGroup()
                        .addComponent(npecaneado113, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial113, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS113Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(npaescanear113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QT113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadrequerida113)
                        .addGap(28, 28, 28)
                        .addComponent(FQT113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadfinal113)
                        .addGap(33, 33, 33))
                    .addGroup(NPS113Layout.createSequentialGroup()
                        .addComponent(DISP113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idsp113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descripcion113, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        NPS113Layout.setVerticalGroup(
            NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS113Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear113)
                    .addComponent(QT113)
                    .addComponent(FQT113)
                    .addComponent(cantidadrequerida113)
                    .addComponent(cantidadfinal113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP113)
                    .addComponent(idsp113)
                    .addComponent(descripcion113))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado113)
                    .addComponent(serial113))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS116.setBackground(new java.awt.Color(255, 255, 255));
        NPS116.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS116.setFocusable(false);
        NPS116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS116MouseClicked(evt);
            }
        });

        npaescanear116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear116.setText("00N8709");

        QT116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT116.setText("QT:");

        FQT116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT116.setText("FQT:");

        DISP116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP116.setText("IDSP:");

        idsp116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp116.setText("A");

        descripcion116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion116.setText("CLIP      \"C\"    CLIP");

        npecaneado116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado116.setText("PF  2L01- PDU4");

        serial116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial116.setText("-             -            -");

        cantidadrequerida116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida116.setText("00002");

        cantidadfinal116.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal116.setText("00000");

        javax.swing.GroupLayout NPS116Layout = new javax.swing.GroupLayout(NPS116);
        NPS116.setLayout(NPS116Layout);
        NPS116Layout.setHorizontalGroup(
            NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS116Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS116Layout.createSequentialGroup()
                        .addComponent(npecaneado116, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial116, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS116Layout.createSequentialGroup()
                        .addGroup(NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS116Layout.createSequentialGroup()
                                .addComponent(DISP116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion116, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS116Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida116)
                                .addGap(28, 28, 28)
                                .addComponent(FQT116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal116)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS116Layout.setVerticalGroup(
            NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS116Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear116)
                    .addComponent(QT116)
                    .addComponent(FQT116)
                    .addComponent(cantidadrequerida116)
                    .addComponent(cantidadfinal116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP116)
                    .addComponent(idsp116)
                    .addComponent(descripcion116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado116)
                    .addComponent(serial116))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS114.setBackground(new java.awt.Color(255, 255, 255));
        NPS114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS114.setFocusable(false);
        NPS114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS114MouseClicked(evt);
            }
        });

        npaescanear114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear114.setText("46K4314");

        QT114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT114.setText("QT:");

        FQT114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT114.setText("FQT:");

        DISP114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP114.setText("IDSP:");

        idsp114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp114.setText("A");

        descripcion114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion114.setText("SCREW");

        npecaneado114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado114.setText("PF  2L01- PDU4");

        serial114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial114.setText("-             -            -");

        cantidadrequerida114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida114.setText("00002");

        cantidadfinal114.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal114.setText("00000");

        javax.swing.GroupLayout NPS114Layout = new javax.swing.GroupLayout(NPS114);
        NPS114.setLayout(NPS114Layout);
        NPS114Layout.setHorizontalGroup(
            NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS114Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS114Layout.createSequentialGroup()
                        .addComponent(npecaneado114, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial114, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS114Layout.createSequentialGroup()
                        .addGroup(NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS114Layout.createSequentialGroup()
                                .addComponent(DISP114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion114, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS114Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida114)
                                .addGap(28, 28, 28)
                                .addComponent(FQT114)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal114)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS114Layout.setVerticalGroup(
            NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS114Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear114)
                    .addComponent(QT114)
                    .addComponent(FQT114)
                    .addComponent(cantidadrequerida114)
                    .addComponent(cantidadfinal114))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP114)
                    .addComponent(idsp114)
                    .addComponent(descripcion114))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado114)
                    .addComponent(serial114))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS115.setBackground(new java.awt.Color(255, 255, 255));
        NPS115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS115.setFocusable(false);
        NPS115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS115MouseClicked(evt);
            }
        });

        npaescanear115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear115.setText("01KL444");

        QT115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT115.setText("QT:");

        FQT115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT115.setText("FQT:");

        DISP115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP115.setText("IDSP:");

        idsp115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp115.setText("A");

        descripcion115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion115.setText("BRACKET    BALLAST BRICK");

        npecaneado115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado115.setText("PF  2L01- PDU4");

        serial115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial115.setText("-             -            -");

        cantidadrequerida115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida115.setText("00001");

        cantidadfinal115.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal115.setText("00000");

        javax.swing.GroupLayout NPS115Layout = new javax.swing.GroupLayout(NPS115);
        NPS115.setLayout(NPS115Layout);
        NPS115Layout.setHorizontalGroup(
            NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS115Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS115Layout.createSequentialGroup()
                        .addComponent(npecaneado115, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial115, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS115Layout.createSequentialGroup()
                        .addGroup(NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS115Layout.createSequentialGroup()
                                .addComponent(DISP115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion115, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS115Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida115)
                                .addGap(28, 28, 28)
                                .addComponent(FQT115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal115)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS115Layout.setVerticalGroup(
            NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS115Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear115)
                    .addComponent(QT115)
                    .addComponent(FQT115)
                    .addComponent(cantidadrequerida115)
                    .addComponent(cantidadfinal115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP115)
                    .addComponent(idsp115)
                    .addComponent(descripcion115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado115)
                    .addComponent(serial115))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS117.setBackground(new java.awt.Color(255, 255, 255));
        NPS117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS117.setFocusable(false);
        NPS117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS117MouseClicked(evt);
            }
        });

        npaescanear117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear117.setText("46K4314");

        QT117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT117.setText("QT:");

        FQT117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT117.setText("FQT:");

        DISP117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP117.setText("IDSP:");

        idsp117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp117.setText("A");

        descripcion117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion117.setText("SCREW");

        npecaneado117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado117.setText("PF  2L01- PDU4");

        serial117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial117.setText("-             -            -");

        cantidadrequerida117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida117.setText("00002");

        cantidadfinal117.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal117.setText("00000");

        javax.swing.GroupLayout NPS117Layout = new javax.swing.GroupLayout(NPS117);
        NPS117.setLayout(NPS117Layout);
        NPS117Layout.setHorizontalGroup(
            NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS117Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS117Layout.createSequentialGroup()
                        .addComponent(npecaneado117, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial117, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS117Layout.createSequentialGroup()
                        .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NPS117Layout.createSequentialGroup()
                                .addComponent(DISP117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp117))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NPS117Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear117)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descripcion117, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NPS117Layout.createSequentialGroup()
                                .addComponent(QT117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida117)
                                .addGap(28, 28, 28)
                                .addComponent(FQT117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal117)))
                        .addGap(31, 31, 31))))
        );
        NPS117Layout.setVerticalGroup(
            NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS117Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear117)
                    .addComponent(QT117)
                    .addComponent(FQT117)
                    .addComponent(cantidadrequerida117)
                    .addComponent(cantidadfinal117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP117)
                    .addComponent(idsp117)
                    .addComponent(descripcion117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado117)
                    .addComponent(serial117))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Material_ContrapesosLayout = new javax.swing.GroupLayout(Material_Contrapesos);
        Material_Contrapesos.setLayout(Material_ContrapesosLayout);
        Material_ContrapesosLayout.setHorizontalGroup(
            Material_ContrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NPS103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Material_ContrapesosLayout.setVerticalGroup(
            Material_ContrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Material_ContrapesosLayout.createSequentialGroup()
                .addComponent(NPS103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Imagen_contrapesos.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_contrapesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/BRICKMX_NEW.jpg"))); // NOI18N

        change9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change9.setText("Incompleto");
        change9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change9StateChanged(evt);
            }
        });
        change9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Imagen_contrapesosLayout = new javax.swing.GroupLayout(Imagen_contrapesos);
        Imagen_contrapesos.setLayout(Imagen_contrapesosLayout);
        Imagen_contrapesosLayout.setHorizontalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_contrapesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(change9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_contrapesosLayout.setVerticalGroup(
            Imagen_contrapesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_contrapesosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Material_extensiones.setBackground(new java.awt.Color(255, 255, 255));
        Material_extensiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS119.setBackground(new java.awt.Color(255, 255, 255));
        NPS119.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS119.setFocusable(false);
        NPS119.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS119MouseClicked(evt);
            }
        });

        npaescanear119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear119.setText("01KL741");

        QT119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT119.setText("QT:");

        FQT119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT119.setText("FQT:");

        DISP119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP119.setText("IDSP:");

        idsp119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp119.setText("A");

        descripcion119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion119.setText("SCREW screw+starwshr");

        npecaneado119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado119.setText("PF  2L01- PDU4");

        serial119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial119.setText("-             -            -");

        cantidadrequerida119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida119.setText("00004");

        cantidadfinal119.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal119.setText("00000");

        javax.swing.GroupLayout NPS119Layout = new javax.swing.GroupLayout(NPS119);
        NPS119.setLayout(NPS119Layout);
        NPS119Layout.setHorizontalGroup(
            NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS119Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS119Layout.createSequentialGroup()
                        .addComponent(npecaneado119, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial119, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS119Layout.createSequentialGroup()
                        .addGroup(NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS119Layout.createSequentialGroup()
                                .addComponent(DISP119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion119, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS119Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida119)
                                .addGap(28, 28, 28)
                                .addComponent(FQT119)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal119)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS119Layout.setVerticalGroup(
            NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS119Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear119)
                    .addComponent(QT119)
                    .addComponent(FQT119)
                    .addComponent(cantidadrequerida119)
                    .addComponent(cantidadfinal119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP119)
                    .addComponent(idsp119)
                    .addComponent(descripcion119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado119)
                    .addComponent(serial119))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS120.setBackground(new java.awt.Color(255, 255, 255));
        NPS120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS120.setFocusable(false);
        NPS120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS120MouseClicked(evt);
            }
        });

        npaescanear120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear120.setText("01KL592");

        QT120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT120.setText("QT:");

        FQT120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT120.setText("FQT:");

        DISP120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP120.setText("IDSP:");

        idsp120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp120.setText("A");

        descripcion120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion120.setText("PLATE       extender Bottm");

        npecaneado120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado120.setText("PF  2L01");

        serial120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial120.setText("-             -            -");

        cantidadrequerida120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida120.setText("00002");

        cantidadfinal120.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal120.setText("00000");

        javax.swing.GroupLayout NPS120Layout = new javax.swing.GroupLayout(NPS120);
        NPS120.setLayout(NPS120Layout);
        NPS120Layout.setHorizontalGroup(
            NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS120Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS120Layout.createSequentialGroup()
                        .addComponent(npecaneado120, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial120, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS120Layout.createSequentialGroup()
                        .addGroup(NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS120Layout.createSequentialGroup()
                                .addComponent(DISP120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion120, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS120Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida120)
                                .addGap(28, 28, 28)
                                .addComponent(FQT120)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal120)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS120Layout.setVerticalGroup(
            NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS120Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear120)
                    .addComponent(QT120)
                    .addComponent(FQT120)
                    .addComponent(cantidadrequerida120)
                    .addComponent(cantidadfinal120))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP120)
                    .addComponent(idsp120)
                    .addComponent(descripcion120))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado120)
                    .addComponent(serial120))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS123.setBackground(new java.awt.Color(255, 255, 255));
        NPS123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS123.setFocusable(false);
        NPS123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS123MouseClicked(evt);
            }
        });

        npaescanear123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear123.setText("01KL684");

        QT123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT123.setText("QT:");

        FQT123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT123.setText("FQT:");

        DISP123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP123.setText("IDSP:");

        idsp123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp123.setText("A");

        descripcion123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion123.setText("BRACKET     Lt Ext Asm");

        npecaneado123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado123.setText("PF  2L01");

        serial123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial123.setText("-             -            -");

        cantidadrequerida123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida123.setText("00001");

        cantidadfinal123.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal123.setText("00000");

        javax.swing.GroupLayout NPS123Layout = new javax.swing.GroupLayout(NPS123);
        NPS123.setLayout(NPS123Layout);
        NPS123Layout.setHorizontalGroup(
            NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS123Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS123Layout.createSequentialGroup()
                        .addComponent(npecaneado123, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial123, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS123Layout.createSequentialGroup()
                        .addGroup(NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS123Layout.createSequentialGroup()
                                .addComponent(DISP123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion123, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS123Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida123)
                                .addGap(28, 28, 28)
                                .addComponent(FQT123)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal123)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS123Layout.setVerticalGroup(
            NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS123Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear123)
                    .addComponent(QT123)
                    .addComponent(FQT123)
                    .addComponent(cantidadrequerida123)
                    .addComponent(cantidadfinal123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP123)
                    .addComponent(idsp123)
                    .addComponent(descripcion123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado123)
                    .addComponent(serial123))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS121.setBackground(new java.awt.Color(255, 255, 255));
        NPS121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS121.setFocusable(false);
        NPS121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS121MouseClicked(evt);
            }
        });

        npaescanear121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear121.setText("02CL385");

        QT121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT121.setText("QT:");

        FQT121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT121.setText("FQT:");

        DISP121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP121.setText("IDSP:");

        idsp121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp121.setText("A");

        descripcion121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion121.setText("PLATE extender top");

        npecaneado121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado121.setText("PF  2L01");

        serial121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial121.setText("-             -            -");

        cantidadrequerida121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida121.setText("00001");

        cantidadfinal121.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal121.setText("00000");

        javax.swing.GroupLayout NPS121Layout = new javax.swing.GroupLayout(NPS121);
        NPS121.setLayout(NPS121Layout);
        NPS121Layout.setHorizontalGroup(
            NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS121Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS121Layout.createSequentialGroup()
                        .addComponent(npecaneado121, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial121, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS121Layout.createSequentialGroup()
                        .addGroup(NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS121Layout.createSequentialGroup()
                                .addComponent(DISP121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion121, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS121Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida121)
                                .addGap(28, 28, 28)
                                .addComponent(FQT121)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal121)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS121Layout.setVerticalGroup(
            NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS121Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear121)
                    .addComponent(QT121)
                    .addComponent(FQT121)
                    .addComponent(cantidadrequerida121)
                    .addComponent(cantidadfinal121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP121)
                    .addComponent(idsp121)
                    .addComponent(descripcion121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado121)
                    .addComponent(serial121))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS118.setBackground(new java.awt.Color(255, 255, 255));
        NPS118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS118.setFocusable(false);
        NPS118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS118MouseClicked(evt);
            }
        });

        npaescanear118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear118.setText("01KL741");

        QT118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT118.setText("QT:");

        FQT118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT118.setText("FQT:");

        DISP118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP118.setText("IDSP:");

        idsp118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp118.setText("A");

        descripcion118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion118.setText("SCREW screw+starwshr");

        npecaneado118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado118.setText("PF  2L01- PDU4");

        serial118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial118.setText("-             -            -");

        cantidadrequerida118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida118.setText("00022");

        cantidadfinal118.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal118.setText("00000");

        javax.swing.GroupLayout NPS118Layout = new javax.swing.GroupLayout(NPS118);
        NPS118.setLayout(NPS118Layout);
        NPS118Layout.setHorizontalGroup(
            NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS118Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS118Layout.createSequentialGroup()
                        .addComponent(npecaneado118, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial118, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS118Layout.createSequentialGroup()
                        .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NPS118Layout.createSequentialGroup()
                                .addComponent(DISP118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp118))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NPS118Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear118)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descripcion118, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(NPS118Layout.createSequentialGroup()
                                .addComponent(QT118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida118)
                                .addGap(28, 28, 28)
                                .addComponent(FQT118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal118)))
                        .addGap(31, 31, 31))))
        );
        NPS118Layout.setVerticalGroup(
            NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS118Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear118)
                    .addComponent(QT118)
                    .addComponent(FQT118)
                    .addComponent(cantidadrequerida118)
                    .addComponent(cantidadfinal118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP118)
                    .addComponent(idsp118)
                    .addComponent(descripcion118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado118)
                    .addComponent(serial118))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NPS122.setBackground(new java.awt.Color(255, 255, 255));
        NPS122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS122.setFocusable(false);
        NPS122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS122MouseClicked(evt);
            }
        });

        npaescanear122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear122.setText("01KL685");

        QT122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT122.setText("QT:");

        FQT122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT122.setText("FQT:");

        DISP122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP122.setText("IDSP:");

        idsp122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp122.setText("A");

        descripcion122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion122.setText("BRACKET     Rt Extdr asm");

        npecaneado122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado122.setText("PF  2L01");

        serial122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial122.setText("-             -            -");

        cantidadrequerida122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida122.setText("00001");

        cantidadfinal122.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal122.setText("00000");

        javax.swing.GroupLayout NPS122Layout = new javax.swing.GroupLayout(NPS122);
        NPS122.setLayout(NPS122Layout);
        NPS122Layout.setHorizontalGroup(
            NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS122Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS122Layout.createSequentialGroup()
                        .addComponent(npecaneado122, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial122, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS122Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(npaescanear122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QT122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadrequerida122)
                        .addGap(28, 28, 28)
                        .addComponent(FQT122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadfinal122)
                        .addGap(33, 33, 33))
                    .addGroup(NPS122Layout.createSequentialGroup()
                        .addComponent(DISP122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idsp122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descripcion122, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        NPS122Layout.setVerticalGroup(
            NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS122Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear122)
                    .addComponent(QT122)
                    .addComponent(FQT122)
                    .addComponent(cantidadrequerida122)
                    .addComponent(cantidadfinal122))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP122)
                    .addComponent(idsp122)
                    .addComponent(descripcion122))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado122)
                    .addComponent(serial122))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Material_extensionesLayout = new javax.swing.GroupLayout(Material_extensiones);
        Material_extensiones.setLayout(Material_extensionesLayout);
        Material_extensionesLayout.setHorizontalGroup(
            Material_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NPS123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NPS118, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Material_extensionesLayout.setVerticalGroup(
            Material_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Material_extensionesLayout.createSequentialGroup()
                .addComponent(NPS123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPS118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1801, Short.MAX_VALUE))
        );

        Imagen_extensiones.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_extensiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/EXTLATRSK.jpg"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/EXTARRIB.jpg"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/EXTABAJO.jpg"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/EXTLATRSK1.jpg"))); // NOI18N

        change10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change10.setText("Incompleto");
        change10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change10StateChanged(evt);
            }
        });
        change10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Imagen_extensionesLayout = new javax.swing.GroupLayout(Imagen_extensiones);
        Imagen_extensiones.setLayout(Imagen_extensionesLayout);
        Imagen_extensionesLayout.setHorizontalGroup(
            Imagen_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_extensionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(change10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_extensionesLayout.setVerticalGroup(
            Imagen_extensionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_extensionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Cable_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Cable_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS124.setBackground(new java.awt.Color(255, 255, 255));
        NPS124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS124.setFocusable(false);
        NPS124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS124MouseClicked(evt);
            }
        });

        npaescanear124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear124.setText("00RY699");

        QT124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT124.setText("QT:");

        FQT124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT124.setText("FQT:");

        DISP124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP124.setText("IDSP:");

        idsp124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp124.setText("A");

        descripcion124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion124.setText("LINE CORD C14-C5 AB140");

        npecaneado124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado124.setText("PF  2L01");

        serial124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial124.setText("-             -            -");

        cantidadrequerida124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida124.setText("00001");

        cantidadfinal124.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal124.setText("00000");

        javax.swing.GroupLayout NPS124Layout = new javax.swing.GroupLayout(NPS124);
        NPS124.setLayout(NPS124Layout);
        NPS124Layout.setHorizontalGroup(
            NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS124Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS124Layout.createSequentialGroup()
                        .addComponent(npecaneado124, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial124, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS124Layout.createSequentialGroup()
                        .addGroup(NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(NPS124Layout.createSequentialGroup()
                                .addComponent(DISP124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idsp124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion124, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(NPS124Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(npaescanear124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QT124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadrequerida124)
                                .addGap(28, 28, 28)
                                .addComponent(FQT124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadfinal124)))
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS124Layout.setVerticalGroup(
            NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS124Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear124)
                    .addComponent(QT124)
                    .addComponent(FQT124)
                    .addComponent(cantidadrequerida124)
                    .addComponent(cantidadfinal124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP124)
                    .addComponent(idsp124)
                    .addComponent(descripcion124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado124)
                    .addComponent(serial124))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Cable_monitorLayout = new javax.swing.GroupLayout(Cable_monitor);
        Cable_monitor.setLayout(Cable_monitorLayout);
        Cable_monitorLayout.setHorizontalGroup(
            Cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NPS124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Cable_monitorLayout.setVerticalGroup(
            Cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cable_monitorLayout.createSequentialGroup()
                .addComponent(NPS124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Imagen_cable_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_cable_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/POWTF5CA.jpg"))); // NOI18N

        change11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        change11.setText("Incompleto");
        change11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                change11StateChanged(evt);
            }
        });
        change11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Imagen_cable_monitorLayout = new javax.swing.GroupLayout(Imagen_cable_monitor);
        Imagen_cable_monitor.setLayout(Imagen_cable_monitorLayout);
        Imagen_cable_monitorLayout.setHorizontalGroup(
            Imagen_cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_cable_monitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(change11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_cable_monitorLayout.setVerticalGroup(
            Imagen_cable_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_cable_monitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Material_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Material_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NPS127.setBackground(new java.awt.Color(255, 255, 255));
        NPS127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NPS127.setFocusable(false);
        NPS127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NPS127MouseClicked(evt);
            }
        });

        npaescanear127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npaescanear127.setText("03HD036");

        QT127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        QT127.setText("QT:");

        FQT127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FQT127.setText("FQT:");

        DISP127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DISP127.setText("IDSP:");

        idsp127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        idsp127.setText("A");

        descripcion127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        descripcion127.setText("DISPLAY     KMM US AB119A");

        npecaneado127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        npecaneado127.setText("PF  2L01");

        serial127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        serial127.setText("-             -            -");

        cantidadrequerida127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadrequerida127.setText("00001");

        cantidadfinal127.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cantidadfinal127.setText("00000");

        javax.swing.GroupLayout NPS127Layout = new javax.swing.GroupLayout(NPS127);
        NPS127.setLayout(NPS127Layout);
        NPS127Layout.setHorizontalGroup(
            NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS127Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(NPS127Layout.createSequentialGroup()
                        .addComponent(npecaneado127, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(serial127, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NPS127Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(npaescanear127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QT127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadrequerida127)
                        .addGap(28, 28, 28)
                        .addComponent(FQT127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadfinal127)
                        .addGap(12, 12, 12))
                    .addGroup(NPS127Layout.createSequentialGroup()
                        .addComponent(DISP127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idsp127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descripcion127)
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NPS127Layout.setVerticalGroup(
            NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NPS127Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npaescanear127)
                    .addComponent(QT127)
                    .addComponent(FQT127)
                    .addComponent(cantidadrequerida127)
                    .addComponent(cantidadfinal127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DISP127)
                    .addComponent(idsp127)
                    .addComponent(descripcion127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NPS127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npecaneado127)
                    .addComponent(serial127))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Material_monitorLayout = new javax.swing.GroupLayout(Material_monitor);
        Material_monitor.setLayout(Material_monitorLayout);
        Material_monitorLayout.setHorizontalGroup(
            Material_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NPS127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Material_monitorLayout.setVerticalGroup(
            Material_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Material_monitorLayout.createSequentialGroup()
                .addComponent(NPS127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 673, Short.MAX_VALUE))
        );

        Imagen_monitor.setBackground(new java.awt.Color(255, 255, 255));
        Imagen_monitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfs/Img/TF5RMA.jpg"))); // NOI18N

        jLabel21.setText("En la pregunta 7 la respuesta C está mal pues debería ser la D. (Ya se modificó) En la pregunta 14 se cree innecesaria pues el puente no siempre va por debajo dependiendo de  la configuración podría cambiar. (Se puede revisar con los entrenadores, ya que se planteó en experiencia de Medellín) (en esta pregunta la mayoria de las veces que e visto dejan un espacio hasta abajo del rack para hacer el puente, igual si han salido sistemas que no tienen ese espacio si no les parece la quitamos y solo hacemos mención en el entrenamiento, DM). En la pregunta 17 esta señalada el inciso C como correcta, pero en realidad lo correcto sería el inciso A. (Ya se modificó) La pregunta 28 debería ser de 600 (Se puede cambiar por la pregunta 20 de 600, al igual mover la pregunta 29 de 600A a 600) (si la pregunta 29 pasarla a 600 y restructurarla para hacer mencion de los ductos que son complementos de los switches ");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Imagen_monitorLayout = new javax.swing.GroupLayout(Imagen_monitor);
        Imagen_monitor.setLayout(Imagen_monitorLayout);
        Imagen_monitorLayout.setHorizontalGroup(
            Imagen_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_monitorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Imagen_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Imagen_monitorLayout.setVerticalGroup(
            Imagen_monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Imagen_monitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bloque1Layout = new javax.swing.GroupLayout(bloque1);
        bloque1.setLayout(bloque1Layout);
        bloque1Layout.setHorizontalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                    .addComponent(bisagraslatch1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_rack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_Contrapesos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(Imagen_rieles_pdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_contrapesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_extensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen_cable_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_monitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
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
                    .addComponent(Imagen_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Material_etiqueta_1952, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque1Layout.createSequentialGroup()
                        .addComponent(Material_extensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3441, 3441, 3441))
                    .addGroup(bloque1Layout.createSequentialGroup()
                        .addComponent(Imagen_extensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Material_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen_bisagras_del_421, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(100, 100, 100)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bisagraslatch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bisagrastraseras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Material_monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen_monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1124, 1124, 1124))
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
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 22204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22451, Short.MAX_VALUE)
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

    private void NPS103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS103MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS103MouseClicked

    private void NPS104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS104MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS104MouseClicked

    private void NPS105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS105MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS105MouseClicked

    private void NPS106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS106MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS106MouseClicked

    private void NPS110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS110MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS110MouseClicked

    private void NPS111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS111MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS111MouseClicked

    private void NPS112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS112MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS112MouseClicked

    private void NPS113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS113MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS113MouseClicked

    private void NPS114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS114MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS114MouseClicked

    private void NPS115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS115MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS115MouseClicked

    private void NPS116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS116MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS116MouseClicked

    private void NPS117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS117MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS117MouseClicked

    private void change9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change9StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_change9StateChanged

    private void change9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change9ActionPerformed

    private void NPS118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS118MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS118MouseClicked

    private void NPS119MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS119MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS119MouseClicked

    private void NPS120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS120MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS120MouseClicked

    private void NPS121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS121MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS121MouseClicked

    private void NPS122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS122MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS122MouseClicked

    private void NPS123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS123MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS123MouseClicked

    private void change10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change10StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_change10StateChanged

    private void change10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change10ActionPerformed

    private void NPS124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS124MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS124MouseClicked

    private void change11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_change11StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_change11StateChanged

    private void change11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_change11ActionPerformed

    private void NPS127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NPS127MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NPS127MouseClicked

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
    private javax.swing.JPanel Cable_monitor;
    private javax.swing.JLabel Cntr;
    public javax.swing.JLabel Cronometro;
    public javax.swing.JLabel DISP103;
    public javax.swing.JLabel DISP104;
    public javax.swing.JLabel DISP105;
    public javax.swing.JLabel DISP106;
    public javax.swing.JLabel DISP110;
    public javax.swing.JLabel DISP111;
    public javax.swing.JLabel DISP112;
    public javax.swing.JLabel DISP113;
    public javax.swing.JLabel DISP114;
    public javax.swing.JLabel DISP115;
    public javax.swing.JLabel DISP116;
    public javax.swing.JLabel DISP117;
    public javax.swing.JLabel DISP118;
    public javax.swing.JLabel DISP119;
    public javax.swing.JLabel DISP120;
    public javax.swing.JLabel DISP121;
    public javax.swing.JLabel DISP122;
    public javax.swing.JLabel DISP123;
    public javax.swing.JLabel DISP124;
    public javax.swing.JLabel DISP125;
    public javax.swing.JLabel DISP126;
    public javax.swing.JLabel DISP127;
    public javax.swing.JLabel DISP29;
    public javax.swing.JLabel DISP32;
    public javax.swing.JLabel DISP33;
    public javax.swing.JLabel DISP35;
    private javax.swing.JButton EndJob;
    private javax.swing.JButton ExtFunc;
    public javax.swing.JLabel FQT103;
    public javax.swing.JLabel FQT104;
    public javax.swing.JLabel FQT105;
    public javax.swing.JLabel FQT106;
    public javax.swing.JLabel FQT110;
    public javax.swing.JLabel FQT111;
    public javax.swing.JLabel FQT112;
    public javax.swing.JLabel FQT113;
    public javax.swing.JLabel FQT114;
    public javax.swing.JLabel FQT115;
    public javax.swing.JLabel FQT116;
    public javax.swing.JLabel FQT117;
    public javax.swing.JLabel FQT118;
    public javax.swing.JLabel FQT119;
    public javax.swing.JLabel FQT120;
    public javax.swing.JLabel FQT121;
    public javax.swing.JLabel FQT122;
    public javax.swing.JLabel FQT123;
    public javax.swing.JLabel FQT124;
    public javax.swing.JLabel FQT125;
    public javax.swing.JLabel FQT126;
    public javax.swing.JLabel FQT127;
    public javax.swing.JLabel FQT29;
    public javax.swing.JLabel FQT32;
    public javax.swing.JLabel FQT33;
    public javax.swing.JLabel FQT35;
    public javax.swing.JPanel Imagen_bisagras_del_421;
    private javax.swing.JPanel Imagen_cable_monitor;
    private javax.swing.JPanel Imagen_contrapesos;
    public javax.swing.JPanel Imagen_etiqueta_1952;
    public javax.swing.JPanel Imagen_etiqueta_396;
    public javax.swing.JPanel Imagen_etiqueta_534;
    public javax.swing.JPanel Imagen_ext_mangueras;
    private javax.swing.JPanel Imagen_extensiones;
    private javax.swing.JPanel Imagen_monitor;
    public javax.swing.JPanel Imagen_pdu_485;
    public javax.swing.JPanel Imagen_rack;
    private javax.swing.JPanel Imagen_rieles_pdu;
    private javax.swing.JPanel Material_Contrapesos;
    public javax.swing.JPanel Material_bisagras_del_421;
    public javax.swing.JPanel Material_etiqueta_1952;
    public javax.swing.JPanel Material_etiqueta_396;
    public javax.swing.JPanel Material_etiqueta_534;
    public javax.swing.JPanel Material_ext_magueras;
    private javax.swing.JPanel Material_extensiones;
    private javax.swing.JPanel Material_monitor;
    public javax.swing.JPanel Material_pdu_485;
    public javax.swing.JPanel Material_rack;
    private javax.swing.JPanel Material_rieles_PDU;
    public javax.swing.JPanel NPS103;
    public javax.swing.JPanel NPS104;
    public javax.swing.JPanel NPS105;
    public javax.swing.JPanel NPS106;
    public javax.swing.JPanel NPS110;
    public javax.swing.JPanel NPS111;
    public javax.swing.JPanel NPS112;
    public javax.swing.JPanel NPS113;
    public javax.swing.JPanel NPS114;
    public javax.swing.JPanel NPS115;
    public javax.swing.JPanel NPS116;
    public javax.swing.JPanel NPS117;
    public javax.swing.JPanel NPS118;
    public javax.swing.JPanel NPS119;
    public javax.swing.JPanel NPS120;
    public javax.swing.JPanel NPS121;
    public javax.swing.JPanel NPS122;
    public javax.swing.JPanel NPS123;
    public javax.swing.JPanel NPS124;
    private javax.swing.JPanel NPS125;
    private javax.swing.JPanel NPS126;
    public javax.swing.JPanel NPS127;
    public javax.swing.JPanel NPS29;
    public javax.swing.JPanel NPS32;
    public javax.swing.JPanel NPS33;
    public javax.swing.JPanel NPS35;
    public javax.swing.JLabel QT103;
    public javax.swing.JLabel QT104;
    public javax.swing.JLabel QT105;
    public javax.swing.JLabel QT106;
    public javax.swing.JLabel QT110;
    public javax.swing.JLabel QT111;
    public javax.swing.JLabel QT112;
    public javax.swing.JLabel QT113;
    public javax.swing.JLabel QT114;
    public javax.swing.JLabel QT115;
    public javax.swing.JLabel QT116;
    public javax.swing.JLabel QT117;
    public javax.swing.JLabel QT118;
    public javax.swing.JLabel QT119;
    public javax.swing.JLabel QT120;
    public javax.swing.JLabel QT121;
    public javax.swing.JLabel QT122;
    public javax.swing.JLabel QT123;
    public javax.swing.JLabel QT124;
    public javax.swing.JLabel QT125;
    public javax.swing.JLabel QT126;
    public javax.swing.JLabel QT127;
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
    public javax.swing.JLabel cantidadfinal103;
    public javax.swing.JLabel cantidadfinal104;
    public javax.swing.JLabel cantidadfinal105;
    public javax.swing.JLabel cantidadfinal106;
    public javax.swing.JLabel cantidadfinal110;
    public javax.swing.JLabel cantidadfinal111;
    public javax.swing.JLabel cantidadfinal112;
    public javax.swing.JLabel cantidadfinal113;
    public javax.swing.JLabel cantidadfinal114;
    public javax.swing.JLabel cantidadfinal115;
    public javax.swing.JLabel cantidadfinal116;
    public javax.swing.JLabel cantidadfinal117;
    public javax.swing.JLabel cantidadfinal118;
    public javax.swing.JLabel cantidadfinal119;
    public javax.swing.JLabel cantidadfinal120;
    public javax.swing.JLabel cantidadfinal121;
    public javax.swing.JLabel cantidadfinal122;
    public javax.swing.JLabel cantidadfinal123;
    public javax.swing.JLabel cantidadfinal124;
    public javax.swing.JLabel cantidadfinal125;
    public javax.swing.JLabel cantidadfinal126;
    public javax.swing.JLabel cantidadfinal127;
    public javax.swing.JLabel cantidadfinal29;
    public javax.swing.JLabel cantidadfinal32;
    public javax.swing.JLabel cantidadfinal33;
    public javax.swing.JLabel cantidadfinal35;
    public javax.swing.JLabel cantidadrequerida103;
    public javax.swing.JLabel cantidadrequerida104;
    public javax.swing.JLabel cantidadrequerida105;
    public javax.swing.JLabel cantidadrequerida106;
    public javax.swing.JLabel cantidadrequerida110;
    public javax.swing.JLabel cantidadrequerida111;
    public javax.swing.JLabel cantidadrequerida112;
    public javax.swing.JLabel cantidadrequerida113;
    public javax.swing.JLabel cantidadrequerida114;
    public javax.swing.JLabel cantidadrequerida115;
    public javax.swing.JLabel cantidadrequerida116;
    public javax.swing.JLabel cantidadrequerida117;
    public javax.swing.JLabel cantidadrequerida118;
    public javax.swing.JLabel cantidadrequerida119;
    public javax.swing.JLabel cantidadrequerida120;
    public javax.swing.JLabel cantidadrequerida121;
    public javax.swing.JLabel cantidadrequerida122;
    public javax.swing.JLabel cantidadrequerida123;
    public javax.swing.JLabel cantidadrequerida124;
    public javax.swing.JLabel cantidadrequerida125;
    public javax.swing.JLabel cantidadrequerida126;
    public javax.swing.JLabel cantidadrequerida127;
    public javax.swing.JLabel cantidadrequerida29;
    public javax.swing.JLabel cantidadrequerida32;
    public javax.swing.JLabel cantidadrequerida33;
    public javax.swing.JLabel cantidadrequerida35;
    public javax.swing.JCheckBox change10;
    public javax.swing.JCheckBox change11;
    public javax.swing.JCheckBox change6;
    public javax.swing.JCheckBox change9;
    public javax.swing.JScrollPane cuerpo;
    public javax.swing.JLabel descripcion103;
    public javax.swing.JLabel descripcion104;
    public javax.swing.JLabel descripcion105;
    public javax.swing.JLabel descripcion106;
    public javax.swing.JLabel descripcion110;
    public javax.swing.JLabel descripcion111;
    public javax.swing.JLabel descripcion112;
    public javax.swing.JLabel descripcion113;
    public javax.swing.JLabel descripcion114;
    public javax.swing.JLabel descripcion115;
    public javax.swing.JLabel descripcion116;
    public javax.swing.JLabel descripcion117;
    public javax.swing.JLabel descripcion118;
    public javax.swing.JLabel descripcion119;
    public javax.swing.JLabel descripcion120;
    public javax.swing.JLabel descripcion121;
    public javax.swing.JLabel descripcion122;
    public javax.swing.JLabel descripcion123;
    public javax.swing.JLabel descripcion124;
    public javax.swing.JLabel descripcion125;
    public javax.swing.JLabel descripcion126;
    public javax.swing.JLabel descripcion127;
    public javax.swing.JLabel descripcion29;
    public javax.swing.JLabel descripcion32;
    public javax.swing.JLabel descripcion33;
    public javax.swing.JLabel descripcion35;
    public javax.swing.JButton f2;
    public javax.swing.JLabel idsp103;
    public javax.swing.JLabel idsp104;
    public javax.swing.JLabel idsp105;
    public javax.swing.JLabel idsp106;
    public javax.swing.JLabel idsp110;
    public javax.swing.JLabel idsp111;
    public javax.swing.JLabel idsp112;
    public javax.swing.JLabel idsp113;
    public javax.swing.JLabel idsp114;
    public javax.swing.JLabel idsp115;
    public javax.swing.JLabel idsp116;
    public javax.swing.JLabel idsp117;
    public javax.swing.JLabel idsp118;
    public javax.swing.JLabel idsp119;
    public javax.swing.JLabel idsp120;
    public javax.swing.JLabel idsp121;
    public javax.swing.JLabel idsp122;
    public javax.swing.JLabel idsp123;
    public javax.swing.JLabel idsp124;
    public javax.swing.JLabel idsp125;
    public javax.swing.JLabel idsp126;
    public javax.swing.JLabel idsp127;
    public javax.swing.JLabel idsp29;
    public javax.swing.JLabel idsp32;
    public javax.swing.JLabel idsp33;
    public javax.swing.JLabel idsp35;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel milisegundos;
    public javax.swing.JLabel npaescanear103;
    public javax.swing.JLabel npaescanear104;
    public javax.swing.JLabel npaescanear105;
    public javax.swing.JLabel npaescanear106;
    public javax.swing.JLabel npaescanear110;
    public javax.swing.JLabel npaescanear111;
    public javax.swing.JLabel npaescanear112;
    public javax.swing.JLabel npaescanear113;
    public javax.swing.JLabel npaescanear114;
    public javax.swing.JLabel npaescanear115;
    public javax.swing.JLabel npaescanear116;
    public javax.swing.JLabel npaescanear117;
    public javax.swing.JLabel npaescanear118;
    public javax.swing.JLabel npaescanear119;
    public javax.swing.JLabel npaescanear120;
    public javax.swing.JLabel npaescanear121;
    public javax.swing.JLabel npaescanear122;
    public javax.swing.JLabel npaescanear123;
    public javax.swing.JLabel npaescanear124;
    public javax.swing.JLabel npaescanear125;
    public javax.swing.JLabel npaescanear126;
    public javax.swing.JLabel npaescanear127;
    public javax.swing.JLabel npaescanear29;
    public javax.swing.JLabel npaescanear32;
    public javax.swing.JLabel npaescanear33;
    public javax.swing.JLabel npaescanear35;
    public javax.swing.JLabel npecaneado103;
    public javax.swing.JLabel npecaneado104;
    public javax.swing.JLabel npecaneado105;
    public javax.swing.JLabel npecaneado106;
    public javax.swing.JLabel npecaneado110;
    public javax.swing.JLabel npecaneado111;
    public javax.swing.JLabel npecaneado112;
    public javax.swing.JLabel npecaneado113;
    public javax.swing.JLabel npecaneado114;
    public javax.swing.JLabel npecaneado115;
    public javax.swing.JLabel npecaneado116;
    public javax.swing.JLabel npecaneado117;
    public javax.swing.JLabel npecaneado118;
    public javax.swing.JLabel npecaneado119;
    public javax.swing.JLabel npecaneado120;
    public javax.swing.JLabel npecaneado121;
    public javax.swing.JLabel npecaneado122;
    public javax.swing.JLabel npecaneado123;
    public javax.swing.JLabel npecaneado124;
    public javax.swing.JLabel npecaneado125;
    public javax.swing.JLabel npecaneado126;
    public javax.swing.JLabel npecaneado127;
    public javax.swing.JLabel npecaneado29;
    public javax.swing.JLabel npecaneado32;
    public javax.swing.JLabel npecaneado33;
    public javax.swing.JLabel npecaneado35;
    public javax.swing.JLabel serial103;
    public javax.swing.JLabel serial104;
    public javax.swing.JLabel serial105;
    public javax.swing.JLabel serial106;
    public javax.swing.JLabel serial110;
    public javax.swing.JLabel serial111;
    public javax.swing.JLabel serial112;
    public javax.swing.JLabel serial113;
    public javax.swing.JLabel serial114;
    public javax.swing.JLabel serial115;
    public javax.swing.JLabel serial116;
    public javax.swing.JLabel serial117;
    public javax.swing.JLabel serial118;
    public javax.swing.JLabel serial119;
    public javax.swing.JLabel serial120;
    public javax.swing.JLabel serial121;
    public javax.swing.JLabel serial122;
    public javax.swing.JLabel serial123;
    public javax.swing.JLabel serial124;
    public javax.swing.JLabel serial125;
    public javax.swing.JLabel serial126;
    public javax.swing.JLabel serial127;
    public javax.swing.JLabel serial29;
    public javax.swing.JLabel serial32;
    public javax.swing.JLabel serial33;
    public javax.swing.JLabel serial35;
    public javax.swing.JLabel work500;
    // End of variables declaration//GEN-END:variables
}
