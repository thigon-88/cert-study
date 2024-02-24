package study.chapter5;

public class TestVariables {

	public static void main(String[] args) {
		final int rest;
		boolean test = false;
		if(true) {
			rest = 6;
		}
		
		System.out.println("Rest value: " + rest);
		//rest = 7;
	}
}
