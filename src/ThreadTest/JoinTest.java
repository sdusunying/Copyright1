package ThreadTest;

public class JoinTest {
	public static void main(String args[]) {
		ThreadTest2 r = new ThreadTest2();
		Thread t = new Thread(r);
		Thread t2=new Thread(r);
		t.start();
		t2.start();
	}
}

class ThreadTest2 implements Runnable {
	int i;

	public void run() {
		i = 0;
		while (true) {
			System.out.println("Hello " + i++);
			if (i == 50) {
				break;
			}
		}
	}
}


