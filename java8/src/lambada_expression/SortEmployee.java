package lambada_expression;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmployee implements Comparator<Employee> {
	public static void main(String[] args) {
		Set<Employee> s1=new TreeSet<>();
		s1.add(new Employee(11,"Aadi",25000));
		s1.add(new Employee(12,"Ankhush",35000));
		s1.add(new Employee(13,"Anamika",22000));
		s1.add(new Employee(14,"Yashvani",25000));
		s1.add(new Employee(15,"Himani",45000));
		Iterator<Employee>iterator=s1.iterator();
		while(iterator.hasNext()) {
			Employee next = iterator.next();
			System.out.println(next.getId() +" "+next.getName() +" "+next.getSalary());
		}
	}
		
		
		
//	}




@Override
public int compare(Employee o1, Employee o2) {
	return (o1.getSalary());
}

}
