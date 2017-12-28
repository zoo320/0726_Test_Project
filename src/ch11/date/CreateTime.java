package ch11.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CreateTime {

	public static void main(String[] args) {
		localDate();
		localTime();
		etc();
	}

	private static void localDate() {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date2 = LocalDate.of(2015, 01, 01);
		System.out.println(date2);
	}

	private static void localTime() {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalTime time2 = LocalTime.of(13, 40, 23);
		System.out.println(time2);
	}

	private static void etc() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		ZonedDateTime zdt = ZonedDateTime.of(dt, ZoneId.of("Asia/Seoul"));
		System.out.println(zdt);
	}
}