package encapsulation;
/**
 * Scoping means visibility
 * Local variable : local variables get memory inside stack.
 * Method parameters : It get memory inside stack
 * Only final modifier can be used for method parameters and local variables.
 * @author adity
 *
 */
public class Scoping {
	public void doSomething(final int a, String s) {
		System.out.println(a);
//		System.out.println(c);
		final int c=30;
		System.out.println(c);
	}
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		int x=20;
		do {
		}
			while(x<30);
	}
}
