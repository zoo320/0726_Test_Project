package ch11.date;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 0);
		System.out.printf("지금은 %d월이다.", cal.get(Calendar.MONTH)+1);
	}

}
