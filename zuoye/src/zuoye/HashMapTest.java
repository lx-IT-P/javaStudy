package zuoye;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

/**
 * @className HashMapTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午2:33:28
 * @version V1.0
 * @copyright SNBC 2011
 */
public class HashMapTest {
	public static void main(String[] args) {
		String str;
		HashMap<String, String> hm = new HashMap<String, String>();
		Poem aPoem = new Poem("lx","l","2019/7/15");
		Poem aPoem1 = new Poem("sry","k","2019/7/1");
		hm.put(aPoem.getName(), aPoem.getNeirong());
		hm.put(aPoem1.getName(), aPoem1.getNeirong());
		try {
			InputStreamReader sInputStream = new InputStreamReader(System.in);
			BufferedReader inBufferedReader = new BufferedReader(sInputStream);
			System.out.println("请输入詩人名稱，按Enter结束");
			str = inBufferedReader.readLine();
			String vaString= hm.get(str);
			System.out.println("诗的内容是:"+vaString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}


class Poem{
	/**
	 * @param i
	 * @param string
	 * @param j
	 * @param string2
	 */
	private String zuozhe;
	/**
	 * @param zuozhe
	 * @param neirong
	 * @param name
	 */
	public Poem(String name, String zuozhe, String neirong) {
		super();
		this.zuozhe = zuozhe;
		this.neirong = neirong;
		this.name = name;
	}
	private String neirong;
	private String name;
	/**
	 * @return the zuozhe
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Poem [zuozhe=" + zuozhe + ", neirong=" + neirong + ", name=" + name + "]";
	}
	/**
	 * @param zuozhe the zuozhe to set
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * @return the neirong
	 */
	public String getNeirong() {
		return neirong;
	}
	/**
	 * @param neirong the neirong to set
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
