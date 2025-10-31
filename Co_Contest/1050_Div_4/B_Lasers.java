
import java.util.*;

public class B_Lasers {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n =  sc.nextInt();  //  horizontal lasers
            int m =  sc.nextInt();  // vertical lasers

            int x = sc.nextInt();
            int y = sc.nextInt();

            int arr[] = new int[n];
            int arr_2[] = new int[m];

            for(int  i = 0; i < n ; i++){
                arr[i] = sc.nextInt();
            }

             for(int  i = 0; i < m ; i++){
                arr_2[i] = sc.nextInt();
            }


            System.out.println(n+m);





        }



    }
}
