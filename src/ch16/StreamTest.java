package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		StreamTest st = new StreamTest();
		st.oldStyle();
		st.streamStyle();
	}

	public void oldStyle() {
		List<String> heroes = Arrays.asList("아이언맨", "스파이더맨", "헐크", "토르");
		List<String> sub = new ArrayList<>();
		for (String hero : heroes) {
			if (hero.length() > 3) {
				sub.add(hero);
			}
		}
		for (String hero : sub) {
			System.out.println(hero);
		}
	}

	public void streamStyle() {
		List<String> heroes = Arrays.asList("아이언맨", "스파이더맨", "헐크", "토르");
		Stream<String> stream = heroes.stream();
		stream.filter(hero -> {
			return hero.length() > 3;
		}).forEach(System.out::println);
	}
}