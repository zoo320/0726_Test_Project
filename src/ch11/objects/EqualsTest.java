package ch11.objects;

import java.util.Objects;

public class EqualsTest {

	public static void main(String[] args) {
		System.out.println(Objects.equals("Hello", "Hi"));
		System.out.println(Objects.equals(null, null));

		int [] ints1 = {1,2};
		int [] ints2 = {1,2};
		System.out.println(Objects.equals(ints1, ints2));
		System.out.println(Objects.deepEquals(ints1, ints2));
	}
}