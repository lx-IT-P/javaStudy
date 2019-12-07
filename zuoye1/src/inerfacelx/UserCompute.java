package inerfacelx;

/**
 * @className UserCompute.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午10:01:31
 * @version V1.0
 * @copyright SNBC 2019
 */
public class UserCompute {
	add add = new add();
	jian jian = new jian();
	cheng cheng = new cheng();
	chu chu = new chu();
	public void useCom(int one,int two) {
		
		System.out.println(add.computer(1, 2));
		
		System.out.println(jian.computer(1, 2));
		
		System.out.println(cheng.computer(1, 2));
		
		System.out.println(chu.computer(1, 2));
	}
	
}
