package ch03;

public class MethodCallDemo {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment 메서드 시작할 때 n의 값은" + x);
		// 호출하기 전 : 0
		System.out.println("increment 메서드 시작할 때 n의 값은" + x);
		// int 타입의 x
		// 호출하고 나서 : 0
		// stack 주소에 서로 다른 주소가 사용했기 때문이다.
		// n이 끝나고 니서 1이 나오지만, 출력을 못하고 사라져서 0으로 나온다.
		// return으로 반환되지 않아서 0
	}

	public static void increment(int n) {
		// call by value -> 8가지 타입일 경우, 값만 복사하고, 읽기만 함
		// 기본형 매개변수 x의 값을인 0을 전달 받음
		// 중괄호를 벗어나면 효력이 나오지 않는다.
		System.out.println("increment 메서드 시작할 때 n의 값은" + n);
		n++;
		System.out.println("increment 메서드 종료할 때 n와 값은" + n);
	}

}
