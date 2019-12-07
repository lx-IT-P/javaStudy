package File;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @className One.java
 * @funciton //键盘输入数据的读取
 * @author liuxiang2
 * @CreatedTime: 2019年8月5日 下午3:31:18
 * @version V1.0
 * @copyright SNBC 2011
 */
public class One {
public static void main(String[] args) {
	int count;
	byte[] b = new byte[256];
	String str;
	BufferedInputStream bis = new BufferedInputStream(System.in);//输入缓冲区流对象
	DataInputStream in = new DataInputStream(bis);//字节流输入对象
	try {
		if(in.markSupported()) {
			System.out.println("支持mark");	
			System.out.println("输入字符串，按Enter结束");
			in.mark(256);
			count = in.read(b);
			System.out.println("读入字符数："+count);
			str = new String(b,0,count);//将b数组转换为字符串
			System.out.println("输入的字符串为："+str);
			in.reset();//重新回到标记出读取数据
			in.read(b,0,2);
			str = new String(b,0,2);
			System.out.println("字符串的前两个:"+str);
		}else {
			System.out.println("不支持mark");
			bis.close();
			in.close();
		}
	} catch (IOException e) {
		System.out.println("发生io异常");
		}
	}
}
