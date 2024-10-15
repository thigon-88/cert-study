package study.chapter11;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;
import java.util.stream.Stream;

public class CompactNumberFormatTest {

	public static void main(String[] args) {
		var testLocale = new Locale.Builder().setRegion("us").build();
		var formatters = Stream.of(
			NumberFormat.getCompactNumberInstance(),
			NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
			NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
			NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
			NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
			NumberFormat.getCompactNumberInstance(testLocale, Style.LONG),
			NumberFormat.getInstance()
		);
		
		formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);
	}
}
