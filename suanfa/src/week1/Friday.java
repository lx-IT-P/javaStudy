package week1;

import org.junit.Test;

/**
 * @className Friday.java
 * @funciton �ж����������Ƿ�ƥ��
 * @author liuxiang2
 * @CreatedTime: 2019��8��1�� ����2:13:25
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Friday {
public static void main(String[] args) {
	char[] arr = {'a','a','b','d'};
	char[] arr1 = {'a',' ','a'};
	boolean bool;
	Mathch mh = new Mathch();
	bool = mh.match(arr, arr1);
	System.out.println(bool);
	
	}
}
class Mathch{
	public boolean match(char[] str,char[] pattern){
		int m = str.length,n =pattern.length;
		boolean[][] dp = new boolean[m+1][n+1];
		dp[0][0] = true;
		for(int i= 1;i<=n;i++)
			if(pattern[i-1] == '*')
				dp[0][i] = dp[0][i-2];
		for(int i = 1;i<=m;i++)
			for(int j= 1;j<=n;j++)
				if(str[i-1] == pattern[j-1]||pattern[j-1] == '.')
					dp[i][j] = dp[i-1][j-1];
				else if(pattern[j-1] == '*')
					if(pattern[j-2] == str[i-1]||pattern[j-2] == '*') {
						dp[i][j] = dp[i][j-1];
		                dp[i][j] = dp[i-1][j];
		                dp[i][j] = dp[i][j-2];
			     }else
			    	 dp[i][j] = dp[i][j-2];
		return dp[m][n];
		}
}