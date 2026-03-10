package ch08;

import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		// StringTokenizer st = new StringTokenizer(s);
		// s 배열로 토큰 st을 만든다. 이때 공백 기준 9개의 토큰을 나온다

		StringTokenizer st = new StringTokenizer(s, ",");
		System.out.println(st.countTokens());
		// , 기준으로 구분자를 만든다 - >3개의 토큰이 나온다.
		// 이때 구분자 기준은 1개만 가능하다.

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken().trim());
			// trim() : 앞 뒤의 공백을 자른다.
		} // 토큰 개수 출력
		st.nextToken();
		// 다음 토큰 가져오기 -> 에러 나옴 -> while 문과 같이 사용해야 한다.

		// st에서 토큰이 몇개인지 반환, 완벽히 배열이 아닌 반복자를 포함한 객체를 반환한다.
		// 반복자 : 기본 구분자로 나눈 특정한 객체로 분리하여 토큰을 만들어, 토큰 여부에 반복적으로 가져온다
		// 토큰이 없으면 false로 더 이상 가져온다. 한번만 실행된다.

	}

}
