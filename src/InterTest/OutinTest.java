package InterTest;

class Outer {
	class Inter // �����Ǿ�̬�ڲ���
	{
		int i = 5; // �ڲ����Ա
	}

	public void myVoid() // �ⲿ���Ա
	{
		Inter n = new Inter(); // ����һ���ڲ������
		int ii = n.i; // �����ڲ����Ա
		System.out.println("�ڲ���ı���ֵΪ��" + ii);
	}
}

public class OutinTest {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.myVoid();
	}
}
