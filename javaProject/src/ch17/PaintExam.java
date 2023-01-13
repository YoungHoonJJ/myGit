package ch17;

import java.awt.Graphics;
import java.awt.Paint;

import javax.swing.JFrame;

public class PaintExam extends JFrame {
	public PaintExam() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,800);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("hello", 10, 60);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
