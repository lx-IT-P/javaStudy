package Thread;

/**
 * @className Demo9.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月7日 下午3:22:15
 * @version V1.0
 * @copyright SNBC 2011
 */
class QQUpdate implements Runnable {
	int i = 3;

	@Override
	public void run() {
		while (true) {

			System.out.println(Thread.currentThread().getName() + " 检测是否有可用更新");
			i++;
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			if (i == 3) {
				System.out.println("有可用更新，是否升级？");
				break;
			}
		}
	}
}
public class Demo9 {
	public static void main(String[] args) {
		QQUpdate qq = new QQUpdate();
		Thread th = new Thread(qq, "qqupdate");
		th.setDaemon(true);
		th.start();
		System.out.println(th.isDaemon());
		System.out.println("hello world");
	}
}

