package GuiTest;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GridlayoutDemo extends JFrame {
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	public GridlayoutDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ò��ַ�ʽΪGridLayout,2�У�2��
		setLayout(new GridLayout(2,2));
		//������ʱ����Ҫ������������С���
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
	}
	public static void main(String arg[]) {
		GridlayoutDemo frame = new GridlayoutDemo();
		frame.setVisible(true);
	}
}
