package InterTest;

class Outer5 {
	public void myVoid() {
		class Inter // ����һ���ֲ��ڲ���
		{
			int i = 5; // �ֲ��ڲ���ĳ�Ա����
		}
		Inter in = new Inter();
		System.out.println("�ֲ��ڲ���ĳ�Ա����Ϊ��" + in.i);
	}
}

public class OutinTest5 {
	public static void main(String args[]) {
		Outer5 o = new Outer5(); // �����ⲿ�����
		o.myVoid(); // �����ڲ����г�Ա
	}
}