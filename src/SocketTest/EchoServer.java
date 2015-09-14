package SocketTest;

import java.io.*;
import java.net.*;

public class EchoServer {
	ServerSocket serverSocket;
	private final int PORT = 8888; // �˿�

	public EchoServer() throws IOException {
		serverSocket = new ServerSocket(PORT); // �������������׽���
		System.out.println("������������");
	}

	// servic()����

	public void servic() {
		Socket socket = null;
		while (true) {
			try {
				socket = serverSocket.accept(); // �ȴ���ȡ���û����ӣ��������׽���
				System.out.println("�����ӣ����ӵ�ַ��" + socket.getInetAddress() + "��"
						+ socket.getPort()); // �ͻ�����Ϣ
				// ����������ȡ�ͻ�����Ϣ
				BufferedReader br = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				// ���������ͻ���д��Ϣ
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream()));
				PrintWriter pw = new PrintWriter(bw, true); // װ���������true,ÿдһ�о�ˢ�����������������flush
				String info = null; // �����û��������Ϣ
				while ((info = br.readLine()) != null) {
					System.out.println(info); // ����û����͵���Ϣ
					pw.println("you said:" + info); // ��ͻ��˷����û����͵���Ϣ��println��������Զ�ˢ�»�����
					if (info.equals("quit")) { // ����û����롰quit�����˳�
						break;
					}
				}
			} // ����ͻ��˶Ͽ����ӣ���Ӧ������쳣������Ӧ�ж�����whileѭ����ʹ�÷������ܼ����������ͻ���ͨ��
			catch (IOException e) {
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
	}

	public static void main(String[] args) throws IOException {
		new EchoServer().servic(); // ��������
	}
}