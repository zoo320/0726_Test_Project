package ch02.variable;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "String과 char는 다르다";// String과 char는 다르다

		System.out.println(s1);

		String s2 = "Hello\t\'Java\'\tWorld";// Hello 'Java' World
		System.out.println(s2);

		String s3 = 1 + "+ " + 2 + " = " + (1 + 2);
		System.out.println(s3);

		System.out.println("1" + "1"); // 11
		System.out.println(1 + "1");// 11
		System.out.println(1 + 1 + "1");// 21
		System.out.println(1 + "1" + 1);// 111
		System.out.println('1' + '1');// 98

	}

}
