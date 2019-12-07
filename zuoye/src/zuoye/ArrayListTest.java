package zuoye;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @className ArrayTeset.java
 * @funciton  存储多个员工信息（包括工号、姓名、年龄，入职时间），逐条打印所有员工姓名，并输出员工的个数
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午1:15:25
 * @version V1.0
 * @copyright SNBC 2011
 */

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList<Employer> array =  new ArrayList<Employer>();
	Employer aEmployer = new Employer(01,"lx",22,"2019/7/15");
	Employer aEmployer1 = new Employer(02,"sry",23,"2019/7/15");
	Employer aEmployer2 = new Employer(03,"wx",26,"2019/7/15");
	Employer aEmployer3 = new Employer(04,"zgj",22,"2019/7/15");
	Employer aEmployer4 = new Employer(05,"zzq",24,"2019/7/15");
	array.add(aEmployer);
	array.add(aEmployer1);
	array.add(aEmployer2);
	array.add(aEmployer3);
	array.add(aEmployer4);
	System.out.println("元素的個數是："+array.size());
	Iterator<Employer> it = array.iterator();
	while (it.hasNext()) {
	    Employer name = (Employer)it.next();
	    System.out.println(name.getAge());
	    System.out.println(name.getName());
	    System.out.println("\n");
		}
	}
}

class Employer{
	/**
	 * @param i
	 * @param string
	 * @param j
	 * @param string2
	 */
	public Employer(int id, String name, int age, String data) {
		super();
		this.name = name;
		this.age = age;
		this.data = data;
		this.id = id;
	}
	private int id;
	private int age;
	private String data;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
