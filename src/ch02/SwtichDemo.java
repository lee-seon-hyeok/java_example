package ch02;

public class SwtichDemo {
	public static void main(String[] args) {
		// switch 문
		int number = 2;
		/*
		 * switch (number) { //number이 2이므로 case 2부터 출력
		 * 
		 * case 1:System.out.println("*"); case 2:System.out.println("*"); //출력 case
		 * 3:System.out.println("*"); // 낙하방식으로 또 출력 }
		 */

		switch (number) { // number이 2이므로 case 2부터 출력
		// number : 변수만 가능
		case 1:
			// case 상수 1 : 상수만 가능, 변수나 실수 X
			System.out.println("*");
			break;
		case 2:
			System.out.println("*");// 출력
			break;
		case 3:
			System.out.println("*"); // 낙하방식으로 또 출력
			// 낙하 방식을 막기 위해 break 문을 쓴다
		}

		String yoil = "월";

		switch (yoil) {
		case "월":
		case "화":
		case "수":
			System.out.println("평일입니다.");
			break; // 분기문 : 밖으로 빠져나오게 함
		case "토":
		case "일":
			System.out.println("주말입니다");
		}

//개선된 switch문 -> 화살표 case 라벨과 다중 case 라벨로 선택하게 함
		switch (yoil) {
		case "월", "화", "수", "목", "금" -> System.out.println("평일입니다");
		case "토", "일" -> System.out.println("주말입니다");
//break 없어서 낙화할 필요없음
		}// 이때 값을 리턴할 경우 default를 써야 한다.

		String result = switch (yoil) {
		case "월", "화", "수", "목", "금" -> "평일입니다";
		case "토", "일" -> "주말입니다";
		default -> "유효하지 않은 요일입니다";
		// 모든 값에 일치하는 cas 없으면 오류 생겨서 default를 추가
		};// 월,화,수,목,금,토,일이 아닌 경우, 값을 리턴해야 하므로 default를 사용한다. 이때 밖에 ;를 써야 한다.

		String obj = "호랑이";
		String kind = switch (obj) {
		case "호랑이", "사자":
			yield "포유류"; // obj가 호랑이면, yield에서 "포유류"로 결과를 보여준다.
		default:
			yield "..."; // 낙하 방식이 없어서 break 필요 없으며 사실상 break 역활을 해준다.
		};
		System.out.println(kind);
	}
}
