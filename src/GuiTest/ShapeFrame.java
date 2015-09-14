package GuiTest;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShapeFrame extends Frame{ 
	ShapeCanvas sc = new ShapeCanvas();
	public ShapeFrame(String s) {
		super(s);
		setLayout(new BorderLayout());
		add(sc,BorderLayout.CENTER);
		setSize(1000,700);
		setVisible(true);
		 
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public static void main(String args[]){
		ShapeFrame pf = new ShapeFrame("Õº–Œ¥¶¿Ì");
	}
}
