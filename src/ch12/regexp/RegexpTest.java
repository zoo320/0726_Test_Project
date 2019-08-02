package ch12.regexp;

import java.text.MessageFormat;
import java.util.regex.Pattern;

public class RegexpTest {

	public static void main(String[] args) {
		String regexp = "^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
		String[] numbers = {
				"010-000-1234",
				"01112345678",
				"010)1234 5678",
				"010 1234 567a" };
		String resultPattern = "{0}는 전화번호 타입인가? {1}";
		for (String number : numbers) {
			boolean result = Pattern.matches(regexp, number);
			System.out.println(MessageFormat.format(resultPattern, number, result));
		}
	}
}