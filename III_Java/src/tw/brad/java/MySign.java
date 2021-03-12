package tw.brad.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySign extends JFrame {
	private JButton clear, undo, redo, saveJPEG, saveObj, loadObj;
	private MyDrawer myDrawer;
	
	public MySign() {
		super("偶的簽名城市");
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPEG = new JButton("Save JPEG");
		saveObj = new JButton("Save Brad");
		loadObj = new JButton("Load Brad");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPEG); top.add(saveObj); top.add(loadObj);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					saveJPEG();
				}catch(Exception e2) {
					System.out.println(e2);
				}
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.saveObject();
				}catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});

		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.loadObject();
				}catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});

		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void saveJPEG() throws IOException {
		BufferedImage image = 
			new BufferedImage(myDrawer.getWidth(), myDrawer.getHeight(), 
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = image.createGraphics();
		myDrawer.print(g2d);
		ImageIO.write(image, "jpeg", new File("dir1/sign.jpg"));
		
//		BufferedImage image = 
//				new BufferedImage(getWidth(), getHeight(), 
//					BufferedImage.TYPE_INT_RGB);
//		Graphics2D g2d = image.createGraphics();
//		paint(g2d);
//		ImageIO.write(image, "jpeg", new File("dir1/sign.jpg"));
	}

	public static void main(String[] args) {
		new MySign();
	}

}
