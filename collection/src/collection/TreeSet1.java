package collection;

import java.util.TreeSet;

/**
 * @className TreeSet.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月6日 上午9:38:26
 * @version V1.0
 * @copyright SNBC 2011
 */
public class TreeSet1 {
	/**
	 * @funciton
	 * @author liuxiang2
	 * @param args
	 * @time 2019年8月6日 上午9:40:24
	 */
	public static void main(String[] args) {
		String str = "8 10 15 5 2 7";
		String[] strs = str.split(" ");
		TreeSet<Integer> ts = new TreeSet();
		for (int x = 0; x < strs.length; x++) {
			int y = Integer.parseInt(strs[x]);
			ts.add(y);
		}
		System.out.println(ts);
	}

}
