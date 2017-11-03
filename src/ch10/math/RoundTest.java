package ch10.math;

public class RoundTest {
	public static void main(String[] args) {
		// 소숫점 둘째 자리에서 반올림하시오.
		double source=10.45;
		double num = source * 10;
		long rounded = Math.round(num);
		System.out.println("최종: "+(rounded / 10.0));
	}
}
