/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author 30047818
 */
public class AdminConexion {
    
    public AdminConexion(){
    }
    
    static Connection conn = null; 
    
    public static Connection Init_conn()
    {

        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://XX.XXX.XX.XX:1433;databaseName=KADMIN;integratedSecurity=true;authenticationScheme=JavaKerberos;authenticationScheme=NativeAuthentication;");
            if(conn != null)
                return null;
        }
        catch(ClassNotFoundException ex)
    {
        JOptionPane.showMessageDialog(null, ex, "Error1 with DB connection" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conn = null;
    }   
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex, "Error2 with DB connection" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conn = null;
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex, "Error3 with DB Connection" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        conn = null;
    }
    finally
    {
        return conn;
        
    }
    }
    
       public static ResultSet Consult(String consult)
       {
        Connection conn = Init_conn();
        Statement st;
        try{
            st  = conn.createStatement();
            ResultSet rs  = st.executeQuery(consult);
            return rs;
            
        }catch(SQLException ex){
            Logger.getLogger(AdminConexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
 }
