package array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
    int[][][] arr=new int[1][2][4];
    System.out.println(arr.length);
    System.out.println(arr[0].length);
    System.out.println(arr[0][0].length);
    arr[0][0][1] = 50;
    arr[0][0][3] = 70;
    arr[0][1][0] = 80;
    arr[0][1][3] = 40;
    System.out.println(arr[0][0][2]);
    System.out.println(arr[0][0][0]);
    System.out.println(arr[0][1][1]);
    System.out.println(arr[0][1][2]);
    System.out.println("************");
    for(int i=0;i<arr.length;i++) {
    	for(int j=0;j<arr[0].length;j++) {
    		for(int k=0;k<arr[0][0].length;k++) {System.out.println(arr[i][j][k]);}
    	}
    }
    System.out.println("**************");
    for(int[][]i:arr) {
    	for(int[]j:i) {
    		for(int k:j) {
    			System.out.println(k);
    		}
    	}
    }
	}

}
