package controflow;

public class RightAngleTriangle {

	public static void main(String[] args) {
		int rc = 5;
		int sc = 1;
		int bc = 4;
		for(int i=0;i<rc;i++) {
			for(int k=0;k<bc;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<sc;j++) {
				System.out.print("*");
			}
			System.out.println();
			sc++;
			bc--;
		}
	}
}
