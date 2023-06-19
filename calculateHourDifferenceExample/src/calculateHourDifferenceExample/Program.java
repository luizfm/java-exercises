package calculateHourDifferenceExample;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2020-06-30");
		LocalDateTime d02 = LocalDateTime.parse("2020-06-30T01:20:00");
		Instant d03 = Instant.parse("2020-06-30T01:20:00Z");
		
		LocalDate pastWeek = d01.minusDays(7);
		LocalDate nextWeek = d01.plusDays(7);
		
		System.out.println("past week: " + pastWeek);
		System.out.println("next week: " + nextWeek);
		
		LocalDateTime pastWeekDateTime = d02.minusDays(7);
		LocalDateTime nextWeekDateTime = d02.plusDays(7);
		
		System.out.println("pastWeekDateTime: " + pastWeekDateTime);
		System.out.println("nextWeekDateTime: " + nextWeekDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDateTime, d02);
		Duration t2 = Duration.between(pastWeek.atStartOfDay(), d01.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d03);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
	}

}
