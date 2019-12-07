package Thread;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * @className Demo10.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月7日 下午3:17:18
 * @version V1.0
 * @copyright SNBC 2011
 */
class JoinThread implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 30) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " i:" + i);
			i++;
		}
	}
}

public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		JoinThread jt = new JoinThread();
		Thread th = new Thread(jt, "one");
		th.setPriority(1);
		th.start();
		int i = 0;
		while (i < 20) {
			if (i == 10) {
				th.join();
			}
			System.err.println(Thread.currentThread().getName() + " i:" + i);
			i++;

		}
	}

}
