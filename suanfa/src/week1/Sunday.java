package week1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @className Sunday.java
 * @funciton 字符流中不重复的字符
 * @author liuxiang2
 * @CreatedTime: 2019年8月2日 上午8:05:09
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Sunday {
	public static void main(String[] args) {
		
	}
}
class First<Charcter>{
	private int[] cnts = new int[256];
	private Queue<Charcter> queue = new LinkedList<>();
	public void insert(Charcter ch) {
		cnts[(int) ch]++;
		queue.add(ch);
		while(!queue.isEmpty()&&cnts[(int) queue.peek()]>1)
				queue.poll();
	}
	public char FirstAppearingOnce() {
		return queue.isEmpty()?'#':(char) queue.peek();
	}
}