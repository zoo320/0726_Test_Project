package ch09.exception.logging;

public class LoggingVsPring {
	public void printAddResult(int a, int b) {
		System.out.printf("파라미터 확인: %d, %d%n",a, b);	// 로깅
		int result = a + b;
		System.out.printf("%d + %d = %d", a, b, result);	// 정보 출력
	}
	public static void main(String[] args) {
		LoggingVsPring lvp = new LoggingVsPring();
		lvp.printAddResult(1, 2);
	}

}
