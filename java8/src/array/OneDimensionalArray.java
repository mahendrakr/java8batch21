package array;

public class OneDimensionalArray {
	public static void main(String[] args) {
		int r1 = 10;
		int r2 = 20; 
		int r3 = 30;
		int r4 = 40;
		int r5 = 50;
		int[] array = new int[5];
		// array initialisation
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		// accessing array
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println("**********");
		System.out.println(array.length);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("*********");
		for(int a: array) {System.out.println(a);}
		
	}
}
