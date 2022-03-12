package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorks {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		
		System.out.println(map.put(10, "A"));
		System.out.println(map.put(10, "B"));
		System.out.println(map);
	}
}
