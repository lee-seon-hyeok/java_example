package ch12;

public class NationFilterDemo {

	public static void main(String[] args) {
		// 별도로 할당하지 않고 스트림으로 처리 가능
        Nation.nations.stream()
        //람다를 구현한다. -> 100의 100만 = 1억 이상인 나라 중에 2개만 출력
        .filter(n ->n.getPopulation()>=100)
        //boolean 값을 가져오는 조건식
        .limit(2)
        .forEach(n->System.out.println(n));
      //나라 이름만 가로로 출력하라 -> util에서 가져온다.
      //n을 매개변수로 받기 때문에 메서드 참조를 출일 수 있다. 
       
	}

}
