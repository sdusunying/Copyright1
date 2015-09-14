package ThreadTest;

public class ThreadSleepTest extends Thread { 
    public void run() { 
        for (int i = 0; i < 100; i++) { 
            if ((i) % 10 == 0) { 
                System.out.println("-------" + i); 
            } 
            System.out.print(i); 
            try { 
                Thread.sleep(1); 
                System.out.print("    �߳�˯��1���룡\n"); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
    public static void main(String[] args) { 
        new ThreadSleepTest().start(); 
    } 
}
