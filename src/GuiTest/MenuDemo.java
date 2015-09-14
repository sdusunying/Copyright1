package GuiTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo extends JFrame {

	public MenuDemo() {

		JMenuBar bar = new JMenuBar(); // ����һ���յĲ˵���
		setJMenuBar(bar);

		JMenu fileMenu = new JMenu("�ļ�");

		JMenuItem newf = new JMenuItem("�½�");
		JMenuItem open = new JMenuItem("��");
		JMenuItem save = new JMenuItem("����");
		
		save.setEnabled(false);

		fileMenu.add(newf);
		fileMenu.add(open);
		fileMenu.addSeparator();
		fileMenu.add(save);
		
		JMenu editMenu = new JMenu("�༭");
		JMenuItem cut = new JMenuItem("����");
		JMenuItem copy = new JMenuItem("����");
		JMenuItem paste = new JMenuItem("ճ��");
		editMenu.add(cut);
		editMenu.add(copy);
		editMenu.add(paste);
		
		bar.add(fileMenu);
		bar.add(editMenu);

		MenuListener ml = new MenuListener();
		open.addActionListener(ml);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);

	}

	public static void main(String[] args) {
		MenuDemo md = new MenuDemo();
	}

}

class MenuListener implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		System.out.println("����ˡ��򿪡��˵�");
	}
}
