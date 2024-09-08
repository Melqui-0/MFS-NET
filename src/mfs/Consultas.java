package mfs;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



public class Consultas extends javax.swing.JFrame {

    BD mBD;
    DefaultTableModel mModeloTabla = new DefaultTableModel();
    String ruta = "";
    
    public Consultas() {
        mBD = new BD("Prueba", "root", "Admin1");
        initComponents();
        mModeloTabla.addColumn("ImagenID");
        mModeloTabla.addColumn("Operador");
        mModeloTabla.addColumn("Fecha");
        mModeloTabla.addColumn("Imagen");
        CargarImagen();
    }

    private void CargarImagen() {
        Limpiar();
        Tabla_consulta.setDefaultRenderer(Object.class, new RenderImagen());//Sirve para visualizar la imagen en la celda de la columna
        
        ArrayList Imagen;
        ImagenAlmacen mImagenAlmacen;
        
        if (mBD.conectar()){
            Object Datos[] =  new Object [4];
            Imagen = mBD.CargarImagen();
            
            if(Imagen != null){
                for (int i = 0; i < Imagen.size(); i++){
                    mImagenAlmacen = (ImagenAlmacen) Imagen.get(i);
                    Datos[0] = String.valueOf(mImagenAlmacen.getImagenID());
                    Datos[1] = mImagenAlmacen.getOperador();
                    Datos[2] = mImagenAlmacen.getFecha();
                    try{
                        byte [] imagen =  mImagenAlmacen.getImagen();
                        BufferedImage bufferedimage = null;
                        InputStream inputstream = new ByteArrayInputStream(imagen);
                        bufferedimage = ImageIO.read(inputstream);
                        ImageIcon mIcon = new ImageIcon(bufferedimage.getScaledInstance(100, 100, 0));
                        Datos[3] = new JLabel(mIcon);                       
                    }catch (IOException e){}
                        Datos[3] = new JLabel("No Imagen");
                }
                mModeloTabla.addRow(Datos);
            }
            
            Tabla_consulta.setModel(mModeloTabla);
            Tabla_consulta.setRowHeight(100);
            Tabla_consulta.getColumnModel().getColumn(0).setPreferredWidth(100);
            Tabla_consulta.getColumnModel().getColumn(1).setPreferredWidth(100);
            Tabla_consulta.getColumnModel().getColumn(2).setPreferredWidth(100);
            Tabla_consulta.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
    }

    private void Limpiar(){
        for (int i = 0; i < Tabla_consulta.getRowCount(); i++){
        mModeloTabla.removeRow(i);
        i -= 1;
    }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_consulta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        operador = new javax.swing.JTextField();
        prevew = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        letras = new javax.swing.JLabel();
        operador_busqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_consulta);

        jButton1.setText("Examinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Operador");

        jLabel2.setText("Fecha");

        jLabel3.setText("Consulta de repeticiones");

        jLabel4.setText("Imagen");

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        letras.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prevew, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(letras)
                        .addGap(242, 242, 242))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(operador_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(487, 487, 487))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(letras)
                .addGap(18, 18, 18)
                .addComponent(operador_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(operador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prevew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton2)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter extensionfilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        filechooser.setFileFilter(extensionfilter);
        
        if(filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            ruta = filechooser.getSelectedFile().getAbsolutePath();
            Image mImagen = new ImageIcon(ruta).getImage();
            ImageIcon micon = new ImageIcon(mImagen.getScaledInstance(prevew.getWidth(), prevew.getHeight(), 0));
            prevew.setIcon(micon);
        }
        System.out.println(ruta);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private byte[] getImagen(String ruta){
        File imagen = new File(ruta);
        try{
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
        } catch (IOException ex){
            return null;
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        prueba();
        
        /*        try{
        ImagenAlmacen mImagen = new ImagenAlmacen();
        if (mBD.conectar()){
            mImagen.setOperador(operador.getText().trim());
            mImagen.setFecha(fecha.getText());
            mImagen.setImagen(getImagen(ruta));
            try {
                mBD.AgregarIamgen(mImagen);
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen 1...");
            }
            Limpiar();
            CargarImagen();
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen 2..." + e);
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Mostrar();
    }//GEN-LAST:event_jButton3ActionPerformed


    
    public void prueba (){
        String url = "jdbc:mysql://localhost:3306/prueba";
        String usuario = "root";
        String contrasena = "Admin1";

        Connection conexion = null;
        PreparedStatement statement = null;
        FileInputStream fis = null;

        try {
            // Conectar a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contrasena);

            // Leer el archivo de imagen
            File archivoImagen = new File(ruta);
            fis = new FileInputStream(archivoImagen);

            // Preparar el SQL para insertar la imagen
            String sql = "INSERT INTO img_mfs (Operador, Fecha, Imagen) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(sql);
            statement.setString(1, operador.getText());
            statement.setString(2, fecha.getText());
            statement.setBinaryStream(3, fis, (int) archivoImagen.length());

            // Ejecutar la inserción
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Imagen subida con éxito.");
            }

        } catch (SQLException | IOException e) {
        } finally {
            // Cerrar recursos
            try {
                if (fis != null) {
                    fis.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (IOException | SQLException e) {
            }
        }
        
    }

    public void Mostrar() {
        String url = "jdbc:mysql://localhost:3306/prueba";
        String usuario = "root";
        String contrasena = "Admin1";
        
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            // Conectar a la base de datos
            conexion = DriverManager.getConnection(url, usuario, contrasena);

            // Preparar la consulta SQL para buscar por nombre
            String sql = "SELECT * FROM img_mfs WHERE operador = ?";
            statement = conexion.prepareStatement(sql);
            statement.setString(1, operador_busqueda.getText());  // Cambia por el nombre de la imagen que quieras recuperar

            // Ejecutar la consulta
            resultado = statement.executeQuery();

            if (resultado.next()) {
                // Recuperar la imagen como un arreglo de bytes
                byte[] imagenBytes = resultado.getBytes("Imagen");

                // Convertir los bytes a una imagen
                InputStream inputStream = new ByteArrayInputStream(imagenBytes);
                Image imagen = ImageIO.read(inputStream);

                // Mostrar la imagen en un JFrame
                JFrame frame = new JFrame();
                JLabel label = new JLabel(new ImageIcon(imagen));
                frame.add(label);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.out.println("No se encontró una imagen con el nombre especificado.");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (resultado != null) resultado.close();
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    
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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla_consulta;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel letras;
    private javax.swing.JTextField operador;
    public javax.swing.JTextField operador_busqueda;
    private javax.swing.JLabel prevew;
    // End of variables declaration//GEN-END:variables

    
}
