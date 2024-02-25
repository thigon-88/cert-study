package study.chapter6;

public class AccessModifierTest {
	public int getNumberOfHumps() {
		return 1;
	}

}

class BactrianCamel extends AccessModifierTest {
	/*
	 * private int getNumberOfHumps() { //DOES NOT COMPILE return 2; }
	 */
}
