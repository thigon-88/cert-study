package study.chapter11;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
	
	public static void main(String[] args) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy 'AND' hh:mm:SS Z");
		System.out.println(dt.format(ZonedDateTime.now()));
		System.out.println(dt.format(LocalDateTime.now()));
	}

}
