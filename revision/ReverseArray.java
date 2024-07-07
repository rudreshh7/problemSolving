public class ReverseArray{

	public static void swap(int[]arr ,int i , int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;


	}

	public static void reverseArr(int[] nums){
		int start =0;
		int end =  nums.length -1;

		while(start <= end){
			swap(nums,start,end);
			start++;
			end--;
		}



	}
	public static void main(String[] args) {
		System.out.println("Reverse Array");
		int[] arr = {2,5,1,5,1,7,9,1};
		reverseArr(arr);
		for (int i = 0; i <arr.length ;i++ ) {
			System.out.println("Reverse Array");
			System.out.println(arr[i]);
			
		}



	}
}