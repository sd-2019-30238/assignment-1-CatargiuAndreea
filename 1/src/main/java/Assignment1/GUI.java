package Assignment1;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI {
	private JFrame frame;
	private JPanel panel;
	private JButton customerButton;
	private JButton staffButton;
	
	public GUI(){
	frame = new JFrame("Library");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,160);
	panel = new JPanel();
	customerButton = new JButton("USER");
	staffButton = new JButton("STAFF");
	
	panel.add(customerButton);
	panel.add(staffButton);
	frame.setContentPane(panel);
	frame.setVisible(true);
	}
}
