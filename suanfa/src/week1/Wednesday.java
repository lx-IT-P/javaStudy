package week1;
/**
 * @className Wednesday.java
 * @funciton �����˻�����
 * @author liuxiang2
 * @CreatedTime: 2019��8��1�� ����2:18:41
 * @version V1.0
 * @copyright SNBC 2019
 */
public class Wednesday {
public static void main(String[] args) {
	int[] arr = {1,2,3};
	int[] arr1 = new int[2];
	swap sp = new swap();
	arr1 = sp.multiply(arr);
	int n = arr.length;
	for(int i = 0;i < n;i++) {
	System.out.println(arr1[i]);
		}	
	}	
}
class swap{
	public int[] multiply(int[] A) {
		int n = A.length;
		int[] B = new int[n];
		for(int i = 0,product = 1;i<n;product*=A[i],i++) 
			B[i] = product;
			for(int i = n-1,product = 1;i>=0;product*=A[i],i--) 
				B[i]*=product;
			return B;
	}
}

