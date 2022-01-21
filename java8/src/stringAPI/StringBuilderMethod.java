package stringAPI;
/**
 * indexOf()
reverse()
insert()
subString()
replace()
delete()
append()
setCharAt()
getChars()
charAt()
setLength()
trimToSize()
capacity()
length()
 * @author adity
 *
 *StringBuilder performance  is better than StringBuffer.
 */
public class StringBuilderMethod {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		StringBuilder sb1=new StringBuilder("aadi");
		System.out.println(sb1.capacity());
	}
}
