package InterTest;




class Outer6 {
	static class Inter // ������̬�ڲ���
	{
		int i = 5; // �ڲ����Ա
	}

	public void myVoid() // �ⲿ���Ա
	{
		Inter in = new Inter(); // ����һ���ڲ������
		int ii = in.i; // �����ڲ����Ա
		System.out.println("��̬�ڲ���ı���ֵΪ��" + ii);
	}
}

public class OutinTest6{
	public static void main(String args[]) {
		Outer ou = new Outer();
		ou.myVoid();
	}
}
