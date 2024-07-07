public class LargestSubarrayWithEqualZeroesAndOnes{
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,0,1,1,0,1};

		int maxlen = 0;

		for (int i  = 0 ; i < nums.length;i++ ) {
			int zeroes = 0 , ones = 0;

			for (int j = 0;j < nums.length ;j++ ) {
				if(nums[j] == 0){
					zeroes++;
				}

				else{
					ones++;
				}

				if(zeroes == ones){
					maxlen = Math.max(maxlen , j - i + 1);
				}


			}
		}
		System.out.println(maxlen);

	}
}
