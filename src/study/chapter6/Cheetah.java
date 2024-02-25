package study.chapter6;

class Speedster {
	int numSpots;
	static StringBuilder sb;
}

public class Cheetah extends Speedster {
	
	int numSpots;
	static  {
		sb.append("q");
	}
	
	
	public Cheetah(int numSpots) {
		super.numSpots = numSpots;
	}
	
	public static void main(String[] args) {
		Speedster s = new Cheetah(50);
		System.out.println(s.numSpots);
	}

}
