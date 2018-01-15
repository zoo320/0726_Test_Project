package ch11.string;

public class TrimTest {
	public static void main(String[] args) {
		String helloWithWhiteSpace="\tHello \n";
		System.out.println("Hello".equals(helloWithWhiteSpace));
		System.out.println("Hello".equals(helloWithWhiteSpace.trim()));
	}
}