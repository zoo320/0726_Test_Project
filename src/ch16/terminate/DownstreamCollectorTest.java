package ch16.terminate;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class DownstreamCollectorTest {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		// List를 Set 계열로 변경
		Map<String, Set<Locale>> toSet = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.groupingBy(locale -> {
			return locale.getLanguage();
		}, Collectors.toSet()));
		System.out.println(toSet);

		// 언어별 사용 국가 수로 변경
		Map<String, Long> counting = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.groupingBy(locale -> {
			return locale.getLanguage();
		}, Collectors.counting()));
		System.out.println(counting);

		// 가장 표시 이름이 큰 값만을 남겨둠
		Map<Object, Optional<Locale>> maxLocale = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.groupingBy(locale -> {
			return locale.getLanguage();
		}, Collectors.maxBy(
				(l1, l2) -> {
					return l1.getDisplayCountry().compareTo(l2.getDisplayCountry());
		})));
		System.out.println(maxLocale);

		// mapping을 이용해 이름으로 변경
		Map<String, Optional<String>> mapping = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.groupingBy(locale -> {
			return locale.getLanguage();
		}, Collectors.mapping(l -> l.getDisplayCountry(), Collectors.maxBy((n1, n2) -> {
			return n1.compareTo(n2) * -1;
		}))));
		System.out.println(mapping);

	}
}