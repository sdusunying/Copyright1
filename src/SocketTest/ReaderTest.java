package SocketTest;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) throws Exception {
		String path = "D:\\Myeclipse Workspace\\JavaDesign\\test.txt";
		Reader reader = null;
		reader = new FileReader(new File(path));
		// ���建����
		char[] buf = new char[50];
		int len = 0;
		// ѭ����ȡֱ��Ϊ�յ�ʱ��
		while ((len = reader.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		reader.close();
	}
}
