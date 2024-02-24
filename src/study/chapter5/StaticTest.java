package study.chapter5;

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(Animal.legs);
		Animal a1 = new Animal();
		System.out.println(a1.legs);
		Animal a2 = null;
		
	}
}


class Animal {
	public static int legs = 2;
}
