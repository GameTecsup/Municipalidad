/*
Clase Funcion Eddi
 */
package clases;

// Importacion del JCalendar

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

public class funcion {
       SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    public String getFecha(JDateChooser jd){
        if(jd.getDate()!=null){
            return formato.format(jd.getDate());
        }else{
            return null;
        }
    } 
}
