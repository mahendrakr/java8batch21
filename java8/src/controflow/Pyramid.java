package controflow;

public class Pyramid {

	public static void main(String[] args) {
    int rc=4;
    int bc=3;//Decreased by 1
    int sc=1;//Increased by 2
    //First print blank space then star
    for(int i=0;i<rc;i++) {
    	for(int j=0;j<bc;j++) {
    		System.out.print("  ");
    		
    	}
    	for(int k=0;k<sc;k++) {
    		System.out.print(" *");
    	}
    	bc--;
    	sc=sc+2;
    	System.out.println();
    }
    
    
	}

}
