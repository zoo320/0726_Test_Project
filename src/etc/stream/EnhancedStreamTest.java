package etc.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EnhancedStreamTest {

	public static void main(String[] args) {
		IntStream.iterate(1, i -> i < 20, i -> i * 2).forEach(System.out::println);
		// 1, 2, 4, 8, 16

		// for ordered Stream
		Stream.of(1, 2, 3, 4, 5, 6).takeWhile(i -> i <= 3).forEach(System.out::println);
		// 1, 2, 3,
		Stream.of(1, 6, 5, 2, 3, 4).takeWhile(i -> i <= 3).forEach(System.out::println);
		// 1

		// for ordered Stream
		Stream.of(1, 2, 3, 4, 5, 6).dropWhile(i -> i <= 3).forEach(System.out::println);
		// 4, 5, 6

		// for unordered Stream
		Stream.of(1, 6, 5, 2, 3, 4).dropWhile(i -> i <= 3).forEach(System.out::println);
		// 6, 5, 2, 3, 4

		Map<Integer, String> mapNumber = new HashMap<>();
		mapNumber.put(1, "One");
		mapNumber.put(2, "Two");
		mapNumber.put(null, null);

		List<String> newstringNumbers = Stream.of(null, 1, 2, 3).flatMap(s -> Stream.ofNullable(mapNumber.get(s)))
				.collect(Collectors.toList());

		System.out.println(newstringNumbers);// [One, Two]
	}
}