package encapsulation;

public class Test {

	public static void main(String[] args) {
		Student s =new Student();
		
		System.out.println(s.getAddress());
		System.out.println(s.getAge());
		System.out.println(s.getID());
		System.out.println(s.getName());
		System.out.println(s.getPhoneNo());
		s.setAge(-10);
		System.out.println("**********");
		System.out.println(s.getAge());
	}

}
