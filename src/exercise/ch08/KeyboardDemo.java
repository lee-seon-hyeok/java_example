package exercise.ch08;

public class KeyboardDemo {

	public static void main(String[] args) {
		Keyboard k = new Keyboard.Builder()
				// 빌드업 패턴 사용
				.name("Logitech").model("K120").price(20000).build();
		// any가 없으면 null 상태

		Keyboard keyboard1 = new Keyboard.Builder()
				// 빌드업 패턴 사용
				.name("Logitech").model("K130").build();

		System.out.println(k.any);

		System.out.println(keyboard1.price);
		// 기본값으로 초기 생성, 선택적으로 필드 골라서 만듬

	}
} // 생성자보다 길지만, 직관적임. 빌드업 패턴은 없으면 어떤 코딩인지 햇깔림

class Keyboard { // 키보드라는 객체 만드는 역활

	private String name;
	private String model;
	public int price;
	public String any;

	// private 생성자 (Builder만 사용하도록)
	private Keyboard(Builder builder) {
		// 빌더를 반환
		this.name = builder.name;
		this.model = builder.model;
		this.price = builder.price;
		this.any = builder.any;
	}

	// Builder 클래스
	public static class Builder {
		// 안에서 불러서 쓰는 중첩 클래스
		// static 만들 떄 outer의 static 생성자
		private String any;
		private String name;
		private String model;
		private int price;

		public Builder name(String name) {

			this.name = name;
			return this;
		}

		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder any(String any) {
			this.model = any;
			return this;
			// 빌드업에 any 반환해주는 return을 넣음
		}

		public Builder price(int price) {
			this.price = price;
			return this;
		}

		public Keyboard build() {
			return new Keyboard(this);
		}
	}
}