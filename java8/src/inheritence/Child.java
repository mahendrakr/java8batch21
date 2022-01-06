package inheritence;
/**
 * loading + initialisation = parent class 1st.
 * calling = child class 1st
 * @author adity
 *
 */
public class Child extends Parent {
	int a=10;
	int b=m9();
	static int c=30;
	static int d=m6();
	static void m7() {
		System.out.println("m7");
	}
	void m8() {
		System.out.println("m8");
	}
	public int m9() {
		System.out.println("m9");
		return 40;
	}
	static {
		System.out.println("child static :" + c);
	}
	{
		System.out.println("child instance block :" + a);
	}
	Child() {
		System.out.println("Child constructor");
	}
	public static int m6() {
		System.out.println("m6");
		return 50;
	}
	public void m10() {
		System.out.println("child m10");
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.m10();
	}
}















