package InterTest;

class Outer3 {
	int i = 8; // �ⲿ���Ա����
	class Inter // �����Ǿ�̬�ڲ���
	{
		public void myVoid() // �ڲ����Ա����
		{
			System.out.println("�ⲿ���еĳ�Ա����ֵΪ��" + i);
		}
	}
}

public class OutinTest3 {
	public static void main(String args[]) {
		Outer3 ou = new Outer3(); // �����ⲿ�����
		Outer3.Inter oi2 = ou.new Inter();// �����ڲ������
		oi2.myVoid(); // �����ڲ����г�Ա
	}
}