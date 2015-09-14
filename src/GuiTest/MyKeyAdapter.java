package GuiTest;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter{
	public void keyPressed(KeyEvent event) {
		switch (event.getKeyCode()) {
		case KeyEvent.VK_UP:
			System.out.println("按下了按键：UP");
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("按下了按键：DOWN");
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("按下了按键：LEFT");
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("按下了按键：RIGHT");
			break;
		default:
			System.out.println("按下了按键：" + event.getKeyChar());
		}
	}
}
 
