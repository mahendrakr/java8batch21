package javabasics;

public class ExecutionOrder2 {
	int a = 10;
	int b = m3();
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
		
	}
	
}
