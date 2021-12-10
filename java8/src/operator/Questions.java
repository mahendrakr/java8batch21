package operator;
/**
 * Q1. Write a program to check divisibility of 3,4,5,6,7,8,9.
 * Q2. Write a program to add two given numbers a and b.
 * Q3. Write a program to subtract two given no. a and b.
 * Q4. Write a program to multiply two given no. a and b.
 * Q5. Write a program to divide two given no. a and b. [/ & %].
 */
public class Questions {
	public boolean isDivisibleBy3(int a) {
 //		return a%3==0;
		int r = a%3;
		boolean f = r==0;
		return f;
	}
	public boolean isDivisibleBy4(int b) 
	{
		return b%4==0;
	}
	public boolean isDivisibleBy5(int e)
	{
		return e%5==0;
	}
	public boolean isDivisibleBy6(int f)
	{
		return f%6==0;
	}
	public boolean isDivisibleBy7(int g)
	{
		return g%7==0;
	}
	public boolean isDivisibleBy8(int h)
	{
		return h%8==0;
	}
	public boolean isDivisibleBy9(int i)
	{
		return i%9==0;
	}
	
	public int add(int c,int d) {
		return c+d;
	}
	public int subtract(int k,int l) {
	    return k-l;
	}
	public int mul(int m,int n) {
		return m*n;
	}
	public int div(int o,int p) {
		return o/p;
	}
	
	public static void main(String[] args) {
		Questions q = new Questions();
		boolean result = q.isDivisibleBy3(16);
		System.out.println(result);
		System.out.println(q.isDivisibleBy4(16));
		System.out.println(q.isDivisibleBy5(16));
		System.out.println(q.isDivisibleBy6(16));
		System.out.println(q.isDivisibleBy7(16));
		System.out.println(q.isDivisibleBy8(16));
		System.out.println(q.isDivisibleBy9(16));
		System.out.println(q.add(4, 0));
		System.out.println(q.subtract(5, 7));
		System.out.println(q.mul(3,8));
		System.out.println(q.div(24, 4));
		
	}
}
