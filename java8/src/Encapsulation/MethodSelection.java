package encapsulation;
/**
 * In method overloading , method selection rules :
 * 1. Compiler will find exact match.
 * 2. If exact match is not found, then compiler looks for immediate match(double>float>long>int>short>byte).
 * 3. If immediate match is also not found then compiler looks for exact matching wrapper class.(int->Integer).
 * 4. If exact matching wrapper is also not found,  then complier will look for "Object"[args].
 * 5. If object[args] is also not found, then compiler will look for var-args.
 * 6. If var-args is also not found, then compiler raise compile time error. 
 * @author adity
 *
 */
public class MethodSelection {
	public void m11(byte b) {
		System.out.println("byte");
	}
	public void m11(int i) {
		System.out.println("int");
	}
	public void m1(Integer a) {
		System.out.println("Integer");
	}
	public void m11(float f) {
		System.out.println("float");
	}
	public void m11(short s) {
		System.out.println("short");
	}
	public void m11(long l) {
		System.out.println("long");
	}
	public void m1(Long b) {
		System.out.println("Long");
	}
	public void m1(Object o) {
		System.out.println("OBJECT");
	}
	public void m11(Byte b) {
		System.out.println("Byte");
	}
	public void m1(int...a) {
		System.out.println("VarArgs");
	}
	public static void main(String[] args) {
		MethodSelection o = new MethodSelection();
		o.m1((byte)20);
		o.m1(30);
	}
}





















