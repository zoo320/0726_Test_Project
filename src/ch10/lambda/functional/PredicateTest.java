package ch10.lambda.functional;

import java.util.function.IntPredicate;

public class PredicateTest {
	static int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	public static void printSome(IntPredicate pred) {
		for (int num : nums) {
			if (pred.test(num)) {
				System.out.print(num + "\t");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printSome((num) -> {
			return num % 3 == 0;
		});
		printSome(num -> num > 5);
	}
}