package sliding_window;

public class MaxSubarraySum {

    public static int subArray(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {
                max_sum = Math.max(max_sum, sum);
                sum -= arr[i]; // Remove `i`th element from sum before sliding
                i++;
                j++;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(subArray(arr, k)); 
    }
}
