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
    
    /**
     * 1.Choose the first value of a given array and store it in a variable called min.
     * 2.Iterate and compare with the next value if min is smaller than immediate next then go to 
     *   next value.
     * 3.If min is less then the immediate next then update the min value with 
     *    next value and repeat the step 1& 2till the end of the loop .
     * 4.Return min.  
   
     * @param args
     */
    
    public static int getMin(int[] arr) {
    	int min=arr[1];
    	for(int j=2;j<arr.length;j++) {
    		if(arr[j]<min) {
    			min=arr[j];
    		}
    	}
    	return  min;
    	
    }
	public static void main(String[] args) {
    int[] arr= {40,30,4,100,90,20};
   int max = getMax(arr);
   System.out.println(max);
    int min=getMin(arr);
    System.out.println(min);
    
	}

}
