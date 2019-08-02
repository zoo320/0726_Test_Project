package ch04.condition;

import java.util.Scanner;

public class IfElseIfTest {
	public static void main(String[] args) {
		System.out.println("32 ~ 126 사이의 정수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int scanned = scanner.nextInt();
		String type = null;
		if (scanned >= 48 && scanned < 58) {
			type = "숫자";
		} else if (scanned >= 66 && scanned < 91) {
			type = "대문자";
		} else if (scanned >= 97 && scanned < 123) {
			type = "소문자";
		} else {
			type = "기타 타입";
		}
		System.out.printf("숫자 %d는 문자로 %c이고 %s입니다.", scanned, scanned, type);
		scanner.close();
	}

}