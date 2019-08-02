package ch12.objects;

import java.util.Comparator;
import java.util.Objects;

class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		int o1Length = o1.length();
		int o2Length = o2.length();
		if(o1Length> o2Length) {
			return 1;
		}else if(o1Length==o2Length) {
			return 0;
		}else {
			return -1;
		}
	}
}

public class CompareTest {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "Java";
		int compResult = Objects.compare(a, b, new StringLengthComparator());
		if(compResult>0) {
			System.out.println("a가 더 길다.");
		}else if(compResult==0) {
			System.out.println("a와 b의 길이는 같다.");
		}else {
			System.out.println("b가 더 길다.");
		}
	}
}