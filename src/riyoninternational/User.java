/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riyoninternational;

import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/** 
 *
 * @author Hp Pavilion
 */
public class User {
    Connection conn=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public ResultSet find(String s){
        try{
        conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/riyon_international", "root","19961121A");
        pst = conn.prepareStatement("select * from customer where cname = ?");
        rs = pst.executeQuery();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
     }
        return rs;
    }
    private int cid;
    private String cname;
    private String cmob1;
    private String cmob2;
    private String companyname;
    private String companymob;
    private String caddress;
    private String cemail;
    private String ccity;
    private String cdistrict;
    
    public User (int id, String name, String mob1, String mob2, String comname, String commob, String address, String email, String city, String district){
        this.cid= id;
        this.cname=name;
        this.cmob1=mob1;
        this.cmob2=mob2;
        this.companyname=comname;
        this.companymob=commob;
        this.caddress=address;
        this.cemail=email;
        this.ccity=city;
        this.cdistrict=district; 
    }
    public int getid(){
        return cid;
    }
    public String getname(){
        return cname;
    }
    public String getmob1(){
        return cmob1;
    }
    public String getmob2(){
        return cmob2;
    }
    public String getcomname(){
        return companyname;
    }
    public String getcommob(){
        return companymob;
    }
    public String getaddress(){
        return caddress;
    }
    public String getemail(){
        return cemail;
    }
    public String getcity(){
        return ccity;
    }
    public String getsitrict(){
        return cdistrict;
    }
    
}
