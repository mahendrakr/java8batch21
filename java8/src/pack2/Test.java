package pack2;
//import pack1.Dog;
//import pack1.Student;
import pack1.*; //Not recommended
import pack1.subpack1.Cat;
import java.lang.System;
import static pack1.Dog.leg;
import static pack1.Dog.m2;
import static java.lang.System.*;
public class Test {

	public static void main(String[] args) {
//pack1.Dog  d = new pack1.Dog();
		Dog d=new Dog();
//pack1.Student s1=new pack1.Student();
		Student s=new Student();

		//System.out.println(Dog.leg);
		System.out.println(leg);
		//System.out.println(Dog.m2());Compilation error because m1 method not returning anything(void).
		Cat c=new Cat();
		System.out.println();
		m2();
		out.println();
	}

}
