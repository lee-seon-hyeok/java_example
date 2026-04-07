package ch06;

public class InheritDemo2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 10;
		c.findRedius();
		c.findArea();

		Ball b = new Ball();
		b.radius = 10;
		b.findRedius();
		b.findArea();
		// 그냥 물려받으니까 넒이가 틀림 -> 부모로부터 물려받은 것을 고침

	}

}
