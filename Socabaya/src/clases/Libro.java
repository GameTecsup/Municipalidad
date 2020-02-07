/*La conexion de  la base de datos
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;


// Clase Libro
public class Libro {
    

    // Pasa los valores de un objeto a un vector
    private Vector ResultSetToVector(ResultSet rs) throws SQLException {
    Vector vRows = new Vector();
    while(rs.next()) {
        Vector vCol = new Vector();
        int nroFields = rs.getMetaData().getColumnCount();
        for(int i=1 ; i <=nroFields; i++) {
            String strTmp = rs.getString(i);
            vCol.add(strTmp);
        }
        vRows.add(vCol);
    }
    return vRows;
}

    // Obtienes todos los registros de la tabla libro
 public Vector getLibro() {
    Vector vRet = null;
    try {
        String sql = "select id ,titulo,autor,categoria,fecha_ingreso,descripcion from libro order by id";
        cBaseDatos bd = new cBaseDatos();        
        Connection xcon = bd.Conectar();
        Statement stm = xcon.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        vRet = ResultSetToVector(rs);
        rs.close();
        stm.close();
        xcon.close();
    } catch(SQLException e){
        e.printStackTrace();
    }
    return vRet;
}
 
 public void grabarNuevoLibro( String[] datos ) throws SQLException {
        cBaseDatos db = new cBaseDatos();
        // si iniciaria un contador automatico String          String xcod = db.generarCodigo("areas","codigo");
        String xcod = datos[0];
        String xtit = datos[1];
        String xaut = datos[2];
        String xcat = datos[3];
      //  String xfec = datos[4];   
     
        String xfec = this.getFecha();  
     
      
   
        String xdes = datos[5];
        String sql = "insert into libro (id ,titulo,autor,categoria,fecha_ingreso,descripcion) values (?,?,?,?,?,?) ";
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, xcod);
        ps.setString(2, xtit);
        ps.setString(3, xaut);
        ps.setString(4, xcat);
        
 
        ps.setString(5, xfec);
       
        ps.setString(6, xdes);
        ps.executeUpdate();
        xcon.close();
    }

 
 
 public void modificarLibro( String[] datos ) throws SQLException {
        String xcod = datos[0];
        String xtit = datos[1];
        String xaut = datos[2];
        String xcat = datos[3];
       //   String xfec = datos[4];
      String xfec = this.getFecha(); 
        String xdes = datos[5];
        String sql = "update libro set  titulo=?, autor=?, categoria=? , fecha_ingreso=?, descripcion=?  where id=? ";
        cBaseDatos db = new cBaseDatos();
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, xtit);
        ps.setString(2, xaut);
        ps.setString(3, xcat);
        ps.setString(4, xfec);
        //  ps.setString(4, xfec);
        
        ps.setString(5, xdes);
        ps.setString(6, xcod);
        ps.executeUpdate();
        xcon.close();
    }

 
 
 
 
 
   
   // Funcion eliminar registro 
        public void eliminarLibro( String codigo ) throws SQLException {
        String sql  = "DELETE FROM libro WHERE id=?";
        cBaseDatos db = new cBaseDatos();
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, codigo);
        ps.executeUpdate();
        xcon.close();
    }
        
        
        
   // prueba 29/01/2020   actualizacion 
        
        
            public String getFecha() {
        Calendar calendar = new GregorianCalendar();
        java.util.Date date = calendar.getTime();
        DateFormat formato = new SimpleDateFormat( "yyyy-MM-dd" );
        return formato.format( date ) ;
    }

        

            


            
            
            

}
