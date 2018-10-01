/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author patdw
 */
class act implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
           //new frame for the add user form
        JFrame myframe3= new JFrame("add user");
        //labels and text fields for the input of new user data
        JLabel first=new JLabel("First name");
        JTextField name=new JTextField();
        name.setColumns(15);
        JLabel second=new JLabel("Last name");
        JTextField name2=new JTextField();
        name2.setColumns(15);
        JLabel Gender=new JLabel("Gender");
        JRadioButton male=new JRadioButton("Male");
        JRadioButton female=new JRadioButton("Female");
        JLabel telephone=new JLabel("telephone");
        JTextField contact=new JTextField();
        contact.setColumns(15);
        JLabel dateofbirth=new JLabel("date of birth");
        JTextField date=new JTextField();
        date.setColumns(15);
        //put the two radio buttons in the same button group
        ButtonGroup gender= new ButtonGroup();
        gender.add(male);
        gender.add(female);        
        //the panels to hold the labels and text boxes and buttons 
        JPanel panel1 =new JPanel();
        panel1.setSize(100, 50);
        JPanel panel2 =new JPanel();
        panel2.setSize(100, 50);
        JPanel panel3 =new JPanel();
        panel3.setSize(100, 50);
        JPanel panel4 =new JPanel();
        panel4.setSize(100, 50);
        JPanel panel5 =new JPanel();
        panel5.setSize(100, 50);
        JPanel panel6 =new JPanel();
        panel6.setSize(100, 50);       
        //the buttons on the form 
        JButton clear=new JButton("CLEAR");
        JButton save=new JButton("SAVE USER");
        //Adding the buttons and text boxes and labels
        panel1.add(first);
        panel1.add(name);
        panel2.add(second);
        panel2.add(name2);
        panel3.add(Gender);
        panel3.add(male);
        panel3.add(female);
        panel4.add(telephone);
        panel4.add(contact);
        panel5.add(dateofbirth);
        panel5.add(date);
        panel6.add(clear);
        panel6.add(save);
        //add the panels to the frame        
        myframe3.add(panel1);
        myframe3.add(panel2);
        myframe3.add(panel3);
        myframe3.add(panel4);
        myframe3.add(panel5);
        myframe3.add(panel6);
        myframe3.setSize(1000, 600);
        myframe3.setLocationRelativeTo(null);
        myframe3.setLayout( new GridLayout(2,5));
        myframe3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe3.setVisible(true);
        
        }
    }
        


