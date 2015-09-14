package GuiTest;


import java.awt.Graphics;

import javax.swing.JApplet;


public class MyApplet extends JApplet{
	  public void init(){
		    System.out.println("init()method called!");  }
		  public void start(){
		    System.out.println("start() method called!");  }
		  public void stop() {
		    System.out.println("stop() method called!");  }
		  public void destroy() {
		    System.out.println("destroy () method called!");  }
		  public void paint(Graphics g){
		    g.drawString("Hello World!",50,80);
		    System.out.println("paint() method called!");  }

}
