package array;

public class Hetro {
	public static void main(String[] args) {
		int[] arr= new int[3];
		Object[] obj= new Object[5];
		obj[0]="himani";
		obj[1]= 123456;
		obj[2]= true;
		obj[3]= new Student(123, "Yashwani", 7788994456L);
	}
}
