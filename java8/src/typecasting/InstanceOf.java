package typecasting;

import ankush.Student;

public class InstanceOf {

	public static void main(String[] args) {
		Object o = new Aadi();
		if(o instanceof Student) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
