package inheritence;

public class Employee extends Person{
	public void m1() {
		System.out.println("child");
	}
	@Override
	 protected final Object add(int id, String name) {
			System.out.println("parent :" + name);
			return name;
		}
	private void m2() {
		System.out.println("child m2");
	}
	
	public static void m3() {
		System.out.println("child m3");
	}
//	public void m4() {
//		System.out.println("child m4");
//	}
	public static void main(String[] args) {
		Person p=new Employee(); // resolution happen at runtime.
		p.m1();
		Person p1=new Person();
		p1.m1();
		Employee e=new Employee();
		e.m1();
		//p.m2(); //not valid cause you can't override private method(refer=parent)
		e.m2();
		p.m3();
	}
}
