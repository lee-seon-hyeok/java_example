package ch03;

public class Ex4 {

	public static void main(String[] args) {
		// 1부터 10까지 숫자 중에서 1,3,5,7,9만 출력하는 프로그램 작성
		// while 문을 사용해라

		int i = 1;

		// 방법 1
		/*
		 * while(i<10) { if(i % 2==1) { System.out.println(i); }
		 * 
		 * i++; }
		 */

		// 방법2 - continue 사용
		int a = 0;
		while (a < 10) {
			a++;
			if (a % 2 == 1) {
				continue;// 흘러 보낸다. -> 계속 패턴 반복 -> 분기문이라고 부름
				// break 빠져 나온다.
			}
			System.out.println(a);
		}
	}

}
