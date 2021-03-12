package tw.brad.java;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private MyMouseListener myMouseListener;
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycle;
	
	public MyDrawer() {
		setBackground(Color.YELLOW);
		myMouseListener = new MyMouseListener();
		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
		
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i=1; i<line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), 
						p1.get("x"), p1.get("y"));
			}
		}
		
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());

			lines.getLast().add(point);
			
			repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			recycle.clear();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);

			lines.add(line);
			
			repaint();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size() > 0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycle.size() > 0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	
	public void saveObject() throws Exception {
		ObjectOutputStream oout = 
			new ObjectOutputStream(
				new FileOutputStream("dir1/mysign.brad"));
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	
	public void loadObject() throws Exception {
		ObjectInputStream oin = 
			new ObjectInputStream(
				new FileInputStream("dir1/mysign.brad"));
		Object obj = oin.readObject();
		if (obj instanceof LinkedList ){
			lines = (LinkedList<LinkedList<HashMap<String, Integer>>>)obj;
			recycle.clear();
			repaint();
		}else {
			throw new Exception("xxxxxxx");
		}
		oin.close();
		
	}
	
}
