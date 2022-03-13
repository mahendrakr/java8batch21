package lambada_expression;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortV2 {
	private static Comparator<Student2>c=new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			return (o1.getName().compareTo(o2.getName()));
		}
	};
	public static void main(String[] args) {
		Set<Student2> s1=new TreeSet<>(c);
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
