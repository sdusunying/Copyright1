package GuiTest;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleKeyEventDemo extends JFrame {
	JLabel label = new JLabel("在控制面板中显示用户按下了什么按键!");

	public SimpleKeyEventDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyKeyAdapter myAdapter = new MyKeyAdapter();
		this.addKeyListener(myAdapter);
		add(label);
		setVisible(true);

	}

	public static void main(String[] args) {
		SimpleKeyEventDemo frame = new SimpleKeyEventDemo();
	}
}
