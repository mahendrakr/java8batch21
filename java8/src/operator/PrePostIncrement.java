package operator;

public class PrePostIncrement {

	public static void main(String[] args) {
		int a = 10;
	//	++a; //post
		a = a++ +a + a-- -a-- + ++a;

		System.out.println(++a);
		//++a; //pre
		int x=10;
		System.out.println(x + ++x + x++ - x++);
		System.out.println(x);
		
		int y=20;
		System.out.println(++y + y++ + y + y-- + ++y);
		
		
		
		
	}

}
