package ch11.token;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String info = "이름:홍길동, Java:100, HTML:80, Script:85";
		StringTokenizer tokens = new StringTokenizer(info, ": ,");
		System.out.println("총 토큰의 개수: " + tokens.countTokens());
		int sum = 0;
		while(tokens.hasMoreTokens()) {
			String token = null;
			try {
				token = tokens.nextToken();
				sum += Integer.parseInt(token);
			} catch (NumberFormatException e) {
				System.out.println("숫자 아님: " + token);
			}
		}
		System.out.println("총점: " + sum);
	}
}