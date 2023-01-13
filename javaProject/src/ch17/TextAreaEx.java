package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	private JTextField tf = JTextField(20);
	private JTextArea ta = new JTextArea(6,20);
	
	public TextAreaEx() {
		super("예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 엔터키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource(); //객체타입 /오브젝트 타입
				ta.append(t.getText()+"\n"); //텍스트필드의 문자열을 textarea영역으로 옮김
				t.setText("");
				
				
			}
		});
		setSize(250,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new TextAreaEx();
		// TODO Auto-generated method stub

	}

}
