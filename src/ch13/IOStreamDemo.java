package ch13;

import java.io.IOException;

public class IOStreamDemo {

	public static void main(String[] args) throws IOException{
		// Scanner가 아닌 System.in(입력 스트림)으로 데이터를 읽는다.
		//java base의 java.io에 들어있는 inputstream과 outputstream을 사용한다. 
		int b, length = 0;
		int[] arr = new int[100];
		//바이트 단위로 읽음
		System.out.println("---입력  스트림---");
		b = System.in.read();
		//입력된 값을 읽어서 반환한다.
		while((b = System.in.read()) != '\n') {
			
			arr[length] = b;
			length++;
			//입력한 값은 i번째에 버퍼 b로 지정
			//i를 증가시켜 배열의 다음 자리에 버퍼 b로 지정지켜 입력받은 문자만큼 받는다.
			System.out.println((char) b + "(" + b + ")");
			//닙력된 버퍼와 아스키 코드값을 반환된 버퍼를 출력한다.
		};
		//하나의 문자를 읽어, \n이 아닐 떄 까지 읽는다. -> \n이 아닐때까지 문자를 읽고 \n일때 빠져 나온다.
		
		//System.out(출력 스트림)으로 데이터를 화면상에 출력한다.
		System.out.println("-- 출력  스트림---");
		for (int i = 0; i < arr.length; i++) {
			System.out.write(arr[i]);
			//입력한 값을 아스키 코드 값으로 반환하여 반복출력한다.
			//이때 버퍼가 채워졌으므로 버퍼를 비워진다.
		}
		System.out.flush();
		//버퍼를 비워진다.
		System.out.close();
		//heap 영억이어서 close()가 없더라도 자동으로 닫혀진다.
	}

}
