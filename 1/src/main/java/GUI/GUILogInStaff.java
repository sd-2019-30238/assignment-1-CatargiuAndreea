package GUI;
import dataAccess.StaffAccess;

//import bll.Customer;
import Model.Customer;
import bll.Staff;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;


public class GUILogInStaff {
	private JFrame frame;
	private JTextField user;
	private JTextField pass;
	private JLabel userL;
	private JLabel password;
	private JButton ok;
	
	public GUILogInStaff(){
		frame = new JFrame("STAFF");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLayout(null);
	
		userL = new JLabel("USER: ", JLabel.RIGHT);
		password = new JLabel("PASSWORD: ", JLabel.RIGHT);
		user = new JTextField("");
		pass = new JTextField("");
		ok = new JButton("OK");
		
		userL.setBounds(60,80,50,50);
		user.setBounds(120, 90, 100, 30);
		password.setBounds(10, 130, 100, 50);
		pass.setBounds(120, 140, 100, 30);
		ok.setBounds(150, 190, 100,40);
		
		
		ok.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	StaffAccess staff = new StaffAccess();
		    	ArrayList<Model.Staff>staff1 = staff.queryLogin(user.getText(), pass.getText());
		    	if(staff1.size() > 0){
		    		GUIStaff login = new GUIStaff();
		    	}
		    	else{
		    		GUIError err = new GUIError();
		    		user.setText("");
		    		pass.setText("");
		    }
		    }
		});
		
		frame.add(userL);
		frame.add(password);
		frame.add(user);
		frame.add(pass);
		frame.add(ok);
		frame.setVisible(true);
		
	

	}
	

	
}
