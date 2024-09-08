package mfs;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static mfs.all.nps;
import static mfs.all.pn;



public class Funcion_f2 {
    
    final String label1 [] = {
            "PN","EC","SEC","MS","CN"
        };

        final String label2 [] = {
            "PN","EC","SEC","MS"
        };

        final String label3 [] = {
            "PN","EC","SEC"
        };

        final String label4 [] = {
            "PN","EC"
        };

        final String label5 [] = {
            "PN"
        };
        final String label6 [] = {
            "PN","EC","MS"
        };
        final String label7 [] = {
            
        };
        final String label8 [] = {
            "PN","SEC"
        };
    
    public void Funcion_F2(){
        Map<String, String[]> map = new HashMap <>();
        map.put("01KL468", label3);
        map.put("69Y1649", label5);
        map.put("03FP534", label6);
        map.put("44V4664", label7);
        map.put("01KL396", label5);
        map.put("39J1952", label4);
        map.put("03JG485", label8);
        map.put("03JG489", label8);
        map.put("03FP231", label8);
        map.put("46C6380", label5);
        map.put("74F1823", label7);
        map.put("69Y2042", label5);
        map.put("01KL425", label4);
        map.put("01KL421", label4);
        map.put("01KU111", label4);
        map.put("01KU112", label4);
        map.put("01KU137", label4);
        nps = map.get(pn);
        if (nps == label1){
            all.barcode.setVisible(true);
        }
        else if (nps == label2){
            all.barcode_1.setVisible(true);
        }
        else if (nps == label3){
            all.barcode_2.setVisible(true);
        }
        else if (nps == label4){
            all.barcode_3.setVisible(true);
        }
        else if (nps == label5){
            all.barcode_4.setVisible(true);
        }
        else if (nps == label6){
            all.barcode_6.setVisible(true);
        }
        else if (nps == label7){
            all.barcode_7.setVisible(true);
        }
        else if (nps == label8){
            all.barcode_8.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Add Part");
        }
    }
    /* switch nos = label2:
            all.barcode_1.SetVisible(true)
       break;
     switch npa = lbel3:
    ...
    break 
    default == else 
    
    
    
    */
}
