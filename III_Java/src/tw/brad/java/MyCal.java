package tw.brad.java;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCal extends JFrame {
	private JLabel jLabel;
	private JButton b1, b2, b3, b4;
	
	public MyCal() {
		setLayout(new BorderLayout());
	
		jLabel = new JLabel("12345");
		add(jLabel, BorderLayout.NORTH);
		
		JPanel center = new JPanel(new GridLayout(2,2));
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		center.add(b1);
		center.add(b2);
		center.add(b3);
		center.add(b4);
		
		add(center, BorderLayout.CENTER);
		
				
		
		setSize(320, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCal();
	}

}
