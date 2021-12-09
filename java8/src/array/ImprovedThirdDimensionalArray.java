package array;

public class ImprovedThirdDimensionalArray {

	public static void main(String[] args) {
    int[][][] array= 
    		{//1D Starts
    		
    		{//2D Starts
    			{4,5},{6,7} //3D
    			
    		},//2D Ends
    		{//2D Starts
    			{1,2},{3,9},{10}  //3D
    		}//2D Ends
    };//1D Ends
    //Access the elements 9 , 6 ,2 ,10
    System.out.println(array[1][1][1]);
    System.out.println(array[0][1][0]);
    System.out.println(array[1][0][1]);
    System.out.println(array[1][2][0]);
    System.out.println("******** Enhanced For Loop ***********");
    for(int [] [] i:array) {
    	for(int [] j:i) {
    		for(int k:j) {
    			System.out.println(k);
    		}
    	}
    }
    System.out.println("######### Normal For Loop ###########");
//    using normal for loop
    for(int i=0;i<array.length;i++) {
    	for(int j=0;j<array[i].length;j++) {
    		for(int k=0;k<array[i][j].length;k++) {
    			System.out.println(array[i][j][k]);
    		}
    	}
    }
	}
	
}
