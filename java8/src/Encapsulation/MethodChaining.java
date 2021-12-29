package Encapsulation;

public class MethodChaining {
	public void m1() {
		m2();
		System.out.println("m1");
	}
	public void m2() {
		m3();
		System.out.println("m2");
	}
	public void m3() {
		m1();
		System.out.println("m3");
	}
	public static void main(String[] args) {
		MethodChaining m= new MethodChaining();
		m.m1();
	}
}
