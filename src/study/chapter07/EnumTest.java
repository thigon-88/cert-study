package study.chapter07;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(Season.WINTER);
		System.out.println(Season.WINTER.ordinal());
		System.out.println(Season.WINTER.name());
	}
}

enum Season {
	WINTER, SPRING, SUMMER, FALL
}