package controflow;

public class ReverseDtriangle {

	public static void main(String[] args) {
		int rc=4;
		int sc=4;
		int bc=0;
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
			sc-=1;
			bc+=2;
			System.out.println();
			
			}
		}

	}


