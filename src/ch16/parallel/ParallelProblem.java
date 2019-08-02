package ch16.parallel;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ParallelProblem {
	private static void testCount(String type, IntStream ints) {
		Map<String, Integer> dataMap = new HashMap<>();
		dataMap.put("counter", 0);
		int sum = ints.filter(num -> {
			int i = dataMap.get("counter");
			dataMap.put("counter", i + 1);
			return num % 2 == 0;
		}).sum();
		System.out.println(type + "- 합:" + sum + ", 카운터: " + dataMap.get("counter"));
	}

	public static void main(String[] args) {
		testCount("순차", IntStream.range(0, 1000));
		testCount("병렬", IntStream.range(0, 1000).parallel());
	}
}