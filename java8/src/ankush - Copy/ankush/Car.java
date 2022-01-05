package ankush;

/**
 * ctrl+A(to select all the content) ctrl+shift+F(to format)
 * 
 * @author Ankush
 *
 */
public class Car {                            // i

	String company;
	String name;
	int registrationYear;
	long capacity;
	String vehicleNumber;
	boolean isComfortable;
	char model;

	void setName() {
		System.out.println("setName()");
	}
	void setCompany(){
		System.out.println("setCompany()");
}
	void setCapacity() {
		System.out.println("setCapacity()");
		}
	
	
	String getName() {
		return "Ankush";
	}
	
	int getRegistrationYear() {
		return 2021;
	}
	long getCapacity() {
		return 7;
		
		
	}
	public static void main(String[] args) {
		Car c = new Car();
		String name = c.getName();
		System.out.println(name);
		
		long capacity = c.getCapacity();
		System.out.println(capacity);
		
		c.setName();
		long cap = c.capacity;
	    System.out.println(cap);
	    System.out.println(c.capacity);
	
	}
	
	
	
}
