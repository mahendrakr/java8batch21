package encapsulation;

public class ConfusionHacks {
	public void m1(int a, Short s) {
		System.out.println("int , Short");
	}
	public void m1(Integer i, short s) {
		System.out.println("Integer,short");
	}
	public void m11(String s) {
		System.out.println("string");
	}
	public void m11(int[] a) {
		System.out.println("array");
	}
	public void m1(Object o) {
		System.out.println("object");
	}
	public static void main(String[] args) {
		ConfusionHacks c = new ConfusionHacks();
		int a=10;
		short s=20;
//		c.m1(a, s); compile time error due to ambiguity
		c.m1(null); 
	}
}
