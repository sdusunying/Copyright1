package ThreadTest;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class GUIWithoutMultiThread extends JFrame {
	private int count = 0;
	private JButton start = new JButton("Start"),
			onOff = new JButton("Toggle");
	private JTextField t = new JTextField(10);
	private boolean runFlag = true;

	public GUIWithoutMultiThread() {
		setSize(400, 100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(t);
		start.addActionListener(new StartL());
		this.add(start);
		onOff.addActionListener(new OnOffL());
		this.add(onOff);
	}

	public void go() {
		while (true) { // ����ѭ��
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.println("Interrupted");
			}
			if (runFlag)// ͬһ���̣߳��ı���ˢ��
				t.setText(Integer.toString(count++));
		}
	}

	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			go();
		}
	}

	class OnOffL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			runFlag = !runFlag;
		} // ͬһ���̣߳�û����ִ��
	}

	public static void main(String[] args) {
		new GUIWithoutMultiThread().setVisible(true);
	}
}
