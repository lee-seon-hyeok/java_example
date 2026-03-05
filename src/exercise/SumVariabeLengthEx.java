package exercise;

public class SumVariabeLengthEx {

	public static void main(String[] args) {

		// sum 메서드 1개만 씀

		System.out.println(sum(1, 2, 3, 4));
		int[] arr = { 2, 3 };
		System.out.println(sum(1, arr)); // 앞에 arr가 아닌 별도의 숫자
		System.out.println(sum(1, 2, 3, 4, 5));
	}

	static int sum(int i1, int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

}
