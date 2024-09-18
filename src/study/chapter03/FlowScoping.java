package study.chapter03;

public class FlowScoping {
	
	public static void main(String[] args) {
		Number n1 = Integer.valueOf(5);
		
		if(!(n1 instanceof Integer number)) {
			System.out.println("It's not a number");
		} else {
			System.out.println(number + " is an integer.");
		}
	}

}
