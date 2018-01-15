package ch11.math;

public class MathTest {

	public static void main(String[] args) {
		System.out.printf("절대값: %f%n", Math.abs(-10.1));
		System.out.printf("올림: %f, %f%n",Math.ceil(10.1), Math.ceil(-10.1));
		System.out.printf("내림: %f, %f%n",Math.floor(10.1), Math.floor(-10.1));
		System.out.printf("최대 값: %d%n", Math.max(100, 200));
		System.out.printf("삼각함수: %f%n", Math.sin(Math.toRadians(30)));
	}
}