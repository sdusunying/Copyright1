package ThreadTest;

public class getThreadInfo {
    public static void main(String args[ ]) {
		String name;	 
		int p;
		Thread curr; 
		curr=Thread.currentThread( ); 
		System.out.println("��ǰ�߳�: "+curr);
		name=curr.getName( );
		p=curr.getPriority( );
		System.out.println("�߳���: "+name);
		System.out.println("���ȼ� :"+p);
	}

}
