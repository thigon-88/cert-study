package study.chapter8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceTest {
	
	public static void main(String[] args) {
		Supplier<LocalDateTime> s1 = LocalDateTime::now;
		System.out.println(s1.get());
	}

}
