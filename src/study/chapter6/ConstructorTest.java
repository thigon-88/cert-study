package study.chapter6;

public class ConstructorTest {
	
	public ConstructorTest() {
		this(6); //the compile identifies the recursive call
	}
	
	public ConstructorTest(int test) {
		//this();
	}

	public static void main(String[] args) {
		
	}
}
