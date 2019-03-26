package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		user = new JTextField("Your username");
		pass = new JTextField("Your password");
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
		       //@SuppressWarnings("unused")
			GUILogInCustomer logIn = new GUILogInCustomer();
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
