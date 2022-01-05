package ankush;

public class Student {
	public int age;
	public void modifyAge(int a){
	 a=a+10;
	 System.out.println(a);
	}
	
	public  static void main(String[] args){
	Student student = new Student();
	System.out.println(student.age);//0
	student.modifyAge(student.age);//10
	System.out.println(student.age);//0
	}
	
	 
	
	
	
	
	
}
