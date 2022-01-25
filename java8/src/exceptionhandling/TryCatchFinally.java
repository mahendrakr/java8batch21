package exceptionhandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		int a = 20;
		try {
			a++;
		//	System.out.println(a/0);
			a++;
			
		}
		catch(Exception e) {
			a++;
			System.out.println(++a);
		}
		finally {
			a++;
		}
		System.out.println(a);
	}
}
