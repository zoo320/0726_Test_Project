package ch11.system;

import java.util.Scanner;

class Dummy {
	public Dummy() {
		System.out.println("dummy 객체 생성됨");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("dummy 객체 소멸됨");
	}
}

public class ProcessManageTest {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("명령을 입력하세요: C, G, X");
				String readLine = scanner.nextLine();
				if(readLine.equals("C")) {
					new Dummy();
				}else if(readLine.equals("G")) {
					System.gc();
				}else if(readLine.equals("X")) {
					System.exit(0);
				}
			}
		}
	}
}
