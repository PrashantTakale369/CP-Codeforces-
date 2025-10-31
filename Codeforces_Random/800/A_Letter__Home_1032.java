import java.util.Scanner;

public class A_Letter__Home_1032{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int ans =0 ; 

        // number of test cases

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int s = sc.nextInt();

            int x[] = new int[n];

            for(int i = 0; i < n; i++){

                x[i] = sc.nextInt();
            }
            
            // ====>  this also work like think about it so it work 

            
            // int P_pos = Math.abs((s - x[0]) + (x[n-1] - x[0]));
            // int N_Pos = Math.abs((x[n-1] - s) +(x[n-1] - x[0]));

            // ans = Math.min(P_pos, N_Pos);
            


            int span = x[n - 1] - x[0];
            int extra = Math.min(Math.abs(s - x[0]), Math.abs(s - x[n - 1]));
            ans = span + extra;

            System.out.println(ans);
        }
    }
}
