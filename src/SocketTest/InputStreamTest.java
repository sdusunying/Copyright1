package SocketTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws Exception {
		String path = "D:\\Myeclipse Workspace\\JavaDesign\\test.txt";
	
		InputStream input = null;
		input = new FileInputStream(new File(path));
		// ¶¨Òå»º³åÇø
		byte[] bys = new byte[50];
		int len = 0;
		while ((len = input.read(bys)) != -1) {
			System.out.println(new String(bys, 0, len));
		}
		input.close();
	}
}
