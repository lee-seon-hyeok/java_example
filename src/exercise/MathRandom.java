package exercise;

public class MathRandom {

	public static void main(String[] args) {
		// Math.random 매서드 이용하여 가위, 바위, 보 랜덤으로 출력
		// 힌트 : math.random 화룡
		String[] name = { "가위", "바위", "보" };
		// 0 1 2 -> 숫자 3개를 뽑으려면 *3을 하는 규칙이다.
		System.out.println(name);
		int index;
		for (int i = 0; i < 10; i++) {
			index = (int) (Math.random() * 3);
			// System.out.println(index);
			System.out.println(name[index]);
		}
	}
}
