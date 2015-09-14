package GuiTest;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutTest {
	
	 public static void main(String[] args)
	  {
	    JFrame f = new JFrame();
	    f.setSize(600,800);
	   
	    Container con=f.getContentPane();
		JPanel pan=new JPanel();
		FlowLayout flowlayout= new FlowLayout(FlowLayout.LEFT, 120, 120);
		pan.setLayout(flowlayout);
		
		JLabel myLabel = new JLabel("��ǩ1");
		pan.add(myLabel);
		
		JLabel myLabe2 = new JLabel("��ǩ2");
		pan.add(myLabe2);
		
		JLabel myLabe3= new JLabel("��ǩ3");
		pan.add(myLabe3);

		JLabel myLabe4= new JLabel("��ǩ4");
		pan.add(myLabe4);
		
		con.add(pan);

	    WindowDestroyer myListener = new WindowDestroyer();
	    f.addWindowListener(myListener);

	    f.setVisible(true);
	  }
}
