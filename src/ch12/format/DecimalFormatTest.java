package ch12.format;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatTest {

	public static void main(String[] args) throws ParseException {
		double orgNum = 1234.5;
		DecimalFormat df = new DecimalFormat("\u00A4#,###.#");
		System.out.println(df.format(orgNum));
		String orgStr = "￦1,234.5";
		double parsed = (double) df.parse(orgStr);
		System.out.println(parsed);
		
		df.applyPattern("#.#%");
		System.out.println(df.format(parsed));
	}
}