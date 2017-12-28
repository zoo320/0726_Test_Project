package ch16.terminate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectTest {

	public static void main(String[] args) {
		String[] strs = { "Hi", "C", "Java", "Zoo", "World" };

		List<String> list = Arrays.stream(strs).filter(str -> {
			return str.length() >= 3;
		}).collect(Collectors.toList());
		System.out.println(list.getClass().getName() + " : " + list);

		Set<String> set = Arrays.stream(strs).filter(str -> {
			return str.length() >= 3;
		}).collect(Collectors.toSet());
		System.out.println(set.getClass().getName() + " : " + set);

		Map<String, Integer> map = Arrays.stream(strs).filter(str -> {
			return str.length() >= 3;
		}).collect(Collectors.toMap(str -> str, str -> str.length()));
		System.out.println(map.getClass().getName() + " : " + map);

		Map<String, Integer> map2 = Arrays.stream(strs).filter(str -> {
			return str.length() >= 3;
		}).collect(Collectors.toMap(str -> str, 
									str -> str.length(), 
									(oldVal, newVal) -> newVal, 
									TreeMap::new));
		System.out.println(map2.getClass().getName());//java.util.TreeMap
	}
}
/*
List<String> list2 = Arrays.stream(strs).filter(str -> {
	return str.length() >= 3;
}).collect(Collectors.toCollection(LinkedList::new));
System.out.println(list2.getClass().getName());// java.util.LinkedList
*/