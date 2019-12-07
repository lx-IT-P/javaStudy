package week2;

/**
 * @className SuShu.java
 * @funciton 输出1-50的素数
 * @author liuxiang2
 * @CreatedTime: 2019年8月8日 上午9:20:04
 * @version V1.0
 * @copyright SNBC 2011
 */

public class SuShu {
public static void main(String[] args) {
		
		  int n = 0; 
		  int m;
		  int j; 
		  int i; 
		  p1:for ( i = 3; i <= 100;i+=2) { 
		  m =(int)Math.sqrt((double)i); 
		  for (j = 2; j<=m; j++) { 
			  if ((i%j) == 0)break;
			  if (i == 51) break p1; 
			  } 
		  if (j>=m+1) { 
			  if (n%6 == 0) System.out.println("\n");
		  System.out.println(i+" ");n++;
		  } 
	}
		 
//	int n =50;
//	for (int i = 2; i <= n; i++) {
//		for (int j = 2; j <= i-1; j++) {
//			if (i%j == 0) {
//				break;
//			}
//			if (j>=i-1) {
//				System.out.println(i);
//				}
//			}
//		}
	}
}

