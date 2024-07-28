public class LongestSubArrayWithSumK{

	public static void subArrayWithSum(int[] nums ,int k){
		int len = 0;
		for(int i = 0; i < nums.length; i++){
			for(int j = i; j < nums.length;j++){
				long sum = 0;
				for(int l = i; l <= j;l++){
					sum+=nums[i];
					if(sum == k){
						len = Math.max(len,)
					}

				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,3,5,1,9};
		int key = 10;
		subArrayWithSum(arr , key);
	}
}