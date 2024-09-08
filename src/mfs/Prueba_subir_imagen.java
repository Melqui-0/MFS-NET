package mfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Prueba_subir_imagen {
    
    public static void prueba(String[] args) {
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
            File archivoImagen = new File(all.consulta.ruta);
            fis = new FileInputStream(archivoImagen);

            // Preparar el SQL para insertar la imagen
            String sql = "INSERT INTO img_mfs (Operador, Fecha, Imagen) VALUES (?, ?, ?)";
            statement = conexion.prepareStatement(sql);
            statement.setString(1, archivoImagen.getName());
            statement.setBinaryStream(2, fis, (int) archivoImagen.length());

            // Ejecutar la inserción
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Imagen subida con éxito.");
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
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
                e.printStackTrace();
            }
        }
    }
}