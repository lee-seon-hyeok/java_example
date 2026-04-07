package ch08;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println("s.hashCode()");
		// 오브젝.hash에서 나온 결과물
		s = s + "i"; // -> 다른 문자열 만든다.
		System.out.println("s.hashCode()");
		// hash 코드 값이 같으면 내용이 같지만, 다르면 내용이 다르다.
		// 내용이 다르면 서로 다른 것이 된다.

		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());
		// stringbulder는와 똑같다.
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.replace(0, 2, "hello");
		// 초기값을 가진 hi가 탄생함
		System.out.println(sb);

		long before = System.nanoTime();
		String result = "";
		for (int i = 0; i < 10000; i++) {
			result += i;
		}
		long after = System.nanoTime();
		System.out.println(after - before);

		before = System.nanoTime();
		StringBuilder sb1 = new StringBuilder("");
		for (int i = 0; i < 10000; i++) {
			sb1.append(i);

		}
		// 안에 객체가 다르지만, 안에 들어있는 문자가 다름
		// 자바가 메모리 낭비 적게 구현함
		String res = sb1.toString();
		after = System.nanoTime();
		System.out.println(after - before);
		// 0,2 대신에 hello로 변경 -> 같은 해시코드 갖음
		// 문자열의 해시코드 같지 않다

	}

}
