package controflow;

public class Triangle2 {

	public static void main(String[] args) {
    int rc=5;
    int sc=1;
    int bc=2;
    for(int i=0;i<rc;i++) {
    	for(int j=0;j<sc;j++) {
    		System.out.print("*");
    	}
    	for(int k=0;k<bc;k++) {
    		System.out.print(" ");
    	}
    	System.out.println();
    	
    	sc+=1;
    	bc-=1;
    }
	int rc1=4;
	int sc1=4;
	for(int i=0;i<rc1;i++) {
	   for(int j=0;j<sc1;j++) {
		System.out.print("*");
	}
	   sc1--;
		System.out.println();
	   
	}


}}
