package mfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BD {
    
    Conexion.Conexionbd conexionbd = new Conexion.Conexionbd();
    
    private final String SQL_AGREGAR = "insert into alm (Operador, Fecha, Imagen) VALUES (?,?,?)";
    private final String SQL_CONSULTAR = "select * from alm";
   
    private static Statement Consulta;
    private static Connection Conection;
    private static ResultSet Resultado;
    
    private final String bd;
    private final String user;
    private final String password;
    

    public BD(String bd, String user, String password) {
        this.bd = bd;
        this.user = user;
        this.password = password;
    }
    
    public boolean conectar (){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Conection = DriverManager.getConnection("jdbc:mysql://localhost" + bd, user, password);
            return Conection != null;
        } catch (Exception e){
            return false;
        }
        
        /*try{
 
        conexionbd.Conexion();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo emtrar a la bd...");
                return false;
                }
        return false;*/
    }
    
    public void desconectar (){
        try{
            this.Conection.close();
        } catch (SQLException e){ }
    }
    
    public void AgregarIamgen (ImagenAlmacen mImagen) throws SQLException{
        // Se inicia con el alta de la imagen
        PreparedStatement preparedstatement = null;
        try{
        preparedstatement = conexionbd.Conexion().prepareStatement(SQL_AGREGAR); //QRY
        preparedstatement.setString(1, mImagen.getOperador());//Agregar valores
        preparedstatement.setString(2, mImagen.getFecha());//Agregar valores
        preparedstatement.setBytes(3, mImagen.getImagen());//Agregar valores
        preparedstatement.executeUpdate();//Subir datos
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se pudo agregar la imagen 3...");
        }
        finally{
            try{
           preparedstatement.close();//Cerrar QRY
            } catch (SQLException ex){ 
                JOptionPane.showMessageDialog(null, "No se pudo cerrar el encloser...");
            }
        }
    }
    
    public ArrayList CargarImagen(){
        //Se inicia con la consulta de la imagen
        ArrayList Imagen =  new ArrayList();
        try{
            Consulta = conexionbd.Conexion().createStatement();
            Resultado = Consulta.executeQuery(SQL_CONSULTAR);//Ejecuta el QRY
            while (Resultado.next()){
                ImagenAlmacen mImagen = new ImagenAlmacen();
                mImagen.setImagenID(Resultado.getInt("ImagenID"));//Se rellenan los campos
                mImagen.setOperador(Resultado.getString("Operador"));//Se rellenan los campos
                mImagen.setFecha(Resultado.getString("Fecha"));//Se rellenan los campos
                mImagen.setImagen(Resultado.getBytes("Imagen"));//Se rellenan los campos
                Imagen.add(mImagen);//Se agregan los datos
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen 4...");
            return null;
        }
        return Imagen;
    }
    
            
    
}
