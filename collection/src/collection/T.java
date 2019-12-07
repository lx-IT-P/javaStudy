package collection;

/**
 * @className T.java
 * @funciton //泛型的使用
 * @author liuxiang2
 * @CreatedTime: 2019年8月6日 上午9:04:31
 * @version V1.0
 * @copyright SNBC 2011
 */
@SuppressWarnings("hiding")
public class T {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		new T();
		T.getData(10);
		System.out.println(getData(10));
	}
	public static <T> T getData(T data) {
		return data;
	}
}
class T1{
	//静态方法
	@SuppressWarnings("rawtypes")
	public static T T1(T data) {
		return data;
	}
}