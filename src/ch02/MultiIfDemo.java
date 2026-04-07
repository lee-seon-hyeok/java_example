package ch02;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// 다중 IF문
		// 시험 점수를 입력 받아서 해당 점수를 A,B,C,F인지 확점 알려주는 프로그램 작성하시오
		// A : 90 ~ 100, B : 80 ~ 89, C : 70 ~ 79, F : 0~ 69, 0~100 범위를 벗어나는 점수가 들어오면
		// 유효하지 점수가 입력되었다고 표시

		Scanner in = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요.");
		int score = in.nextInt();// int score 라는 함수에 할당
		String grade = "";
//if 블록문을 벗어나면 영향력이 떨어지기 때문에 문자열을 밖에 선언
		/*
		 * if (90 <= score && score < 100) { grade = "A"; } else if (80 <= score &&
		 * score < 90) { grade = "B"; } else if (70 <= score && score < 80) { grade =
		 * "C"; } else if (0 <= score && score < 70) { grade = "F"; } else {
		 * System.out.println("유효하지 않은 점수 입니다."); }
		 * System.out.printf("당신의 점수는 %d이며, 학점은 %s입니다.", score, grade);
		 */

		// 이제 불필요한 연산자를 제외하면

		if (90 <= score && score < 100) {
			grade = "A";
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else if (0 <= score) {
			grade = "F";
		} else {
			System.out.println("유효하지 않은 점수 입니다.");
		}
		System.out.printf("당신의 점수는 %d이며, 학점은 %s입니다.", score, grade);

		// nested if문 - 중접 if문 : if 문 안에 다른 if 문 들어있음, else 블록은 가까운 if문과 연결함
		if (score > 100 || score < 0) {
			grade = "유효하지 않은 정수가 입력됨";
		} else if (90 <= score) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "C";
		} else {
			grade = "F";
		}

		// 모든 if문이 switch로 변환하지 않지만, switch문으로 바꿀 수 있음

	}
}
