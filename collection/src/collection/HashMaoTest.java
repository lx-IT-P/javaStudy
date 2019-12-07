package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import collection.HashEx.Inner;
import collection.HashEx.sInner;

/**
 * @className HashMaoTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月6日 上午8:53:04
 * @version V1.0
 * @copyright SNBC 2011
 */
public class HashMaoTest {
	public static void main(String[] args) {
		HashMap<Person, String> hm = new HashMap<Person, String>();
		hm.put(new Person("jack", 20), "1001");
		hm.put(new Person("rose", 18), "1002");
		hm.put(new Person("lucy", 19), "1003");
		hm.put(new Person("hmm", 17), "1004");
		hm.put(new Person("ll", 25), "1005");
		System.out.println(hm);
		System.out.println(hm.put(new Person("rose", 18), "1006"));

		Set<Entry<Person, String>> entrySet = hm.entrySet();
		Iterator<Entry<Person, String>> it = entrySet.iterator();
		while (it.hasNext()) {
			Entry<Person, String> next = it.next();
			Person key = next.getKey();
			String value = next.getValue();
			System.out.println(key + " = " + value);
		}
		Person hashMaoTest  = new HashEx();
		hashMaoTest.sum(1,2);
		HashEx hashMaoTest1 = new HashEx();     
		hashMaoTest1.sum(1,2);
		hashMaoTest1.sum(1);
		HashEx.Inner inner = new HashEx().new Inner();
		System.out.println("成员内部类"+inner.write());
		System.out.println("静态内部类"+sInner.write());
		sInner sum = new sInner();
		sum.write1();
	}
}
class HashEx extends Person{ 
	String s =new String("abc");
	int a =1;
	static final String s1 = "";
	//成员内部类
	class Inner{
		public int write() {
			return a;
		}
	}
	//静态内部类
	static class sInner{
		public static String write() {
			return s1;
		}
		public  String write1() {
			return s1;
		}
	}
	public int sum(int x) {
		//局部内部类
		@SuppressWarnings("unused")
		class Inner1{
			@SuppressWarnings("unused")
			public String write() {
				return s;
			}
	}
		//匿名内部类
		new Person() {
			@SuppressWarnings("unused")
			public String write() {
				return s;
			}
		}.sum(1, 2);
		return x;
	}
}
class Person {
	private String name;
	private int age;

	Person() {

	}
public int sum(int x,int y) {
	return x+y;
}
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {

		return this.name.hashCode() + age * 37;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {

		return "Person@name:" + this.name + " age:" + this.age;
	}
}

