package InterTest;

class Outer2 {
	class Inter // �����Ǿ�̬�ڲ���
	{
		int i = 5; // �ڲ����Ա
		int ii = 6;
	}
}

public class OutinTest2 {
	public static void main(String args[]) {
		Outer2.Inter oi1 = new Outer2().new Inter();
		Outer2 o = new Outer2();
		Outer2.Inter oi2 = o.new Inter();
		System.out.println("�ڲ����еı���i��ֵΪ��" + oi1.i);
		System.out.println("�ڲ����еı���ii��ֵΪ��" + oi2.ii);
	}
}
