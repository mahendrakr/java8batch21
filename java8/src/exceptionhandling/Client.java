package exceptionhandling;

public class Client {
       public static void main(String[] args) {
	   Student s = new Student();
	   try {
		long phoneno = s.getPhoneno("aadi12");
		System.out.println(phoneno);
	} catch (MyException e) {
		System.out.println("name doesnot exist");
	}
	   String email = s.getEmail("aadi1234");
	   System.out.println(email);
	}
}
