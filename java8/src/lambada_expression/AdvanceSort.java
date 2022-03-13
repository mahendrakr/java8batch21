package lambada_expression;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AdvanceSort {

	public static void main(String[] args) {
		//Comparator<Student2> c=(s1,s2)->s1.getName().compareTo(s2.getName());		
		Set<Student2> s1=new TreeSet<>((s,s2)->s.getName().compareTo(s2.getName()));
		s1.add(new Student2(10,"Yashvani"));
		s1.add(new Student2(11,"Ankush"));
		s1.add(new Student2(12,"Aadi"));
		s1.add(new Student2(13,"Anamika"));
		s1.add(new Student2(14,"Kavya"));
		s1.add(new Student2(15,"Himani"));
		Iterator<Student2> iterator = s1.iterator();
		while(iterator.hasNext()) {
			Student2 next = iterator.next();
			System.out.println(next.getId() +" "+next.getName());
		}
	}

}
