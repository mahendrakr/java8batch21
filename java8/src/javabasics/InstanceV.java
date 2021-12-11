package javabasics;

public class InstanceV {
	String name ="Himani";
	int id=20;
	int a = 30;
	int b = 40;
	int c = 50;
	int d = 60;
	int e = 70;
	static int x;
	static int y;
	public String getName() {
		return "sharma";
    }
	public int getId() {
		System.out.println(x);
		return 10;		
	}
	public static int getX() {
		System.out.println(x);
		return 100;
	}
	public static void main(String[] args) {
		InstanceV iv = new InstanceV();
		int a = iv.a;
		System.out.println(a);
		String name=iv.getName();
		System.out.println(name);
		int id=iv.getId();
		System.out.println(id);
        InstanceV.x= iv.getX();
        System.out.println(x);
         
		
	} 

	
	
}

