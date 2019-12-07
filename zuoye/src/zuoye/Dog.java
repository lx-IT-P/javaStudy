package zuoye;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @className Dog.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午6:30:03
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Dog extends Pet{
	public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            new Timer("timer - " + i).schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " run ");
                }
            }, 1000);
        }
    }
	String strain = "牧羊犬";

	/**
	 * @return the strain
	 */
	public String getStrain() {
		return strain;
	}
}
