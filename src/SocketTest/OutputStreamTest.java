package SocketTest;

import java.io.*;

public class OutputStreamTest {
	public static void main(String[] args) throws Exception {
		
		OutputStream out = new FileOutputStream("test.txt",true);
		byte[] bys = "hello".getBytes();
		for (int i = 0; i < bys.length; i++) {
			out.write(bys[i]);//ÿ��ֻд��һ������
		}
		out.flush();
		out.close();

	}

}
