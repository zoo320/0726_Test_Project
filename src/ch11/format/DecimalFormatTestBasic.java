package ch11.format;

import java.text.DecimalFormat;

public class DecimalFormatTestBasic {
	private static final double NUMBER = 1234.5;

	public static void main(String[] args) {
		DecimalFormatTestBasic dft = new DecimalFormatTestBasic();
		printNumber("#");
		printNumber("#####.##");
		printNumber("-#.#;#.#");
		printNumber("0.0");
		printNumber("#,###.#");
		printNumber("0.0E0");
		printNumber("#,###.##\u2030");
		printNumber("\u00A4#,###.##");

	}

	private static void printNumber(String pattern) {
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.printf("%19s : %s\n", pattern, df.format(NUMBER));
	}
	
}
