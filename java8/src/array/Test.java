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
	/**
	 * Steps - 1. Traverse the array .
	 *         2. Match the given id in the given array.
	 *         3. If match return the Name.
	 *         4. If id doesn't match go to next iteration and repeat step 3 & 4 till 
	 *            end of the loop.
	 *         5. After completion of iteration if id doesn't match then return id not 
	 *            found.   
	 *        
	 * @param arr
	 * @param id
	 * @return
	 */
	public static String getNameById(Student[] arr,int id) {
		for(Student s:arr) {
			if(s.id==id) {
				return s.name;
			}
		}
		return "id not found";
		
	}      
	/**
	 * Steps - 1. Traverse the array .
	 *         2. Match the name in the given array.
	 *         3. If match return phone number .
	 *         4. If name doesn't match go to next iteration and repeat step 3 & 4 till end of loop.
	 *         5.After completion of iteration id phone number doesn't match then return -1.
	 * @param arr
	 * @param name
	 * @return
	 */
	public static long getPhoneNumberByName(Student[] arr,String name) {
		for(Student s:arr) {
			if(s.name==name) {
				return s.phoneNumber;
			}
			
			}
		return -1;
	}

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
    String name= getNameById(arr, 4);
    System.out.println(name);
    long phoneNumber = getPhoneNumberByName(arr, "Anamika");
    System.out.println(phoneNumber);
    }
    
    
    	
    		
	}


