
import java.util.Scanner;


public class A_Be_Positive {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  
        
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int count_z = 0;
            int count_n= 0;

            for(int i = 0; i < n; i++){
                if(arr[i] == 0) count_z++;
                if(arr[i] < 0) count_n++;
            }

            if(count_n % 2 == 0){
                System.out.println(count_z);
            }else{
                System.out.println(count_z+2);
            }


        }
    }
    
}
