public class MergeSort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a new array to hold the merged elements
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays until one of them is exhausted
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1, if any
        while (i < m) {
            temp[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2, if any
        while (j < n) {
            temp[k++] = nums2[j++];
        }

        // Copy the merged elements back to nums1
        for (i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
