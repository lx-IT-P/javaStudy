package week1;

/**
 * @className Saturday.java
 * @funciton �ж��Ƿ�����ֵ
 * @author liuxiang2
 * @CreatedTime: 2019��8��1�� ����1:57:11
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Saturday {
public static void main(String[] args) {
	char[] str = {'a','+','d'};
	boolean id;
	IsNumerir is = new IsNumerir();
    id = is.isNumeric(str);	
    System.out.println(id);
	}
}
class IsNumerir{
	public boolean isNumeric(char[] str) {
		if(str == null||str.length == 0)
			return false;
		return new String(str).matches("\"[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?\"");

	}
}
