package stringAPI;
/**
 * length()
isEmpty()
charAt()
getChars()
equals()
contentEquals()
equalsIgnoreCase()
compareTo()
compareToIgnoreCase()
startsWith()
endsWith()
indexOf()
lastIndex()
subString()
concat()
replace()
matches()
contains()
split()
join()
toLowerCase()
toUpperCase()
trim()
toString()
toCharArray()
format()
valueOf()
intern() this method is used to call object from SCP.
 * @author adity
 *
 */
public class StringMethods {
	public static void main(String[] args) {
	String s1="Anushka Bansal";
	System.out.println(s1.length());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.charAt(s1.length()-1));
	String s2="My name is Khan";
	for(int i=0;i<s2.length();i++) {
		System.out.print(s2.charAt(i));
	}
	System.out.println("******");
	for(int i=s2.length()-1;i>=0;i--) {
		System.out.print(s2.charAt(i));
	}
	System.out.println("********");
	String[] arr = s2.split(" ");
	for(String s:arr) {
	if(s.equals("name")) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}
		}
	System.out.println("##########");
	String s3="Shreya";
	System.out.println(s3.charAt(3));
	
}
}
