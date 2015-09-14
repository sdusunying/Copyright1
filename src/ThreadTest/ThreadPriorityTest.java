package ThreadTest;

public class ThreadPriorityTest {
	public static void main(String agrs[]) {
		Thread one = new PriorityTest("one");
		Thread two = new PriorityTest("two");
		Thread three = new PriorityTest("three");
		one.setPriority(Thread.MIN_PRIORITY);
		two.setPriority(Thread.NORM_PRIORITY);
		three.setPriority(Thread.MAX_PRIORITY);

		one.start();
		two.start();
		three.start();
	}

}

class PriorityTest extends Thread { // 线程的调度模型
	PriorityTest(String str) {
		super(str);
	}

	public void run() {
	 	try {
			Thread.sleep(20 );
		} catch (InterruptedException e) {
			System.err.println(e.toString());
		}
 
		System.out.println(getName() + " " + getPriority());
	}
}