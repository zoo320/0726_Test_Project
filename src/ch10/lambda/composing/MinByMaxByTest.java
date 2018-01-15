package ch10.lambda.composing;

import java.util.function.BinaryOperator;

public class MinByMaxByTest {

	public static void main(String[] args) {
		BinaryOperator<String> bo = BinaryOperator.minBy((o1, o2) -> {
			return o1.compareTo(o2);
		});
		System.out.println(bo.apply("Hello", "Hi"));
		BinaryOperator<Integer> bo2 = BinaryOperator.maxBy((i1, i2) -> {
			return i1.compareTo(i2);
		});
		System.out.println(bo2.apply(10, 5));
	}
}
