package study.chapter10;

import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamTest {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, Set<String>> map = ohMy.collect(
				Collectors.groupingBy(
						String::length,
						TreeMap::new,
						Collectors.toSet()));
	}
}
