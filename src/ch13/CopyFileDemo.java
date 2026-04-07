package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {

	public static void main(String[] args) {
		// C:/temp/text1.txt를 읽어서, C:temp/test2.txt로 저장하는 예제
		String input = "c\\temp\\test1.txt";
		String output = "c\\temp\\test2.txt";
		// '\'는 특수문자이다.

		try {
			InputStream fis = new FileInputStream(input);
			OutputStream fos = new FileOutputStream(output);
			// 추상적인 것에 의존한다.
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
				// endofstream을 만날때까지읽는다.
			}
			fos.flush();
			// endofstream 만나면 빠져나온다.

		} catch (IOException e) {
			e.printStackTrace();
		}

		// fis.read() ==> fos.write() : 파일 끝을 만날 때 까지 읽는다.
		// fos.flush()
		// fis.close, fos.close();
		// FileInput, OutputStream을 통해 이렇게 쓸 필요가 없음
	}

}
