package ch13.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

import ch13.list.StringLengthComparator;

public class CustomTreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>(new StringLengthComparator());
		set.addAll(Arrays.asList("타노스", "아이언맨","헐크","토르","데드폴","비전"));
		System.out.println("오름차순 TreeSet: "+set);
		
		NavigableSet<String> naviSet = set.descendingSet();
		System.out.println("내림차순 TreeSet: "+naviSet);
	}
}