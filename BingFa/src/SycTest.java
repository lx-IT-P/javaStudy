

/**
 * @className SycTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年12月18日 下午1:33:02
 * @version V1.0
 * @copyright SNBC 2011
 */

public class SycTest {
	/**
	 * 因为两个线程作用于不同的对象，获得的是不同的锁，所以互相并不影响
	 */
	static SycTest instance=new SycTest();
	static int i = 0;
	public static void main(String[] args) {
		new Thread(new Runnable() { // 创建线程, 代表中国人
			public void run() {
				i++;
				System.out.println(Thread.currentThread().getName()+i);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}, "中国人").start();
		
		new Thread(new Runnable() { // 美国人
			public  void run() {
				 synchronized ("筷子") {
					 i--;
					 System.out.println(Thread.currentThread().getName()+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					i--;
					System.out.println(Thread.currentThread().getName()+i);
				 }
				}
			
		}, "美国人").start();

		new Thread(new Runnable() { // 创建线程, 代表英国人
			public void run() {
				synchronized ("kk") {
					i++;
					System.out.println(Thread.currentThread().getName()+i);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}	
			}
		}, "英国人").start();
	}
}


