package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * 1. Difference between List and Set:
 * List allow duplicate element where as Set don't
 * In List order are preserved where as Set don't maintain order
 * 
 * 2. Difference between ArrayList and LinkedList :
 * - In ArrayList searching is faster than LinkedList.
 * - In ArrayList write operation is costly compared to LinkedList.
 * - ArrayList is implemented on Array data structure but LinkedList is implemented on doubly LinkedList.
 * 
 * 3. How does ArrayList internally work?
 * 4. Difference between Iterator & ListIterator?
 * 5. 
 * 
add
remove
get
clear
contains
isEmpty
iterator
replaceAll
size
subList
toArray
addAll
set
containsAll
listIterator
removeAll
retainAll
sort-TBD in future lecture.

 */
public class MyList {

	public static void main(String[] args) {
//		ArrayList<String> list= new ArrayList<>();
		List<Integer> list1=new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(50);
		System.out.println(list1);
		System.out.println(list1.get(3));
		//Integer remove = list1.remove(5);
		//System.out.println(remove);
		System.out.println(list1);
//		list1.clear();
		List<Integer> list2=new ArrayList<>();
		list2.add(20);
		list2.add(30);
//		list1.removeAll(list2);
//		list1.retainAll(list2);
		System.out.println(list1);
		list1.set(1, 50);
		System.out.println(list1);
		System.out.println(list1.contains(200));
		ListIterator<Integer> listIterator = list1.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		//list1.sort(null);
		
		
	}

}
