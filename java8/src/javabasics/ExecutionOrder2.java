package javabasics;
/**
 * 1. STATIC MEMBERS
 * 		static variable , static block (FCFS first come first serve)
 * 2. INSTANCE MEMBERS
 * 		instance variable , instance block (FCFS first come first serve)	
 *		constructor
 * #NOTE : METHOD (static or non static) IS ONLY EXECUTED , WHEN CALLED ! 
 * 		IF YOU WANT TO ACCESS A STATIC METHOD WITHIN SAME CLASS , THEN YOU CAN CALL DIRECTLY WITH NAME OF THE METHOD. 
 * 			E.G:  static int z = m1(); OR static int z = ExecutionOrder2.m1();(OPTIONAL)
 *
 */
public class ExecutionOrder2 {
	{System.out.println("IB1");}
	int a = 10;
	int b = m3();
	static int z = m1();
	static {
		System.out.println("static block 1");
	}
	static int c = 30;
	static int d = m2();
	{System.out.println(a);}
	{System.out.println(b);}
	static {System.out.println(c);}
	static {System.out.println(d);}
	ExecutionOrder2(){
		System.out.println("constructor");
	}
	static int m1(){
		System.out.println("m1");
		return 50; 
		}
	static int m2() {
		System.out.println("m2");
		return 60;
	}
	int m3() {
		System.out.println("m3");
		return  70;
		}
	int m4() {
		System.out.println("m4");
		return 80;
	}
	public static void main(String[] args) {
		ExecutionOrder2 eo2 = new ExecutionOrder2();
		
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println(z);
	}
	{System.out.println("IB2");}
}
