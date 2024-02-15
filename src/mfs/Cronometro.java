package mfs;

import java.awt.event.ActionEvent;
import javax.swing.Timer;



public class Cronometro {
    
    public Timer mTimer;
    public int horas = 0;
    public int minutos = 0;
    public int segundos = 0;
    public int milisegundos = 0;
    
    public Cronometro (){
        
        mTimer = new Timer(10, (ActionEvent e) -> {
            IniciarCronometro();
    });
    
    }
    
    public void IniciarCronometro() {
        ActualizarTime();
        ActualizarLabel();
    }
    public void ActualizarTime() {
        milisegundos++;
        
        if (milisegundos == 100){
            milisegundos = 0;
            segundos++;
        }
        if (segundos == 60){
            segundos = 0;
            minutos++;
        }
        if (minutos == 60){
            minutos = 0;
            horas++;
        }
        
    }
    public void ActualizarLabel() {
        if (all.opcempty.empty == true){
            String crono = horas + "hrs:" + minutos + "m:" + segundos + "s";
            all.empty.Cronometro.setText(crono);
            all.empty.milisegundos.setText("." + milisegundos);
        } else if (all.opcempty.empty231 == true){
            String crono = horas + "hrs:" + minutos + "m:" + segundos + "s";
            all.empty_231.Cronometro.setText(crono);
            all.empty_231.milisegundos.setText("." + milisegundos);
        }
    }
    
    public void reboot() {
        if (mTimer.isRunning()){
            mTimer.stop();
        }
        
        horas = 0;
        minutos = 0;
        segundos = 0;
        milisegundos = 0;
        ActualizarLabel();
         
    }
    
}

