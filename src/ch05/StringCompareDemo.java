package ch05;

public class StringCompareDemo {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = "A";

		// if(str1 > str2) <- 거짓
		System.out.println(str1.compareTo(str2));
		// 문자열 크기 비교 -> a - b로 0보다 큰 값이면 a가 크다, 0보다 작으면 b가 크다, 0이 나오면 a와 b는 같다.

		System.out.println(str2.compareTo(str1));
		// b-a로 값을 비교한다.

		System.out.println(str1.compareTo(str3));
		// 소문자 a가 더 큼

		System.out.println(str1.compareToIgnoreCase(str3));
		// 대소문자 비교 안하고 크기 비교

		System.out.println(str1.equalsIgnoreCase(str3));
		// true, false 여부로 준다

		if (str1.compareTo(str2) > 0) {
			System.out.println(str1 + "이 사전 순으로 더 먼저 나옵니다.");
		} else if (str1.compareTo(str2) == 0) {
			System.out.println(str2 + "이 사전 순으로 더 먼저 나옵니다.");
		} else {
			System.out.println("a가 c보다 사전 순으로 출력된다");
		}

	}

}
