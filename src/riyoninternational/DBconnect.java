/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riyoninternational;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp Pavilion
 */
public class DBconnect {
    public static Connection connect(){
    
        Connection conn = null;
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/riyon_international", "root","19961121A");
            
            return conn;
        }
        catch (Exception e){
        
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
        
      
    }
}
