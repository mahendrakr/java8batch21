package newpack;

import pack.Aadi;
import pack.Student;

public class ProtectedMain extends Aadi {

	public static void main(String[] args) {
    Student s1=new Student();
   // System.out.println(s1.a);
  //  s1.m1();
   // System.out.println(Student.b);
 //   Student.m2();
    
    ProtectedMain p=new ProtectedMain(); 
    p.m1();
  //  p.m3();
    p.m4();
	}

}
