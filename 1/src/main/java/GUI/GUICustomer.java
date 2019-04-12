package GUI;
import dataAccess.CustomerAccess;

//import bll.Customer;
import Model.Customer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;


public class GUICustomer {
	private JFrame frame;
	private JTextField user;
	private JTextField pass;
	private JButton CreateButton;
	private JLabel userL;
	private JLabel password;
	private JButton ok;
	
	public GUICustomer(){
		frame = new JFrame("USER");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLayout(null);
	
		CreateButton = new JButton("Create Account");
		userL = new JLabel("USER: ", JLabel.RIGHT);
		password = new JLabel("PASSWORD: ", JLabel.RIGHT);
		user = new JTextField("");
		pass = new JTextField("");
		ok = new JButton("OK");
		
		CreateButton.setBounds(160,20,150,50);
		userL.setBounds(60,80,50,50);
		user.setBounds(120, 90, 100, 30);
		password.setBounds(10, 130, 100, 50);
		pass.setBounds(120, 140, 100, 30);
		ok.setBounds(150, 190, 100,40);
		
		CreateButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		       //@SuppressWarnings("unused")
		    	GUICreateAcc createCustomerAccount = new GUICreateAcc();
		    }
		});
		
		ok.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	CustomerAccess customer = new CustomerAccess();
		    	ArrayList<Customer>customer1 = customer.queryLogin(user.getText(), pass.getText());
		    	if(customer1.size() > 0){
		    		GUILogInCustomer login = new GUILogInCustomer();
		    		System.out.println("da");
		    	}
		    	else{
		    		GUIError err = new GUIError();
		    		user.setText("");
		    		pass.setText("");
		    }
		    }
		});
		
		frame.add(userL);
		frame.add(CreateButton);
		frame.add(password);
		frame.add(user);
		frame.add(pass);
		frame.add(ok);
		frame.setVisible(true);
		
	

	}
	

	
}
