package etc.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalTest {

	public static void main(String[] args) {

		List<Object> list = Stream.of(Optional.empty(), Optional.of("one"), Optional.of("two"), Optional.of("three"))
				.flatMap(Optional::stream).collect(Collectors.toList());
		System.out.println(list);

		Optional<Integer> max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).max(Integer::compare);
		max.ifPresentOrElse(x -> System.out.println("최대값: " + x), () -> System.out.println("원하는 값이 없습니다."));
	}

}
