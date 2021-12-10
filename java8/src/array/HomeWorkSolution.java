package array;
/** 
 *  A given array {40,30,4,100,90,20} find min and max value.
 * @author Yashwani
 *
 */
public class HomeWorkSolution {
	/**
	 * Step- 1. Choose the first value of a given array and store in a variable
	 *          called max.
	 *       2.Iterate and  compare with the next element if max is greater than immediate next 
	 *          then go to next value.
	 *       3. If max is less then the immediate next then update the max value with 
	 *          next value and repeat step 1 & 2 till end of the loop.    
	 *       4. Return max.     
	 *    
	 * @param arr
	 * @return
	 */
    public static int getMax(int[] arr) {
    	int max=arr[0];
    	for(int i=1;i<arr.length;i++) {
    		if(arr[i]>max) {
            max=arr[i];    		}
    	}
    	return max;
    }
	public static void main(String[] args) {
    int[] arr= {40,30,4,100,90,20};
    int max = getMax(arr);
    System.out.println(max);
    
	}

}
