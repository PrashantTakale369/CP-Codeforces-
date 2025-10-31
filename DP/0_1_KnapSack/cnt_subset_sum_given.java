public class cnt_subset_sum_given {

    public static void main(String[] args){

        int arr[] = {2,3,5,6,8,10};
        int sum = 10;

        int n = arr.length;

        System.out.println(subset(arr , sum , n)); // Function Call
    }


    public static int subset(int arr[] , int sum , int n){

        int dp[][] = new int[n+1][sum+1];

        for(int i = 0 ; i <=n ; i++) dp[i][0] = 1;
        for(int j = 1 ; j <=sum ;j++) dp[0][j] = 0;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= sum ;j++){

                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }
    
}



/*

  public static int subset1D(int arr[], int sum, int n) {
    int dp[] = new int[sum+1];

    dp[0] = 1; // Only one way to make sum=0 → empty set

    for(int i = 0; i < n; i++){
        for(int j = sum; j >= arr[i]; j--){
            dp[j] += dp[j - arr[i]];
        }
    }

    return dp[sum];
}

 */

