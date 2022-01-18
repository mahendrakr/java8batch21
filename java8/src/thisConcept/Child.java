package thisConcept;

public class Child extends Parent{
	public void m1() {
		this.m2();
		System.out.println("child m1");
	}
	public void m2() {
		super.m3();
		System.out.println("child m2");
	}
	public void m4() {
		System.out.println("child m4");
	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.m1();
	}
}
