package zuoye2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @className TimerTest1.java
 * @funciton 特定时间执行
 * @author liuxiang2
 * @CreatedTime: 2019年8月29日 下午1:43:23
 * @version V1.0
 * @copyright SNBC 2011
 */
public class TimerTest1 {
	public static void main(String[] args) {
	 for (int i = 0; i < 10; ++i) {
         new Timer("timer - " + i).schedule(new TimerTask() {
             @Override
             public void run() {
                 System.out.println(Thread.currentThread().getName() + " run ");
             }
         }, new Date(System.currentTimeMillis() + 2000));
     }
   }
}