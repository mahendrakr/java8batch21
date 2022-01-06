package inheritence;

public class Parent {
	int a=10;
	int b=m3();
	static int c=30;
	static int d=m5();
	static void m1() {
		System.out.println("m1");
	}
	void m2() {
		System.out.println("m2");
	}
	public int m3() {
		System.out.println("m3");
		return 40;
	}
	static {
		System.out.println("static :" + c);
	}
	{
		System.out.println("instance block :" + a);
	}
	Parent() {
		System.out.println("Parent constructor");
	}
	public void m10() {
		System.out.println("parent m10");
	}
	public static int m5() {
		System.out.println("m5");
		return 50;
	}
}
