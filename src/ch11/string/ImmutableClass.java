package ch11.string;

public class ImmutableClass {

	public static void main(String[] args) {
		String a = "a";
		System.out.println(System.identityHashCode(a));
		a = a + "b";
		System.out.println(System.identityHashCode(a));
		System.out.println(a);
	}
}