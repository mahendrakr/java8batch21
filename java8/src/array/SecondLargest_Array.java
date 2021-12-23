package homework;

public class SecondLargest_Array {
	/**
	 * Steps:-
	 * 1)  Traverse the array and compare if element is greater than max then 
	 * @param arr
	 * @return
	 */
	
	public static int getSecondLargest(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax= max;
				max = arr[i];	
			}
			else if(arr[i]>secondMax && arr[i]<max ) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	
//	Version 2
	
	public static int getSecondLargestV2(int[] arr) {
		int largest = arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
				largest = arr[j];
			}
		}
		int second = 0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>second && arr[k]<largest) {
				second = arr[k];
			}
		}
		return second;
	}
	
	// Sorting
	
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {130,130,80,10,5,100,90};
//		 int secMax = getSecondLargest(arr);
//		 int second = getSecondLargestV2(arr);
//		 
//	     System.out.println(secMax);
//	     System.out.println(second);
	    int[] sort = sort(arr);
	    System.out.println("second largest" +" " +sort[1]);
	    for(int k:arr) {
	    	System.out.println(k);
	    }
	}

}
