package ch03.arithmetic;

public class FloatProblem {
	public static void main(String[] args) {
		float f1 = 2.0f;
		float f2 = 1.1f;
		System.out.println("float 연산 결과: " + (f1 - f2));

		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println("double 연산 결과: " + (d1 - d2));
		
		int i1 = (int)(d1 * 10);
		int i2 = (int)(d2 * 10);
		double result = (i1 - i2)/10.0;
		System.out.println("변환 후 처리: " + result);  // 0.9
	}
}