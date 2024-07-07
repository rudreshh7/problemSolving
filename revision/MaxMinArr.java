public class MaxMinArr{

public static void maxNum(int[] nums){
	// Finding the max element
	int max = Integer.MIN_VALUE;
	for (int i = 0;i < nums.length ; i++) {
		if(nums[i] > max ){
			max = nums[i];
		}
		
	}
			System.out.println("Max element will be" + max);


}

public static void minNum(int[] nums){
	// Finding the max element
	int min = Integer.MAX_VALUE;
	for (int i = 0;i < nums.length ; i++) {
		if(nums[i] < min )
			min = nums[i];

		
	}
			System.out.println("Min element will be"+ min);


}
	public static void main(String[] args) {
		System.out.println("Max and Minimum Element");
		int[] arr = {2,5,1,6,8,1,3,9};
		// Max Element = 9 and Min Element = 1
		// Two Function one for max and one for min
		maxNum(arr);
		minNum(arr);









	}
}