import java.util.*;

public class A_Cut_the_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }


            int sum =0;

            // % 3 == 0 1 

            for(int i = 0 ; i < 2 ; i++){

                int j = n /2;

                for( i  = 0 ; i < j ; i++){
                    sum += arr[i];
                }
            }


        }
    }
}
