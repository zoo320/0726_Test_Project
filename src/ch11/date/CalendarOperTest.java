package ch11.date;

import java.util.Calendar;

public class CalendarOperTest {
	public static String printSimpleCalendar(Calendar c) {
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		return String.format("%d월 %d일", month, date);
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 29);
		System.out.println("최초: "+printSimpleCalendar(cal));
		cal.add(Calendar.DATE, 20);
		System.out.println("20일 add 후: "+printSimpleCalendar(cal));
		cal.roll(Calendar.DATE, -20);
		System.out.println("-20일 roll 후: "+printSimpleCalendar(cal));
	}

}
