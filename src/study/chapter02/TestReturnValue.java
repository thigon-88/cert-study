package study.chapter02;

public class TestReturnValue {
	
	public static void main(String[] args) {
		//return value
		long wolf = 5;
		long coyote = (wolf=3);
		System.out.println(wolf);
		System.out.println(coyote);
		
		String test = null;
		if(test instanceof String) {
			System.out.println("It's String");
		} else {
			System.out.println("Null variable");
		}
	}

}
