package ch05;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 정적배열을 이용해서 학생의 수를 입력하자
		Scanner in = new Scanner(System.in);
		System.out.print("학생 몇명의 점수를 입력할까요 ?");
		int numOfStudents = in.nextInt();

		int[] scores = new int[numOfStudents];
		// 입력받은 만큼 배열 확보

		for (int i = 0; i < scores.length; i++) {
			System.out.print("학생의 점수 >");
			scores[i] = in.nextInt();
			// 배열에 각각 값을 입력한다.
		}

		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			// total에 스택을 쌓는다.
		}

		System.out.printf("%d 학생 점수 총합은 %d이고 평균은 %1.f입니다", numOfStudents, total, total / (double) numOfStudents);
	}

}
