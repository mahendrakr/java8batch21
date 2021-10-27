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
	public static void main(String[] args) {
		Questions q = new Questions();
		boolean result = q.isDivisibleBy3(16);
		System.out.println(result);
	}
}
