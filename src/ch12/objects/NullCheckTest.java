package ch12.objects;

import java.util.Objects;

public class NullCheckTest {

	public static void main(String[] args) {
		String[] strs = { "Hello", null };
		
		if (Objects.nonNull(strs[0])) {
			System.out.println(strs[0].length());
		}
		
		if (Objects.isNull(strs[1])) {
			System.out.println("strs[1]은 null 입니다.");
		}
		
		try {
			String name = Objects.requireNonNull(strs[0]);
			System.out.println(name);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			String name = Objects.requireNonNull(strs[1], "먼저 값을 할당하세요.");
			System.out.println(name);
		} catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			String name = Objects.requireNonNull(strs[1], ()->"먼저 값을 할당하세요.");
			System.out.println(name);
		} catch (NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}