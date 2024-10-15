package study.chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Locale.Category;

public class LocalizedDateTest {

	public static void main(String[] args) {
		Locale.setDefault(Category.DISPLAY, new Locale("pt"));
		LocalDateTime ldt = LocalDateTime.now().minusDays(1);
		var formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
		System.out.println("Date and time " + formatter.format(ldt)
		 + " with locale " + formatter.withLocale(Locale.US).format(ldt));
	}
}
