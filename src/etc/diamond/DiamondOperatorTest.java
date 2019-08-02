package etc.diamond;

public class DiamondOperatorTest {
	Comparable<String> comp = new Comparable<>() {
		@Override
		public int compareTo(String o) {
			return 0;
		}
	};
}
