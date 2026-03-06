package exercise;

public class Ex5 {

	public static void main(String[] args) {
		// 타입을 물어봐서, 여부에 따라 talk(), autoanswer, playgame()가 호출
		// 이때 instanceof에 순서에 따라 물어보지 않으면, 값이 달라짐
		// 더 구체적인 값부터 물어야 봐야 한다.

		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

		for (Phone phone : phones) {
//			if (phone instanceof Phone) {
//				phone.talk();
//			} else if (phone instanceof Telephone telephone) {
//				telephone.autoAnswering();
//			} else if (phone instanceof Smartphone smartphone) {
//				smartphone.playGame();
//			}
			if (phone instanceof Smartphone smartphone) {
				smartphone.playGame();
			} else if (phone instanceof Telephone telephone) {
				telephone.autoAnswering();
			} else if (phone instanceof Phone) {
				phone.talk();
			}
		}

		// instanceof : 더 구체적인 스마트몬을 물어봄

	}
}

class Phone {
	// 필드
	protected String owner;
	// 일반 메서드도 접근 가능함 -> 상속대상

	// 메서드
	void talk() {

		System.out.println("owner가 통화 중" + owner);
	}

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
}

class Telephone extends Phone {
	// 필드
	private String when; // 상속 대상이 아님
	// 메서드

	void autoAnswering() {
		System.out.println("owner가 부재 중이니 when에게 전화 요망" + when);
	}

	// 생성자
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}

}

class Smartphone extends Telephone {
	// 필드
	private String game;// private일때는 set, get 사용

	// 메서드
	void playGame() {
		System.out.println(owner + "가" + game + "게임 중");
	}

	// 생성자
	public Smartphone(String owner, String game) {

		super(owner, "내일");
		this.game = game;

	}

}
