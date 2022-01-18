package scopeofmodifier;
/**
 * we can access all the (default, protected and public) members outside of the class
 * and within a same package.  
 * @author adity
 *
 */
public class Test {
	public static void main(String[] args) {
		Parent p= new Parent();
//		p.m4(); not visible outside of the class.
		p.m3();
		p.m2();
		p.m1();
	}
}
