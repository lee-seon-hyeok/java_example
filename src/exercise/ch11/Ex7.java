package exercise.ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String maxName = ""; // 최고 점수를 받은 아이디를 저장하는 변수
		String minName = ""; // 최저 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int minScore = 100; // 최저 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		double mean = 0.0; // 평균 점수를 저장하는 변수

		// 여기에 코드를 작성하세요 (평균점수출력(.2f ), 최고점수와 최저점수 받은 아이디 출력)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();

			totalScore += score;

			if (score > maxScore) {
				maxScore = score;
				maxName = id;
			}
			if (score < minScore) {
				minScore = score;
				minName = id;
			}

		}
		mean = (double) totalScore / map.size();
		System.out.printf("평균 점수 : %.2f\n", mean);
		System.out.println("최고 점수를 받은 아이디 : " + maxName);
		System.out.println("최저 점수를 받은 아이디 : " + minName);
	}
}
