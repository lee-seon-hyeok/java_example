package ch08;

public class WrapperClassDemo {

	public static void main(String[] args) {
		String s = "123";
		int i = Integer.parseInt(s);
		System.out.println(i + 10);
		// int 값으로 반환
		// 소문자 int는 숫자만 넣음

		// Integer iI = null;
		Integer iI = 10; // <- 자동 박싱
		int j = iI;// 객체로 값을 할당할 때, 강제 형변환 없이 자동 언박싱을 함
		System.out.println(iI);
		// null값이 출력 -> 지역변수는 참조되기전 초기화해야 함
		// 객체인 Integer는 null 넣을 수 있음
		// 매개변수에 저당된 메모리 영역에 값만 처리하기 위해 포장

	}

}
