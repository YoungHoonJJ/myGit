package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	
	private JMenuItem jmi = new JMenuItem();
	public MenuEx() {
		
		super("menu");
		creatMenu();
		setSize(700,700);
		setVisible(true);
	}

	private void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu jm = new JMenu("file");
		jm.add(new JMenuItem("open"));
		jm.add(new JMenuItem("save"));
		jm.add(new JMenuItem("print"));
		jm.addSeparator();//메뉴 분리선 추가
		jm.add(jmi);
		mb.add(jm);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("run"));
		
		setJMenuBar(mb);
		jmi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
