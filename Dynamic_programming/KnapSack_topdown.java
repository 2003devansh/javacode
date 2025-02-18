package Dynamic_programming;

public class KnapSack_topdown {
    public static void main(String[] args) {
        
    }

    public static int KnapSackTopDown(int[] wt, int[] val, int capacity, int n) {
        int[][] dp = new int[n+1][capacity+1];

        for(int i=0; i<n+1; i++) {
            for(int j = 0 ; j < capacity +1 ; j++){
                if(i== 0 || j == 0 ){
                    return 0 ; 
                }
            }
        }

        if(wt[n-1] <= capacity){
            dp[n][capacity] = Math.max(val[n-1] + dp[n-1][capacity - wt[n-1]], dp[n-1][capacity]);
        }else{
            dp[n][capacity] = dp[n-1][capacity];
        }
        return dp[n][capacity];
    }
}
