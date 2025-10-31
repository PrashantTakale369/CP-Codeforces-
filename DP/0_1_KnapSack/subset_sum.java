public class subset_sum {

    public static void main(String[] args){

        int arr[] = {2,3,7,8,10};
        int sum = 11;

        System.out.println(subset(arr , sum)); // Function Call

    }


    public static boolean subset(int arr[] , int sum){

        int n = arr.length;

        boolean dp[][] = new boolean[n+1][sum+1];


        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = true;  // if sum is 0 then it is always true
        }

        for(int j = 0 ; j <= sum ; j++){
            dp[0][j] = false; // if array is empty and sum is not 0 then it is always false
        }


        for(int i = 1 ; i <= n; i++){
            for(int  j  = 1  ; j <= sum ; j++){

                if( arr[i-1] <= j){
                    dp[i][j] = dp[i][j- arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }


        return dp[n][sum];

        
    }
    
}
