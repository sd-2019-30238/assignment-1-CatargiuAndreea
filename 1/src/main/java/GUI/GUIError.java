package GUI;

import javax.swing.*;


public class GUIError {
	private JFrame frame;
	private JPanel panel;
	private JTextField err;
	
	public GUIError(){
	frame = new JFrame("ERROR");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,50);
	panel = new JPanel();
	
	err = new JTextField("ERROR", JLabel.RIGHT);
	err.setBounds(160,190,50,50);
	frame.add(err);
	frame.setContentPane(panel);
	frame.setVisible(true);
	}
}