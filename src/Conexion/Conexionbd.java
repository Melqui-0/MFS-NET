package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexionbd {
    //Declaración de variables para la bd
    Connection conectar;
    
    String usuario =  "root";
    String contraseña =  "Admin1";
    String bd =  "Prueba";
    String ip =  "127.0.0.1";
    String puerto =  "3306";
    
    String cadena =  "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection Conexion(){
        
        try{
            
            //Class.forName("com.mysql.jdbc.Driver");
            //Aquí se hace la conexión a la bd
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "Conexion correctamente" );
            
        } catch (SQLException e) { // Esto es por si algo sale mal en la conexión
            JOptionPane.showMessageDialog(null, "Problemas con la conexión..." + e.toString());
        }
        return conectar;
    }
    
}
