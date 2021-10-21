 package datatypes;

public class DataTypeLiterals {
	byte b = Byte.MAX_VALUE;
	short s = 20;
	int i = 30;
	long l = 40;
	float f = 50.5f;
	double d = 60.5;
	char c = 'A'; 
	boolean y = true;
	String t ="Anushka";
	long phone = 7028918233L;
	public static void main(String[] args) {
		int a =0b100;// 0B /0b (binary)
		System.out.println(a);
		int b = 053; // 0 (octal)
		System.out.println(b);
		int c = 0xF; // 0x /0X (hexadecimal)
		System.out.println(c);
	}
}
