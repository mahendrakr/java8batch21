package collection;

import java.util.HashMap;
import java.util.Map;

/**
remove
get
put
equals
values
hashCode
clear
isEmpty
replace
replaceAll
size
entrySet
putAll
putIfAbsent
forEach
keySet
compute
computeIfAbsent
computeIfPresent
containsKey
containsValue
getOrDefault
merge
 * @author adity
 *
 */
public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(123, "Aadi");
		map.put(124, "Ankush");
		map.put(125, "Anamika");
		map.put(121, "Yashwani");
		map.put(127, "Himani");
		System.out.println(map);
		String name = map.get(121);
		System.out.println(name);
		//iterate entries of the map :
		for(Map.Entry<Integer, String > e:map.entrySet()) {
			System.out.println(e.getKey() +" " +e.getValue());
		}
		String[] names= {"A","B","C","A","B"};
		Map<String, Integer> map1= new HashMap<>();
		for(String s : names) {
			if(map1.containsKey(s)) {
				int v  = map1.get(s);
				v=v+1;
				map1.put(s, v);
			}
			else {
			map1.put(s, 1);
			}
		}
		System.out.println(map1);
	}
}









