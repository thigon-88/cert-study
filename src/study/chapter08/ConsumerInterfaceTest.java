package study.chapter08;

import java.util.function.Consumer;

public class ConsumerInterfaceTest {
	
	public static void main(String[] args) {
		Consumer<String> con = System.out::println;
		con.accept("Innovative");
	}

}
