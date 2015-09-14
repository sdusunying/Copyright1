package ThreadTest;

public class Machine extends Thread{
	  public void run(){
	    for(int a=0;a<10;a++)
	      System.out.println(getName()+":"+a);
	  }
	  public static void main(String args[])throws Exception{
	    Machine machine=new Machine();
	    machine.setName("m1");

	    machine.start();
	    System.out.println("main:join machine");
	    machine.join();  //主线程等待machine线程运行结束
	    System.out.println("main:end");
	  }
	}
