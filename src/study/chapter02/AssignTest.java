package study.chapter02;

public class AssignTest {
	
	public static void main(String[] args) {
		long fst = 30493049303845L; //the L is necessary for the literal to be recognized as long
		long scd = 3 + fst;
		//long reptile = (long)30493049303845; // the casting doesn't work here because the value is
		//interpreted as an int by the compiler and is out of range. If it were in range, it would 
		//work.
		
		System.out.println(2147483647 + 1); // The first number is the last integer representation.
		//So the sum returns the lowest negative.
		
		short one = 10;
		short two = 20;
		//short three = one + two; //both numbers are promoted to int before any arithmetic operator.
		
		long goat = 10;
		int sheep = 5;
		//sheep = sheep * goat; //wrong because the arithmetic operation would return an int. We need
		//to cast it.
		sheep *= goat; //the cast occurs automatically
		
		int sample3 = 5 * (1 % 2);
		System.out.println(sample3);
	}

}
