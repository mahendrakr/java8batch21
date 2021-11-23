package controflow;
/**
 * Write a program to print table of given number.
 * Write a program of factorial number .
 * Print all odd numbers between 1-100.
 * Print all even numbers between 1-100.
 * Print all prime numbers between 1-100.
 * Print all numbers between 1-100 which is divisible by 3.
 *  
 * @author Yashwani
 *
 */
public class IterativeQuestions {
	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		
	}
	public void factorial(int n){
		int t=1;
		for(int i=1;i<=n;i++) {
			t=t*i;
		}
	System.out.println(t);	
	}
public static void main(String[] args) {
	IterativeQuestions i1=new IterativeQuestions();
	//i1.printTable(5);
	i1.factorial(5);
	
	
	
}	
	

}
