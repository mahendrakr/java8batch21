package collection; 
/**
 * 1.Contract between hashCode and equals method?
 * 2.Difference between HashSet and LinkedhashSet?
 * 
 * 
add
remove
copyOf
clear
isEmpty
size
toArray
iterator
of
contains
addAll
removeAll
retainAll
containsAll


 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
	public static void main(String[] args) {
		//Set<Integer> set=new HashSet<>(); [null, 20, 70, 40, 60, 30]
		Set<Integer> set=new TreeSet<>();
		set.add(null);
	 //	set.add(40);
	//	set.add(20);
		//set.add(30);
		//set.add(60);
	//	set.add(70);
		//set.add(null);
		
		// System.out.println(set.add(60));
		System.out.println(set);
	}

}
