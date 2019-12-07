package scoket;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

/**
 * @className HttpClient.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月12日 下午1:42:28
 * @version V1.0
 * @copyright SNBC 2011
 */
public class HttpClient {
	
	public static void main(String[] args) throws Exception {
		try {
			
			//依据地址创建URL
			URL url=new URL("http://ww2.sinaimg.cn/large/70c8c5b7gw1erdli8ka8vj21360m1ju9.jpg");
			//获得urlConnecion
			URLConnection connection=url.openConnection();
			//打开连接
			connection.connect();
			//取得属性
			System.out.println(connection.getContentLength());
			System.out.println(connection.getContentType());
			System.out.println(connection.getDate());
			System.out.println(connection.getExpiration());
			System.out.println(connection.getLastModified());
			//读取网页数据
			int c;
			InputStream is=connection.getInputStream();
			@SuppressWarnings("resource")
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("copy.png"));
			while((c=is.read())!=-1){
				out.write(c);
				System.out.println((char)c);
			}
			out.flush();
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
