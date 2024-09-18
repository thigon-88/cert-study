package study.chapter10;

import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorTest {
	
	public static void main(String[] args) {
		var stream = Stream.of("bird-", "bunny-", "cat-", 
				"dog-", "fish-", "lamb-", "mouse-");
		
		Spliterator<String> originalBagOfFood = stream.spliterator();
		//originalBagOfFood.forEachRemaining(System.out::print);
		Spliterator<String> emmasBag = originalBagOfFood.trySplit();
		emmasBag.forEachRemaining(System.out::print);
		
		Spliterator<String> jillsBag = originalBagOfFood.trySplit();
		jillsBag.tryAdvance(System.out::print);
		jillsBag.forEachRemaining(System.out::print);
		
		originalBagOfFood.forEachRemaining(System.out::print);
	}

}
