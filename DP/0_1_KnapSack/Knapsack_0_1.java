import java.util.Arrays;

public class Knapsack_0_1{
 
    static int[][] dp = new int[100][1002]; // Dp for memoization

    static {
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
    }

    public static void main(String[] args){

        int val[] = {1,3,4,5};
        int wt[] = {1,2,3,4};
        int W = 7;

        int n = wt.length;

        System.out.println(KnapSack(val , wt , W , n)); // Function Call

    }

    static int KnapSack(int[] val , int[] wt , int W , int n ){

        int max = Integer.MIN_VALUE;

        if(n == 0 || W == 0 ){          // Base Condition bcz recursion.
            return 0;
        }

        if(dp[n][W] != -1){    // tabel filling with -1
            return dp[n][W];
        }
        
        if(wt[n-1] <= W){
            return  dp[n][W] = Math.max(val[n-1] + KnapSack(val , wt , W-wt[n-1] , n-1), KnapSack(val , wt , W , n-1));       // Memoization
        }else{
           return  dp[n][W] = KnapSack(val,wt,W,n-1);
        }
    }

}