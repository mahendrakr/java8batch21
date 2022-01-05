package PassByValue;

public class Test {

	public static void swap(Student s1,Student s2){
		Student temp=s1;
		s1=s2;
		s2=temp;
		}
	public static void resetValueOfName(Student s1){
		s1.setName("Anu");
		}
		public static void main(String[] args){
		Student student1 = new Student("Kalawati");
		Student student2 = new Student("Amit");
		System.out.println(student1.getName()+":"+student2.getName());//Kalawati : Amit
		swap(student1,student2);
		System.out.println(student1.getName()+":"+student2.getName());//Kalawati : Amit

		}
		
}

