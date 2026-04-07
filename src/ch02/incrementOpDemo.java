package ch02;

public class incrementOpDemo {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;

		x++; // x = 0; x = x+1; -> 0인 x에 1를 더함
		++y; // y = y+1 -> y를 1에 더한 값을 참조

		System.out.println(x);
		System.out.println(y);
		// 독립으로 사용하면,1로 똑같이 나옴

		System.out.println(x++);
		// 1를 입력하며 출력되고 그 다음에 증가함
		System.out.println(++y);
		// 바로 값을 증가하여 2가 출력된다.
		// 전위, 후위 연산자로 값이 다르게 나옴

		System.out.println("x=" + x);
		// 이제 2로 출력하게 된다.
		System.out.println("y=" + y);

	}

}
