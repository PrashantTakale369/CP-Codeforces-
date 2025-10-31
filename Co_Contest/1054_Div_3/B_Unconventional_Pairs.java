import java.util.*;

public class B_Unconventional_Pairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t  = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();   // size of array
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int max = Integer.MIN_VALUE;
            int diff = 0;

            int i = 0;

            while(i < n){
                diff = Math.abs(arr[i] - arr[i+1]);
                max = Math.max(max, diff);
                i += 2; 
            }

            System.out.println(max);

        }
    }
    
}
