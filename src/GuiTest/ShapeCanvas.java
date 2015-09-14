package GuiTest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class ShapeCanvas extends Canvas {
	ShapeCanvas() {
		setBackground(Color.white);
	}
	public void paint(Graphics g) {
		//��ͼ
		//��Բ
		Graphics2D g2=(Graphics2D)g;
		
		Ellipse2D ellipse=new Ellipse2D.Double(20,30,400,200); 
		g2.setColor(Color.green);
		g2.draw(ellipse);
		// ֱ�� ǰ������������ʼ�㣬�����������ǽ�����
		Line2D line = new Line2D.Double(70, 30, 70, 100);
		g2.setColor(Color.red);
		g2.draw(line);
		// ����
		Rectangle2D rec = new Rectangle2D.Double(200, 100, 300, 400);
		g2.setColor(Color.ORANGE);
		g2.draw(rec);
		g2.setColor(Color.gray);
		g2.fill(rec);
		//Բ�Ǿ���
		RoundRectangle2D rrec = new RoundRectangle2D.Double(50, 50, 300, 500,20, 20);
		g2.setColor(Color.blue);
		g2.draw(rrec);

		
		//Բ��
		Arc2D arc= new Arc2D.Double(400, 10, 200, 90, 0, 270, 	Arc2D.OPEN);//����
		g2.draw(arc);
		g2.fill(arc);
		arc.setArc(600, 10, 90, 90, 0, 270, Arc2D.CHORD);// ����
		g2.draw(arc);
		arc.setArc(700, 10, 90, 90, 0, -270, Arc2D.PIE);// ����
		g2.draw(arc);

		//�����ı�
		Font f1 = new Font("����", Font.BOLD, 28);
		Font f2 = new Font("����", Font.BOLD + Font.ITALIC, 22);
		g2.setFont(f1);
		g2.drawString("�߼������������", 600, 300);
		g2.setFont(f2);
		g2.drawString("Java�γ����", 600, 350);
		
		// ���������Բ
		Ellipse2D ellipse1 = new Ellipse2D.Double(500, 400, 400, 200);
		GradientPaint gp = new GradientPaint(20, 30, Color.red, 200, 100, Color.green, true);//true������ɫѭ��
		g2.setPaint(gp);
		g2.fill(ellipse1);
		
		BufferedImage bi = new BufferedImage(5, 5, 
				   BufferedImage.TYPE_INT_RGB); 
				Graphics2D big = bi.createGraphics();
				big.setColor(Color.blue);      
				big.fillRect(0,0,5,5);         
				big.setColor(Color.yellow);  
				big.fillOval(0,0,5,5);         
				Rectangle r = new Rectangle(0,0,5,5);
				TexturePaint tp = new  TexturePaint(bi,r);
				g2.setPaint(new  TexturePaint
				        (bi, new Rectangle(0,0,5,5)));
				g2.fill( new RoundRectangle2D.Double
				     ( 155, 40, 75, 110, 50, 50 ) ); 



	}
}
