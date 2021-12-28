package encapsulation;

public class Student {
		private String name = "Anushka";
		private int age= 20;
		private int ID=123;
		private long phoneNo=700498812;
		private String address="Bhopal";
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getID() {
			return ID;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public String getAddress() {
			return address;
			
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			if(age<0) {
				System.out.println("Invalid age,it should be positive");
				return;
			}
			else if(age>0) {
				
			this.age = age;
		}
		}
		public void setID(int iD) {
			ID = iD;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
