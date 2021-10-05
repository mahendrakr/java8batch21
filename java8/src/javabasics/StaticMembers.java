package javabasics;

public class StaticMembers {
	String name = "shreya";
	int id = 30;
	static int a = 50;
	static int b = 40;
	public String getName() {
		return "aadi";
	}
	public static int getId() {
		return 10;
	}
	public static void main(String[] args) {
		int result1 = StaticMembers.a;
		int result2 = StaticMembers.b;
		int id = StaticMembers.getId();
		StaticMembers sm = new StaticMembers();
		int result3 =  sm.a;
		int result4 = sm.b;
		int result5 = sm.id;
		String n = sm.name;
	}
}
