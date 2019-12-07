package week1;
/**
 * @className Thursday.java
 * @funciton 将数组中的空格用相应的字符代表
 * @author liuxiang2
 * @CreatedTime: 2019年8月1日 下午2:14:40
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Thursday {
	public static void main(String[] args) {
		Solution son = new Solution();
		StringBuffer str = new StringBuffer("ni hao a");
		String str1 = new String();
		str1 = son.replaceSpace(str);
		System.out.println(str1);
	}
}
class Solution{
	public String replaceSpace(StringBuffer str) {
		String str1 = str.toString();
		if(str1.equals(""))
			return str1;
		char[] strArray = str1.toCharArray();
		int i = 0;
		int lengthSpace = 0;
		while(i<strArray.length) {
			if(strArray[i] == ' ') 
				lengthSpace++;
			i++;
		}
		int newStrLength = strArray.length+lengthSpace*2;
		char[] newStr = new char[newStrLength];
		int j= newStrLength-1;
		i = strArray.length-1;
		while(i>=0) {
			if(strArray[i]!=' ') {
				newStr[j--] = strArray[i--];
			}
			else {
				newStr[j--]='0';
				newStr[j--]='2';
				newStr[j--]='%';
				i--;
			}
		}
		return new String(newStr);
	}
}