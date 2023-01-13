package ja09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame {
	
	public MyGridLayout() {
		
		
		
		setLayout(null);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		p1.add(new JLabel("id"));
		p1.add(new JLabel(":"));
		p1.add(new JLabel("비밀번호"));
		p1.add(new JLabel(":"));
		p1.add(new JLabel("이메일"));
		p1.add(new JLabel(":"));
		p1.add(new JLabel("hp"));
		p1.add(new JLabel(":"));
		add(p1);
		p1.setBounds(10, 5, 115, 120);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 1));
		p2.add(new JTextField("hong"));
		p2.add(new JPasswordField("1234"));
		p2.add(new JTextField("hong@daum.net"));
		p2.add(new JTextField("010-1234-5678"));
		add(p2);
		p2.setBounds(130, 5, 165, 120);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new MyGridLayout();
		
	}
	

}
