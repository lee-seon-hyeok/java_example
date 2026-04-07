package ch02;

public class Hello3 {// 클래스

	public static void main(String[] args) { // 메서드 : 특정목적을 달성하기 위한 코드들의 모음
		// 메인 메서드 내부
		System.out.println("안녕");// 화면에 문자열을 직접 출력
		int v1 = 3;// 변수를 선언과 동시에 값 할당
		System.out.println(v1); // 화면에 변수의 값 입력
		// 복사 붙어넣기 = crtrl + c -> crtrl + v
		String str = "hello";
		System.out.print(str);
		// print 안에 화면에 변수의 값을 출력

		System.out.print(str);
		System.out.print(str);
		// 같은 역활을 한 메서드를 여러 개 작성도 가능함
		// println : 값을 출력하고 줄바꿈, %d 같은 거 사용 x
		System.out.printf("%d %d", v1, v1);
		System.out.printf("%s %s", str, str);
		System.out.printf("%.2f %f", 3.14, 3.14);
		// printf 안에 들어갈 여러 타입의 형식에 맞게 출력문을 작성할 수 있음

		// 식별자는 문자, _ $로 시작, 한글 가능하며 대소문자 구분 , 연산자 포함하면 안됨, 정해진 자바 코드를 식별자로 x

		// 변수와 메서드는 모두 소문자로 표기하는게 좋음
		// 클래스와 인터페이스는 대문자로 표기
		// 상수는 전체를 대문자로 표기

	}

}
