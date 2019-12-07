package zuoye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @className LinkListTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午2:08:01
 * @version V1.0
 * @copyright SNBC 2011
 */
public class LinkListTest {
	public static void main(String[] args) {
		LinkedList<Data> array =  new LinkedList<Data>();
		Data aEmployer = new Data(01,"lx",22,"2019/7/15");
		Data aEmployer1 = new Data(02,"sry",23,"2019/7/15");
		Data aEmployer2 = new Data(03,"wx",26,"2019/7/15");
		Data aEmployer3 = new Data(04,"zgj",22,"2019/7/15");
		Data aEmployer4 = new Data(05,"zzq",24,"2019/7/15");
		array.add(aEmployer);
		array.add(aEmployer1);
		array.add(aEmployer2);
		array.add(aEmployer3);
		array.add(aEmployer4);
		System.out.println(array.removeFirstOccurrence(aEmployer));
		
		}
	}

	class Data{
		/**
		 * @param i
		 * @param string
		 * @param j
		 * @param string2
		 */
		public Data(int id, String name, int age, String data) {
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
