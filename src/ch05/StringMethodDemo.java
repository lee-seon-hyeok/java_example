package ch05;

public class StringMethodDemo {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Java";
		String s3 = "hello";

		System.out.println("s1의 문자열 길이는 ?" + s1.length());
		// ㅣength() -> 문자열의 길이

		System.out.println(s2.charAt(2));
		// 문자열을 문자로 변환
		System.out.println(s2.toUpperCase());// 전부다 대문자로 변경
		// 이떄 불변 객체로 진짜 바꿔지지 않고 보여주기만 함 -> 진짜 값을 바꾸려면 값을 할당해야 함

		System.out.println(s3.substring(1)); // 1번부터 끝까지 ello
		// 서브 스트링 : 1번자리 부터 시작해서 n번까지 문자열을 자르게 함
		System.out.println(s3.substring(1, 3)); // 1~3까지

	}

}
