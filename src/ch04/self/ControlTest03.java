package ch04.self;

public class ControlTest03 {
	public static void main(String[] args) {
		// TODO: 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오 .
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if ((i + j) == 6) {
					System.out.println(i + " : " + j);
				}
			}
		}
		// END://
	}
}
