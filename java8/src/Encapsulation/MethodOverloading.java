package Encapsulation;
/**
 * Method Overloading rules :
 * 1. Methods name must same.
 * 2. Method's arguments must be different 
 * 		diff. in terms of 
 * 		a. type.
 * 		b. order.
 * 		c. number of args.
 * Method signature = method name + args
 * @author adity
 *
 */
public class MethodOverloading {
	public void m1() {
		System.out.println("m1");
	}
	public int m1(int a) {
		System.out.println("m1_int");
		return 10;
	}
	private void m1(float f) {
		System.out.println("m1_float");
	}
	private void m1(int a, int b) {
		System.out.println("m1_int a_int b");
	}
	private void m1(float a , int b) {
		System.out.println("m1_float_int");
	}
	}
