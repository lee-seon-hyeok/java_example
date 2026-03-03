package ch04;

public class CatDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		// 참조 변수 cat으로 4byte 확보 -> heap 영역에 Cat 객체 가리킴

		Cat c2 = c1;// 참조변수 : c2에 c1을 할당함, 값이 변경됨
		Cat c3 = c2;

		System.out.println("고양이의 이름은" + c1.name);
		System.out.println("고양이의 이름은" + c2.name);
		// 객체 하나에 2개를 가리킴 -> 주소 복사했기 때문에

		// 첫번째 참조변수 c1을 '야웅이'로 변경
		c1.name = "야웅이";
		System.out.println("고양이의 이름은" + c1.name);
		System.out.println("고양이의 이름은" + c2.name);
		System.out.println("고양이의 이름은" + c2.name);
		// 변수의 객체 값이 계속 바뀜 -> 사이드 이펙트 나옴 -> 1개를 고쳤는데, 2개 다 고쳐짐

		// String 객체
		String s1 = "나비";
		String s2 = s1; // 같은 객체를 가리킴

		System.out.println("s1 문자열은" + s1);
		System.out.println("s2 문자열은" + s2);

		// 문자열은 다른 객체와 다르게, 불변성이 있어서 사이드 이펙트가 없음
		s1 = "야웅이";
		System.out.println("s1 문자열은" + s1);
		System.out.println("s2 문자열은" + s2);
		// 사이드 이펙트가 일어나지 않음, 문자열을 불변의 객체로 만듬

	}

}
