package ch12;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MapDemo {

	public static void main(String[] args) {
	String[] sa = {"a","b","c","d","e"}; //데이터 형태가 바뀌지 않는 맵
	
	//전부 대문자로 바꾸기	
	Arrays.stream(sa) //Stream<String>이 된다.
	            .map(String::toUpperCase)
	            //매핑, 인스턴스 메시지 참조로 바꾼다.
	            .forEach(Util::print);
	             //Util은 satic 메서드를 참조한다.
	            //Util의 print를 참조해서 출력한다.
	
	//숫자를 숫자로 바꾸기
	Integer[] ia = {1,2,3,4,5}; //데이터 형태가 바뀌지 않은 맵
	Arrays.stream(ia)
	            .map(i-> i*2)
	        	//i를 받으면 2배로 곱하여 반환
	            .forEach(Util::print);

	//숫자 -> 문자, 문자 -> 숫자로 바꾸기
	String[] sal =  {"a1","b1","c2","d3","e4"};
	//문자 -> 숫자로 바꾸려면 mapToint를 사용하고, 숫자-> 문자로 바꾸려면 mapToObj로 사용한다.
	//1. 각 원소의 두번째 글자만 잘라내서 스트림으로 반환한다.
	//2. 문자열을 숫자로 변환해서 스트림으로 반환한다.
	//3. 스트림 내용을 출력한다.
	
	Arrays.stream(sal)
	            .map(s->s.substring(1))
	            //map을 통해 각 데이터마다 1개씩 잘라낸다, 변화 주기때문에 메서드 참조 못해서 생략 X
	            .mapToInt(Integer::parseInt)
	            //어떠한 조작을 안하고 넘기므로 메서드 참조할 수 있어, 생략 가능
	            //숫자에서 문자열로 반환한다. 
	           //.forEach(Util::print)
	
	//이제 숫자 스트림을 문자 스트림으로 반환이 가능하다. "s"+1
    .mapToObj(i -> "s"+i)
    .forEach(Util::print);
	
	//Nation의 인구만을 값을 가지는 Doublestream으로 반환하기
	OptionalDouble o = Nation.nations.stream()
	              .mapToDouble(n-> n.getPopulation())
	              .max();//최종연산
	
	if(o.isPresent())//값이 o에 존재할 경우,
	System.out.println(o.getAsDouble());
	//이때 구해진 결과를 왼쪽에 할당하여 값을 꺼낼 수 있다.
	}

}
