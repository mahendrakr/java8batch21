package inheritence;

import java.io.FileNotFoundException;

public class Person {
	public void m1() {
		System.out.println("parent");
	}
	 Object add(int id, String name) {
		System.out.println("parent :" + name);
		return name;
	}
	 private void m2() {
		 System.out.println("parent m2");
	 }
	 public static void m3() {
		 System.out.println("parent m3");
	 }
	 public final void m4() {
		 System.out.println("parent m4");
	 }
	 public void m5() throws FileNotFoundException {
		 System.out.println("parent m5");
	 }
	 public void m6() throws ArithmeticException {
		 System.out.println("parent m6");
	 }
}
