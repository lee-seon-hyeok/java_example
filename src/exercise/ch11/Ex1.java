package exercise.ch11;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();

		animals.add("사자");
		animals.add("곰");
		animals.add("기린");
		animals.add("코끼리");
		for (String animal : animals) {
			if (animal.length() == 2) {
				System.out.println(animal);
			}
		}

	}

}
