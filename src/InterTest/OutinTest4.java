package InterTest;

class Outer4 {
	int i = 8; // �ⲿ���Ա����

	class Inter // �����Ǿ�̬�ڲ���
	{
		int i = 9;
		Outer4 ou = new Outer4();

		public void myVoid() // �ڲ����Ա����
		{
			System.out.println("�ڲ����еĳ�Ա����ֵΪ��" + i);
			System.out.println("�ⲿ���еĳ�Ա����ֵΪ��" + ou.i);
		}
	}
}

public class OutinTest4 {
	public static void main(String args[]) {
		Outer4 w = new Outer4(); // �����ⲿ�����
		Outer4.Inter wn2 = w.new Inter(); // �����ڲ������
		wn2.myVoid(); // �����ڲ����г�Ա
	}
}
