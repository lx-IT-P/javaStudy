package zuoye;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @className CollectionsTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 下午3:18:43
 * @version V1.0
 * @copyright SNBC 2011
 */
public class CollectionsTest {
	public static void main(String[] args) {
		ArrayList<Integer> array =  new ArrayList<Integer>();
		Employer1 aEmployer1 = new Employer1(01,"lx",22,"2019/7/15");
		Employer1 aEmployer11 = new Employer1(02,"sry",23,"2019/7/15");
		Employer1 aEmployer12 = new Employer1(03,"wx",26,"2019/7/15");
		Employer1 aEmployer13 = new Employer1(04,"zgj",22,"2019/7/15");
		Employer1 aEmployer14 = new Employer1(05,"zzq",24,"2019/7/15");
		array.add(aEmployer1.getAge());
		array.add(aEmployer11.getAge());
		array.add(aEmployer12.getAge());
		array.add(aEmployer13.getAge());
		array.add(aEmployer14.getAge());
		for (int i = 0; i < array.size(); i++) {
			Collections.sort(array);
			System.out.println(array.get(i));
		}
	}
}

	@SuppressWarnings("rawtypes")
	class Employer1 implements Comparable{
		/**
		 * @param i
		 * @param string
		 * @param j
		 * @param string2
		 */
		private int id;
		private int age;
		private String data;
		private String name;
		public Employer1(int id, String name, int age, String data) {
			super();
			this.name = name;
			this.age = age;
			this.data = data;
			this.id = id;
		}
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
		/* (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		@Override
		public int compareTo(Object o) {
			return 0;
		}
}
