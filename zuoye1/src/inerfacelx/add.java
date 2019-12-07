package inerfacelx;

/**
 * @className add.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午9:56:49
 * @version V1.0
 * @copyright SNBC 2019
 */
public class add implements Compute{

	/* (non-Javadoc)
	 * @see完成加法运算
	 */
	@Override
	public int computer(int n, int m) {
	int i;
	i = n+m;
		return i;
	}

}
