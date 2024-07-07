public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {6, 2, 1, 3, 5, 1, 4};
        
        int max_peak = Integer.MIN_VALUE;

        if(arr[0] > arr[1]){
            max_peak = arr[1];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                int peak = arr[i];
                max_peak = Math.max(max_peak, peak);
            }
        }

        if(arr[arr.length - 1] > arr[arr.length]){
            max_peak = arr[arr.length -1];
        }

        System.out.println("Maximum Peak Element: " + max_peak);
    }
}
