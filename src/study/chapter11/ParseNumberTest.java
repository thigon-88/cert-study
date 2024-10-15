package study.chapter11;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseNumberTest {

	public static void main(String[] args) throws ParseException {
		var nb = NumberFormat.getCurrencyInstance(Locale.US);
		String income = "$92,807.99";
		double value = (Double) nb.parse(income);
		
	}
}
