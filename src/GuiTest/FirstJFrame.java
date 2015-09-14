package GuiTest;

import javax.swing.*;

public class FirstJFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame("hello");
		f.setTitle("My First JFrame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.setVisible(true);
	}
}
