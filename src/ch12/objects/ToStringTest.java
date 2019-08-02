package ch12.objects;

import java.util.Objects;

public class ToStringTest {

	public static void main(String[] args) {
		Object obj1 = null;
		// System.out.println(obj1.toString()); -- NullPointerException
		System.out.println(Objects.toString(obj1));
		System.out.println(Objects.toString(obj1, "널"));
	}

}
