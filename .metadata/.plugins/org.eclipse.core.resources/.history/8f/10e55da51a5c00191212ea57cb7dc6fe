package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class GUILogInCustomer {
	private JFrame frame;
	private JButton returnB;
	private JButton recomandation;
	private JButton borrow;
	private JLabel filter;
	String[] filterString = {"title", "author", "genre", "release date"};
	@SuppressWarnings({ "unchecked", "rawtypes" })
	JComboBox filterChoice = new JComboBox(filterString);

	
	public GUILogInCustomer(){
		frame = new JFrame("USER");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		frame.setLayout(null);
	
		borrow = new JButton("Borrow books");
		filter = new JLabel("Filter by ", JLabel.RIGHT);
		returnB = new JButton("Return books");
		recomandation = new JButton("Recomandations");
		filterChoice.setSelectedIndex(3);
		
		borrow.setBounds(160,20,150,30);
		filter.setBounds(160,190,50,50);
		returnB.setBounds(160, 80, 150, 30);
		recomandation.setBounds(160, 140, 150, 30);
		filterChoice.setBounds(220, 200, 150, 30);
		
		frame.add(filter);
		frame.add(borrow);
		frame.add(returnB);
		frame.add(recomandation);
		frame.add(filterChoice);
		frame.setVisible(true);
	}
}
