/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import mfs.all;

/**
 *
 * @author MelquiAzarelRamirezR
 */
public class Login {
    
    public void ValidarUsuario (JTextField usuario, JPasswordField contraseña){
        
        try{
            
            //Se establecen paramentros y se hace la validación para el inicio de sesión....
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            Conexion.Conexionbd conexionbd = new Conexion.Conexionbd();
            
            String consulta = "select * from prueba where prueba.NUM = (?) and prueba.CONTRA = (?);";
            ps = conexionbd.Conexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();//Se ejecuta la consulta...
            
            if (rs.next()){
                //all.abrir.setVisible(true);
                mfs.Inicio inicio = new mfs.Inicio();
                inicio.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña y/o Usuario incorrectos ");
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas con la conexión..." + e.toString());
        }
        
    }
}
