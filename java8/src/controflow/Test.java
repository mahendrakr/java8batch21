package controflow;

public class Test {

	public static void main(String[] args) {
    Student s= new Student(101, "yashvani", 78, 58.6, 97);
    Eligibility e=new Eligibility();
    boolean result = e.isEligible(s);
    System.out.println(result);
	}

}
