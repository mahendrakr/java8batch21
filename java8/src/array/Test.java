package array;
/**
 * Question: 1) Create a method - Get name by id which take array of student type
 *              and id(int type which should return name of the student) ?
 *           2).Create a method get phone number by name which take- array of student type
 *              and name of the student and should  return phone number of the student ?   
 * 
 * @author Yashwani
 *
 */
public class Test {

	public static void main(String[] args) {
    Student[] arr= new Student[5];
    arr[0]=new Student(1,"Anamika",8602546990l);
    arr[1]=new Student(2,"Anushka",7566341234l);
    arr[2]=new Student(3,"Kavya",7566341264l);
    arr[3]=new Student(4,"Yashvani",9066341234l);
    arr[4]=new Student(5,"Ankhush",9906341234l);
    
    for(Student s:arr) {
    if(s.name.equals("Anushka")) {
    	System.out.println(s.phoneNumber);
    }
    if(s.id==4) {
    	System.out.println(s.name+ " "+s.phoneNumber);
    }
    
    }
    
    
    	
    		
	}

}
