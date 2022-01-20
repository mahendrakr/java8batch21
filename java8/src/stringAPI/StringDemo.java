package stringAPI;
/**
 * 1. What is immutability, give some example of immutable class in java :(string and all wrapper classes)
 * 2. What are the benefit of immutable class?
 * 3. How can you make your own immutable class?
 * 4. What is string constant pool (scp)?
 * 5.Difference between String ,StringBuilder and StringBuffer?
 * 5. 
 * @author adity
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1="aadi"; // this is string literals and object is going to create inside SCP.
		String s2=new String("ankush"); // it will create two objects, one is in heap and other one in SCP and pointed to heap object.
		String s3="aadi";
		System.out.println(s1.hashCode() + " " + s3.hashCode());
		String s4="Himani" + "Kavya" + "Yashwani";
	}
}
