package tw.brad.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Brad34 extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public Brad34() {
		super("猜數字遊戲");

		setLayout(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		log = new JTextArea();
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad34();
	}

}