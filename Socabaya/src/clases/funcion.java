/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

/**
 *
 * @author Eddy Alvaro
 */
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
