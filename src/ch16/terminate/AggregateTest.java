package ch16.terminate;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class AggregateTest {

	public static void main(String[] args) {
		IntStream is = new Random().ints(10, 1, 6);
		System.out.println("총합은: " + is.sum());

		String[] strs = { "Hi", "C", "Java", "zoo", "World" };
		Optional<String> max = Arrays.stream(strs).max(String::compareTo);
		max.ifPresent(val -> {
			System.out.println("최대값은: " + val);
		});

		String result = max.filter(val -> {
			return val.matches("[가-힣]{1,}");
		}).orElse("한글 중에는 없다.");
		System.out.println(result);

	}
}