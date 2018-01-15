package ch13.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("토르", "캡틴아메리카", "스파이더맨", "아이언맨");
		Collections.sort(names);
		System.out.println("알파벳 순 정렬 결과: "+names);
		Collections.sort(names, new StringLengthComparator());
		System.out.println("글자수 정렬 결과: "+names);
	}
}