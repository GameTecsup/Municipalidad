/*Clase para conexion y Validacion  */
package clases;

// Lista de Importaciones 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class cBaseDatos {
    
    // Conexion del Mysql Worbentch
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/socabaya?useSSL=false&serverTimezone=UTC"; 
    
    
    String usuario = "root";
    String clave = "tecsup";
    
    public Connection Conectar() {
        try {
            Class.forName(driver);
            Connection xcon = DriverManager.getConnection(url,usuario,clave);
            return xcon;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
    // Validar el logueo
    

    // Permite Autogenerar un codigo para una tabla de la base datos una vez realizado cualquier procesiso  ------ Evaluar 31/01/2020
    protected String generarCodigo(String tabla, String campo) throws SQLException {
   String rpta = "";
   String sql = "select count(*) from " + tabla;
   Connection xcon = this.Conectar();
   Statement st = xcon.createStatement();
   ResultSet rs = st.executeQuery(sql);
   rs.next();
   int cant = Integer.parseInt(rs.getString(1).toString());
   if ( cant <= 0 )
       rpta = "1";
   else {
       sql = "select max(" + campo + ") from " + tabla;
       rs = st.executeQuery(sql);
       rs.next();
       cant = Integer.parseInt(rs.getString(1).toString()) + 1;
       rpta = "" + cant;
   }
   xcon.close();
   return rpta;
}

    
    // Validacion de Usuario -    jvafrom - loguin
   public boolean validarUsuario ( String xcod , String xcla){
   try {
       Connection xcon = this.Conectar();
       String sql="select count(*) from usuario where nombre=? AND clave=?";
       
       PreparedStatement ps=xcon.prepareStatement(sql);
       ps.setString(1,xcod);
       ps.setString(2,xcla);
       ResultSet rs = ps.executeQuery();
       rs.next();
       
       String cantidad = rs.getString(1);
       int xcant = Integer.parseInt(cantidad);
       
       if(xcant > 0)
           return true;
       
       xcon.close();
       return false;
       
       
   } catch (Exception ex){
                System.out.println(ex.toString());
   }
         
    return false;
    
} 
    
     // Validacion de Usuario -    jvafrom - codigo 
    
      public boolean validarCodigo ( String xcod ){
   try {
       Connection xcon = this.Conectar();
       String sql="select count(*) from usuario where codigo=? ";
       
       PreparedStatement ps=xcon.prepareStatement(sql);
       ps.setString(1,xcod);
      
       ResultSet rs = ps.executeQuery();
       rs.next();
       
       String cantidad = rs.getString(1);
       int xcant = Integer.parseInt(cantidad);
       
       if(xcant > 0)
           return true;
       
       xcon.close();
       return false;
       
       
   } catch (Exception ex){
                System.out.println(ex.toString());
   }
         
    return false;
    
} 
   
   
   
   
    }