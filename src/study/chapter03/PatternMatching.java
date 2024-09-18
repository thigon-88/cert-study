package study.chapter03;

public class PatternMatching {
	
	public static void main(String[] args) {
		
		Number n1 = Integer.valueOf(7);
		
		if(n1 instanceof Integer) {
			Integer i1 = (Integer) n1;
			System.out.println("Conversao normal: " + i1);
		}
		
		if(n1 instanceof final Integer i1) {
			System.out.println("Conversao pattern matching: " + i1);
		}
		
		if(n1 instanceof Integer i1 && i1 > 5) {
			System.out.println("Numero maior que 5.");
		}
		
		Integer i2 = Integer.valueOf(10);
		
		if(i2 instanceof Integer) {
			System.out.println("Esse objeto é um number");
		}
		
		if(i2 instanceof Integer i3) { // o compilador java dá erro aqui
			System.out.println("Teste");
		}
	}
	

}
