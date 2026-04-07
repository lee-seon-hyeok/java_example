package ch13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// Scanner in = new Scanner(new FileReader());

		long start, end, duration;
		String inputFile = "C:\\temp\\file1.txt";
		String outputFile = "C:\\temp\\file2.txt";

		start = System.nanoTime();
		end = System.nanoTime();
		duration = end - start;
		// BufferedReader과 OutputWriter의 속도 비교
		try (BufferedReader bis = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bos = new BufferedWriter(new FileWriter(outputFile))) {
			int c;
			while ((c = bis.read()) != -1) {// 읽을 수 있는 바이트의 개수를 반환
				bos.write(bis.read());
			} // 별도로 사용한 버퍼를 닫아야 한다. -> close는 자동
			bos.flush();
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		// 외부의 버퍼를 따로 둔다.
		end = System.nanoTime();
		duration = end - start;
		System.out.println("buffered Steam을 사용한 경우 처리 시간 : " + duration);

		start = System.nanoTime();
		end = System.nanoTime();
		duration = end - start;
		// temp에 iexplore.exe가 저장되면서 크기가 810kb이다. -> 1,644,792,000
		// buffered Reader 처리시간 : 2513400

		// 외부의 별도의 버퍼를 쓰지 않았고 내부의 버퍼를 사용할때
		// FileReader, OutputReader의 속도 비교
		try (FileReader bis = new FileReader(inputFile); FileWriter bos = new FileWriter(outputFile)) {
			while (bis.read() > 0) { // 읽을 수 있는 바이트의 개수를 반환
				bos.write(bis.read());
			} // 별도로 사용한 버퍼를 닫아야 한다. -> close는 자동
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		start = System.nanoTime();
		end = System.nanoTime();
		duration = end - start;
		System.out.println("File Steam을 사용한 경우 처리 시간 : " + duration);
		// buffered보다 3배 이상 시간이 걸리다. -> 5,441,629, 300
		// file Reader 사용할 경우 처리시간 : 7991900
	}

}
