package ch13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		// jvm에게 예외처리를 떠넘긴다.
		// FileOutputStream 사용법
		// byte a,b,c => c:/Temp/test1.txt에 저장한다.

		OutputStream os = new FileOutputStream("c:/Temp/test1.txt");
		// 추상적인 것에 의존하도록 Output 형태로 os를 자식에 가리킨다.
		// FileOutputStream() 안에 절대 경로를 넣는다. -> 파일에 출력한다. -> 이때 바이트 단위여서 읽을 수 없다.

		byte a = 10, b = 20, c = 30;
		// 바이트 단위로 데이터를 상속받는다.

		os.write(a);
		os.write(b);
		os.write(c);

		// write를 쓸 경우, 버퍼 채워져서 비워야 한다.
		os.flush();
		os.close();
	}

}
