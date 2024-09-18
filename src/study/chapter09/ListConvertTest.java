package study.chapter09;

import java.util.List;

public class ListConvertTest {
	
	public static void main(String[] args) {
		List<String> list = List.of("hawk", "robin", "batman", "superman");
		Object[] objectArray = list.toArray();
		String[] stringArray = list.toArray(new String[0]);
		String[] stringArray1 = list.toArray(new String[5]);
		
		System.out.println(objectArray.length);
		System.out.println(stringArray.length);
		System.out.println(stringArray1.length);
		readArray(stringArray);
		readArray(stringArray1);
	}

	private static void readArray(String[] array) {
		for(String e : array) {
			System.out.println(e);
		}
	}
}
