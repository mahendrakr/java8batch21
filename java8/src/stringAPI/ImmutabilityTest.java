package stringAPI;

public class ImmutabilityTest {

	public static void main(String[] args) {
		Address add= new Address();
		add.setCity("patna");
		add.setPincode(840001);
		add.setState("Bihar");
		Student s=new Student(101, "aadi", add);
		System.out.println(s.getName()+ " "+ s.getAddress().getCity());
		s.getAddress().setCity("nalanda");
		System.out.println(s.getName()+ " "+ s.getAddress().getCity());
	}

}
