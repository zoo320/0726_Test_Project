package ch16.terminate;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingTest {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();

		Map<String, List<Locale>> langNames2 = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.groupingBy(locale -> {
			return locale.getLanguage();
		}));
		System.out.println("중국어가 사용되는 나라는?");
		langNames2.get("zh").stream().forEach(locale -> {
			System.out.print("["+locale.getDisplayCountry()+"]");
		});
	
		Map<Boolean, List<Locale>> langNames3 = Arrays.stream(locales).filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		}).collect(Collectors.partitioningBy(locale -> {
			return locale.getLanguage().equals("en");
		}));
		System.out.println("\n비 영어권 국가의 수는?");
		System.out.println(langNames3.get(false).stream().count()+"개국");
	}
}
/*
Locale[] locales = Locale.getAvailableLocales();

Map<String, String> langNames = Arrays.stream(locales)
		.filter(locale -> {
			return locale.getDisplayCountry().trim().length() > 0;
		})
		.collect(
				Collectors.toMap(
						locale -> {
							return locale.getDisplayCountry() + "(" + locale.getCountry() + ")";
						},
						locale -> {
							return locale.getDisplayLanguage() + "(" + locale.getLanguage() + ")";
						},
						(oldOne, newOne) -> {
							return newOne;
						}));
System.out.println(langNames);
*/