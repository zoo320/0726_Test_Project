package ch14.status;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GuGuDanGame1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("게임을 시작합니다.");
			long start = System.currentTimeMillis();
			Question question = new Question();
			System.out.println(question.printQuestion());
			String input = scanner.nextLine();

			if (input.equals("x")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (Pattern.matches("[0-9]*", input)) {
				int answer = Integer.parseInt(input);
				long end = System.currentTimeMillis();
				question.setResult(answer, end - start);
				System.out.println(question);
			} else {
				System.out.println("부적절한 답안");
			}
		}
	}
}