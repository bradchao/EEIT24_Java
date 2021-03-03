package tw.brad.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Brad23 extends JFrame{
	private JButton bt1, bt2, bt3;
	
	public Brad23() {
		// super();
		super("視窗城市");
		System.out.println("Brad23()");
		
		bt1 = new JButton("Bt1");
		bt2 = new JButton("Bt2");
		bt3 = new JButton("Bt3");
		
		setLayout(new FlowLayout());
		add(bt1); add(bt2); add(bt3);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello");
			}
		});
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Brad23();
	}

}
