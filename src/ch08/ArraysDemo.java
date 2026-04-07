package ch08;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] arr = { "j", "a", "v", "a" };
		String[] arr2 = { "j", "a", "v", "a" };
		// 비교 가능하므로 sort 가능 -> 아스키코드 값으로

		System.out.println(Arrays.equals(arr, arr2));
		// 배열이 같은지 확인 -> 배열의 크기가 같아야 비교
		// 각 원소의 값이 인덱스마다 같해야 함

		Arrays.sort(arr); // 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		// 크기는 고정, 안에 있는 내용은 가변 객체로, 안의 내용이 바뀜

		// 새로운 String 타입에 arrays가 정의하는 copyof 사용
		String[] arr1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arr1));
		// 앞의 두번째를 꺼내서 복사해줌 ->[a,a]

		int index = Arrays.binarySearch(arr, "j");
		// 몇번째 인덱스에 있는지 찾아줌

	}

}
