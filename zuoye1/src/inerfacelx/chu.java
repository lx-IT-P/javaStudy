package inerfacelx;

/**
 * @className chu.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午9:58:14
 * @version V1.0
 * @copyright SNBC 2011
 */
public class chu implements Compute{

	/* (non-Javadoc)
	 * @see完成触发运算
	 */
	@Override
	public int computer(int n, int m) {
		int c = 0;
			try {
				c = n/m;
			} catch (ArithmeticException e) {
				System.out.println("算术异常。。。");
			}
		return c;
	}
}
