package ch11.number;

import java.math.BigInteger;

public class BigIntegerTest {
	public static void createAndConvert() {
		// long l1 = 12345678901234567890L; - long의 범위를 벗어나는 정수
		BigInteger bi = new BigInteger("12345678901234567890");
		System.out.println(bi.longValue()); // 값의 잘림
		try {
			System.out.println(bi.longValueExact());// 예외 처리
		} catch (Exception e) {
			System.out.println("범위를 벗어남");
		}
		System.out.println(bi.doubleValue());
	}

	public static void simpleOperation() {
		BigInteger b1 = new BigInteger("1234567890");
		BigInteger b2 = new BigInteger("9876543210");
		System.out.println("연산 결과: " + b2.subtract(b1));
		System.out.println("원판 불변: " + b2);
	}

	public static void main(String[] args) {
		createAndConvert();
		simpleOperation();
	}
}