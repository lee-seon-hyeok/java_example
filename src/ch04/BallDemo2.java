package ch04;

public class BallDemo2 {

	public static void main(String[] args) {
		// 공 3개 생성 -> 참조를 함
		Ball b1 = new Ball();
		// heap 영역에 반지름 10인 공을 마듬

		Ball b2 = new Ball();

		Ball b3 = new Ball();

		b2.setRadius(20.0);
		b3.setRadius(5.0);

		System.out.println(b1 == b2);
		// ==, != : 기초타입에만 사용할 수 있는 비교 연산자

		// 공 3개의 반지름을 각각 출력
		System.out.printf("%f, %f, %f", b1.getRadius(), b2.getRadius(), b3.getRadius());

		// 공에 대한 3개의 영역이 Heap에서 만들어진다.
		// 다른 주소들로 서로 다른 특성으로 각각 가져올 수 있게 됬다

		b1 = b2;
		// b2의 주소를 b1에 할당 -> b2와 b1은 동일 비교릃 함
		// = : 할당하기 전에는 다르지만, 할당하면서 b1과 b2의 값이 같아짐
		// 할당되면서, b1에서 값을 수정하면 b1은 b2와 주소랑 같아지기 때문에, 연쇄적으로 값도 달라진다.
		// 사이드 임펙트 : 하나의 값이 바꿔도, 주소도 바꿔지면서 원치하는 변화가 생김

		int i = 10, j = 5;
		System.out.printf("i=%d, j=%d \n", i, j);

		i = j;
		System.out.printf("i=%d, j=%d \n", i, j);
		// i = 5, j = 5

		i = 10;
		System.out.printf("i=%d, j=%d \n", i, j);
		// i의 값을 바꿈 i = 10, j =5가 된다.
		// 변수와 달리 객체는 주소가 저장되었기 때문에,주소로 가서 값을 가져온다.
		// i와 j가 객체라면, i = j에서 i는 j의 주소로 가게 되면서 i와 j이 값 같아진다.
	}

}
