package ch11.date;

import java.util.Calendar;

public class CalendarTest {

	public static String getDateString(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);// 0:일요일 ~ 6:토요일
		String dayOfWeekStr = null;
		if (dayOfWeek == Calendar.SUNDAY) {
			dayOfWeekStr = "일";
		} else if (dayOfWeek == Calendar.MONDAY) {
			dayOfWeekStr = "월";
		} else if (dayOfWeek == Calendar.TUESDAY) {
			dayOfWeekStr = "화";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			dayOfWeekStr = "수";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			dayOfWeekStr = "목";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			dayOfWeekStr = "금";
		} else {
			dayOfWeekStr = "토";
		}
		return String.format("%d년 %d월 %d일(%s)", year, month, date, dayOfWeekStr);
	}

	public static String getTimeString(Calendar c) {
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int amPm = c.get(Calendar.AM_PM);
		String amPmString = (amPm == Calendar.AM ? "오전" : "오후");
		return String.format("%d시 %d분 %d초(%s)", hour, minute, second, amPmString);


	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("오늘은: " + getDateString(cal));
		System.out.println("지금은 " + getTimeString(cal));
		cal.set(Calendar.YEAR, 2002);
		System.out.println("오늘은: " + getDateString(cal));
	}
}
