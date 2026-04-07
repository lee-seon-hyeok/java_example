package ch03;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printScore(90);
		printScore(90);
		printScore(-10);
		// 인자를 숫자로 넘겨야 함 -> int로 해야함

	}

	public static void printScore(int score) {
		// score로 입력받음
		// System.out.println("당신의 점수는 " + score + "점 입니다.");
		// 입력받은 점수를 출력하는 함수
		// return;
		// Static을 써도 되고, 안 써도 됨

		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수" + score + "입니다.");
			return;
			// 중간에 메모리를 반환하거나 함수에서 빠져나오려고 하면 return 반드시 써야 함
		}
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		// 단 0~100점 사이 값이 아닌 점수 전달하면 잘못된 점수라고 출력하고 메서드 종료해라
		// return 밖에서 return이 없어도 자동으로 컴파일러가 되기 때문이다.

	}

}
