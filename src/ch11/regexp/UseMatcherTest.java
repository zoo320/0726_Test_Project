package ch11.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseMatcherTest {

	public static void main(String[] args) {
		String src = "A Java and JavaScript has no relation";
		String regexp = "Java";
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(src);
		
		System.out.println("완전히 일치 되는가? " + matcher.matches());
		System.out.println("정규 표현식을 포함하는가? " + matcher.lookingAt());
		
		matcher.reset();
		int cnt = 0;
		while (matcher.find()) {
			cnt++;
			int start = matcher.start();
			int end = matcher.end();
			System.out.println(cnt + ":(" + start + "," + end + ")" + src.substring(start, end));
		}
		
		String replaced = matcher.replaceAll("Some");
		System.out.println(replaced);
	}
}