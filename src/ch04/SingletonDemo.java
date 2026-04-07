package ch04;

public class SingletonDemo {

	public static void main(String[] args) {
		// Singleton s = new Singleton();
		// 싱글톤은 외부에서 new로 쓰지 못하게 한다.
		Singleton s1 = Singleton.getInstance();
		// getInstance : static 메서드 만들게 허용, 싱글톤 접근 허용하게 한다
		// 외부에서 주소를 반환하게 된다.

		Singleton s2 = Singleton.getInstance();
		// heap 영역에 있는 s2, s1 객체를 2개의 같은 주소로 바라보게 하여 값을 꺼내서 쓸 수 있게 한다.

		System.out.println(s1);
		System.out.println(s2);
		// 같은 주소로 출력된다.

	}

}
