package bank_application.ex1;

public class AggregationDemo {
  //클래스 다이어그램에서 전체와 부분 관계 나타내고 속이 빈 마름모로 표시한다
  //한 객체가 다른 객체에 포함한 관계

  CPU c = new CPU();
  MainBoard m = new MainBoard();
  Computer com = new Computer();
  //지워져도 부분으로 남아서 관계를 갖는다.
}


class Computer{}
class CPU{}
class MainBoard{}