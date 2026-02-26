package ch02;

public class CompareDemo {

	public static void main(String[] args) {
		// 참조 타입 비교
		String str1 = "hello";
		String str2 = "hello";

		String str3 = new String("hello");
		String str4 = new String("hello");
		String str6 = new String("hello");
		// new string : 자바가 최적화하기 전 문법
		// heap 영역에 new string 호출될때마다 hello 객체를 만들어 각각의 다른 주소에 넣어 메모리 낭비함
		// 그래서 string pool 사용

		System.out.println(str1 == str2);
		// 주소가 같다고 나옴
		System.out.println(str3 == str4);
		// 문자열은 ==로 값이 같다고 나오지 않음
		System.out.println(str3.equals(str4));
		// 문자열을 equal를 통해 값이 같은 여부가 제대로 나온다

		System.out.println(str3.equalsIgnoreCase(str6));
		// 대소문자 관계 없이 문자열이 비슷하나 여부를 물어봄

		// 기초 타입 비교
		System.out.println(1 == 1);
		System.out.println(true != true);
		System.out.println(3 > 2);
		// System.out.println(true > false);
		// 물리 타입은 크기 비교를 할 수 없다
	}

}
