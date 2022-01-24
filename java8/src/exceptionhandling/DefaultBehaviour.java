package exceptionhandling;

public class DefaultBehaviour {
	public static void m1() {
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		m1();
	}
}
