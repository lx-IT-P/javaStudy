package clonestudy;

/**
 * @className ZhengZe.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月7日 上午8:40:54
 * @version V1.0
 * @copyright SNBC 2011
 */
public class ZhengZe {
	public static void main(String[] args) {
		
		/*
		 * //只能输入数字 String str = "124354232"; char[] arr = str.toCharArray(); boolean
		 * flag = true; for(int i = 0 ; i< arr.length ; i++){
		 * if(!(arr[i]>=48&&arr[i]<=57)){ flag = false; } }
		 */
		//只能输入数字
		String str = "12435423a2";
		boolean flag = str.matches("[0-9]+"); 
		System.out.println(flag?"输入正确":"只能输入数字");
		//预定义字符类
		System.out.println("预定义字符类");
		System.out.println("a".matches("."));//匹配任意字符
		System.out.println("1".matches("\\d"));//匹配数字
		System.out.println("%".matches("\\D"));//匹配非数字
		System.out.println("\r".matches("\\s"));//匹配空白字符
		System.out.println("^".matches("\\S"));//匹配非空白字符
		System.out.println("a".matches("\\w"));//匹配字母，\b匹配单词的边界，$匹配结尾，|匹配分组
		//Greedy 数量词
//		X?	X，一次或一次也没有
//		X*	X，零次或多次
//		X+	X，一次或多次
//		X{n}	X，恰好n次
//		X{n,}	X，至少n次
//		X{n,m}	X，至少n次，但是不超过m次
		System.out.println("Greedy 数量词");
		System.out.println( "a".matches(".") );
		System.out.println( "a".matches("a") );
		System.out.println("a".matches("a?") );
		System.out.println( "aaa".matches("a*") );
		System.out.println( "".matches("a+") );
		System.out.println( "aaaaa".matches("a{5}") );
		System.out.println( "aaaaaaaaa".matches("a{5,8}") );
		System.out.println( "aaa".matches("a{5,}") );
		System.out.println( "aaaaab".matches("a{5,}") );
//范围表示
//		[abc]	a、b 或 c（简单类） 
//		[^abc]	任何字符，除了 a、b 或 c（否定） 
//		[a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
//		[a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集） 
//		[a-z&&[def]]	d、e 或 f（交集） 
//		[a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去） 
//		[a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
		System.out.println("范围表示");
		System.out.println( "a".matches("[a]") );
		System.out.println( "aa".matches("[a]+") );
		System.out.println( "abc".matches("[abc]{3,}") );
		System.out.println( "abc".matches("[abc]+") );
		System.out.println( "dshfshfu1".matches("[^abc]+") );
		System.out.println( "abcdsaA".matches("[a-z]{5,}") );
		System.out.println( "abcdsaA12".matches("[a-zA-Z]{5,}") );
		System.out.println( "abcdsaA12".matches("[a-zA-Z0-9]{5,}") );
		System.out.println( "abdxyz".matches("[a-c[x-z]]+"));
		System.out.println( "bcbcbc".matches("[a-z&&[b-c]]{5,}"));
		System.out.println( "tretrt".matches("[a-z&&[^b-c]]{5,}"));
		//[1-9][0-9]{4,14}   
		//[1-9]表示是第一位数字是会出现1-9范围之间的其中一个，
		//下来的数字范围会出现在0-9之间，至少出现4次，最多出现14次。
		String qq = "12345";              
		String reg = "[1-9][0-9]{4,14}";  
		boolean b = qq.matches(reg);      
		System.out.println("b="+b);   
		//切割字符串
		String str1 = "aa.bb.cc";                                
		str1 = "-1     99    4    23";                           
		String[] arr = str1.split(" +");                         
		for(String s : arr)                                     
		{                                                       
			System.out.println(s);        
		}
	}
}