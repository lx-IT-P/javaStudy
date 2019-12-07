package zuoye;

import java.text.DecimalFormat;

/**
 * @className leiConvert.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 上午8:03:05
 * @version V1.0
 * @copyright SNBC 2011
 */
public class leiConvert {
	public static void main(String[] args) {
		DecimalFormat a = new DecimalFormat("##0.0000");
//		int b = 1231432423;
//		double c =  b;
		double d = 23424353453534.35415;
		System.out.println(a.format(d));
		//System.out.println(a.format(c));

	}
}
