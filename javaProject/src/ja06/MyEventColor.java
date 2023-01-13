package ja06;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyEventColor implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
	
	public static void main(String[] args) { //실행
		new ColorSet();
	}
	
	public MyEventColor(JFrame f , Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
}

	class ColorSet extends JFrame{
		
		public ColorSet() {
			
			setTitle("01-06 과제");//타이틀 셋팅
			setSize(1000, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setLayout(new BorderLayout()); //생략 가능
			
			Button b1=new Button("east");
			Button b2=new Button("west");
			Button b3=new Button("south");
			Button b4=new Button("north");
			
			add(b1, "East");
			add(b2, "West");
			add(b3, "South");
			add(b4, "North");
			
			b1.addActionListener(new MyEventColor(this, Color.red));
			b2.addActionListener(new MyEventColor(this, Color.green));
			b3.addActionListener(new MyEventColor(this, Color.blue));
			b4.addActionListener(new MyEventColor(this, Color.yellow));
			

		}
}