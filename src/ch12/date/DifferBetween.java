package ch12.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferBetween {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2000, 1, 3);
		LocalDate date2 = LocalDate.of(2017, 5, 1);

		Period period = Period.between(date1, date2);
		System.out.println(period);// Period에는 두 날짜의 차이가 저장됨
		System.out.println("몇 년 차이? " + period.getYears()); // 년 간의 차이
		System.out.println("몇 월 차이? " + period.get(ChronoUnit.MONTHS));// 월 간의 차이
		System.out.println("몇 일 차이? " + period.get(ChronoUnit.DAYS));// 일 간의 차이	
		
		long monthDiff = ChronoUnit.MONTHS.between(date1, date2);
		System.out.println("몇 개월 차이? "+monthDiff);// 총 개월의 차이
		
		LocalDateTime dt1 = LocalDateTime.of(2016,1,1,1,1,1);
		LocalDateTime dt2 = LocalDateTime.of(2017,1,1,1,1,1);
		Duration duration = Duration.between(dt1, dt2);
		System.out.println(duration);
		System.out.println("몇 초 차이? "+duration.getSeconds());		
		long secDiff = ChronoUnit.SECONDS.between(dt1, dt2); // 총 초의 차이
		System.out.println("몇 초 차이? "+secDiff);// 총 초의 차이
		long hourDiff = ChronoUnit.HOURS.between(dt1, dt2);
		System.out.println("몇 시간 차이? "+hourDiff);
	}
}