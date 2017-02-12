package ch03.arithmetic;

import java.math.BigDecimal;

public class FloatProblem {
	public static void main(String[] args) {
		float f1 = 2.0f;
		float f2 = 1.1f;
		System.out.println("float 연산 결과: " + (f1 - f2));
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println("double 연산 결과: " + (d1 - d2));

		BigDecimal d3 = new BigDecimal("2.0");
		BigDecimal d4 = new BigDecimal("1.1");
		System.out.println("BigDecimal을 이용한 빼기: " + d3.subtract(d4));

		BigDecimal d5 = new BigDecimal(2.0);
		BigDecimal d6 = new BigDecimal(1.1);
		System.out.println("BieDecimal을 이용한 빼기: " + d5.subtract(d6));
	}
}
