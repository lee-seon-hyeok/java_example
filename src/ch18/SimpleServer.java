package ch18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(5000); // 자신의 IP가 5000번지인 것이 오길 대기시킨다. -> localhost : 자신의 ip
				Socket connection = server.accept(); // 접속 기다리는 요청을 기다리면서, 요청이 오면 받아줌
				InputStream is = connection.getInputStream(); // 요청를 받아서 ois에서 클라이언트의 메시지를 가져와서 출력한다.
				ObjectInputStream ois = new ObjectInputStream(is);) { // 한번 연결을 받고 끝낸다.

			String str = (String) ois.readObject();
			System.out.println("받은 문자열 = " + str);
		} catch (Exception e) {
		}

	}

}
