package study.chapter06;

public class Second extends First {
	
	private static int ver;
	
	public Second() {
		System.out.println("Second class constructor");
	}
	
	static {
		System.out.println("Initializing Second");
	}
	
	{
		System.out.println("Instance Initializer Second");
	}

}
