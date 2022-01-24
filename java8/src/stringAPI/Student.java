package stringAPI;
/**
 * Q. how can you make your class immutable?
 * step 1. make your class final.
 * step 2. make all the fields private and final.
 * step 3. don't provide setter methods.
 * step 4. provide only getter methods
 * 
 * NOTE : If any reference variable(e.g. Address address;) is available, which is mutable, then return new object by initializing 
 * 			with the old data.
 * 
 * @author adity
 *
 */
public final class Student {
	private final int id;
	private final String name;
	private final Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public Address getAddress() {
		Address add= new Address();
		add.setCity(address.getCity());
		add.setState(address.getState());
		add.setPincode(address.getPincode());
		
		return add;
	}



}
