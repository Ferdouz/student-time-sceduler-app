/*
 * This is the create account class and contains code that will register a new student/user on the calendar app
 * Ferdouz Allie - 214038033
 * Project 2
 * 
 */
package za.ac.cput.studentcalenderapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class createAccount {
   
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/ScedulingAppDB";
    private final String username = "administrator";
    private final String password = "password";

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String studNum;
      
    
    public createAccount(String FirstName ,String LastName, String Email,String Password, String studNum){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.studNum = studNum;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.FirstName = FirstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

     
    public void save() {
        Connection connection = null;
        PreparedStatement statement1 = null;

        int successFlag1;
        String sql = "INSERT INTO TABLE(must still create one) VALUES (?,?,?,?,?)";
                  
        try{
            
        //  connection = DriverManager.getConnection(DATABASE_URL,username,password);
            statement1 = connection.prepareStatement(sql);
            statement1.setString(1,FirstName);
            statement1.setString(2,LastName);
            statement1.setString(3,Email);
            statement1.setString(4,Password);
            statement1.setString(5,studNum);

            successFlag1 = statement1.executeUpdate();

            if(successFlag1 > 0 ){
                JOptionPane.showMessageDialog(null,"Success! Student added.");

            }else{
                JOptionPane.showMessageDialog(null,"Error,could not add user.");
            }
        }
        catch(SQLException sqlException){
            JOptionPane.showMessageDialog(null,"Error: "+ sqlException.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        finally{
            try{
                if(statement1 != null)
                    statement1.close();
            }
            catch(Exception exception){
                JOptionPane.showMessageDialog(null,exception.getMessage(),"warning" ,JOptionPane.ERROR_MESSAGE);
            }
            try{
                if(connection != null)
                    connection.close();

            }
            catch(Exception exception){
                JOptionPane.showMessageDialog(null, exception.getMessage(),"warning" ,JOptionPane.ERROR_MESSAGE);
            }
        }
        
     }
    
    }

     
        


