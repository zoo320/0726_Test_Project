package ch03.arithmetic;

public class ArithmeticOperatorTest {

	public static void main(String[] args) {
		// 나누기와 나머지 연산의 차이
		System.out.println(10 / 3); // 3
		System.out.println(10 % 3); // 1

		// 연산시의 형변 환 int 이하의 피연산자 끼리의 연산은 최소 단위가 int
		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1 + b1;
		// Type mismatch: cannot convert from int to byte

		// 연산시의 형 변환 - int 이상의 피 연산자 타입으로 형 변환
		int i1 = 100;
		long l1 = 200;
		// int i2 = i1 + l1;
		// Type mismatch: cannot convert from long to int

		System.out.println(10 / 3);
		System.out.println(10 / 3.0);

	}

}
