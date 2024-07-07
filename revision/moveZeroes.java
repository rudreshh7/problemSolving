public class moveZeroes {
    public static void moveZeroesToEnd(int[] nums) {
        // Some variables
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[index++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < index) {
                nums[i] = temp[i];

            } else {
                nums[i] = 0;
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}