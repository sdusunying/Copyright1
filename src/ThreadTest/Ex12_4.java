package ThreadTest;

public class Ex12_4 {
	public static void main(String args[]) {
		Cperson c1 = new Cperson();
		Cperson c2 = new Cperson();
		c1.start();
		c2.start();
	}
}

class Countmoney {
	private static int sum = 0;

	public  static void add(int n) {
		int t = sum;
		t = t + n;
		try {
			Thread.sleep((int) (1000 * Math.random()));
		} catch (InterruptedException e) {
		}
		sum = t;
		System.out.println("sum=" + sum);
	}
}

class Cperson extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++)
			Countmoney.add(100);
	}
}
