package ch12.number;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1-d2);
		
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));

		BigDecimal bd3 = new BigDecimal(2.0);
		BigDecimal bd4 = new BigDecimal(1.1);
		System.out.println(bd3.subtract(bd4));
	}
}