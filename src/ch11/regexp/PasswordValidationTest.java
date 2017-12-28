package ch11.regexp;

import java.util.regex.Pattern;

public class PasswordValidationTest {

	public static void main(String[] args) {
		String[] passwords = {
				"abcde한글124",
				"abc!12",
				"abcdefghij",
				"abcdef!@",
				"abc123!@#"
		};

		for (String password : passwords) {
			String lenReg = "[a-zA-Z0-9!@#$%]{8,}";
			String engReg = "[a-zA-Z]";
			String numReg = "[0-9]";
			String specReg = "[!@#$%]";
			System.out.print(password+"는 ");
			int has = 0;
			if (Pattern.matches(lenReg, password)) {
				has += Pattern.compile(engReg).matcher(password).find() ? 1 : 0;
				has += Pattern.compile(numReg).matcher(password).find() ? 1 : 0;
				has += Pattern.compile(specReg).matcher(password).find() ? 1 : 0;
				if (has < 2) {
					System.out.println("영문, 숫자, 특수문자 중 두 가지 이상이 조합되어야 합니다.");
				} else {
					System.out.println("적합한 패스워드 입니다.");
				}
			} else {
				System.out.println("영문, 숫자, 특수문자로 8자 이상이어야 합니다.");
			}
		}
	}
}