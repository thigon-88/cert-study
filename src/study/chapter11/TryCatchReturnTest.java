package study.chapter11;

public class TryCatchReturnTest {

	public static void main(String[] args) {
		int result = goHome();
		System.out.println("Result: " + result);
	}
	
	private static int goHome() {
		try {
			System.out.println(-1);
			return -1;
		} catch(Exception e) {
			System.out.println(-2);
			return -2;
		} finally {
			System.out.println(-3);
			return -3;
		}
	}
}
