package ch10.string;

public class EqualsTest {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("hello".equals(str));
		System.out.println("hello".equalsIgnoreCase(str));
		
		String nullStr = null;
		//System.out.println(nullStr.equals("some")); // NullPointerException 발생 가능
		System.out.println("some".equals(nullStr)); // NullPointerException 발생 없음
	}
}