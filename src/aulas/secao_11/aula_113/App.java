package aulas.secao_11.aula_113;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("d04 = "+ d04);
		System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),
													 d04.atStartOfDay());
		System.out.println("t1 dias = "+ t1.toDays());
		
		System.out.println("============================================");
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("d05 = "+ d05);
		System.out.println("pastWeekLocalDateTime = "+ pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("t2 dias = "+ t2.toDays());
		
		System.out.println("============================================");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("d06 = "+ d06);
		System.out.println("pastWeekInstant = "+ pastWeekInstant);
		System.out.println("nextWeekInstant = "+ nextWeekInstant);
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("t3 dias = "+ t3.toDays());
		
		
		
		
	}

}
