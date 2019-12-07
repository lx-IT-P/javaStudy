package week1;
/**
 * @className Tuesday.java
 * @funciton 查找数组中的重复数字
 * @author liuxiang2
 * @CreatedTime: 2019年8月1日 下午2:15:57
 * @version V1.0
 * @copyright SNBC 2011
 */
public class Tuesday {
	public static void main(String[] args) {
		int arr[] = {1,2,3,0,4,5};
		int duplicate[] = new int[5];
		fuzhi fz = new fuzhi();
		boolean i =  fz.duplicate(arr, 5, duplicate);
		System.out.println(i);
	}
}
	class fuzhi{
		public boolean duplicate(int[] nums,int length, int[] duplicate) {
			if(nums == null || length <=0)
				return false;
			for(int i = 0;i<=length;i++) {
				while(nums[i]!=i) {
					if(nums[i] == nums[nums[i]]) {
						duplicate[0] = nums[i];
						return true;
					}
					swap(nums,i,nums[i]);
				}
			}
			return false;
		}
	private void swap(int[] nums,int i,int j)
	{
		int t = nums[i];
		nums[i] = nums[j];
		nums[j]= t;
	}
}



