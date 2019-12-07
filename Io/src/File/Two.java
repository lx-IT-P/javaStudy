package File;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @className Two.java
 * @funciton //从键盘输入字符串，再输出到屏幕
 * @author liuxiang2
 * @CreatedTime: 2019年8月5日 下午3:52:27
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Two {
public static void main(String[] args) {
	char c1[],c2[];
	String str;
	CharArrayReader cin;
	CharArrayWriter con;
	//将键盘上的输入数据放到BufferStreamReader类in的对象中
	InputStreamReader sInputStream = new InputStreamReader(System.in);
	BufferedReader inBufferedReader = new BufferedReader(sInputStream);
	OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
	try {
		System.out.println("请输入一个字符串，按Enter结束");
			str = inBufferedReader.readLine();
			c1 = str.toCharArray();
			//创建CharArraryReader类cin的对象，并与输入流c1数据绑定
			cin = new CharArrayReader(c1);
			con = new CharArrayWriter();
			//读cin的对象数据内容到con的对象中
			while (cin.ready()) {//返回输入流是否是可读信息
				//读cin的一个字符到con中 ，读/写指针后一个字符位置
				con.write(cin.read());
			}
			System.out.println("c2=");
			c2 = con.toCharArray();//将con的对象数据写到字符数组c2中
			System.err.println(new String(c2));//用c2数组创建字符串并打印
			System.err.println("\n将count的对象数据写入out的对象中，并输出：");
			con.writeTo(outputStreamWriter);//将con数据写入到out中
			outputStreamWriter.flush();//强制输出out中的数据到屏幕
	} catch (IOException e) {
		System.out.println("I/O异常");
		}
	}
}
