package GuiTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class SimpleEventDemo2 extends JFrame{
	JButton button=new JButton("press me");
	public SimpleEventDemo2() {
		setSize(300,300);		
		setLocation(400, 400);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //���ð����¼���ʹ����������
		button.addActionListener(new ActionListener(){
		//��ȡ������İ���
		public void actionPerformed(ActionEvent e) {	
			JButton clickedButton=(JButton) e.getSource();
			//�ı䱻��������ı���
			clickedButton.setText("I have been pressed");
					}
				});
			setLayout(new BorderLayout());
			add(button,BorderLayout.NORTH);
			}
			public static void main(String[] args) {
				SimpleEventDemo2 frame=new SimpleEventDemo2();
				frame.setVisible(true);
			}
		}
