package bank_application;


public class CompositionDemo {
  //클래스 다이어그램에서 전체와 부분 객체가 라이프사이클을 같이 하는 것
  //채워진 마름모로 표시
  Computer com = new Computer();
}

class Computer{
  private CPU c;
  private MainBoard m;

  public Computer(){
    this.c = new CPU();
    this.m = new MainBoard();
  }

  class CPU{}
  class MainBoard{}
  //종속이 아닌 일체형이어서 다른 클래스에서 사용 못함
}

