package typecasting;

public class Test {

	public static void main(String[] args) {
		Object d = new Aadi();
//		d.m5();
		Aadi a = (Aadi)d;
		a.m5();
		Dada d2 = (Dada)d;
		Dada d3 = (Papa)d;
		Dada d4 = (Aadi)d;
		Dada d5 = (Dada)d; 
		Papa d6 = (Aadi)d;
		Papa p = new Aadi();
		Papa c = (Papa)p;
	}

}
