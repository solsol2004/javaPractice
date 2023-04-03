package com.multi.ex05.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// 날씨 관련 Library
public class DateTest {
	
	public static void main(String[] args) {
		// Date - java 1.0부터 날짜 Type으로 활용
		Date date = new Date();
		System.out.println(date); // 오늘 날짜 출력
		System.out.println(date.getTime()); // 1970년부터 현재까지 흐른 millisecond 단위 
		System.out.println(System.currentTimeMillis()); // 위 같은 시간 출력
//		1679644180652 = 1970년부터 현재까지 흐른 millisecond 단위 
		
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(date2);
		
		
		//Date format 바꾸는 방법
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf1.format(new Date()));
		System.out.println(sdf2.format(new Date()));
		
		// Calendar : Date를 개선한 Library
				// 특징 : 자체 생성이 불가능!! 
//				Calendar cal = new Calendar(); // 추상클래스라 생성 불가!
				Calendar cal = Calendar.getInstance(); // 대신 생성해주는 메소드 호출
//				System.out.println(cal.toString().replace(",", ",\n"));
				
				System.out.println(cal.get(Calendar.YEAR));
				System.out.println(cal.get(Calendar.MONTH) + 1); // +1
				System.out.println(cal.get(Calendar.DATE));
				System.out.println(cal.get(Calendar.AM_PM));
				System.out.println(cal.get(Calendar.HOUR));
				System.out.println(cal.get(Calendar.MINUTE));
				System.out.println(cal.get(Calendar.SECOND));
				
				String dateStr = sdf1.format(cal.getTimeInMillis());
//				String dateStr = sdf1.format(cal.getTime());
				System.out.println(dateStr);
				
				// 날짜를 지정하는 방법 : GregorianCalendar를 권장
				GregorianCalendar gc = new GregorianCalendar(2001,6-1,10);
				System.out.println(sdf1.format(gc.getTime()));
				
				// 날짜간 비교
				System.out.println(gc.after(cal));
				System.out.println(cal.before(gc));
				
				// 날짜간 연산
				System.out.println(cal.getTimeInMillis() - gc.getTimeInMillis());
				System.out.println(new Date(cal.getTimeInMillis() - gc.getTimeInMillis()));
				System.out.println("----------------------------------------");
		
				
				// Java8 이후 추가된 java.time
				// 기존 Date, Calendar 체계보다 성능적으로나 활용적으로 더 좋은 Joda-Time을 내장시킴 ★★★★★
				LocalDate localDate = LocalDate.now(); // 날짜
				LocalTime localTime = LocalTime.now(); // 시간
				LocalDateTime localDateTile = LocalDateTime.now(); // 날짜 시간
				System.out.println(localDate);
				System.out.println(localTime);
				System.out.println(localDateTile);
		
				// 연원일시분까지 다루는 방법
				LocalDateTime birthDay = LocalDateTime.of(1996, 03, 24, 12, 0);
				System.out.println(birthDay);
				System.out.println(birthDay.format(DateTimeFormatter.ISO_DATE_TIME));
				System.out.println(birthDay.format(DateTimeFormatter.ISO_DATE));
				System.out.println(birthDay.format(DateTimeFormatter.ISO_TIME));
				System.out.println(birthDay.format(DateTimeFormatter.ISO_WEEK_DATE)); // 주단위
				
				// Zone				
				ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("Asia/Seoul"));
				System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
				System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
				System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
				System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
				System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
				
				
				// 날짜 연산
				LocalDate dateTime1 = LocalDate.of(2023, 03, 13);
				LocalDate dateTime2 = LocalDate.now();
				System.out.println(dateTime1.isAfter(dateTime2));
				System.out.println(dateTime2.isAfter(dateTime1));
				Period period = Period.between(dateTime1, dateTime2);
				System.out.println(period.getDays());
				System.out.println(dateTime1.plusDays(5));
				System.out.println(dateTime1.minusDays(5));
				System.out.println(dateTime1.plusWeeks(1));
				System.out.println(dateTime1.minusWeeks(1));
				System.out.println(dateTime1.plusMonths(5));
				System.out.println(dateTime1.minusMonths(5));
				

				
				
	}
}
