package GuiTest;

import javax.swing.*;
import java.awt.*; // for Container class

public class HelloApplet extends JApplet {
	public void init()

	{
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel myFirstLabel = new JLabel("Hello out there!");
		contentPane.add(myFirstLabel);
	}
}
