package clonestudy;

/**
 * @className Strudent.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月7日 上午8:20:25
 * @version V1.0
 * @copyright SNBC 2011
 */
	public class Student implements Cloneable{
		 String name;
		 int age;
	 Student(String name,int age){
		  this.name=name;
		  this.age=age;
	 }
	 
	 public Object clone(){
		  Object o =null;
		  try{
		   o=super.clone();//Object中的clone()识别出你要复制的哪一个对象
		  }
		  catch(CloneNotSupportedException e){
		   System.out.println(e.toString());
		  }
		  return o;
	 }

public static void main(String[] args){
	  Student s1 = new Student("zhang",18);
	  Student s2 = (Student)s1.clone();
	  s2.name="li";
	  s2.age=20;
	  System.out.println("name="+s1.name+","+"age="+s1.age);//修改学生2后不影响学生1的值
  }
}

