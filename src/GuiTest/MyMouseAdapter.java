package GuiTest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class MyMouseAdapter extends MouseAdapter {

	public void mouseClicked(MouseEvent event) {
		System.out.println("�����" + event.getX() + "," + event.getY() + "�����˵��");
	}

	public void mouseMoved(MouseEvent event) {
		System.out.println("����ƶ�����" + event.getX() + "," + event.getY());
	}

	public void mouseWheelMoved(MouseWheelEvent event) {
		System.out.println("�����ֽ����˹���");
	}

}
