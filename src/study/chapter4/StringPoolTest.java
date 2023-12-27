package study.chapter4;

public class StringPoolTest {

	public static void main(String[] args) {
		String first = "First";
		String first1 = new String("First");
		System.out.println(first == first1);
		
		String second = "Second";
		String second1 = new String("Second").intern();
		System.out.println(second == second1);
		
		String third = "Third";
		String third1 = "Third";
		System.out.println(third == third1);
		System.out.println("--------\n");
		
		String a = "rat" + 1;
		String b = "r" + "a" + "t" + "1";
		String c = "r" + "a" + "t" + new String("1");
		System.out.println(a == b);
		System.out.println(a == b.intern());
		System.out.println(a == c); //false
		System.out.println(a == c.intern());
	}
}
