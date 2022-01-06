package inheritence;
/**
 * Ques) Can we create an object of abstract class? why?
 * Ans) No, because abstract is a concept it does not exist in real world 
 * Ques) Write difference between concrete class and abstract class technically.
 * 
 * @author user
 *
 */
public abstract class Animal {
	int a=10;
	public abstract void speak();
	public abstract void move();
	public abstract void eat();
	public Animal() {
	}
	public static void m1() {}
	void m2(){}
	static {
		System.out.println();
	}
	{
		System.out.println("1");
	}
}
