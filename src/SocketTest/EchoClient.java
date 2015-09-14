package SocketTest;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class EchoClient {
	static final int PORT = 8888; // ���Ӷ˿�
	static final String HOST = "192.168.250.209"; // ���ӵ�ַ
	Socket socket;

	public EchoClient() throws UnknownHostException, IOException {
		socket = new Socket(HOST, PORT); // �����ͻ����׽���
	}

	// send()����

	public void send() {
		try {
			// �ͻ���������������������Ϣ
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			// �ͻ��������������շ�������Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader(socket
					.getInputStream()));
			PrintWriter pw = new PrintWriter(bw, true); // װ�����������ʱˢ��
			Scanner in = new Scanner(System.in); // �����û���Ϣ
			String msg = null;
			while ((msg = in.next()) != null) {
				pw.println(msg); // ���͸���������
				System.out.println(br.readLine()); // ������������ص���Ϣ
				if (msg.equals("quit")) {
					break; // �˳�
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != socket) {
				try {
					socket.close(); // �Ͽ�����
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		new EchoClient().send();
	}
}