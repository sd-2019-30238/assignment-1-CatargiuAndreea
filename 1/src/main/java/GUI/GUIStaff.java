package GUI;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;

public class GUIStaff {
	private JButton paymentRequests;
	private JFrame frame;
	private JButton returnRequests;

	public GUIStaff() {
		frame = new JFrame("STAFF");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 250);
		frame.setLayout(null);

		JCheckBox cash = new JCheckBox("Cash");

		paymentRequests = new JButton("See payment requests");
		returnRequests = new JButton("See return requests");

		paymentRequests.setBounds(50, 50, 200, 30);
		returnRequests.setBounds(50, 100, 200, 30);

		frame.add(paymentRequests);
		frame.add(returnRequests);
		frame.setVisible(true);
	}
}
