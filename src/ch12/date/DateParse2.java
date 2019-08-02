package ch12.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateParse2 {
	public static void main(String[] args) {
		String sDate = "2015-01-01";
		LocalDate lDate = LocalDate.parse(sDate);
		System.out.println("ISO_LOCAL_DATE 형태 : " + lDate);

		String sDate2 = "2015-01-01(목)";
		DateTimeFormatter dformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
		LocalDate lDate2 = LocalDate.parse(sDate2, dformatter);
		System.out.println("사용자 정의 형태(날짜) : " + lDate2);

		String sTime = "03:30:30";
		LocalTime lTime = LocalTime.parse(sTime);
		System.out.println("ISO_LOCAL_TIME 형태 : " + lTime);

		String sTime2 = "03:30:30 오후";
		DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("KK:mm:ss a");
		LocalTime lTime2 = LocalTime.parse(sTime2, tformatter);
		System.out.println("사용자 정의 형태(시간) : " + lTime2);

		String sTime3 = "03:30:30 PM";
		DateTimeFormatter tformatter2 = DateTimeFormatter.ofPattern("KK:mm:ss a", Locale.ENGLISH);
		LocalTime lTime3 = LocalTime.parse(sTime3, tformatter2);
		System.out.println("사용자 정의 형태(시간_로케일) : "+lTime3);

		String sDateTime = "2015-01-01T11:20:30";
		LocalDateTime ldt = LocalDateTime.parse(sDateTime);
		System.out.println("ISO_LOCAL_DATE_TIME 형태: " + ldt);
		
		String sDateTime2 = "2015년 01월 01일(목요일) 오후 03시 30분";
		DateTimeFormatter tformatter3 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일(EEEE) a KK시 mm분");
		LocalDateTime ldt2 = LocalDateTime.parse(sDateTime2, tformatter3);
		System.out.println("사용자 정의 형태(날짜_시간) : " + ldt2);
	}
}