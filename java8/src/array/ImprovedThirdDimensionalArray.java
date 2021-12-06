package array;

public class ImprovedThirdDimensionalArray {

	public static void main(String[] args) {
    int[][][] a= 
    		{//1D Starts
    		
    		{//2D Starts
    			{4,5},{6,7} //3D
    			
    		},//2D Ends
    		{//2D Starts
    			{1,2},{3,9},{10}  //3D
    		}//2D Ends
    };//1D Ends
    //Access the elements 9 , 6 ,2 ,10
    System.out.println(a[1][1][1]);
    System.out.println(a[0][1][0]);
    System.out.println(a[1][0][1]);
    System.out.println(a[1][2][0]);
    System.out.println("********************");
    for(int [] [] i:a) {
    	for(int [] j:i) {
    		for(int k:j) {
    			System.out.println(k);
    		}
    	}
    }
	}

}
