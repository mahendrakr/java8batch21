package newpack;

import pack.Aadi;
import pack.Student;

public class DefaultMain  extends Aadi{

	public static void main(String[] args) {
    Student s1=new Student();
   // System.out.println(s1.a); // Default modifier are not visibile outside of the package.
    Aadi adi=new Aadi();
	//adi.m3();
	adi.m4();
	Aadi.m4();
	//System.out.println(adi.a); 
	}

}
