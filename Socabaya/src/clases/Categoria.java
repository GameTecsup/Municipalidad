/*
Area de Categoria
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


public class Categoria {
    
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
       
       // Lista las categorias
       public Vector getCategoria() {
         Vector vRet = null;
    try {
        String sql = "select  id,categorias from categorias order by id";
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
       
       
       // Agregar Nueva Categoria
       public void grabarNuevaCat( String[] datos ) throws SQLException {
        cBaseDatos db = new cBaseDatos();
   
        String xcod = db.generarCodigo("categorias","id");
        String xcat = datos[0];
        String sql = "insert into categorias(id,categorias) values (?,?) ";
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        // Area de almacenado
        ps.setString(1, xcod);
        ps.setString(2, xcat);
        ps.executeUpdate();
        xcon.close();
        
        
    }
       
       // Modicar Categoria
       public void modificarCategoria( String[] datos ) throws SQLException {
        String xcod = datos[0];
        String xcat = datos[1];
       
        String sql = "update categorias set  categorias=? where id="+xcod ;
        cBaseDatos db = new cBaseDatos();
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, xcat);
     
        ps.executeUpdate();
        xcon.close();
    }
       
       
       
       // Eleminar Categoria Mediante el ID -SQL
        public void eliminarCat( String codigo ) throws SQLException {
        String sql  = "DELETE FROM categorias WHERE id=?";
        cBaseDatos db = new cBaseDatos();
        Connection xcon = db.Conectar();
        PreparedStatement ps = xcon.prepareStatement(sql);
        ps.setString(1, codigo);
        ps.executeUpdate();
        xcon.close();
    }
}
