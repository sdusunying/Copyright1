package ThreadTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIWithMultiThread extends JFrame {
	private int count = 0;
	private JButton start = new JButton("Start"),
			onOff = new JButton("Toggle");
	private JTextField t = new JTextField(10);
	private boolean runFlag = true;

	public GUIWithMultiThread() {
		setSize(400, 100);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(t);
		start.addActionListener(new StartL());
		this.add(start);
		onOff.addActionListener(new OnOffL());
		this.add(onOff);
	}

	private class SeparateSubTask extends Thread {
		private int count = 0;
		private boolean runFlag = true;

		SeparateSubTask() {
			start();
		}

		void invertFlag() {
			runFlag = !runFlag;
		}

		public void run() {
			while (true) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
				}
				if (runFlag)
					t.setText(Integer.toString(count++));
			}
		}
	}

	private SeparateSubTask sp = null;

	class StartL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sp == null)
				sp = new SeparateSubTask();
		}
	}

	class OnOffL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sp != null)
				sp.invertFlag();
		}
	}

	public static void main(String[] args) {
		new GUIWithMultiThread().setVisible(true);
	}
}
