package ch18;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try (Socket client = new Socket("192.168.0.51", 5000); // localhost -> 127.0.0.1로 내 컴퓨터에 5000번지로 요청한다.
				OutputStream os = client.getOutputStream(); // outputstream으로 통해 oss 문자를 sever에 보낸다.
				ObjectOutputStream oos = new ObjectOutputStream(os);) {

			oos.writeObject("안녕, 단순 서버야");
			oos.flush(); // 소켓이 끊어진다.
			Thread.sleep(500);
		} catch (Exception e) {

		}

	}
}
