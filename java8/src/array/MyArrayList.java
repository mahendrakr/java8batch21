package array;

public class MyArrayList {
	int[] arr;
	int size;
	public MyArrayList() {
	arr = new int[10];
	} 
	/**
	 * Steps : 
	 * 1. Take a variable size.
	 * 2. check if the array is full or not.
	 * 3. if array is full, then copy the data in temp. array. Increase the size of the array by 2x.
	 * 		- Copy the existing data in new array. Add the latest data at appropriate index. 
	 * 4. Else (if array is not full )
	 * 5. Add value to array.
	 * 6. Increase the size.
	 * @param data
	 */
	public void add(int data) {
		if (size == arr.length) {
			int[] temp = arr;
			int l = temp.length;
			arr = new int[l*2];
			for(int i = 0;i<temp.length;i++) {
				arr [i] = temp [i];
			}
		}
		
		arr[size] = data; 
		size++;
	}
	public void print() {
		for (int i = 0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
