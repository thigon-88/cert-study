package study.chapter07;

public record RecordTransformationExample(int one, String two) {
	
	public RecordTransformationExample {
		one = 1;
		//this.one = 2; // this doesn't compile
	}
	
	@Override
	public int one() {
		return 1;
	}

}
