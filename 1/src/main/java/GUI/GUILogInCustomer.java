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
	private JCheckBox filterGenre;
	private JCheckBox filterTitle;
	private JCheckBox filterAuthor;
	private JLabel filter;
	private JTextField textField;
	//String[] filterString = {"title", "author", "genre", "release date"};
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	//JComboBox filterChoice = new JComboBox(filterString);

	
	public GUILogInCustomer(){
		frame = new JFrame("USER");
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,400);
		frame.setLayout(null);
	
		borrow = new JButton("Borrow books");
		returnB = new JButton("Return books");
		recomandation = new JButton("Recomandations");
		textField = new JTextField("Write recommendation");
		filterGenre = new JCheckBox("Genre");
		filter = new JLabel("Filer by: ", JLabel.RIGHT);
		filterTitle = new JCheckBox("Title");
		filterAuthor = new JCheckBox("Author");
		
		borrow.setBounds(160,20,150,30);
		filter.setBounds(160,190,50,50);
		returnB.setBounds(160, 80, 150, 30);
		recomandation.setBounds(120, 140, 150, 30);
		filterGenre.setBounds(220, 200, 60, 30);
		textField.setBounds(220, 230, 150, 30);
		filterTitle.setBounds(280, 200, 50, 30);
		
		
		frame.add(filter);
		frame.add(borrow);
		frame.add(returnB);
		frame.add(recomandation);
		frame.add(filterGenre);
		frame.add(textField);
		frame.add(filterTitle);
		frame.setVisible(true);
	}
}