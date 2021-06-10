/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author jibarra
 */
public class conexion {
    
    public static Connection getConexion(){
        String connectionUrl = "jdbc:sqlserver://DESKTOP-4BUF27B:1433;databaseName=PROYECTO;integratedSecurity=true;";  
        try{
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
    
    public int login(String usuario, String contrasena){
        
        return 3;
    }
    

}
