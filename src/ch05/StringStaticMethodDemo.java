package ch05;

public class StringStaticMethodDemo {

	public static void main(String[] args) {
		// 숫자를 문자열로 만드는 방법 : 숫자 + "", String.valueof()
		// 1.정수, 실수를 문자열로 만들기
		String str = String.valueOf(10);// 정수
		System.out.println(str);

		String str2 = String.valueOf(3.14);// 실수
		System.out.println(str);

		// 2.여러 타입의 변수들을 내가 원하는 포멧의 문자열로 만드는 법 : string.format()
		// Static을 이용해야 한다.
		System.out.println("PI =" + 3.14 + "입니다.");
		String str3 = String.format("%s = %d입니다,", "PI", 3.14);
		System.out.println(str2);
		// 결과는 동일하지만 사용법은 다름
	}

}
