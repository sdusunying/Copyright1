package GuiTest;

import java.awt.Container;

import javax.swing.*;
public class NoLayoutSwingDemo {
	public static final int WIDTH = 300;
	  public static final int HEIGHT = 200;

	  public static void main(String[] args)
	  {
		  JFrame f=new JFrame();
		  f.setTitle("ѧ����Ϣ����ϵͳ");
		  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  f.setSize(800,600);
		  
		  Container con=f.getContentPane();
		  JPanel pan=new JPanel();
		  
		  JLabel jbxx=new JLabel("ѧ��������Ϣ¼�����");
		  pan.add(jbxx);
		  JLabel l_xm=new JLabel("����");
		  pan.add(l_xm);
		  JTextField tf_name=new JTextField(20);
		  pan.add(tf_name);
		  
		  JLabel l_jg=new JLabel("¼����");
		  JTextArea result=new JTextArea(10,30);
		  JScrollPane sp=new JScrollPane(result);
		  pan.add(sp); 
		  pan.add(l_jg);
		
		  

		  JButton b_sub=new JButton("ȡ��");
		  pan.add(b_sub);
		  JButton b_save=new JButton("����");
		  pan.add(b_save); 

		  con.add(pan);
		  f.setVisible(true);
		  
		 


	  }

}
