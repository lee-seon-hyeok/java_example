package ch05;

public class ArrayDemo {

	public static void main(String[] args) {
		// 변수에는 정해진 크기의 데이터를 1개 담을 수 있다.
		// 이때 정해진 크기의 여러 개의 데이터를 담으려고 배열을 사용한다.

		// 요구사항 = 3명의 학생 점수를 각각 저장하고 합계와 평균을 구해라
		int score1 = 100;
		int score2 = 90;
		int score3 = 80;
		int score4 = 100;
		int score5 = 90;
		// 여러 개의 데이터들을 한번에 담으려고 함

		int total = score1 + score2 + score3;
		double avg = total / (double) 3; // 둘 중에 하나를 double로 함 -> 자동 형변환

		String res = String.format("합계 = %d, 평균 = %.2f입니다.", total, avg);
		System.out.println(res);

		int[] scores = { 100, 90, 80, 95, 90 };// 배열의 초기화
		// 정해진 크긴의 여러 개의 데이터를 하나의 변수에 닿는 방법 = 배열 -> 인덱스를 활용하여 값을 가져온다.
		total = 0; // 초기값 설정
		for (int i = 0; i < scores.length; i++) { // 횟수를 5번 돌림, length : 변수
			total = total + scores[i]; // 인덱스에 증가시켜서 배열 변수에 대입 [0], [1], [2]..

		}
		res = String.format("합계 = %d, 평균 = %.2f입니다.", total, total / (double) scores.length);

	}

}
