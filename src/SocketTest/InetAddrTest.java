package SocketTest;

import java.net.*;

public class InetAddrTest {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress ia=InetAddress.getLocalHost(); //��ñ���IP��ַ���
		System.out.println("��������"+ia.getHostName());  //�õ�������
		System.out.println("������ַ:"+ia.getHostAddress()); //�õ�������ַ


		InetAddress ia2=InetAddress.getByName("Lily-THINK"); //ͨ�������������Ϣ
		System.out.println("������ַ��"+ia2.getHostAddress());

		
		InetAddress ia4=InetAddress.getByName("www.163.com"); //����������DNS��ѯIp
		System.out.println("163 IP:"+ia4.getHostAddress());

	}
}
