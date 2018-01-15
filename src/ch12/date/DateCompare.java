package ch12.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCompare {

	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.now();
		LocalDateTime date2 = LocalDateTime.of(2000, 1, 1, 1, 1, 1);
		System.out.printf("date1: %s, date2: %s%n",date1,date2);
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.isEqual(date2));

		long pasted = date2.until(date1, ChronoUnit.YEARS);
		System.out.printf("date1는 date2으로부터 %d년 지났다." ,pasted);
	}
}