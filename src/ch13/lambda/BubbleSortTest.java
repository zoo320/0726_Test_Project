package ch13.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortTest {

	public static void main(String[] args) {
		String [] strs = {"this", "is", "java", "world"};
		System.out.println(Arrays.toString(strs));//정렬 전: [this, is, java, world]
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));//정렬 후: [is, java, this, world]
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2)*-1;
			}
		});
		System.out.println(Arrays.toString(strs));//정렬 후: [world, this, java, is]
		Arrays.sort(strs, (o1, o2) -> {return o1.compareTo(o2)*-1;});
		System.out.println(Arrays.toString(strs));//정렬 후: [world, this, java, is]
		
		Comparator<String> strComp = (o1, o2) -> {
			return o1.compareTo(o2)*-1;
		};
		Arrays.sort(strs, strComp);
		System.out.println(Arrays.toString(strs));
		System.out.println(strComp.getClass().getName());
	}

}
