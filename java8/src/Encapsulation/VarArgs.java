package Encapsulation;

public class VarArgs {
	public void m1(int...a) {
		for(int i: a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		v.m1(10,20,30,40,50);
}
}