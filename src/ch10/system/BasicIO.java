package ch10.system;

import java.util.Scanner;

public class BasicIO {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String str = scanner.nextLine();
			System.out.println("일반 출력: " + str);
			System.err.println("오류 출력: " + str);
		}
	}
}