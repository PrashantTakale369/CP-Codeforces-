package fetch;
import java.util.Scanner;

public class A_Incremental_Subarray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int t  = sc.nextInt();

        while(t-- > 0){

            // At the beginning, James writes the number 1        ===== 1 
            //Right after, James writes 1 again, and then 2       ===== 1  1  2 
            // Then James writes 1 2 3                            ===== [ 1  ]  [1  2 ]  [ 1  2   3 ]  [ 1    2   3   4 ] [ 1   2   3   4   5 ]


            int n = sc.nextInt();   //  maximum number written 
            int m = sc.nextInt();   //  length of the array 


            int[] arr = new int[m];

            for(int i = 0; i < m; i++){
                arr[i] = sc.nextInt();
            }

                if( m ==1 && arr[0] == 1){
                    System.out.println(n);
                }else if(n % 2 == 0 && m % 2 == 0){
                    System.out.println(1);
                }else{
                    System.out.println(m);
                }
        }
    }
}