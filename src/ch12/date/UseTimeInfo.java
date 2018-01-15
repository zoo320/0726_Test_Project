package ch12.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class UseTimeInfo {

	public static void printDate(LocalDateTime now) {
		String date = now.getYear() + "/" + now.getMonthValue() + "/" + now.getDayOfMonth();
		String time = now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
		DayOfWeek day = now.getDayOfWeek();
		String dayDsipName = day.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		System.out.println(date + "(" + dayDsipName + ")" + time);
		Month month = now.getMonth();
		String monthDispName = month.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		System.out.println(monthDispName);
	}

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.of(2017, 1, 1, 12, 30, 30);
		printDate(now);
		LocalDateTime now2 = now.plusMonths(2).minusDays(5);// now 월+2, 일-5
		printDate(now2);
		LocalDateTime now3 = now.withMonth(5).withHour(0); // 기존 월 --> 5로 수정
		printDate(now3);
	}
}
