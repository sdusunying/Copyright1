package SocketTest;

import java.io.*;

public class WriterTest {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("test.txt");
		String str = "���������ݣ����";
		char[] cbuf = str.toCharArray();// ���ַ���ת��char����
		writer.write(cbuf);// д���ļ�
		writer.flush();// ˢ�»�����
		writer.close();// �ر���
	}

}
