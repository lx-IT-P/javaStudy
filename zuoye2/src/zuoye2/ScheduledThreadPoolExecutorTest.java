package zuoye2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @className ScheduledThreadPoolExecutorTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月29日 下午1:47:32
 * @version V1.0
 * @copyright SNBC 2011
 */
public class ScheduledThreadPoolExecutorTest {
	public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(10);
        for (int i = 0; i < 10; ++i) {
            executor.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " run ");
                }
            } , 2 , TimeUnit.SECONDS);
        }
        executor.shutdown();
    }
}
