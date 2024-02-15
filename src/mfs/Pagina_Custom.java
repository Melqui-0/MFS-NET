/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfs;


public class Pagina_Custom {
    
    public Pagina_Custom (){
        
    }    
    
    public void PDU_LIMITE (java.awt.event.MouseEvent evt){
        if (all.custom.limite.isSelected()){
            all.custom.Panel_LM_PDU.setVisible(true);
        } else if (all.custom.pdu.isSelected()){
            all.custom.Panel_LM_PDU.setVisible(false);
        } else {
            all.custom.Panel_LM_PDU.setVisible(false);
        }
    }
}
