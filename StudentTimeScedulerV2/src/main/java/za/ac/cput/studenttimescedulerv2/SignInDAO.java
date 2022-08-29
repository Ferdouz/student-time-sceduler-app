/*
 * This class will correspond with UserSignIn class regarding DB information about an existing user where information will be
   retrieved and verified between the UserSign in class and this class.
 * Please note code is incomplete and still in progress
 * Ferdouz Allie - 214038033
 */
package za.ac.cput.studentcalenderapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SignInDAO {
    
    private static final String DATABASE_URL =  "must still create database for this"; 
    private final String Username = "Administrator";
    private final String Password = "password";
    
    public boolean verifyDatabase(String FirstName, String password){
    
        String sql = "Select * from TABLE(must still create DB AND table) where FIRSTNAME=? and PASSWORD=?"; //change table name
        boolean valid = false;
        
        try {         
            Connection con = DriverManager.getConnection(DATABASE_URL, FirstName, Password);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, FirstName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                valid = true;
            }
            else{
                valid = false;
            }
            con.close();
            return  valid;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            return valid;
        }
        
    }
    
}

