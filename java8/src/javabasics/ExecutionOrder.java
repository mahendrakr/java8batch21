package javabasics;

public class ExecutionOrder {
	int y = 10;
	int x = 20;
	static int w = 30;
	static int z = 40;
	static int a = m1();
	public static int m1() {
		System.out.println(a);
		return 20;
	}
	
	static {
		System.out.println(a);
		System.out.println("static block");
	}
	int b = m2();
	public int  m2() {
		System.out.println(b);
		return 30;
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		ExecutionOrder o = new ExecutionOrder();
		ExecutionOrder o1 = new ExecutionOrder();
	}
	

}
