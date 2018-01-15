package ch13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import ch13.list.StringLengthComparator;

public class TreeMapTest {
	private static Map<String, String> initMap(Map<String, String> map) {
		map.put("토르", "마블");
		map.put("베트맨", "DC");
		map.put("아이언맨", "마블");
		map.put("원더우먼", "DC");
		return map;
	}

	public static void main(String[] args) {
		Map<String, String> map = initMap(new HashMap<>());
		System.out.println("맵의 정렬 상태 1: " + map);
		Map<String, String> tmap = initMap(new TreeMap<>());
		System.out.println("맵의 정렬 상태 2: " + tmap);
		if(tmap instanceof NavigableMap<?, ?>) {
			NavigableMap<String, String> navMap = (NavigableMap<String, String>)tmap;
			System.out.println("맵의 맨 처음 요소: "+navMap.firstEntry());
			System.out.println("맵의 내림차수 정렬: "+navMap.descendingMap());
		}
		
		Map<String, String> tmap2 = initMap(new TreeMap<>(new StringLengthComparator()));
		System.out.println("맵의 정렬 상태 3: " + tmap2);
	}
}