import java.util.HashSet;
import java.util.Scanner;

public class A_Circle_of_Apple_Trees {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        

        /*

         strictly greater than the beauty of the last apple you ate

         i > i-1

         */


         int t = sc.nextInt();  

         while(t-- > 0){

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }



            // --------------------> S  olution <--------------------

             HashSet<Integer> set = new HashSet<>();
             for(int i = 0; i < n; i++){
                 set.add(arr[i]);
             }

             System.out.println(set.size());

      } 
  }  

}