public class RotateByOne{

	public static void rotate(int[] nums){
		// Step 1 , Store first value in temp
		//> Store in int[] temp = (i < d)
		// arr[i-1] = arr[i] , change position to left side
		// store the temp value in n-1
		int n = nums.length;


		int temp = nums[0];
		for (int i = 1;i < n ; i++) {
			nums[i-1] = nums[i];

		}
		nums[n-1] = temp;



	}

	public static void main(String[] args) {
		// Left rotate = 2,3,4,5,1
		int[] arr = {1,2,3,4,5};

		rotate(arr);

		for (int i = 0; i < arr.length;i++ ) {
			System.out.println(arr[i]);
			
		}






		
	}
}