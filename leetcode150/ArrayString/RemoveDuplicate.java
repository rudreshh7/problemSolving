public class RemoveDuplicate{
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};

		int j = 0; // pointer to place the next unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println(j+1);
    
    }
}