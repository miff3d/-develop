package desktopapp;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class database {
    public static void main(String[] args){
        try{
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/desktop","root", "");
            System.out.println ("connection Established");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from users");
                    while (rs.next())
                    {
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                        System.out.println(rs.getString(4));
                    }  
        }catch(Exception e){
                            
                            System.out.println("Error");
                            } 
                            
}
        }

