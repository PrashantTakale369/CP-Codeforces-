import java.util.Scanner;

public class Max_len_3201{

public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(maximumLength(arr))  ;


}

public static int maximumLength(int nums[]){

        int n = nums.length;

         int maxlen = 0 ; 

        int i = 0 ; 
        int j = 1 ; 

        while( j < n ){

            int count = 0 ;

            if(nums[i] != nums[j]){
                count++;
                j++;
            }
            maxlen = Math.max(count , j - i + 1);

            i++;
        }

    return maxlen;
}


}
