package pack;

public class Student {
	protected int a=10;
	protected  static int b=20;
	protected  void m1() {
		System.out.println("m1");
	}
   static void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.a);
		System.out.println(b); //Only within a class .
		System.out.println(Student.b); // Standard & Recommended !
		System.out.println(s1.b); // Not recommended !
		s1.m1();
		s1.m2();
		Student.m2();
		m2();
		
	}

}
