public class ReverseAnArray{
	public static void reverseArray(int[] arr , int start , int end){
		if(start >= end){
			return;

		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		// Call the recursive array
		recursiveArray(array , start + 1 , end  - 1);

	}


	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Call the recursive function to reverse the array
        reverseArray(array, 0, array.length - 1);

        System.out.println("\nReversed array:");
        for (int i : array) {
            System.out.print(i + " ");
        }	
    }
}