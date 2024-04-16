package study.chapter7;

public sealed class SealedClassTest permits SealedExample {
	
}

final class SealedExample extends SealedClassTest {
	
}
