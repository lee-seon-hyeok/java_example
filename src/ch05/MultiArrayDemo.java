package ch05;

public class MultiArrayDemo {

	public static void main(String[] args) {
		int[][] interests = { { 1, 2, 3, 4, 5 }, { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 } }; // 배열의 원소에 3개가 들어있다.
		// 0번째 인덱스에 데이터 5개, 1번째 인덱스도 데이터 5개, 2번째 인덱스에 5개 들어간다고 가정
		// int[3][5]
		// 1: 0행에 1열, 5 : 0행에 4열, 14욜 : 1행에 4열

		System.out.println(interests.length); // 항목 출력
		// length : 고정값
		System.out.println(interests[0].length); // 항목에 0행에 있는 열의 개수 출력

		// for문으로 중첩 행을 출력하자
		for (int i = 0; i < interests.length; i++) {
			// i가 올라가면 j도 올라가야 한다.
			for (int j = 0; j < interests[i].length; j++) {
				System.out.printf("%2d", interests[i][j]);
				// println으로 하면 줄바꿈이 생겨서 안됨 -> 행이 바꿀때마다 공백을 웇력
				// 두 자리를 확보하고 1칸 뛰움
			}
			System.out.println();

		}

	}

}
