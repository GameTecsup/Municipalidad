
package clases;

import formularios.Principal;

import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.TimerTask;
/*
Importaciones 
 */
public class Inicio {

 // Control de la imagen 
    static int contador = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int velocidad = 2; // tiempo de cambio segundos
        
        Timer  timer;
        TimerTask tarea;
        
        int velmil = velocidad*1000;        // milisegundos
        
        // labelinicio  - para la imagen
        
        Principal inicio = new Principal();
        inicio.setVisible(true);
        
    

   tarea = new TimerTask(){ 

            @Override
            public void run() {
             
            Icon icono;
            switch(contador){
                
                case 0:
                    contador = 1;
                icono = new ImageIcon(getClass().getResource("/imginicio/ISesion1.png"));
                inicio.labelinicio.setIcon(icono);
                    break;
                    
                case 1:
                    contador = 2;
                icono = new ImageIcon(getClass().getResource("/imginicio/ISesion2.png"));
                inicio.labelinicio.setIcon(icono); 
                break;  
                    
                case 2:
                    contador = 3;
                icono = new ImageIcon(getClass().getResource("/imginicio/ISesion3.png"));
                inicio.labelinicio.setIcon(icono);  
                break;
                    
                 case 3:
                     contador = 0;
                icono = new ImageIcon(getClass().getResource("/imginicio/ISesion4.png"));
                inicio.labelinicio.setIcon(icono);  
                break;                   
                                     }
            }

 };
// Referencia https://www.tutorialspoint.com/java/util/timer_scheduleatfixedrate.htm
   
   
   
timer = new Timer();
timer.scheduleAtFixedRate(tarea,velmil,velmil);
   
}




}

