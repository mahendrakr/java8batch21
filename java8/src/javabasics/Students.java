package javabasics;

public class Students {
	String name;
	int age;
	String rollNo;
	long contact;
	String address;
	String department;
	String email;
	void setName(String name) {
		System.out.println(name);
	}
	String getName(){
		return "Aadi";
	}
	int getAge() {
		return 10;
	}
	void setAge(int age) {
		System.out.println(age);
	}
	public static void main(String[] args) {
		Students s = new Students();
		String name = s.getName();
		System.out.println(name);
		int age = s.getAge();
		System.out.println(age);
		s.setName("Anamika");
		s.setAge(20);
		String email = s.email;
		System.out.println(email);
	}
}
