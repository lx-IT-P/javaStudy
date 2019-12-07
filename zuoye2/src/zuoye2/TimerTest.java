package zuoye2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @className TimerTest.java
 * @funciton   定时任务延迟
 * @author liuxiang2
 * @CreatedTime: 2019年8月29日 下午1:41:51
 * @version V1.0
 * @copyright SNBC 2011
 */
public class TimerTest {
	public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            new Timer("timer - " + i).schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " run ");
                }
            }, 1000);
        }
    }
}
