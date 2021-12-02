package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
    int[] a;
    int []b;
    int c[];
    int d [];
    int[][] dd = new int[3][2];
    System.out.println(dd.length);
    dd[1][1] = 60;
    dd[2][0] = 50;
    dd[0][1] = 70;
    dd[0][0] = 40;
    dd[1][0] = 30;
    dd[2][1] = 20;
    System.out.println(dd[0][1]);
    System.out.println(dd[1][1]);
    System.out.println(dd[2][0]);
    System.out.println(dd[1][0]);
    System.out.println(dd[2][1]);
    System.out.println(dd[0][0]);
    System.out.println("*************");
    System.out.println(dd.length);
    System.out.println(dd[2].length);
    for(int i=0;i<dd.length;i++) {
    	for(int j=0;j<dd[i].length;j++) {
    		System.out.println(dd[i][j]);
    	}
    }
    System.out.println("***********");
    for(int[]p:dd) {
    	for(int q:p) {System.out.println(q);}
    }
    
	}

}
