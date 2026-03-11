package ch09;

public class GenericMethod { // Outer Class
//outer 클래스와 관련 있는 것을 묶는다.

	// Inner Class, 중첩 클래스
	static class Utils {
		// 일반, 제너릭 메서드 선언 가능함
		// 코드 중복되어 여러개 만들 수 있음
		public static <T extends Comparable<T>> void showArrays(T[] a) {
			// Comparable를 구현한 클래스만 상속 받게 제한한다.
			// 타입 T에 숫자만 상속 받는다.-> <T extends Number> 사용
			// Object : 모든 것을 상속 받는다.
			// Comparable : 인터페이스만 상속받게 한다.
			// Number : 숫자만 상속받게 한다.
			for (T i : a) {
				System.out.println(i);
			}
		}

		/*
		 * // 제네릭 메서드로 수정한다. public static <T> void showArrays(T[] a) { for (T i : a) {
		 * System.out.println(i); } }
		 */

		/*
		 * public static void showArrays(String[] a) { for (String string : a) {
		 * System.out.println(string); } }
		 * 
		 * public static void showArrays(Person[] a) { for (Person person : a) {
		 * System.out.println(person); } } public static void showArrays(long[] a) { for
		 * (long l : a) { System.out.println(1); } }
		 */
	}

	public static void main(String[] args) {
		/*
		 * int[] arr1 = {1,2,3,4}; String[] arr2 = {"a","b","c"}; long[] arr3 = {10L,
		 * 20L, 30L};
		 */

		// T 타입은 클래스만 대체되므로
		Integer[] arr1 = { 1, 2, 3, 4 };
		String[] arr2 = { "a", "b", "c" };
		// 타입 누르고 ctrl 눌러서 확인 가능
		// String은 Serializable와 comparable이 implements에 상속받음
		// Person은 Comparable에 상속 받은 객체가 아니어서 제한이 된다.

		Long[] arr3 = { 10L, 20L, 30L };
		Double[] arr4 = { 1.0, 2.0, 3.0 };
		// 확장과 재사용성 높아짐

		Utils.showArrays(arr1);
		Utils.showArrays(arr2);
		Utils.showArrays(arr3);
		// 오버로딩을 구현되었다.
		// 요구사항마다 계속 오버로딩을 해야해서 유지보수가 어려움
		// 제네릭 메서드로 바꾼다.
	}

}
