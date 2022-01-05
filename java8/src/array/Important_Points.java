package array;
/**
 * Ques 1) A given array {40,30,4,100,90,20} find min and max value.
 * Ques 2) Design auto growable array.
 * Ques 3) A given array {40,30,4,100,90,20} find second largest value and second shortest value
 * @author user
 *
 */
public class Important_Points {
	public static void main(String[] args) {
		int[] array = new int[4];
		byte[] barray = new byte[6];
//		array = barray; (Invalid- we can not assign byte array to int array or vice versa)
		//type conversion is valid for element level not for array level
		
		int[] arr = new int[10];
		array = arr; // valid compiler will check only type and dimension not size because it is not copying the elements, only redirecting to new array(arr).
		
		int brr[] = {10,20,30};
		int crr[] = {4,5,6,7,8,9,2,3,5,1};
		brr = crr;
		
		for(int i:brr) {
			System.out.println(i);
		}
		
		Object obj = new int[7]; // valid array of ints is an object in java
		
//		Object[] obj2 = new int[9]; (Invalid - because LHS is array of object but on RHS array of int)
		
		Object[] obj3 = new int[2][3]; //(Valid - because LHS is array of object and on RHS array of [(array of ints)object] )
		
		Object obj4 = obj3; //(Valid - because Object is Brahma isme sab kuch aa jayega (SuperClass))
		
//		Object obj5[][] = new int[4][5];(Inavlid- because LHS is array of array object but on RHS array of object )
		
		byte b1=10;
		short s1 = 20;
		char c1 = 'a';
		int i1 = 30;
		long l1 = 50;
		System.out.println(Integer.MAX_VALUE);
		int[] arrin = new int[-1];//negative number not allowed
		
	}
}
