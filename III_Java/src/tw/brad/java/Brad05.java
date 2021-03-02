package tw.brad.java;

import javax.swing.JOptionPane;

public class Brad05 {

	public static void main(String[] args) {
		String aStr = JOptionPane.showInputDialog("a = ?");
		System.out.println(aStr);
		int a = Integer.parseInt(aStr);

		String bStr = JOptionPane.showInputDialog("b = ?");
		System.out.println(bStr);
		int b = Integer.parseInt(bStr);
		
		JOptionPane.showMessageDialog(null, "10 + 3 = 13\n10 - 3 = 7");
		System.exit(0);
	}

}
