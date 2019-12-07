package zuoye2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @className TimerTest2.java
 * @funciton  延迟 执行并每隔 执行一次
 * @author liuxiang2
 * @CreatedTime: 2019年8月29日 下午1:45:23
 * @version V1.0
 * @copyright SNBC 2011
 */
public class TimerTest2 {
	public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            new Timer("timer - " + i).schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " run ");
                }
            }, 2000 , 3000);
        }
    }
}
