package Thread;
public class One {
	public static void main(String[] args) {
		new Thread(new Runnable() { // 创建线程, 代表中国人
			public void run() {
					System.out.println(Thread.currentThread().getName()
							+ ": 你们不给我筷子, 我就不给你们刀叉");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
						System.out.println(Thread.currentThread()
								.getName() + ": 给你们刀叉");
			}
		}, "中国人").start();
		
		new Thread(new Runnable() { // 美国人
			public void run() {
				 synchronized ("筷子") {
				// 美国人拿到了筷子
					System.out.println(Thread.currentThread().getName()
							+ ": 你先给我刀叉, 我再给你筷子");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
						System.out.println(Thread.currentThread()
								.getName() + ": 好吧, 把筷子给你.");
				 }
				}
			
		}, "美国人").start();

		new Thread(new Runnable() { // 创建线程, 代表英国人
			public void run() {
				
					System.out.println(Thread.currentThread().getName()
							+ ":还有我的刀叉呢， 请你们给我刀叉啊");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (args) {
						System.out.println(Thread.currentThread()
								.getName() + ": 谢谢");
					
				}	
			}
		}, "英国人").start();
	}
}



