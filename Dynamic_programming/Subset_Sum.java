package Dynamic_programming;

public class Subset_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int target = 11;
        System.out.println("Subset with given sum exists: " + SubSum(arr, target));
    }

    public static boolean SubSum(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base Case: If sum is 0, it is always possible (empty subset)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }
}
