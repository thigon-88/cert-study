package study.chapter07;

import java.util.Objects;

public record RecordExample(String first, String second) {

	
	/*
	 * public RecordExample(String first, String second) { // long constructor,
	 * needs to assign fields this.first = first; this.second = second; }
	 */
	 
	
	public RecordExample {
		//compact constructor, fields are assigned automatically
		if(Objects.nonNull(first)) {
			System.out.println("OK!");
		}
		
	}
}
