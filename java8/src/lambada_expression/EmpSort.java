package lambada_expression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpSort {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Amit", 20000));
		list.add(new Employee(102, "Ankush", 30000));
		list.add(new Employee(103, "Anamika", 20000));
		list.add(new Employee(104, "Aditya", 40000));
		list.add(new Employee(105, "Himani", 40000));
		list.add(new Employee(106, "Shreya", 30000));
		Comparator<Employee> sort=(e1,e2)->{
		
		int diff=-(int ) (e1.getSalary() - e2.getSalary());
			if(diff==0) {
			diff=	e1.getName().compareTo(e2.getName());
			}
			return diff;
		};
		list.sort(sort);
		list.forEach(e->{System.out.println(e.getEid() +" "+e.getName()+" "+e.getSalary());});
	}
}
