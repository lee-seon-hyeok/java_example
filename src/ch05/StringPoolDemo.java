package ch05;

public class StringPoolDemo {

	public static void main(String[] args) {
		// -----------------자바가 스트링에 최적화 하기 전
		String str1 = new String("hellow");
		String str2 = new String("hellow");

		str1 = str2;
		// str2의 주소값에 할당하며 str2 주소로 가리킴 -> 불변성

		str2 = "hello2";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// String 생성자를 이용해서 안에 있는 내용을 초기화를 함
		// 생성자를 만들면 heap에 객체 만들어짐. 이떄 heap에서 객체는 hello로 초기화
		// stack에 str1에 주소로 할당함
		// heap에 hello를 추가하여 stack의 str2에 주소를 할당했었음
		// stack에 2자리를 차지하기 때문에 최적화하게 됨

		System.out.println(str1);
		System.out.println(str2);
		// 불변성 성격으로 str1은 안 바뀌고 str2만 변경된다.

		// pool에 데이터들을 담아서 필요할 때 pool로부터 가져와서 사용한다.
		// ---------------------------자바가 최적한 후
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// 값이 같을 경우, 다른 주소들이 pool에 할당하면, pool에서 같은 주소로 만든다

		// String 안에 to sring이 탑재되어 있어서 자동으로 값을 출력

	}

}
