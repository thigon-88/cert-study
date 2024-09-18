package study.chapter07;

public sealed class SealedClassTest permits SealedExample {
	
}

final class SealedExample extends SealedClassTest {
	
}
