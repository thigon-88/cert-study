package study.chapter06;

public class First {
	
	public First() {
		System.out.println("First class constructor");
	}
	
	static {
		System.out.println("Initializing First");
	}
	
	{
		System.out.println("Instance Initializer First");
	}

}
