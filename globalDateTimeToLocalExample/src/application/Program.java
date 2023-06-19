package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2020-06-30");
		LocalDateTime d02 = LocalDateTime.parse("2020-06-30T01:20:00");
		Instant d03 = Instant.parse("2020-06-30T01:20:00Z");
		
		LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime d06 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime d07 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		
		System.out.println(d01.getDayOfMonth());
		System.out.println(d01.getMonthValue());
		System.out.println(d01.getYear());
		
		System.out.println(d02.getHour());
		System.out.println(d02.getMinute());
;	}

}
