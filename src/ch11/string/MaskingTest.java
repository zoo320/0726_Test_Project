package ch11.string;

public class MaskingTest {
	public static void main(String[] args) {
		String hp = "010-1234-5678";
		String last4 = hp.substring(9, hp.length());
		System.out.println("추출된 문자열: "+last4);
		String masked = hp.replace(last4, "****");
		System.out.println(masked);
	}
}