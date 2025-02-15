package Dynamic_programming;

public class Knapsack_rec {
    public static void main(String[] args) {
        
    }

    public int max_prof_knapsack(int[] weight, int[] val, int capacity, int n){
        if(n == 0 || capacity == 0){
            return 0 ;
        }

        if(weight[n-1] <= capacity){
            return Math.max(val[n-1] + max_prof_knapsack(weight, val, capacity - weight[n-1], n-1), max_prof_knapsack(weight, val, capacity, n-1));
        }else{
            return max_prof_knapsack(weight, val, capacity, n-1);
        }
            
    }
        
}
