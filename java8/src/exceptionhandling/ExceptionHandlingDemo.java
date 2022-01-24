package exceptionhandling;
/**
 * Q. Difference between checked and unchecked exceptions?
 * @author adity
 *
 */
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int a=10;
		try {
		System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println("You can not divide a number by 0");
			e.printStackTrace();
		}
		System.out.println("kavya");
		System.out.println("himani");
	}

}
