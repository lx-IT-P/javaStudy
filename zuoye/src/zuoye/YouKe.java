package zuoye;

import java.util.Scanner;
/**
 * @className YouKe.java
 * @funciton //类和对象的练习
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午5:59:21
 * @version V1.0
 * @copyright SNBC 2011
 */
public class YouKe {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		 Scanner shuru=new Scanner(System.in);
		 for (int i = 0; i < 3; i++) {
		          System.out.print("请输入您的年龄:"+"\n");
		          PiaoJia piaoJia = new PiaoJia();
		          piaoJia.setAge(shuru.nextInt());
		          piaoJia.ticket();
		          System.out.println("\n");
		 }
	}
}

 class PiaoJia {
	 private int age;
	 private int ticketPrice;
	 public void setAge(int age)
	  {
	      this.age=age; 
	  }
	 public void ticket()
	 {
	     if((age>0&&age<12)||age>60)
	         ticketPrice=50;
	     else 
	     ticketPrice=80;
	     System.out.println("门票价格:"+ticketPrice);
	 }
}

