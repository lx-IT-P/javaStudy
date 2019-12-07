package exception;

/**
 * @className ExceptionTest.java
 * @funciton
 * @author liuxiang2
 * @CreatedTime: 2019年8月13日 上午10:06:39
 * @version V1.0
 * @copyright SNBC 2019
 */
public class ExceptionTest {
	public static void main(String[] args) {

		System.out.println();
		int[] arr = { 1, 2 };
		arr = null;

		// print (1, 0, arr);
		print (1, 2, arr);

		System.out.println("over");
	}	

	public static void print(int x, int y, int[] arr) {

		try {
			System.out.println(arr[1]);
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
			System.out.println("算术异常。。。");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
			System.out.println("数组角标越界。。。");
		} catch (NullPointerException e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
			System.out.println("空指针异常。。。");
		}
		System.out.println("函数执行完毕");
	}
}

