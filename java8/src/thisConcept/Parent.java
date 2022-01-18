package thisConcept;

public class Parent {
	public void m1() {
		System.out.println("parent m1");
	}
	public void m3() {
		this.m4();
		System.out.println("parent m3");
	}
	public void m4() {
		System.out.println("parent m4");
	}
}
