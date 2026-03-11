package ch10;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {

	public static void main(String[] args) {
		// 디젤 자동차만 찾는다. -> 디젤 자동차만 list에 모아놓는다.
		ArrayList<Car> diesel = findCars(Car.cars, c -> !c.isGasoline());
		// false일 경우 true로 뒤집어서 true로 반환됨

		// 10년보다 오래된 자동차만 모두 찾아보자.
		ArrayList<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
		// 10년보다 오래된 가솔린 자동차만 모두 찾아보자
		ArrayList<Car> oldGsoline = findCars(Car.cars, c -> (c.getAge() > 10) && (c.isGasoline()));

		// Car의 findCars에 첫번째 매개변수를 넘긴다. 이때 두번재 Predicate가 넘어온다.
	}

	public static ArrayList<Car> findCars(List<Car> cars, CarPredicate cp) {
//조건마다 달라질 때 사용할 리스트 만듬 
		return new ArrayList<>();
	}
}

interface CarPredicate {
	// functional이러서 추상메서드 1개
	boolean test(Car car);
}

interface CarConsumer {
	void apply(Car car);
}