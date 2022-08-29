/*
 * This class contains the GUI elements of the create account frame, it is incomplete and
   sizes have not been finalised yet
*/
package za.ac.cput.studentcalenderapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreateAccountGUI extends JFrame implements ActionListener {
    
    private createAccount CreateAccount;
    
    private JFrame mainFrame;
    private JPanel panelSouth, panelCenter, panelNorth;
    private JLabel lblHeading;
    private JLabel lblImage;

    private JLabel lblFirstName;
    private JTextField txtFirstName;

    private JLabel lblLastName;
    private JTextField txtLastName;    
    
    private JLabel lblEmail;
    private JTextField txtEmail;    
    
    private JLabel lblPassword;
    private JTextField txtPassword;
    
    private JLabel lblStudentNumber;
    private JTextField txtStudentNumber; 
  
    private JButton btnCreate;
    private JButton btnReset;    
    private Font font;
    private Font font2;
    private JPanel boxLayout;
  

public CreateAccountGUI(){
    
    //CreateAccount = new createAccount();
    
    mainFrame = new JFrame("Student Calendar Application");
    mainFrame.setPreferredSize(new Dimension(300, 450));

    //super("Student Calendar Application");
    
    panelSouth = new JPanel();
    panelNorth = new JPanel();
    panelNorth.setBackground(Color.blue);
    panelCenter = new JPanel();
    panelCenter.setBackground(Color.yellow);
    
    font = new Font("Helvetica", Font.BOLD, 18);
    font2 = new Font("Helvetica", Font.BOLD, 15);

    lblHeading = new JLabel("Student Calendar Application");
    lblHeading.setForeground(Color.white);
    lblHeading.setBackground(Color.blue);
    lblHeading.setFont(font);
            
    lblImage = new JLabel(new ImageIcon("add an image if needed for app")); // add image
    lblImage.setPreferredSize(new Dimension(100, 100));

    lblFirstName = new JLabel("FirstName:");
    txtFirstName = new JTextField(15);
    lblFirstName.setFont(font2);

    lblLastName = new JLabel("Last Name:");
    txtLastName = new JTextField(15);
    lblLastName.setFont(font2);

    lblEmail = new JLabel("Email:");
    txtEmail = new JTextField(15);
    lblEmail.setFont(font2);
    
    lblPassword = new JLabel("Password:");
    txtPassword = new JTextField(15);
    lblPassword.setFont(font2);    
    
    btnCreate = new JButton("Save");
    btnReset = new JButton("Reset");
}
    public void setGUI(){
        
        JPanel panel = new JPanel();
  // edit GUI sizes are still inconsistent , random sizes were added
        add(panel);
        //this.setLayout(new GridLayout(5,1));   
        panelNorth.setLayout(new FlowLayout());
        panelSouth.setLayout(new GridLayout(1,3));
        BoxLayout boxlayout = new BoxLayout(panelCenter, BoxLayout.Y_AXIS);
        panelCenter.setBorder(new EmptyBorder(new Insets(70, 140, 70, 140)));
        panelCenter.setLayout(boxlayout);

       GridLayout grid = new GridLayout(5, 1);
        panel.setLayout(grid);
        panel.add(lblFirstName);
        panel.add(txtFirstName);
        panel.add(lblLastName);
        panel.add(txtLastName);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(lblStudentNumber);
        panel.add(txtStudentNumber);
       

        this.setLayout(grid);

        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        
        panelCenter.add(lblStudentNumber);
        panelCenter.add(txtStudentNumber);
        
        btnCreate.setEnabled(true);
        panelSouth.add(btnCreate);
        panelSouth.add(btnReset);
        
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth,BorderLayout.SOUTH);
        
        btnCreate.addActionListener(this);
        btnReset.addActionListener(this);
        
        mainFrame.setSize(500,550);
        mainFrame.setVisible(true); 
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true); 
          }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btnCreate){

        String FirstName = txtFirstName.getText();
        String LastName = txtLastName.getText();
        String Email = txtEmail.getText();
        String Password = txtPassword.getText();
        String studNum = txtStudentNumber.getText();

        //Logger.getLogger(CreateAccountGUI.class.getName()).log(Level.SEVERE, null, ex);

        createAccount c = new createAccount(FirstName, LastName, Email, Password, studNum);
        c.save();

        if(e.getSource() == CreateAccount){
            if(btnCreate.isSelected()){
                btnCreate.setEnabled(true);
            }else{
                btnCreate.setEnabled(false);
            }
        }
    }
    }
    public void save() {
    }

    static class setGUI {

        public setGUI() {
        }
    }
}
      

