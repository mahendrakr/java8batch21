package controflow;

public class TrianglePattern {

	public static void main(String[] args) {
		int rc = 5;
		int sc = 1;
		for(int i=0; i<rc; i++) {
			for(int j=0;j<sc;j++) {
				System.out.print("* ");
			}
			System.out.println();
			sc++;
//			sc=sc+1;
		}
	}

}
