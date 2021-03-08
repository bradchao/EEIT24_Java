package tw.brad.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Brad34 extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	
	public Brad34() {
		super("猜數字遊戲");

		setLayout(new BorderLayout());
		guess = new JButton("Guess");
		input = new JTextField();
		log = new JTextArea();
		log.setBackground(Color.YELLOW);
		
		// super => 父類別的物件實體; this => 本類別的物件實體
		// super(), this()
//		guess.addActionListener(this);
//		guess.addActionListener(new Brad341());
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(createAnswer(4));
				doGuess();
			}
		});
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
	}
	
	// 開新局
	private void initGame() {
		createAnswer(4);
	}
	
	private void doGuess() {
		String strInput = input.getText();
		// 檢查幾A幾B
		log.append(strInput + "\n");
		input.setText("");
	}
	
	private String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<10; i++) { 
			poker[i] = i;
		}
		for (int i=poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) sb.append(poker[i]);
			
		return sb.toString();
	}
	
	public static void main(String[] args) {
		new Brad34();
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Brad");
	}
}

class Brad341 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("III");
	}
}
