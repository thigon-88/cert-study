package study.chapter4;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] animals;
		int [] animals1;
		int []animals2;
		int animals3[];
		int animals4 [];
		
		int[] ids, types;
		ids = new int[3];
		types = new int[2];
		
		int ids1[], types1;
		ids1 = new int[1];
		//types1 = new int[2]; //it's possible to declare 2 variables of different types.
		
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		objects[0] = new StringBuilder();
		
	}

}
