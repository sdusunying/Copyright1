package ThreadTest;

public class multTheadTwo {
	public static void main(String args[]) {
		UserThread Obj = new UserThread();
		Thread t1 = new Thread(new UserMultThread(Obj, 1));
		Thread t2 = new Thread(new UserMultThread(Obj, 2));
		Thread t3 = new Thread(new UserMultThread(Obj, 3));

		t1.start();
		t2.start();
		t3.start();
	}
}

class UserMultThread implements Runnable {
	UserThread UserObj;
	int num;

	UserMultThread(UserThread o, int n) {
		UserObj = o;
		num = n;
	}

	public  void run() {
		UserObj.Play(num);
	}
}

class UserThread { // ��Դ��ͻ
	 void  Play(int n) {
		System.out.println("�����߳� NO��" + n);

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			System.out.println("�߳��쳣, NO��" + n);
		}

		System.out.println("�����߳� NO��" + n);
	}
}
