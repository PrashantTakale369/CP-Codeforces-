public class equal_partition_sum {

    public static void main(String[] args){

        int arr[] = {1,5,11,5};

        int sum = 0;
        for(int i : arr) sum += i;

        if(sum % 2 != 0){
            System.out.println(false);
        }else{
             System.out.println(subset(arr , sum / 2)); // Function Call
        }

    }

    // Sum1 - sum2  ==== 0 we want i mean this is the intution behind this problem.


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