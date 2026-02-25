package ch02;

public class HearAreaEx {

	public static void main(String[] args) {
		// Heap 영역에 저장방식

		String str = "hello";
		// 지금까지 소문자 int,double,float
		// String은 대문자로, 이때 대문자를 붙인 타입은 객체이다.
		// 객체는 Heap 영역에 저장한다.
		System.out.println(str);

	}

}
