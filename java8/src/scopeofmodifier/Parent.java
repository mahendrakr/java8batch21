package scopeofmodifier;

public class Parent {
	public void m1() {
		System.out.println("m1");
	}
	protected void m2() {
		System.out.println("m2");
	}
	void m3() {
		System.out.println("m3");
	}
	private void m4() {
		System.out.println("m4");
	}
	public static void main(String[] args) {
		Parent p= new Parent();
		p.m4();
		p.m1();
		p.m2();
		p.m3();
	}
}
