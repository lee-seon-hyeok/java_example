package ch10;

import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;

	public Car(String model, boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public boolean isGasoline() {
		return gasoline;
		// boolean 값은 is로 자동 반환 -> 같은 get이지만, 이름이 달라짐
	}

	public int getAge() {
		return age;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}

	public static final List<Car> cars = Arrays.asList(
			// 자동차의 리스트를 리스트와 배열로 만듬
			// 바뀌지 않은 변수
			new Car("소나타", true, 18, 210000), new Car("아반테", true, 10, 70000), new Car("싼타페", false, 18, 210000),
			new Car("K3", true, 5, 80000), new Car("테슬라", false, 1, 10000), new Car("쏘렌토", false, 1, 10000),
			new Car("그랜저", false, 18, 10000));
}
