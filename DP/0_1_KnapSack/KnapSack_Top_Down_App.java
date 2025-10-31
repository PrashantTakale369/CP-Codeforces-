public class KnapSack_Top_Down_App {
                
    public static void main(String[] args){

        int val[] = {1,3,4,5};
        int wt[] = {1,2,3,4};
        int W = 7;

        int n = wt.length;

        System.out.println(KnapSack(val , wt , W , n)); // Function Call

    }

    static int KnapSack(int[] val , int[] wt , int W , int n ){

        int[][] dp = new int[n+1][W+1]; // Dp for tabulation

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){

                if(i == 0 || j == 0 ){          // Base Condition bcz recursion.
                    dp[i][j] = 0;
                }else if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);       // Tabulation
                }else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        return dp[n][W];
    }
}
