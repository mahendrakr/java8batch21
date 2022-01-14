package inheritence;
/**
 * you cannot access this and super keyword from static context
 * @author Anamika Kundal
 *
 */

public class ThisAndSuper extends Super {
	int a = 10;
	static int b= 20;
	ThisAndSuper(int a){
		
		System.out.println(this.a);
	}
	void m1() {
		System.out.println("m1");};
		public static void m2() {System.out.println("m2");}
//		static {this.a}
		{}
	public static void main(String[] args) {
		ThisAndSuper t = new ThisAndSuper(40);
	//	this.m1();
	}
	
	

}
