import java.util.*;
public class A_Collatz_Conjecture{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
 
                int k = sc.nextInt();
                int x = sc.nextInt();

                // int count = 0 ;

            
            for (int i = 0 ; i < k ; i++) {
                x *= 2;
            }

            System.out.println(x);

        }
    }
}