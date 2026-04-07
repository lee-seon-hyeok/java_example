package ch05;

public class ArrayIncrementDemo {

	public static void main(String[] args) {
		int[] x = { 0, 1, 2 };

		System.out.println(x[0]);
		change(x);
		System.out.println(x[0]);

	}

	public static void change(int[] a) {
		System.out.println("변경한 a[0] = " + a[0]);
		a[0]++;
		System.out.println("변경후 a[0] = " + a[0]);
	}

}
