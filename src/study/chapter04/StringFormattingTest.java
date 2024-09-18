package study.chapter04;

public class StringFormattingTest {
	
	public static void main(String[] args) {
		double pi = Math.PI;

		System.out.println("PI Format: [%f]".formatted(pi));
		System.out.println("PI format: [%12f]".formatted(pi));
		System.out.println("PI format: [%12.2f]".formatted(pi));
		System.out.println("PI format: [%012.2f]".formatted(pi));
		System.out.println("PI format: [%.3f]".formatted(pi));
	}

}
