package ch08;

import java.util.Objects;

public class KeyboardDemo {

	public static void main(String[] args) {
		/*
		 * Mouse m1 = new Mouse("Logitec"); Mouse m2 = new Mouse("Logitec");
		 * System.out.println(m1 == m2); System.out.println(m1.equals(m2)); // 묵시적으로
		 * 물려받은 equals을 입맛에 맞게 구현 -> true로 구현하려고 함
		 * 
		 * Keyboard k1 = new Keyboard("Logeitec", null, null); Keyboard k2 = new
		 * Keyboard("Logeitec", null, null); k1 = k2;
		 * 
		 * System.out.println(k1 = k2); System.out.println(k1.equals(k2)); if
		 * (k1.equals(k2)) { System.out.println(k1 + "키보드 작동");
		 */
		Mouse m1 = new Mouse("Logitec");
		Mouse m2 = new Mouse("Logitec");

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));

		Keyboard k1 = new Keyboard("Logitec", "L001", 10000);
		Keyboard k2 = new Keyboard("Logitec", "L002", 12000);
		// k1 = k2;

		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
		if (k1.equals(k2)) {
			System.out.println(k1 + " 키보드 입니다.");
		} else {
			System.out.println("서로 다른 키보드 입니다.");
		}

	}

}

class Keyboard {

	// 변수
	// String name;
	// String model;
	// String price;

	String name;
	String model;
	// public String any;
	int price;

	// 생성자
	public Keyboard(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}

	// 생성자
	/*
	 * private Keyboard(Builder builder) { this.name = builder.name; this.model =
	 * builder.model; //this.any = builder.any; this.price = builder.price; }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
//				System.out.println("완벽히 동일한 객체입니다.");
			return true;
		} else if (obj instanceof Keyboard keyboard) {
//				System.out.println("동일한 모델입니다.");
			System.out.println(this.hashCode() + ":" + keyboard.hashCode());
			return this.hashCode() == keyboard.hashCode();
		}
//			System.out.println("다른 객체이거나 모델이 다릅니다.");
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, model, price);
	}

	@Override
	public String toString() {
		return name;
	}

}

class Mouse {
	// 변수
	String name;
	// 생성자

	public Mouse(String name) {
		this.name = name;
		/*
		 * public Keyboard(String name, String model, String price) {
		 * 
		 * // 변수 this.name = name; this.model = model; this.price = price; // super();
		 * // this.name = name1; }
		 */

		/*
		 * @Override public int hashCode() { return Objects.hash(name); } // hash 코드끼리
		 * 비교해서 연산하여 보낸다. // equals 사용할 때 같이 사용 -> 필드값들을 해시코드 구하는 값에 참여해서 값을 반환한다. //
		 * 빌드하는 코드들이 많을 때 hash 코드를 사용 // 해시코드 모델이 다르면, 결과가 다름
		 */
		/*
		 * @Override public boolean equals(Object obj) { //이름이 같다면 반환 //return this.name
		 * == obj.name; X //return super.equals(obj); X //this에 원래 갖고 있던 결과가 같은 지 반환해야함
		 * 
		 * //키보드 경우에 같은 지 비교해야 함 -> 업캐스팅하여 다운 캐스팅 // 키보드랑 비교할 때만 함
		 * 
		 * if(obj instanceof Keyboard keyboard) { return this.name.equals(obj.name);
		 * }//키보드와 같은 값이 아니면 false return false; }
		 */
		/*
		 * @Override public boolean equals(Object obj) { if (this == obj) { return true;
		 * } else if (obj instanceof Keyboard keyboard) { return
		 * this.name.equals(keyboard.name); } // 만약 동일 객체이면 true 반환
		 * System.out.println("모델링이 같지 않습니다."); return false; }
		 * 
		 */

		/*
		 * @Override public boolean equals(Object obj) { if (this == obj) {
		 * System.out.println("안벽히 동일한 객체입니다."); return true; } else if (obj instanceof
		 * Keyboard keyboard) { System.out.println("동일한 모델니다.");
		 * System.out.println(this.hashCode() + ":" + keyboard.hashCode()); // hashcode가
		 * 키보드와 같나? -> int 같은 기초타입이어서 비교 가능 return true; } // 만약 동일 객체이면 true 반환
		 * System.out.println("모델링이 같지 않습니다."); return false; // 헤시코드에게 반환 }
		 */
// @Override
// public String toString() {
// return name;

		/*
		 * // 여러값을 비교할 때 equals if (this == obj) return true; if (obj == null) return
		 * false; if (getClass() != obj.getClass()) return false; Keyboard other =
		 * (Keyboard) obj; return Objects.equals(name, other.name);
		 * 
		 */
//	}

//}

		/*
		 * class Mouse { // object를 기본으로 상속
		 * 
		 * // 변수 String name;
		 * 
		 * // 생성자 public Mouse(String name) { super(); this.name = name; }
		 * 
		 * }
		 */

	}
}