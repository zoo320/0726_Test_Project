package ch12.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class UseTemporalAdjuster {

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.of(2017, 1, 1, 1, 1, 1);
		System.out.println("기준일: "+datetime+"-"+datetime.getDayOfWeek());
		LocalDateTime lastDay = datetime.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("마지막일: "+lastDay+"-"+lastDay.getDayOfWeek());
		LocalDateTime prevWeekDay = datetime.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
		System.out.println("이전 일요일: "+prevWeekDay+"-"+prevWeekDay.getDayOfWeek());
		LocalDateTime nextWeekDay = datetime.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("다음 월요일: "+nextWeekDay+"-"+nextWeekDay.getDayOfWeek());
	}
}