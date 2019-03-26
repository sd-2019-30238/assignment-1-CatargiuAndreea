package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


public class GUICreateAcc {
	private JFrame frame;
	private JTextField user;
	private JTextField pass;
	private JButton create;
	private JLabel userL;
	private JLabel password;
	private JLabel payment;
	String[] paymentType = {"week", "month", "year"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox paymentBox = new JComboBox(paymentType);
	
	public GUICreateAcc(){
		frame = new JFrame("CREATE ACCOUNT");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,300);
		frame.setLayout(null);
	

		userL = new JLabel("Set username: ", JLabel.RIGHT);
		password = new JLabel("Set password: ", JLabel.RIGHT);
		payment = new JLabel("Set Payment:", JLabel.RIGHT);
		user = new JTextField("    ");
		pass = new JTextField("    ");
		create = new JButton("Create");
		paymentBox.setSelectedIndex(2);
		
		
		userL.setBounds(15,20,90,50);
		user.setBounds(120, 30, 100, 30);
		password.setBounds(10, 80, 100, 50);
		pass.setBounds(120, 90, 100, 30);
		payment.setBounds(0, 130, 100,100);
		create.setBounds(350, 70, 100, 30);
		paymentBox.setBounds(150, 170, 150, 20);
		
			
		frame.add(userL);
		frame.add(password);
		frame.add(user);
		frame.add(pass);
		frame.add(payment);
		frame.add(create);
		frame.add(paymentBox);
		frame.setVisible(true);		
	}
}