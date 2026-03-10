package ch09;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchDemo {

	public static void main(String[] args) {
		// FileInputStream fs;

		// 수정한다. -> 자바 7부터 예외 여부 상관없이 리소스를 자동 반납한다.
		// 반드시 AutoCloseable 인터페이스 구현되어야 함
		try (FileInputStream fs = new FileInputStream("file.txt")) {
			// 선언문이 안으로 들어왔다.

			int data;

			while ((data = fs.read()) != -1) {
				System.out.println((char) data);
			}
			fs.close(); // 파일을 열고 닫아야 함
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

		/*
		 * try { fs = new FileInputStream("file.txt");
		 * 
		 * int data;
		 * 
		 * while((data = fs.read()) != -1) { System.out.println((char)data); }
		 * fs.close(); //파일을 열고 닫아야 함 }catch(IOException e) { e.printStackTrace();
		 * }finally {
		 * 
		 * }
		 */
		// 리소스를 관리하는 코드를 추가하면 가독성도 떨어지고, 개발자도 번거롭다.
	}

}
