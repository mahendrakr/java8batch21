package pack;

public class Test {

	public static void main(String[] args) {
    Student s1=new Student();
    System.out.println(s1.a);
    System.out.println(s1.a);
	System.out.println(Student.b); // Standard & Recommended !
	System.out.println(s1.b); // Not recommended !
	s1.m1();
	s1.m2();
	Student.m2();
	
	}

}
