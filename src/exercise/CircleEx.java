package exercise;

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle("빨간색", 100);
		c1.printInfo();
		Circle c2 = new Circle("노란색", 50);
		c2.printInfo();
		Circle c3 = new Circle("파란색", 100);
		c3.printInfo();

		System.out.println(c1.getClass());
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
		// 서클이라는 클래스 정보 반환 -> 문자 정보를 숫자로 바꾸는 해시코드 반환
		// object이 갖고 있는 클래스들을 사용할 수 있다.
	}

}
