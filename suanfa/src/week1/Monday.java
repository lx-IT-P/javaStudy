package week1;
/**
 * @className Monday.java
 * @funciton 判断数组中是否含有该整数
 * @author liuxiang2
 * @CreatedTime: 2019年8月1日 下午2:10:36
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Monday {
	public static void main(String[] args) {
		boolean hs;
		int[][] arr = {{1,2,2},{3,4,5},{3,2,3}};
		PaiXu px = new PaiXu();
		hs = px.Find(9, arr);
		System.out.println(hs);
	}
	
}
class PaiXu{
	public boolean Find(int target, int[][] matrix) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int rows = matrix.length,cols = matrix[0].length;
		int r= 0,c= cols - 1;
		while(r<=rows-1 && c>=0)
		{
			if(target == matrix[r][c])
				return true;
			else if (target > matrix[r][c])
					r++;
				else
					c--;
		}
			return false;
		}	
   }


