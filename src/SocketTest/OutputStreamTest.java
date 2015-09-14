package SocketTest;

import java.io.*;

public class OutputStreamTest {
	public static void main(String[] args) throws Exception {
		
		OutputStream out = new FileOutputStream("test.txt",true);
		byte[] bys = "hello".getBytes();
		for (int i = 0; i < bys.length; i++) {
			out.write(bys[i]);//每次只写入一个内容
		}
		out.flush();
		out.close();

	}

}
