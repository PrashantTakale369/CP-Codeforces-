package fetch;
import java.util.*;
public class A_All_Lengths_Subtraction{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for( int i = 0 ; i < n ;i++){
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n-1;

            boolean flag = true;

                for(int i = 1 ; i < n ; i++){

                    if(arr[left] == i){
                        left++;
                    }else if(arr[right] == i){
                        right--;
                    }else{
                        flag = false;
                        break;
                    }
            }


         if(flag == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



            

        }
    }
}