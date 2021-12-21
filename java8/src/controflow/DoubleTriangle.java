package controflow;

public class DoubleTriangle {

	public static void main(String[] args) {
    int rc=4;
    int bc=6;
    int sc=1;
    for(int i=0;i<rc;i++) {
    	for(int j=0;j<sc;j++) {
    		System.out.print("*");
    	
    	}
    	for(int k=0;k<bc;k++) {
    		System.out.print(" ");
    		
    	}
    	for(int j=0;j<sc;j++) {
    		System.out.print("*");
    	
    	}
    	sc++;
    	bc-=2;
    	
    	System.out.println();
    }
	}

}
