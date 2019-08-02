package ch12.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class GetCalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass().getName()); // java.util.GregorianCalendar
		TimeZone newYorkTZ = TimeZone.getTimeZone("America/New_York");
		Calendar calNewYork = Calendar.getInstance(newYorkTZ);
		int gap = (cal.get(Calendar.HOUR_OF_DAY) - calNewYork.get(Calendar.HOUR_OF_DAY));
		System.out.printf("서울은 뉴욕보다 %d시간 빠르다.%n", gap);

		Calendar buddhistCal = Calendar.getInstance(new Locale("th", "TH"));
		System.out.println(buddhistCal.getClass().getName()); // sun.util.BuddhistCalendar
	}
	
	public void printTimeZone() {
		String [] tzs = TimeZone.getAvailableIDs();
		for(String tz: tzs) {
			System.out.println(tz);
		}
	}
	public static void printLocale() {
		Locale [] locales = Locale.getAvailableLocales();
		for(Locale l: locales) {
			System.out.println(l.getLanguage()+"_"+l.getCountry());
		}
	}

}
