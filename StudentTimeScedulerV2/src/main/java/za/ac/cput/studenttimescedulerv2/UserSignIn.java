/*
 * This is the worker class for User Sign in which contains a string and verification
 */
package za.ac.cput.studentcalenderapp;
public class UserSignIn {
    
    private String FirstName;
    private String password;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User (" + "FirstName=" + FirstName + ", Password=" + password + ")";
    }
    public boolean authentication(){
    
        boolean authenticated;
        SignInDAO verify = new SignInDAO();
        
        if(verify.verifyDatabase(FirstName, password)){
        
            authenticated = true;         
        }
        else{
        
            authenticated = false;
        }
        return authenticated;
    }
    
}


