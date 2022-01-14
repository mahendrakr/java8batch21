package encapsulation;

public class ConstructorChaining {
	public ConstructorChaining(int a) {
		this(10,20); 
		System.out.println("int");
	}
	public ConstructorChaining(int s, int b) {
		this(50.5);
		System.out.println("int,int");
	}
	public ConstructorChaining(double a) {
//	this(50);
		System.out.println("double");
	}
	public static void main(String[] args) {
		ConstructorChaining cc=new ConstructorChaining(50);
		
	}
	}
