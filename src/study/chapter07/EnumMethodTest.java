package study.chapter07;

public class EnumMethodTest {

}

enum Season1 {
	WINTER {
		public String print() {
			return "";
		}
	}, SPRING {
		public String print() {
			return "";
		}
	}, SUMMER {
		public String print() {
			return "";
		}
	}, FALL {
		public String print() {
			return "";
		}
	};
	
	public abstract String print();
}