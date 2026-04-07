package ch05;

public class VariabeLengthDemo {

	public static void main(String[] args) {
		/*
		 * change("a"); change( "a","b"); change("a","b","c"); change("a","b","c","d");
		 */

		change(1, "a"); // [0]
		change(10, "a", "b"); // [0],[1]
		change(30, "a", "b", "c");
		change(40, "a", "b", "c", "d");
		// change(1, "a")처럼 가변적일 경우
	}

	/*
	 * public static void change(String s1) {} public static void change(String s1,
	 * String s2) {} public static void change(String s1, String s2, String s3) {}
	 * public static void change(String s1, String s2, String s3, String s4) {}
	 */
	// 요구사항이 들어올 때마다 계속해서 오버로딩 한 상황 -> 불편해서 다른 방법 사용

	// 가변 개수로 해결
	/*
	 * public static void change(tring... s1) { for(String s : s1) {
	 * System.out.println(s); }//S1을 배열로 처리해서 출력한다 -> for each로 (주소)인덱스 관계없이 하나씩 데이터
	 * 꺼낸다 System.out.println(); //배열의 데이터들을 한번에 출력하고 다음 라인으로 이동 }
	 */

	public static void change(int i, String... s1) {
		// 가변 개수가 타입이 섞여있으면 타입의 순서에 맞게 적어야 함
		for (String s : s1) {
			System.out.println(s);
		}
		System.out.println();
	}
	// 오버로딩을 해결할 수 없는 상황을 가변 개수 인자로 해결, 가변 개수 인자 :...
	// 가변 개수는 s1을 배열로 인식한다.
	// 단, 가변 개수가 항상 맨끝이어야 한다.

}
