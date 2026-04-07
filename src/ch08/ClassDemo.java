package ch08;

public class ClassDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitec", "L001", 10000);

		Class c = k.getClass();

		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		// 실행 중인 객체에 대한 정보를 저장하고 싶다. -> Class
	}

}
