package desktopapp;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Desktopapp {

    /**
     
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        //create new frame for the login screen
        JFrame myframe;
        myframe = new JFrame("login");
        //create buttons to execute the action of login
        JButton loginButton=new JButton();
        loginButton.setText("Login");
        loginButton.setToolTipText("initiate userprofile");
        

        
        //create a clear button
        JButton button2=new JButton("Clear");
        button2.setToolTipText("incase of incorrect value inputed");
        
        JLabel user=new JLabel("username");
        JTextField username=new JTextField();
        username.setColumns(15);
        JPanel userpanel=new JPanel();
        userpanel.setSize(100, 50);
        userpanel.add(username);
        myframe.add(userpanel);
        userpanel.add(user, BorderLayout.WEST);
        //create the label for the password input area 
        JLabel label=new JLabel("password");
        JPanel panel=new JPanel();
        panel.setSize(100, 50);
        myframe.add(panel);

        
        //create the password input field
        JPasswordField pass=new JPasswordField(10);
        pass.setEchoChar('*'); 
        //initiate the action listener for the password field 

        panel.add(label, BorderLayout.WEST);
        panel.add(pass, BorderLayout.EAST);
        //create a panel 
        JPanel panel1=new JPanel();

        panel1.add(loginButton);
        panel1.add(button2);
        panel1.setSize(100, 50);
        
        JPanel panel2=new JPanel();
        myframe.add(panel2);
        myframe.add(panel1);
        
        //specifications for the frame i created 
        myframe.setSize(600, 400);
        myframe.setLocationRelativeTo(null);
        myframe.setLayout( new GridLayout(2,5));
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true); 
        
                loginButton.addActionListener(new action());
    }
    //the action listener for the buttons 
        static class action implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                
              JFrame myframe2= new JFrame("homepage");
              
              JPanel panel1 =new JPanel();
                      panel1.setSize(100, 50);
                     JPanel panel2=new JPanel();
                     panel2.setSize(100, 50);
                     JPanel panel3=new JPanel();
                     panel3.setSize(100, 50);
              JButton add= new JButton("add user");
              JButton logout = new JButton("logout");
              add.addActionListener( new act());
              panel2.add(logout);
                logout.addActionListener(new listener());
              panel1.add(add);
           DefaultPieDataset pieDataset = new DefaultPieDataset();
        myframe2.add(panel1);
        myframe2.add(panel2);
        myframe2.setSize(600, 400);
        myframe2.setLocationRelativeTo(null);
        myframe2.setLayout( new GridLayout(2,5));
        myframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe2.setVisible(true);
           }
     
            }
    static class listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent b) {
            
           
        }
    }
        }

 
    

        


            
  
    


        


        
     
