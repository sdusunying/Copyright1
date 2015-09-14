package SocketTest;

import java.io.*;

public class WriterTest {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("test.txt");
		String str = "新输入内容：你好";
		char[] cbuf = str.toCharArray();// 把字符串转成char数组
		writer.write(cbuf);// 写进文件
		writer.flush();// 刷新缓冲区
		writer.close();// 关闭流
	}

}
