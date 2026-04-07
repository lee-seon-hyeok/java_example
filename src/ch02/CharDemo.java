package ch02;

public class CharDemo {

	public static void main(String[] args) {
		char c = 'A'; // 문자열에 내부적으로 숫자 저장
		//char c =65 -> 유니코드
		// char c = '\u0041' 유니코드를 넣으면 A가 출력됨
		// 유니코드 문자 매핑 테이블을 보면, A = 65, a = 97 처럼 사용가능
		// 숫자 더할 때마다 문자가 달라지기 때문에, 숫자로 문자를 변환 가능함
		
		String str = "hello";
		//문자열로 'h' 'e' 'l' 'l' 'o'가 모여짐, String은 문자를 구현하는 방식이 있음
		//String은 내부에 문자열을 문자로 반환되는 함수가 구현되어 있음
		
		char c1 = str.charAt(0);
		//문자열을 문자로 반환 -> charAt(0) : 0번째 문제를 뽑아서 반환한다. -> hello에서 h가 출력
		
		
		String str2 = c1 + "";
		System.out.println(str2);
		//문자를 문자열로 변환 -> 문자열은 빈 문자열를 사용 가능하므로, 빈 문자열과 결합하여 문자열로 만듬 
		
		String str3 = 7+"";
		System.out.println(str3);
		String str4 = 7 + 7 +"";// 14 + "" => "14"
		String str5 = "" + 7 + 7; //"7" +7 => "77"
		//숫자를 문자열로 형변환
		
		char c2 = 3 + '0'; //문자'3'
		//숫자를 문자로 바꾸기
		
		int i1 = c2 -'0'; //3
		// 문자를 숫자로 바꾸기
		
		Object obj = new Object();
		Object obj2 = new Object();
		//기초타입이 아닌 참조 타입은 객체를 하나를 만든다. new를 통해 Heap 영역에 할당시킨다.
		// Object 목적 1. 4byte 확보, 2. heap 영역에 Object 객체 생성 3. 주소를 1번에 확보한 변수에 할당
		// object는 String과 마찬가지로 객체로, 모든 객체의 조상으로서, 물려봤냐고 물어봄.
		// 3번째 단계를 밝지만, 최적화가 되었다는 장점이 있음, 버퍼 관리가 됨 
		
		
		//String str = new String("hello"); 새로운 hello라는 string 객체 
		// String의 목적 1. 4byte 확보, 2. heap 영역에 String 객체 생성 ("hello") 3. 주소를 1번에 확보한 변수에 할당
		
		int value = 3;
		//1. 4바이트 확보 2. 3이라는 값을 1번에 확보한 변수에 할당
		
		//char c ="A"; -> "" 쌍따움표를 하는 순간, 문자열로 선언되어 오류가 생김
		System.out.println(c);
		
		System.out.println(obj);		
		System.out.println(obj2);
		//원래 객체는 주소를 찍는게 맞지만, String은 객체가 가지고 있는 값을 할당함

		String str6 = "30000"; // "30000" + 10 ==> 3000010"
		int i6 = Integer.parseInt(str6); //" (Str6) + 10 = 3000020"
		System.out.print(i6);
		//숫자형태의 문자열을 숫자로 변환 -> interger라는 도움을 받아야 한다.
		///**~ : 문서에 대한 정보가 들어 있음. 
	    //parsenInt : static은 객체를 안 만들고 바로 쓸 수 있는 parseInt 부름 -> integer 도움으로 형변환인다.
		
		String str7= "3.140002";
		double d2 = Double.parseDouble(str7);
		//(double) 숫자열의 문자열을 숫자로
		//parse double의 도움으로 형반환하는데,public static이 new double()같은 객체를 안 만들고 바로 parse double를 불러서 쓴다.
	
	
	}
	
	

}
