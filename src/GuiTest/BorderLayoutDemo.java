package GuiTest;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class BorderLayoutDemo extends JFrame {
	private JButton north = new JButton("��");
	private JButton south = new JButton("��");
	private JButton east = new JButton("��");
	private JButton west = new JButton("��");
	private JButton center = new JButton("��");
	public BorderLayoutDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ò��ַ�ʽΪBorderLayout
		setLayout(new BorderLayout());
		//��Ӱ�����ע�����ò��ַ�ʽ֮���κζ�����������õķ���������setSize��setLocation�ȶ���ʧЧ
		add(north,BorderLayout.NORTH);
		add(south,BorderLayout.SOUTH);
		add(east,BorderLayout.EAST);
		add(west,BorderLayout.WEST);
		add(center,BorderLayout.CENTER);
		setVisible(true);

	}
    public  static  void  main(String[]  args) {
    	BorderLayoutDemo  f = new BorderLayoutDemo();
  }

}
