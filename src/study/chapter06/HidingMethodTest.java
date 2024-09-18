package study.chapter06;

public class HidingMethodTest {
	
	public static String test() {
		System.out.println("Test");
		return "Test";
	}

}

class SecondClass extends HidingMethodTest {
	
	public static String test() {
		return "Test";
	}
	
}
