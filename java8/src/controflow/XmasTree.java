package controflow;

public class XmasTree {

	public static void main(String[] args) {
    int rc=4;
    int bc=3;
    int sc=1;
    for(int i=0;i<rc;i++) {
    	for(int j=0;j<bc;j++) {
    		System.out.print(" ");
    	}
    	for(int k=0;k<sc;k++) {
    		System.out.print("*");
    	}
    	bc--;
    	sc+=2;
    	System.out.println();
    }
    int rc1=3;
    int sc1=3;
    int bc1=2;
    
    for(int i=0;i<rc1;i++) {
        for(int j=0;j<bc1;j++) {
        	System.out.print(" ");
        }   
        for(int k=0;k<sc1;k++) {
        	System.out.print("*");
        }
        System.out.println();
        }
    }
    
    
    
    
	}


