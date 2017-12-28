package ch16.terminate;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregateCollectorTest {

	public static void main(String[] args) {
		long cnt = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.counting());
		System.out.println("counting: " + cnt);

		long sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.summingInt(n -> {
					return n;
				}));
		System.out.println("summing: " + sum);

		double avg = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.averagingInt(n -> {
					return n;
				}));
		System.out.println("avg: " + avg);

		Optional<Integer> maxBy = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.maxBy((a, b) -> {
					return a == b ? 0 : (a > b ? 1 : -1);
				}));
		maxBy.ifPresent(val -> {
			System.out.println("maxBy: " + val);
		});

		Optional<Integer> minBy = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.maxBy((a, b) -> {
					return a == b ? 0 : (a > b ? -1 : 1);
				}));
		minBy.ifPresent(val -> {
			System.out.println("minBy: " + val);
		});

		Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.collect(Collectors.reducing((a, b) -> {
					return a * b;
				}));
		reduce.ifPresent(val -> {
			System.out.println("reduce: " + val);
		});
	}
}