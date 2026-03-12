package ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		List<Car> list = Car.cars.subList(3, 7);
		// Car에서 7개 자동차 중 4개만 가져온 sublist 메서드를 이용한다.
		System.out.println(list.size()); // 리스트에 4개 담음
		// list.toArray(new Car[4]);
		// subList의 list 인터페이스를 Array로 형변환한다.
		// Array()는 Arraylist()와 다르게 정적 배열이어서 크기를 정해야 한다.
		// Car에 4개를 할당하는 원소로 변환
		Car[] cars = list.toArray(new Car[4]);
		// 동적 배열을 정적 배열로 할당

		System.out.println(Arrays.toString(cars));
		// tostring으로 문자열 출력

		// Comparator<Car> modelComaprator =
		// Comparator.comparing(c -> c.getModel());
		// c가 가지는 getmodel를 기준으로 comparing해서 Comaparator를 만든다.

		Comparator<Car> modelComaprator = Comparator.comparing(Car::getModel);
		// 이떄 c가 중복되므로 메소드 앞을 ::으로 바꾸고 메소드 표시하는 소가로 없앤다
		// 정렬을 Car 기준으로 하기 위해

		Arrays.sort(cars, modelComaprator);
		// modelComprator 기준으로 배열 비교

		// 연식으로 비교할 경우
		Comparator<Car> ageComaprator = Comparator.comparing(Car::getAge);
		Arrays.sort(cars, ageComaprator);
		// 연식이 짧은 거 기준으로 나열한다.

		// 마일리지 기준으로 비교할 경우
		Comparator<Car> mileageComparator = Comparator.comparing(Car::getMileage);
		Arrays.sort(cars, mileageComparator);
		// 마일리지 짧은 거 기준으로 나열한다.

		// comparing은 오름차순 기준으로 배열

		// reversed는 내림차순으로 배열
		Arrays.sort(cars, mileageComparator.reversed());
		// Arrays.sort(cars, Comparator.reversOrder.reversed());
		// Comparator.reverseOrder로 하면 오류 걸린다.
		// cars는 comparable이 있어야 하는데, comparable가 없기 때문이다.

		String[] strs = { "c", "a", "b" };
		Arrays.sort(strs, Comparator.reverseOrder());
		// 원래 갖고 있던 있던 비교자가 있으면 Comparator.reversOrder가 작동이 된다.
	}

}
