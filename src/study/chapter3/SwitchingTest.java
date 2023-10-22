package study.chapter3;

public class SwitchingTest {
	
	public static void main(String[] args) {
		
		int n1 = 6;
		
		switch(n1) {
			case 5: 
			case 6: System.out.println("Number is 5 or greater"); break;
		}
		
		//SINCE JAVA 14
		switch(n1) {
			case 5, 6: System.out.println("Number is 5 or greater"); break;
		}
	}
}
