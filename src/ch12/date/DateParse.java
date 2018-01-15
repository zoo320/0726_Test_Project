package ch12.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateParse {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2007, 2, 5, 1, 11, 0);
		System.out.printf("기본 날짜 출력: %s%n", date);
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(date.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		String isoLocalDateTime = "2007-02-05T01:11";
		System.out.println(isoLocalDateTime);
		LocalDateTime parsed = LocalDateTime.parse(isoLocalDateTime);
		System.out.printf("복원된 값: %s",parsed);
	}
}