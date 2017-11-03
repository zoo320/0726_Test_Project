package ch10.stringbuilder;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println("buffer 크기: "+builder.capacity());
		System.out.println("문자열 길이: "+builder.length());
	}
}