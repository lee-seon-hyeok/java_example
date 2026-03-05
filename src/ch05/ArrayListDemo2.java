package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// 동적배열을 이용하여 정해져 있지 않은 학생의 점수를 입력받아 총점, 평균 구하자
		Scanner in = new Scanner(System.in); // 사용자로부터 키보드 입력하기 위한 객체 생성
		System.out.print("학생 점수 입력하시오, 더 이상 학생과 점수 없으면 -1 입력해라");
		int numOfStudents = in.nextInt();

		// int[] scores = new int[numOfStudents]; -> 고정된 배열 선언
		ArrayList<Integer> scores = new ArrayList<>();// Arraylist 생정자를 통한 객체(배열)를 만든다
		// 동적 배열 선언, ArrayList는 util에 있어서 import 해야 한다.

		System.out.println(scores.size());
		int score;
		while (true) {
			System.out.println("학생의 점수를 입력하세요, 더 이상 입력할 학생의 점수 없으면 -1 입력하시오");

			score = in.nextInt();
			if (score == -1) {
				break;
			}
			scores.add(score); // 맨 뒤에 점수 입력
		}
		System.out.println(scores.size());

		int total = 0;
		for (Integer sc : scores) { // 배열에 값이 없을때까지 반복
			total += sc;
			// sc는 꺼낸 데이터를 total에 더해준다.

		} // scores 배열에 있는 데이터는 integer sc를 통해 데이터를 꺼내서 잠시 저장
		/*
		 * for (int i = 0; i < scores.size(); i++) { total += scores.get(i); // score에
		 * 있는 i번째 배열에 있는 데이터를 total에 넣는다. }
		 */
		// for ~ each : 배열에 비어있을 때까지, 배열에 계속해서 데이터를 넣는다.

		System.out.printf("%d 학생 점수 총합은 %d이고 평균은 %1.f입니다", scores.size(), total / (double) numOfStudents);
	}

}
