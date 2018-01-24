package ch11.math;

public class ExactCalcTest {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		int i2 = i + 1;
		System.out.println(i2);
		try {
			int i3 = Math.addExact(i, 1);
			System.out.println(i3);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}