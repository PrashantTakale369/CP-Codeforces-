import java.util.*;

public class C_MEX_rose {

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){


            // MEX(a)∗=k

            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);


            int missing = 0; 
            int cnt = 0;


            for(int i = 0 ; i < n ; i++){  // missing number cal
                if(arr[i] != missing){
                    missing++;
            }
                if(missing == k) break;
            }

            for(int j = 0; j < n ; j++){
                if(arr[j] == k){
                    cnt++;
                }
            }



            
        }
    }  
}
