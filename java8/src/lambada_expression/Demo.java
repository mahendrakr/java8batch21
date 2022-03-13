package lambada_expression;

public class Demo {
	public static void main(String[] args) {
		//public void m1();
		Yashu y=()->{
			System.out.println("Hello Yashu!");
		};
		y.m1();
		Yashu y1=()->
			System.out.println("Hello Yashu!");
		y1.m1();
	}
	

}
